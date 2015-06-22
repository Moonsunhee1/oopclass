package com.jeju.arraygrade;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class scorerate extends JDialog {
	private double 중간비율, 기말비율, 과제비율, 출석비율;
	private Button check_button;
	JTextField in_중간비율, in_기말비율, in_과제비율, in_출석비율;

	public scorerate(Frame owner, boolean modal) {
		super(owner, "비율입력창", modal);
		guiinputform();
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public void guiinputform() {
		setSize(300, 300);
		setLayout(null);

		JLabel title1, middlerate, finalrate, assignrate, attendrate;

		title1 = new JLabel("비 율 입 력");
		middlerate = new JLabel("중간비율");
		finalrate = new JLabel("기말비율");
		assignrate = new JLabel("과제비율");
		attendrate = new JLabel("출석비율");

		title1.setBounds(80, 40, 80, 20);
		middlerate.setBounds(30, 70, 60, 20);
		finalrate.setBounds(30, 100, 60, 20);
		assignrate.setBounds(30, 130, 60, 20);
		attendrate.setBounds(30, 160, 60, 20);

		add(title1);
		add(middlerate);
		add(finalrate);
		add(assignrate);
		add(attendrate);

		in_중간비율 = new JTextField("0.3");
		in_기말비율 = new JTextField("0.3");
		in_과제비율 = new JTextField("0.3");
		in_출석비율 = new JTextField("0.1");

		in_중간비율.setBounds(100, 70, 40, 20);
		in_기말비율.setBounds(100, 100, 40, 20);
		in_과제비율.setBounds(100, 130, 40, 20);
		in_출석비율.setBounds(100, 160, 40, 20);

		add(in_중간비율);
		add(in_기말비율);
		add(in_과제비율);
		add(in_출석비율);

		check_button = new Button("적용하기");
		check_button.setBounds(160, 130, 50, 50);

		inputratedata();
		add(check_button);

	}

	public void inputratedata() {
		check_button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				중간비율 = Double.parseDouble(in_중간비율.getText());
				기말비율 = Double.parseDouble(in_기말비율.getText());
				과제비율 = Double.parseDouble(in_과제비율.getText());
				출석비율 = Double.parseDouble(in_출석비율.getText());

				dispose();
			}
		});
	}

	public double get중간비율() {
		return 중간비율;
	}

	public double get기말비율() {
		return 기말비율;
	}

	public double get과제비율() {
		return 과제비율;
	}

	public double get출석비율() {
		return 출석비율;
	}

}
