package com.jejunu.finalexam;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;

public class menulist extends JDialog {
	private int 고기국수, 멸치국수, 콩국수, 순대국밥, 돼지국밥, 해물탕, 매운탕, 해물파전;
	private Button check_button;

	public menulist(Frame owner, boolean modal) {
		super(owner, "차림표", modal);

		setSize(230, 400);
		setLayout(null);
		Label title1, 고기국수, 멸치국수, 콩국수, 순대국밥, 돼지국밥, 해물탕, 매운탕, 해물파전;

		title1 = new Label("주 문 표");
		고기국수 = new Label("고기국수");
		멸치국수 = new Label("멸치국수");
		콩국수 = new Label("콩국수");
		순대국밥 = new Label("순대국밥");
		돼지국밥 = new Label("돼지국밥");
		해물탕 = new Label("해물탕");
		매운탕 = new Label("매운탕");
		해물파전 = new Label("해물파전");

		Label 고기국수가격 = new Label("5000");
		Label 멸치국수가격 = new Label("4500");
		Label 콩국수가격 = new Label("6000");
		Label 순대국밥가격 = new Label("5000");
		Label 돼지국밥가격 = new Label("6000");
		Label 해물탕가격 = new Label("8000");
		Label 매운탕가격 = new Label("7000");
		Label 해물파전가격 = new Label("10000");

		title1.setBounds(80, 40, 60, 20);
		고기국수.setBounds(30, 70, 60, 20);
		멸치국수.setBounds(30, 100, 60, 20);
		콩국수.setBounds(30, 130, 60, 20);
		순대국밥.setBounds(30, 160, 60, 20);
		돼지국밥.setBounds(30, 190, 60, 20);
		해물탕.setBounds(30, 220, 60, 20);
		매운탕.setBounds(30, 250, 60, 20);
		해물파전.setBounds(30, 280, 60, 20);

		고기국수가격.setBounds(100, 70, 60, 20);
		멸치국수가격.setBounds(100, 100, 60, 20);
		콩국수가격.setBounds(100, 130, 60, 20);
		순대국밥가격.setBounds(100, 160, 60, 20);
		돼지국밥가격.setBounds(100, 190, 60, 20);
		해물탕가격.setBounds(100, 220, 60, 20);
		매운탕가격.setBounds(100, 250, 60, 20);
		해물파전가격.setBounds(100, 280, 60, 20);

		add(title1);
		add(고기국수);
		add(멸치국수);
		add(콩국수);
		add(순대국밥);
		add(돼지국밥);
		add(해물탕);
		add(매운탕);
		add(해물파전);

		add(고기국수가격);
		add(멸치국수가격);
		add(콩국수가격);
		add(순대국밥가격);
		add(돼지국밥가격);
		add(해물탕가격);
		add(매운탕가격);
		add(해물파전가격);

		check_button = new Button("돌아가기");
		check_button.setBounds(80, 300, 70, 50);
		add(check_button);

		backaction();
	}

	private void backaction() {
		check_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}

}
