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

		super("��Ģ���� ���");
		setLayout(null);

		Button out_check_button;
		Label title1, title2, title3;

		title1 = new Label(
				"----------------------------------------------------------");
		title1.setBounds(10, 40, 500, 3);
		add(title1);

		title2 = new Label("��Ģ���� ���");
		title2.setBounds(90, 60, 500, 15);
		add(title2);

		title3 = new Label(
				"----------------------------------------------------------");
		title3.setBounds(10, 80, 500, 3);
		add(title3);

		frist_label = new Label("ù°��");
		frist_label.setBounds(50, 104, 70, 20);
		add(frist_label);
		second_label = new Label("��°��");
		second_label.setBounds(120, 104, 70, 20);
		add(second_label);

		hap_label = new Label("��");
		hap_label.setBounds(80, 130, 50, 20);
		add(hap_label);

		cha_label = new Label("��");
		cha_label.setBounds(80, 150, 50, 20);
		add(cha_label);

		gop_label = new Label("��");
		gop_label.setBounds(80, 170, 50, 20);
		add(gop_label);

		mok_label = new Label("��");
		mok_label.setBounds(80, 190, 50, 20);
		add(mok_label);

		out_check_button = new Button("���ư���");
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
		frist_label.setText("ù°��:" + firstnum);
		second_label.setText("��°��:" + secondnum);
		hap_label.setText("��: " + sum);
		cha_label.setText("��:" + sub);
		gop_label.setText("��:" + mul);
		mok_label.setText("��:" + div);

		repaint();
	}

	@Override
	public void actionPerformed(ActionEvent er) {
		if ("���ư���".equals(er.getActionCommand())) {
			dispose();
			input in = new input();
			in.setSize(220, 220);
			in.setVisible(true);

		}
	}
}