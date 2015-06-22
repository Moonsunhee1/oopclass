package com.jeju.arraygrade;

import javax.swing.JFrame;



public class Controller extends JFrame {

	private gradecal gcal;
	private scorecal scal;
	private menu me;
	private Student[] st;
	private String[] 학점;
	private double[] score;

	private Controller() {
		gcal = new gradecal();
		scal = new scorecal();
		st = new Student[12];

		for (int i = 0; i < 12; i++) {
			st[i] = new Student();
		}

		score = new double[12];
		학점 = new String[12];
	}

	public void result() {
		for (int i = 0; i < 12; i++) {
			scal.점수설정(st[i]);
			score[i] = scal.총점구하기();
			gcal.점수설정(score[i]);
			학점[i] = gcal.학점정하기(score[i]);
		}
	}

	public void setControl(String 이름[], int[] 학번, int[] 중간, int[] 기말, int[] 과제,
			int[] 출석) {
		for (int i = 0; i < 12; i++) {
			st[i].setvalue(이름[i], 학번[i], 중간[i], 기말[i], 과제[i], 출석[i]);
		}
	}

	public Student[] getStudent() {
		return st;
	}

	public double[] getScore() {
		return score;
	}

	public String[] get학점() {
		return 학점;
	}

	public void setrate(double 중간비율, double 기말비율, double 과제비율, double 출석비율) {
		scal.점수비율설정(중간비율, 기말비율, 과제비율, 출석비율);
	}

	public static void main(String[] args) {
		Controller con = new Controller();
		menu me = new menu(con);
	}

}
