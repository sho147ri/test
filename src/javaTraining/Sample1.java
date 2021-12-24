package javaTraining;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sample1 {

	public static void main(String[] args) {
		Map<String, String> map1 = new HashMap<>();
		map1.put("Key1-1", "data1-1");
		map1.put("Key1-2", "data1-2");
		map1.put("Key1-3", "data1-3");

		Map<String, String> map2 = new HashMap<>();
		map2.put("Key2-1", "data2-1");
		map2.put("Key2-2", "data2-2");
		map2.put("Key2-3", "data2-3");
		
		List<Map<String, String>> list = new ArrayList<>();
		list.add(map1);
		list.add(map2);
		
		System.out.println(list.get(0).get("Key1-3"));
		
		
	}

}
