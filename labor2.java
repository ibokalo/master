package Homework1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class labor2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(3);
		list.add(4);
		list.add(8);
		list.add(3);
		list.add(6);
		list.add(6);
		list.add(1);
		list.add(5);
		
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);{
			
	    Set<Integer> setFromList = new HashSet<>(list);
        System.out.println(setFromList);
		}

	}

}
