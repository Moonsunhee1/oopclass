package com.jejunu.Guicalculator;

public class calculator {
	private int firstnum, secondnum;
	private int sum, sub, mul;
	private double div;

	public void Setnum(int firstnum, int secondnum) {
		this.firstnum = firstnum;
		this.secondnum = secondnum;
	}

	public int Sum() {
		sum = firstnum + secondnum;
		return sum;
	}

	public int Sub() {
		sub = firstnum - secondnum;
		return sub;

	}

	public int Mul() {
		mul = firstnum * secondnum;
		return mul;
	}

	public double Div() {
		div = firstnum / secondnum;
		return div;
	}
}
