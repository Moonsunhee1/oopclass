package com.jeju.arraygrade;

import javax.swing.JFrame;



public class Controller extends JFrame {

	private gradecal gcal;
	private scorecal scal;
	private menu me;
	private Student[] st;
	private String[] ����;
	private double[] score;

	private Controller() {
		gcal = new gradecal();
		scal = new scorecal();
		st = new Student[12];

		for (int i = 0; i < 12; i++) {
			st[i] = new Student();
		}

		score = new double[12];
		���� = new String[12];
	}

	public void result() {
		for (int i = 0; i < 12; i++) {
			scal.��������(st[i]);
			score[i] = scal.�������ϱ�();
			gcal.��������(score[i]);
			����[i] = gcal.�������ϱ�(score[i]);
		}
	}

	public void setControl(String �̸�[], int[] �й�, int[] �߰�, int[] �⸻, int[] ����,
			int[] �⼮) {
		for (int i = 0; i < 12; i++) {
			st[i].setvalue(�̸�[i], �й�[i], �߰�[i], �⸻[i], ����[i], �⼮[i]);
		}
	}

	public Student[] getStudent() {
		return st;
	}

	public double[] getScore() {
		return score;
	}

	public String[] get����() {
		return ����;
	}

	public void setrate(double �߰�����, double �⸻����, double ��������, double �⼮����) {
		scal.������������(�߰�����, �⸻����, ��������, �⼮����);
	}

	public static void main(String[] args) {
		Controller con = new Controller();
		menu me = new menu(con);
	}

}
