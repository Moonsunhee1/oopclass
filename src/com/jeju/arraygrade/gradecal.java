package com.jeju.arraygrade;

public class gradecal {
	private double score;
	private String 학점;

	public void 점수설정(double score) {
		this.score = score;
	}

	public String 학점정하기(double score) {
		if (score >= 90) {
			학점 = "A";
		} else if (score >= 80) {
			학점 = "B";
		} else if (score >= 70) {
			학점 = "C";
		} else if (score >= 60) {
			학점 = "D";
		} else {
			학점 = "F";
		}
		return 학점;
	}
}
