package com.jejunu.finalexam;

public class control {
	private calculators cal;
	private input in;

	private double ����;
	private double ���ξ�;
	private double �����Ѱ�;
	private int ��ⱹ��, ��ġ����, �ᱹ��, ���뱹��, ��������, �ع���, �ſ���, �ع�����;
	private double �̸�����, �︸����, �縸����, ��������;

	private control() {
		cal = new calculators();
	}

	public void setContorl(int ��ⱹ��, int ��ġ����, int �ᱹ��, int ���뱹��, int ��������,
			int �ع���, int �ſ���, int �ع�����) {

		cal.set�޴�(��ⱹ��, ��ġ����, �ᱹ��, ���뱹��, ��������, �ع���, �ſ���, �ع�����);

	}

	public void totalmoney() {

		cal.getcalculatefortotal();
		cal.get���εȱݾ�();
		cal.�����Ѱ�();

		���� = cal.get����();
		���ξ� = cal.get���ξ�();
		�����Ѱ� = cal.get�����Ѱ�();
	}

	public void setpoint(double �̸�����, double �︸����, double �縸����, double ��������) {
		cal.set���κ���(�̸�����, �︸����, �縸����, ��������);
	}

	public void setmenu(int ��ⱹ��, int ��ġ����, int �ᱹ��, int ���뱹��, int ��������,
			int �ع���, int �ſ���, int �ع�����) {
		cal.set�޴�(��ⱹ��, ��ġ����, �ᱹ��, ���뱹��, ��������, �ع���, �ſ���, �ع�����);
	}

	public double get����() {
		return ����;
	}

	public double get���ξ�() {
		return ���ξ�;
	}

	public double get�����Ѱ�() {
		return �����Ѱ�;
	}

	public static void main(String[] arg) {
		control con = new control();
		menu me = new menu(con);
	}

}
