package com.jeju.arraygrade;

public class scorecal {

	private int �߰�, �⸻, ����, �⼮;

	private double �߰�����, �⸻����, ��������, �⼮����;

	private Student st;

	 private final double �߰��� = 0.3;
	 private final double �⸻�� = 0.3;
	 private final double ������ = 0.3;
	 private final double �⼮�� = 0.1;

	public void ��������(Student st) {
		this.st = st;
		�߰� = st.get�߰�();
		�⸻ = st.get�⸻();
		���� = st.get����();
		�⼮ = st.get�⼮();
	}

	public void ������������(double �߰�����, double �⸻����, double ��������, double �⼮����) {
		this.�߰����� = �߰�����;
		this.�⸻���� = �⸻����;
		this.�������� = ��������;
		this.�⼮���� = �⼮����;
	}

	public double �������ϱ�() {

		double score = (�߰� * �߰����� + �⸻ * �⸻���� + ���� * �������� + �⼮ * �⼮����);
		return score;
	}
}
