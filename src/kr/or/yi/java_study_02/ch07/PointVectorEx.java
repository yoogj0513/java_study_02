package kr.or.yi.java_study_02.ch07;

import java.util.Vector;

public class PointVectorEx {

	public static void main(String[] args) {
		Vector<Point> v = new Vector<Point>();
		v.add(new Point(2, 3));
		v.add(new Point(-5, 20));
		v.add(new Point(30, -8));
		
		v.remove(1);
		
		for(int i=0; i<v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p);
		}
		
		System.out.println(v.contains(new Point(30, -8)));
		System.out.println(v.indexOf(new Point(30, -8)));
		v.remove(new Point(30, -8));
		System.out.println(v);
		
//		System.out.println(v.contains(v.get(1)));
//		System.out.println(v.indexOf(v.get(1)));
//		v.remove(v.remove(1));
//		System.out.println(v);
	}

}
