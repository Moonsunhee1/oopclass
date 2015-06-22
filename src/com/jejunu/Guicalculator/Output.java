package com.jejunu.Guicalculator;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Output extends Frame implements ActionListener {

	private Label frist_label, second_label;
	private Label hap_label, cha_label, gop_label, mok_label;
	private int firstnum, secondnum;
	private int sum, sub, mul;
	private double div;

	public Output() {

		super("사칙연산 결과");
		setLayout(null);

		Button out_check_button;
		Label title1, title2, title3;

		title1 = new Label(
				"----------------------------------------------------------");
		title1.setBounds(10, 40, 500, 3);
		add(title1);

		title2 = new Label("사칙연산 결과");
		title2.setBounds(90, 60, 500, 15);
		add(title2);

		title3 = new Label(
				"----------------------------------------------------------");
		title3.setBounds(10, 80, 500, 3);
		add(title3);

		frist_label = new Label("첫째수");
		frist_label.setBounds(50, 104, 70, 20);
		add(frist_label);
		second_label = new Label("둘째수");
		second_label.setBounds(120, 104, 70, 20);
		add(second_label);

		hap_label = new Label("합");
		hap_label.setBounds(80, 130, 50, 20);
		add(hap_label);

		cha_label = new Label("차");
		cha_label.setBounds(80, 150, 50, 20);
		add(cha_label);

		gop_label = new Label("곱");
		gop_label.setBounds(80, 170, 50, 20);
		add(gop_label);

		mok_label = new Label("몫");
		mok_label.setBounds(80, 190, 50, 20);
		add(mok_label);

		out_check_button = new Button("돌아가기");
		out_check_button.setBounds(80, 210, 60, 30);
		add(out_check_button);

		out_check_button.addActionListener(this);

		addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {

				dispose();
				System.exit(0);
			}
		});

	}

	public void set_data(int firstnum, int secondnum, int sum, int sub,
			int mul, double div) {
		this.firstnum = firstnum;
		this.secondnum = secondnum;
		this.sum = sum;
		this.sub = sub;
		this.mul = mul;
		this.div = div;

	}

	public void data_print() {
		frist_label.setText("첫째수:" + firstnum);
		second_label.setText("둘째수:" + secondnum);
		hap_label.setText("합: " + sum);
		cha_label.setText("차:" + sub);
		gop_label.setText("곱:" + mul);
		mok_label.setText("몫:" + div);

		repaint();
	}

	@Override
	public void actionPerformed(ActionEvent er) {
		if ("돌아가기".equals(er.getActionCommand())) {
			dispose();
			input in = new input();
			in.setSize(220, 220);
			in.setVisible(true);

		}
	}
}