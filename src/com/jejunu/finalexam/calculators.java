package com.jejunu.finalexam;

public class calculators {

	private int ���ⱹ��, ��ġ����, �ᱹ��, ���뱹��, ��������, �ع���, �ſ���, �ع�����;
	private double �̸�����, �︸����, �縸����, ��������;
	private double ���ξ�, ����, �����Ѱ�;

	public void set�޴�(int ���ⱹ��, int ��ġ����, int �ᱹ��, int ���뱹��, int ��������, int �ع���,
			int �ſ���, int �ع�����) {
		this.���ⱹ�� = ���ⱹ��;
		this.��ġ���� = ��ġ����;
		this.�ᱹ�� = �ᱹ��;
		this.���뱹�� = ���뱹��;
		this.�������� = ��������;
		this.�ع��� = �ع���;
		this.�ſ��� = �ſ���;
		this.�ع����� = �ع�����;
	}

	public void set���κ���(double �̸�����, double �︸����, double �縸����, double ��������) {
		this.�̸����� = �̸�����;
		this.�︸���� = �︸����;
		this.�縸���� = �縸����;
		this.�������� = ��������;
	}

	public void getcalculatefortotal() {
		���� = (���ⱹ�� * 5000) + (��ġ���� * 4500) + (�ᱹ�� * 6000) + (���뱹�� * 5000)
				+ (�������� * 6000) + (�ع��� * 8000) + (�ſ��� * 7000) + (�ع����� * 10000);

	}

	public void get���εȱݾ�() {

		if (���� >= 20000 && ���� < 30000) {
			���ξ� = ���� * (�̸����� * 0.01);
		} else if (���� >= 30000 && ���� < 40000) {
			���ξ� = ���� * (�︸���� * 0.01);
		} else if (���� >= 40000 && ���� < 60000) {
			���ξ� = ���� * (�縸���� * 0.01);
		} else if (���� >= 60000) {
			���ξ� = ���� * (�������� * 0.01);
		} else if (���� < 20000) {
			���ξ� = ����;
		}
		
	}

	public void �����Ѱ�() {
		�����Ѱ� = ����- (���ξ� - (���ξ� % 100));
	}

	public double get���ξ�() {
		return ���ξ�;
	}

	public double get�����Ѱ�() {
		return �����Ѱ�;
	}

	public double get����() {
		return ����;
	}

}
