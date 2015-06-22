package com.jeju.arraygrade;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class input extends JDialog {
	private Scanner sn;
	private String[] �̸�;
	private int[] �й�, �߰�, �⸻, ����, �⼮;
	private Button check_button;
	JTextField[] in_stuid, in_middle, in_final, in_assign, in_attend,
			in_stuname;

	public input(Frame owner, boolean modal) {
		super(owner, "�����Է�â", modal);

		�߰� = new int[12];
		�⸻ = new int[12];
		���� = new int[12];
		�⼮ = new int[12];
		�й� = new int[12];
		�̸� = new String[12];

		guiinputform();
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public void guiinputform() {
		setSize(400, 550);
		setLayout(null);

		JLabel title1, stuid, stuname, middle, finalexam, assignment, attend;

		title1 = new JLabel("�� �� �� ��");
		stuname = new JLabel("�̸�");
		stuid = new JLabel("�й�");
		middle = new JLabel("�߰�");
		finalexam = new JLabel("�⸻");
		assignment = new JLabel("����");
		attend = new JLabel("�⼮");

		title1.setBounds(150, 40, 80, 20);
		stuname.setBounds(40, 60, 40, 20);
		stuid.setBounds(100, 60, 40, 20);
		middle.setBounds(150, 60, 40, 20);
		finalexam.setBounds(200, 60, 40, 20);
		assignment.setBounds(250, 60, 40, 20);
		attend.setBounds(300, 60, 40, 20);

		in_stuname = new JTextField[12];
		in_stuid = new JTextField[12];
		in_middle = new JTextField[12];
		in_final = new JTextField[12];
		in_assign = new JTextField[12];
		in_attend = new JTextField[12];

		add(title1);
		add(stuname);
		add(stuid);
		add(middle);
		add(finalexam);
		add(assignment);
		add(attend);

		int y = 80;
		for (int i = 0; i < 12; i++) {

			in_stuname[i] = new JTextField("����");
			in_stuid[i] = new JTextField("1228");
			in_middle[i] = new JTextField("100");
			in_final[i] = new JTextField("90");
			in_assign[i] = new JTextField("80");
			in_attend[i] = new JTextField("70");

			in_stuname[i].setBounds(40, y, 40, 20);
			in_stuid[i].setBounds(100, y, 30, 20);
			in_middle[i].setBounds(150, y, 30, 20);
			in_final[i].setBounds(200, y, 30, 20);
			in_assign[i].setBounds(250, y, 30, 20);
			in_attend[i].setBounds(300, y, 30, 20);

			y = y + 30;
			add(in_stuname[i]);
			add(in_stuid[i]);
			add(in_middle[i]);
			add(in_final[i]);
			add(in_assign[i]);
			add(in_attend[i]);
		}

		check_button = new Button("�������");
		check_button.setBounds(160, y + 30, 50, 50);

		inputdata();
		add(check_button);

	}

	public void inputdata() {
		check_button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 12; i++) {

					�̸�[i] = in_stuname[i].getText();
					�й�[i] = Integer.parseInt(in_stuid[i].getText());
					�߰�[i] = Integer.parseInt(in_middle[i].getText());
					�⸻[i] = Integer.parseInt(in_final[i].getText());
					����[i] = Integer.parseInt(in_assign[i].getText());
					�⼮[i] = Integer.parseInt(in_attend[i].getText());

				}
				dispose();
			}
		});
	}

	public int[] get�й�() {
		return �й�;
	}

	public int[] get�߰�() {
		return �߰�;
	}

	public int[] get�⸻() {
		return �⸻;
	}

	public int[] get����() {
		return ����;
	}

	public int[] get�⼮() {
		return �⼮;
	}

	public String[] get�̸�() {
		return �̸�;
	}

}