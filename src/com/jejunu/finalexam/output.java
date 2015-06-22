package com.jejunu.finalexam;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class output extends Dialog {

	private int 고기국수, 멸치국수, 콩국수, 순대국밥, 돼지국밥, 해물탕, 매운탕, 해물파전;
	private Label 수량_고기국수, 수량_멸치국수, 수량_콩국수, 수량_순대국밥, 수량_돼지국밥, 수량_해물탕, 수량_매운탕,
			수량_해물파전, 합계, 할인금액, 수령액;
	private Button check_button;
	private double 할인액, 최종총계, 총합;

	public output(Frame frame, boolean modal) {
		super(frame, "계산서", modal);

		setSize(300, 500);
		setLayout(null);

		Label title1, 고기국수, 멸치국수, 콩국수, 순대국밥, 돼지국밥, 해물탕, 매운탕, 해물파전, 합계금액, 할인금액, 수령금액;

		title1 = new Label("계 산 서");
		고기국수 = new Label("고기국수");
		멸치국수 = new Label("멸치국수");
		콩국수 = new Label("콩국수");
		순대국밥 = new Label("순대국밥");
		돼지국밥 = new Label("돼지국밥");
		해물탕 = new Label("해물탕");
		매운탕 = new Label("매운탕");
		해물파전 = new Label("해물파전");
		합계금액 = new Label("합계금액");
		할인금액 = new Label("할인금액");
		수령금액 = new Label("수령금액");

		title1.setBounds(80, 40, 60, 20);
		고기국수.setBounds(30, 70, 60, 20);
		멸치국수.setBounds(30, 100, 60, 20);
		콩국수.setBounds(30, 130, 60, 20);
		순대국밥.setBounds(30, 160, 60, 20);
		돼지국밥.setBounds(30, 190, 60, 20);
		해물탕.setBounds(30, 220, 60, 20);
		매운탕.setBounds(30, 250, 60, 20);
		해물파전.setBounds(30, 280, 60, 20);
		합계금액.setBounds(30, 310, 60, 20);
		할인금액.setBounds(30, 340, 60, 20);
		수령금액.setBounds(30, 370, 60, 20);

		add(title1);
		add(고기국수);
		add(멸치국수);
		add(콩국수);
		add(순대국밥);
		add(돼지국밥);
		add(해물탕);
		add(매운탕);
		add(해물파전);
		add(합계금액);
		add(할인금액);
		add(수령금액);

		check_button = new Button("돌아가기");
		check_button.setBounds(130, 400, 50, 50);
		add(check_button);
		returnaction();

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
	}

	public void setvalue(int 고기국수, int 멸치국수, int 콩국수, int 순대국밥, int 돼지국밥,
			int 해물탕, int 매운탕, int 해물파전, double 총합, double 할인액, double 최종총계) {
		this.고기국수 = 고기국수;
		this.멸치국수 = 멸치국수;
		this.콩국수 = 콩국수;
		this.순대국밥 = 순대국밥;
		this.돼지국밥 = 돼지국밥;
		this.해물탕 = 해물탕;
		this.매운탕 = 매운탕;
		this.해물파전 = 해물파전;
		this.총합 = 총합;
		this.할인액 = 할인액;
		this.최종총계 = 최종총계;

	}

	public void totaloutput() {

		수량_고기국수 = new Label(":" + Integer.toString(고기국수) + "개");
		수량_멸치국수 = new Label(":" + Integer.toString(멸치국수) + "개");
		수량_콩국수 = new Label(":" + Integer.toString(콩국수) + "개");
		수량_순대국밥 = new Label(":" + Integer.toString(순대국밥) + "개");
		수량_돼지국밥 = new Label(":" + Integer.toString(돼지국밥) + "개");
		수량_해물탕 = new Label(":" + Integer.toString(해물탕) + "개");
		수량_매운탕 = new Label(":" + Integer.toString(매운탕) + "개");
		수량_해물파전 = new Label(":" + Integer.toString(해물파전) + "개");
		합계 = new Label(":" + Double.toString(총합) + "원");
		할인금액 = new Label(":" + Double.toString(할인액) + "원");
		수령액 = new Label(":" + Double.toString(최종총계) + "원");

		수량_고기국수.setBounds(100, 70, 40, 20);
		수량_멸치국수.setBounds(100, 100, 40, 20);
		수량_콩국수.setBounds(100, 130, 40, 20);
		수량_순대국밥.setBounds(100, 160, 40, 20);
		수량_돼지국밥.setBounds(100, 190, 40, 20);
		수량_해물탕.setBounds(100, 220, 40, 20);
		수량_매운탕.setBounds(100, 250, 40, 20);
		수량_해물파전.setBounds(100, 280, 40, 20);
		합계.setBounds(100, 310, 60, 20);
		할인금액.setBounds(100, 340, 60, 20);
		수령액.setBounds(100, 370, 60, 20);

		add(수량_고기국수);
		add(수량_멸치국수);
		add(수량_콩국수);
		add(수량_순대국밥);
		add(수량_돼지국밥);
		add(수량_해물탕);
		add(수량_매운탕);
		add(수량_해물파전);
		add(합계);
		add(할인금액);
		add(수령액);

		setVisible(true);

	}

	private void returnaction() {
		check_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}

}
