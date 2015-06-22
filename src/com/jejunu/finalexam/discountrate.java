package com.jejunu.finalexam;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

public class discountrate extends JDialog {

	private double 이만원비, 삼만원비, 사만원비, 육만원비;
	private TextField 이만원이상비, 삼만원이상비, 사만원이상비, 육만원이상비, 수량_돼지국밥, 수량_해물탕, 수량_매운탕,
			수량_해물파전;
	Label title1, 고기국수, 멸치국수, 콩국수, 순대국밥, 돼지국밥, 해물탕, 매운탕, 해물파전;
	private Button check_button;

	public discountrate(Frame owner, boolean modal) {
		super(owner, "할인율", modal);

		setSize(230, 400);
		setLayout(null);
		Label title1, 이만원이상, 삼만원이상, 사만원이상, 육만원이상;

		title1 = new Label("할인율");
		이만원이상 = new Label("이만원이상");
		삼만원이상 = new Label("삼만원이상");
		사만원이상 = new Label("사만원이상");
		육만원이상 = new Label("육만원이상");

		title1.setBounds(80, 40, 60, 20);
		이만원이상.setBounds(30, 70, 70, 20);
		삼만원이상.setBounds(30, 100, 70, 20);
		사만원이상.setBounds(30, 130, 70, 20);
		육만원이상.setBounds(30, 160, 70, 20);

		add(title1);
		add(이만원이상);
		add(삼만원이상);
		add(사만원이상);
		add(육만원이상);

		이만원이상비 = new TextField("1");
		삼만원이상비 = new TextField("2");
		사만원이상비 = new TextField("3");
		육만원이상비 = new TextField("5");

		이만원이상비.setBounds(110, 70, 30, 20);
		삼만원이상비.setBounds(110, 100, 30, 20);
		사만원이상비.setBounds(110, 130, 30, 20);
		육만원이상비.setBounds(110, 160, 30, 20);

		add(이만원이상비);
		add(삼만원이상비);
		add(사만원이상비);
		add(육만원이상비);

		check_button = new Button("적용하기");
		check_button.setBounds(80, 200, 50, 50);
		add(check_button);

		inputrate();

	}

	private void inputrate() {
		check_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				이만원비 = Integer.parseInt(이만원이상비.getText());
				삼만원비 = Integer.parseInt(삼만원이상비.getText());
				사만원비 = Integer.parseInt(사만원이상비.getText());
				육만원비 = Integer.parseInt(육만원이상비.getText());

				dispose();
			}
		});
	}
	
	

	public double get이만원비() {
		return 이만원비;
	}

	public double get삼만원비() {
		return 삼만원비;
	}

	public double get사만원비() {
		return 사만원비;
	}

	public double get육만원비() {
		return 육만원비;
	}

}
