package com.jejunu.finalexam;

public class control {
	private calculators cal;
	private input in;

	private double 총합;
	private double 할인액;
	private double 최종총계;
	private int 고기국수, 멸치국수, 콩국수, 순대국밥, 돼지국밥, 해물탕, 매운탕, 해물파전;
	private double 이만원비, 삼만원비, 사만원비, 육만원비;

	private control() {
		cal = new calculators();
	}

	public void setContorl(int 고기국수, int 멸치국수, int 콩국수, int 순대국밥, int 돼지국밥,
			int 해물탕, int 매운탕, int 해물파전) {

		cal.set메뉴(고기국수, 멸치국수, 콩국수, 순대국밥, 돼지국밥, 해물탕, 매운탕, 해물파전);

	}

	public void totalmoney() {

		cal.getcalculatefortotal();
		cal.get할인된금액();
		cal.최종총계();

		총합 = cal.get총합();
		할인액 = cal.get할인액();
		최종총계 = cal.get최종총계();
	}

	public void setpoint(double 이만원비, double 삼만원비, double 사만원비, double 육만원비) {
		cal.set할인비율(이만원비, 삼만원비, 사만원비, 육만원비);
	}

	public void setmenu(int 고기국수, int 멸치국수, int 콩국수, int 순대국밥, int 돼지국밥,
			int 해물탕, int 매운탕, int 해물파전) {
		cal.set메뉴(고기국수, 멸치국수, 콩국수, 순대국밥, 돼지국밥, 해물탕, 매운탕, 해물파전);
	}

	public double get총합() {
		return 총합;
	}

	public double get할인액() {
		return 할인액;
	}

	public double get최종총계() {
		return 최종총계;
	}

	public static void main(String[] arg) {
		control con = new control();
		menu me = new menu(con);
	}

}
