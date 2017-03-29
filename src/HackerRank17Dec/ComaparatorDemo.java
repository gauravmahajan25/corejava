package HackerRank17Dec;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ComaparatorDemo {

	public static void main(final String[] args) {
		final Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		Player[] players = new Player[n];
		Checker checker = new Checker();

		for (int i = 0; i < n; i++) {
			players[i] = new Player(scan.next(), scan.nextInt());
		}

		scan.close();

		Arrays.sort(players, checker);

		for (int i = 0; i < players.length; i++) {
			System.out.printf("%s %s \n", players[i].name, players[i].score);

		}

	}

}

class Player {
	int score;
	String name;

	Player(final String name, final int score) {
		this.name = name;
		this.score = score;
	}

	
}

class Checker implements Comparator<Player> {

	@Override
	public int compare(Player player1, Player player2) {
		int sortResult = 0;
		if (player1.score < player2.score) {
			sortResult = 1;
		} else if (player1.score > player2.score) {
			sortResult = -1;
		}

		if (sortResult == 0) {
			sortResult = player1.name.compareTo(player2.name);
		}

		return sortResult;
	}

}