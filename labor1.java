package Homework1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class labor1 {

	public static void main(String[] args) {
		
		List<String> elements = new ArrayList<String>();
		Collections.addAll(elements, "E1", "T2", "E1", "U6", "T3", "E1", "R3", "E1", "I4");		
		Collections.replaceAll(elements.subList(0, (int) Math.round(((double) elements.size() / 2))), "E1", "F1");
		System.out.println(elements);
	}
}
