package afi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;
public class StreamExample {
	
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("One");
		strList.add("Two");
		strList.add("Three");
		strList.add("Two");
		strList.add("Four");
		strList.add("Five");
		strList.add("Six");
		
		long count = strList.stream().filter(s -> s.startsWith("T")).count();
		
		List<String> filteredList  = strList.stream().filter(s -> s.startsWith("T")).collect(toList());
		
		/*strList.stream().filter(s -> s.startsWith("T")).distinct().forEach(System.out::println);
		System.out.println(count);
		System.out.println(filteredList);*/
		
		//strList.stream().filter(s -> s.startsWith("T")).limit(5).distinct().forEach(System.out::println);
		
		
		//strList.stream().filter(s->s.startsWith("F")).map(String::length).limit(5).distinct().forEach(System.out::println);
		
		//split returns String [] so map returns stream<String [] > but we need Stream<String>
		//strList.stream().map(s->s.split("")).forEach(System.out::println);
		
		List<Integer> numList = new ArrayList<>();
		numList.add(1);
		numList.add(2);
		numList.add(3);
		
		List<Integer> numList2 = new ArrayList<>();
		numList2.add(3);
		numList2.add(4);
		
		List<Integer> finalList = numList.stream().map(num -> num*num).collect(toList());
		System.out.println(finalList);
		
		List<int []> finalStream = numList.stream().flatMap(i -> numList2.stream().map(j -> new int []{i, j})).collect(toList());
		
		/*System.out.println(finalStream);*/
		
		
		List<Integer> numbers1 = Arrays.asList(1, 2, 3); 
		List<Integer> numbers2 = Arrays.asList(3, 4); 
		
		/*System.out.println(numbers1.stream().reduce(0, (i, j)-> i + j));*/
		System.out.println(numbers1.stream().reduce(0, Integer::sum));
		
		System.out.println(numbers2.stream().reduce(1, (i, j)-> i * j));
		
		//REDUCE without initial value
		Optional<Integer> sum = numbers2.stream().reduce((a, b) -> (a + b));

		
		
		/*List<int[]> pairs = numbers1.stream().flatMap(i -> numbers2.stream().filter(j -> (i+j)%3 == 0).map(j -> new int[]{i, j})).collect(toList());
		System.out.println(pairs.toString());*/
	}
	

}
