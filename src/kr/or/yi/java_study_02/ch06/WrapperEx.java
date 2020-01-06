package kr.or.yi.java_study_02.ch06;

public class WrapperEx {
	public static void main(String[] args) {
//		do_wrapper();
		
		System.out.println(Character.toLowerCase('A')); //'A'를 소문자로 변환
		
		char c1 = '4';
		char c2 = 'F';
		if(Character.isDigit(c1))  // 문자 c1이 숫자이면 true
			System.out.println(c1 + "는 숫자");
		if(Character.isAlphabetic(c2)) // 문자 c2가 영문자이면 true
			System.out.println(c2 + "는 영문자");
		
		System.out.println(Integer.parseInt("-123")); // "-123"을 10진수로 변환
		System.out.println(Integer.toHexString(28)); // 정수 28을 2진수 문자열로 변환
		System.out.println(Integer.toBinaryString(28)); // 정수 28을 16진수 문자열로 변환
		System.out.println(Integer.bitCount(28)); // 정수 28을 2진수의 1개의 개수
		
		Double d = Double.valueOf(3.14);
		System.out.println(d.toString()); // Double을 문자열 "3.14"로 변환
		System.out.println(Double.parseDouble("3.14")); // 문자열을 실수 3.14로 변환
		
		boolean b = (4>3); // true
		System.out.println(Boolean.toString(b));// true를 문자열 "true"로 변환
		System.out.println(Boolean.parseBoolean("false"));// 문자열을 false로 변환
		
	}

	private static void do_wrapper() {
		// i ~ i4 모두 같은 의미로 모두 integer
		Integer i = 31; //autoboxing 자동으로 기본타입이지만 integer로 선언됨
		Integer i2 = Integer.valueOf(31);
		Integer i3 = new Integer(31);
		Integer i4 = Integer.valueOf("31");
		
		System.out.printf("%d, %d, %d, %d %n", i, i2, i3, i4);
		
		System.out.println(Integer.bitCount(31)); // 31을 이진수로 변환 후 1의 갯수
		System.out.println(Integer.bitCount(32));
		System.out.println(Integer.bitCount(1));
		
		System.out.println();
		System.out.println(Integer.toHexString(31)); // 16진수
		System.out.println(Integer.toBinaryString(31)); // 2진수
		System.out.println(Integer.toOctalString(31)); // 8진수
		
		System.out.println();
		System.out.println(i2.floatValue()); // 실수형(float)으로 변환
		System.out.println(i2.doubleValue());// 실수형(double) 변환
		
		System.out.println();
		String str = i2.toString();//문자열로 변환
		System.out.printf("%s", str);
	}
}
