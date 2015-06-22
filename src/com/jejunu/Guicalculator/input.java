package com.jejunu.Guicalculator;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class input extends Frame implements ActionListener {
	private TextField text_first_input, text_second_input;
	private Button check_button;
	private int firstnum, secondnum;

	public input() {
		super("계산기 프로그램");
		setLayout(null);

		Label title1, title2, title3;
		Label label_first_num, label_second_num;
		title1 = new Label("---------------------------------------------");
		title1.setBounds(10, 40, 500, 3);
		add(title1);

		title2 = new Label("사칙연산을 위한 자료 입력");
		title2.setBounds(30, 60, 500, 15);
		add(title2);

		title3 = new Label("---------------------------------------------");
		title3.setBounds(10, 80, 500, 3);
		add(title3);

		label_first_num = new Label("first num:");
		label_first_num.setBounds(50, 95, 80, 45);
		add(label_first_num);

		label_second_num = new Label("Second num:");
		label_second_num.setBounds(50, 130, 80, 35);
		add(label_second_num);

		text_first_input = new TextField();
		text_first_input.setBounds(130, 105, 35, 20);
		add(text_first_input);

		text_second_input = new TextField();
		text_second_input.setBounds(130, 135, 35, 20);
		add(text_second_input);

		check_button = new Button("사 칙 연 산");
		check_button.setBounds(70, 180, 80, 20);
		add(check_button);

		check_button.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if ("사 칙 연 산".equals(e.getActionCommand())) {
			firstnum = Integer.parseInt(text_first_input.getText());
			secondnum = Integer.parseInt(text_second_input.getText());
			Controller con = new Controller();
			con.data_set(firstnum, secondnum);
			con.control();
			this.dispose();
		} else {
			System.exit(0);
		}
	}
}
