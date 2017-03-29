package afi;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class TraderStreamExample {

	public static void main(String[] args) {

		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));

		System.out.println(transactions.stream().filter(transaction -> transaction.getYear() == 2011)
				.sorted((Transaction t1, Transaction t2) -> {
					return new Integer(t1.getValue()).compareTo(new Integer(t2.getValue()));
				}).collect(toList()));

		System.out.println(transactions.stream().map(transaction -> transaction.getTrader().getCity()).distinct()
				.collect(toList()));

		System.out.println(
				transactions.stream().filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
						.sorted((Transaction t1, Transaction t2) -> {
							return (t1.getTrader().getName().compareTo(t2.getTrader().getName()));
						}).collect(toList()));

		System.out.println(transactions.stream().map(transaction -> transaction.getTrader().getName()).sorted()
				.reduce("", (n1, n2) -> n1 + n2));

		System.out.println(
				transactions.stream().anyMatch((transaction -> transaction.getTrader().getCity().equals("Milan"))));

		System.out.println(transactions.stream().map(transaction -> transaction.getValue()).reduce(Integer::max));
		System.out.println(
				transactions.stream().map(transaction -> transaction.getValue()).reduce((t1, t2) -> t1 > t2 ? t1 : t2));

		System.out.println(transactions.stream().map(transaction -> transaction.getValue()).reduce(Integer::min));
		System.out.println(
				transactions.stream().map(transaction -> transaction.getValue()).reduce((t1, t2) -> t1 < t2 ? t1 : t2));

		Stream<int[]> pythagoreanTriples = IntStream.rangeClosed(1, 100).boxed()
				.flatMap(a -> IntStream.rangeClosed(a, 100).filter(b -> Math.sqrt(a * a + b * b) % 1 == 0)
						.mapToObj(b -> new int[] { a, b, (int) Math.sqrt(a * a + b * b) }));

		pythagoreanTriples.limit(5).forEach(t -> System.out.println(t[0] + ", " + t[1] + ", " + t[2]));

	}
}

class Trader {
	private final String name;
	private final String city;

	public Trader(String n, String c) {
		this.name = n;
		this.city = c;
	}

	public String getName() {
		return this.name;
	}

	public String getCity() {
		return this.city;
	}

	public String toString() {
		return "Trader:" + this.name + " in " + this.city;
	}
}

class Transaction {

	private final Trader trader;
	private final int year;
	private final int value;

	public Transaction(Trader trader, int year, int value) {
		this.trader = trader;
		this.year = year;
		this.value = value;
	}

	public Trader getTrader() {
		return this.trader;
	}

	public int getYear() {
		return this.year;
	}

	public int getValue() {
		return this.value;
	}

	public String toString() {
		return "{" + this.trader + ", " + "year: " + this.year + ", " + "value:" + this.value + "}";
	}
}
