package com.jejunu.Guicalculator;

public class Controller {
	private int firstnum, secondnum;
	private Output out;
	private calculator cal;
	private int sum, sub, mul;
	private double div;

	public Controller() {
		cal = new calculator();
		out = new Output();
	}

	public void data_set(int firstnum, int secondnum) {
		this.firstnum = firstnum;
		this.secondnum = secondnum;
	}

	public void control() {

		cal.Setnum(firstnum, secondnum);
		sum = cal.Sum();
		sub = cal.Sub();
		mul = cal.Mul();
		div = cal.Div();

		out.setSize(250, 250);
		out.setVisible(true);
		out.set_data(firstnum, secondnum, sum, sub, mul, div);
		out.data_print();
	}

	public static void main(String[] args) {
		input in = new input();
		in.setSize(220, 220);
		in.setVisible(true);
	}
}
