package com.jejunu.finalexam;

public class calculators {

	private int 고기국수, 멸치국수, 콩국수, 순대국밥, 돼지국밥, 해물탕, 매운탕, 해물파전;
	private double 이만원비, 삼만원비, 사만원비, 육만원비;
	private double 할인액, 총합, 최종총계;

	public void set메뉴(int 고기국수, int 멸치국수, int 콩국수, int 순대국밥, int 돼지국밥, int 해물탕,
			int 매운탕, int 해물파전) {
		this.고기국수 = 고기국수;
		this.멸치국수 = 멸치국수;
		this.콩국수 = 콩국수;
		this.순대국밥 = 순대국밥;
		this.돼지국밥 = 돼지국밥;
		this.해물탕 = 해물탕;
		this.매운탕 = 매운탕;
		this.해물파전 = 해물파전;
	}

	public void set할인비율(double 이만원비, double 삼만원비, double 사만원비, double 육만원비) {
		this.이만원비 = 이만원비;
		this.삼만원비 = 삼만원비;
		this.사만원비 = 사만원비;
		this.육만원비 = 육만원비;
	}

	public void getcalculatefortotal() {
		총합 = (고기국수 * 5000) + (멸치국수 * 4500) + (콩국수 * 6000) + (순대국밥 * 5000)
				+ (돼지국밥 * 6000) + (해물탕 * 8000) + (매운탕 * 7000) + (해물파전 * 10000);

	}

	public void get할인된금액() {

		if (총합 >= 20000 && 총합 < 30000) {
			할인액 = 총합 * (이만원비 * 0.01);
		} else if (총합 >= 30000 && 총합 < 40000) {
			할인액 = 총합 * (삼만원비 * 0.01);
		} else if (총합 >= 40000 && 총합 < 60000) {
			할인액 = 총합 * (사만원비 * 0.01);
		} else if (총합 >= 60000) {
			할인액 = 총합 * (육만원비 * 0.01);
		} else if (총합 < 20000) {
			할인액 = 총합;
		}
		
	}

	public void 최종총계() {
		최종총계 = 총합- (할인액 - (할인액 % 100));
	}

	public double get할인액() {
		return 할인액;
	}

	public double get최종총계() {
		return 최종총계;
	}

	public double get총합() {
		return 총합;
	}

}
