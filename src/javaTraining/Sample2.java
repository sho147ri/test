package javaTraining;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sample2 {
	public static void main(String[] args) {

		System.out.println("Set");
		Set<String> set1 = new HashSet<>();
		set1.add("data1");
		set1.add("data3");
		set1.add("data4");
		set1.add("data4");
		set1.add("data2");

		for (String val : set1) {
			System.out.println(val);
		}
		
		System.out.println("TreeSet");
		Set<String> set2 = new TreeSet<>();
		set2.add("data1");
		set2.add("data3");
		set2.add("data4");
		set2.add("data4");
		set2.add("data2");

		for (String val : set2) {
			System.out.println(val);
		}

		
		System.out.println("LinkedHashSet");
		Set<String> set3 = new LinkedHashSet<>();
		set3.add("data1");
		set3.add("data3");
		set3.add("data4");
		set3.add("data4");
		set3.add("data2");

		for (String val : set3) {
			System.out.println(val);
		}
	}
}
