package com.jeju.arraygrade;

public class gradecal {
	private double score;
	private String ����;

	public void ��������(double score) {
		this.score = score;
	}

	public String �������ϱ�(double score) {
		if (score >= 90) {
			���� = "A";
		} else if (score >= 80) {
			���� = "B";
		} else if (score >= 70) {
			���� = "C";
		} else if (score >= 60) {
			���� = "D";
		} else {
			���� = "F";
		}
		return ����;
	}
}
