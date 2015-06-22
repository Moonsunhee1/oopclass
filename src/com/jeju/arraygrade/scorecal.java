package com.jeju.arraygrade;

public class scorecal {

	private int 중간, 기말, 과제, 출석;

	private double 중간비율, 기말비율, 과제비율, 출석비율;

	private Student st;

	 private final double 중간비 = 0.3;
	 private final double 기말비 = 0.3;
	 private final double 과제비 = 0.3;
	 private final double 출석비 = 0.1;

	public void 점수설정(Student st) {
		this.st = st;
		중간 = st.get중간();
		기말 = st.get기말();
		과제 = st.get과제();
		출석 = st.get출석();
	}

	public void 점수비율설정(double 중간비율, double 기말비율, double 과제비율, double 출석비율) {
		this.중간비율 = 중간비율;
		this.기말비율 = 기말비율;
		this.과제비율 = 과제비율;
		this.출석비율 = 출석비율;
	}

	public double 총점구하기() {

		double score = (중간 * 중간비율 + 기말 * 기말비율 + 과제 * 과제비율 + 출석 * 출석비율);
		return score;
	}
}
