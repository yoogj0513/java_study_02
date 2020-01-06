package kr.or.yi.java_study_02.ch06reveiw;

import java.util.Arrays;

import kr.or.yi.java_study_02.ch06.Student;

class Product {
	private String code;
	private String name;

	public Product(String code, String name) {
		this.code = code;
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("Product [code=%s, name=%s]", code, name);
	}

}

class Sale {
	private int no;
	private String code;
	private int price;
	private int saleCnt;
	private int marginRate;

	public Sale(int no, String code, int price, int saleCnt, int marginRate) {
		this.no = no;
		this.code = code;
		this.price = price;
		this.saleCnt = saleCnt;
		this.marginRate = marginRate;
	}

	@Override
	public String toString() {
		return String.format("Sale [no=%s, code=%s, price=%s, saleCnt=%s, marginRate=%s]", no, code, price, saleCnt,
				marginRate);
	}

}

public class Exam {

	public static void main(String[] args) {
		String std01 = "1,이상원,90,90,90";
		String[] std01Arr = std01.split(",");

		Student std = new Student(Integer.parseInt(std01Arr[0]), std01Arr[1], Integer.parseInt(std01Arr[2]),
				Integer.parseInt(std01Arr[3]), Integer.parseInt(std01Arr[4]));

		System.out.println(std);

//		StringTokenizer st = new StringTokenizer(std01, ",");
		exam01();

	}

	private static void exam01() {
		String[] productArr = { "A001,아메리카노", // code, name Product p = new Product(code, name)
				"A002,카푸치노", "A003,헤이즐넛", "A004,에스프레소", "B001,딸기쉐이크", "B002,후르츠와인", "B003,팥빙수", "B004,아이스초코" };

		String[] saleArr = { "1,A001,4500,150,10", // no, code, price, saleCnt, marginRate
				"2,A002,3800,140,15", "3,B001,5200,250,12", "4,B001,4300,110,11", };
		// 위의 문장을 이용하여 Product클래스와 Sale클래스를 정의하고
		// Product[] pdtArrs와 Sale[] saleArrs로 변경하시오.
		Product[] pdtArrs = convert_to_Product(productArr);
		System.out.println(Arrays.toString(pdtArrs));

		Sale[] saleArrs = convert_to_Sale(saleArr);
		System.out.println(Arrays.toString(saleArrs));
	}

	private static Sale[] convert_to_Sale(String[] saleArr) {
		Sale[] sales = new Sale[saleArr.length];
		for (int i = 0; i < saleArr.length; i++) {
			sales[i] = getSale(saleArr[i]);
		}
		return sales;
	}

	private static Product[] convert_to_Product(String[] productArr) {
		Product[] pdt = new Product[productArr.length];
		for (int i = 0; i < productArr.length; i++) {
			pdt[i] = getProduct(productArr[i]);
		}
		return pdt;
	}

	private static Product getProduct(String pdtArr) {
		String[] arr = pdtArr.split(",");
		return new Product(arr[0], arr[1]);
	}

	private static Sale getSale(String saleArr) {
		String[] arr = saleArr.split(",");
		int no = Integer.parseInt(arr[0]);
		String code = arr[1];
		int price = Integer.parseInt(arr[2]);
		int saleCnt = Integer.parseInt(arr[3]);
		int marginRate = Integer.parseInt(arr[4]);
		return new Sale(no, code, price, saleCnt, marginRate);
	}
}
