package kr.or.yi.java_study_02.ch07.generic;

public class Sale {
	private int no;
	private String code;
	private int saleCnt;
	private int price;
	private int marginRate;

	public int getNo() {
		return no;
	}

	public String getCode() {
		return code;
	}

	public int getSaleCnt() {
		return saleCnt;
	}

	public int getPrice() {
		return price;
	}

	public int getMarginRate() {
		return marginRate;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setSaleCnt(int saleCnt) {
		this.saleCnt = saleCnt;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setMarginRate(int marginRate) {
		this.marginRate = marginRate;
	}

	@Override
	public String toString() {
		return String.format("Sale [no=%s, code=%s, saleCnt=%s, price=%s, marginRate=%s]", no, code, saleCnt, price,
				marginRate);
	}

}
