package kr.or.yi.java_study_02.ch07.collection;

import java.util.*;

public class Ex11_02 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);
		
		HashSet<Integer> set = new HashSet<>(list);
		System.out.println(set);
		TreeSet<Integer> tset = new TreeSet<>(set);
		System.out.println(tset);
		Stack<Integer> stack = new Stack<>();
		stack.addAll(tset);
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
	}
}
