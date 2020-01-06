package kr.or.yi.java_study_02.ch07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
//		ArrayList arr = new ArrayList(); //ArrayList<Object> arr = new ArrayList<>(); 로 선언 한것과 같음. 좋지않은 방법
		
		List<Integer>arList = new ArrayList<>();
		
		arList.add(5); // index = 0
		arList.add(3); // index = 1
		arList.add(4);
		arList.add(2);
		arList.add(1);
		
		for(int i=0; i<arList.size(); i++) {
			System.out.println(arList.get(i));
		}
		
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("이상원");
		strList.add("황태원");
		strList.add("권수진");
		strList.add("이상원");
		String[] a = new String[strList.size()];
		System.out.println(Arrays.toString(a));
		strList.toArray(a);
		System.out.println(Arrays.toString(a));
		
		
		
		
		
		/*
		for(String name : strList) {
			System.out.println(name);
		}
		
		if(strList.contains("황태원")){
			System.out.println("포함");
		} else {
			System.out.println("미포함");
		}
		
		int findIdx = strList.lastIndexOf("이상원");
		System.out.println(findIdx);
		
		
		
		System.out.println(strList.isEmpty());
//		strList.remove(0); //index로도 삭제 가능
		strList.remove("이상원");
		System.out.println(strList);
		
//		strList.clear();
		System.out.println(strList.isEmpty());
		strList.clear();
		
		
		strList.clear();
		System.out.println(strList);
		
		*/
		
//		int는 사용불가. 기본 타입이기 때문에
//		addList(arList);
//		
//		for(int i=0; i<arList.size(); i++) {
//			int a = arList.get(i);
//			System.out.println(a);
//		}
	}

	private static void addList(List<Integer> arList) {
		System.out.println("arList.size() : " + arList.size());
		
		//추가
		arList.add(5);
		System.out.println("arList.size() : " + arList.size());
		for(int i=0; i<10; i++) {
			arList.add(i); //i는 int지만 오토박싱되어 들어감
		}
		System.out.println("arList.size() : " + arList.size());
		System.out.println(arList); //toString이 적용되어 있음
		
		arList.add(1, 10);
		System.out.println(arList); //1의 위치에 10을 추가함. 자동으로 리스트가 밀려나고 추가가 됨
		
		ArrayList<Integer> subList = new ArrayList<Integer>();
		subList.add(20);
		subList.add(21);
		subList.add(22);
		
		arList.addAll(subList);
		System.out.println(arList);
	}
}
