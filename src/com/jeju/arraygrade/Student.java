package com.jeju.arraygrade;

public class Student {

	private int 학번, 중간, 기말, 과제, 출석;
	private String 이름;

	public void setvalue(String 이름, int 학번, int 중간, int 기말, int 과제, int 출석) {
		this.이름 = 이름;
		this.학번 = 학번;
		this.중간 = 중간;
		this.기말 = 기말;
		this.과제 = 과제;
		this.출석 = 출석;
	}

	public int get중간() {
		return 중간;
	}

	public int get기말() {
		return 기말;
	}

	public int get과제() {
		return 과제;
	}

	public int get출석() {
		return 출석;
	}

	public int get학번() {
		return 학번;
	}

	public String get이름() {
		return 이름;
	}

}
