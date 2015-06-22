package com.jeju.arraygrade;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class output extends JDialog {

	private int[] �й�, �߰�, �⸻, ����, �⼮;
	private double[] score;
	private String[] ����, �̸�;
	private JButton outbutton;
	private JLabel middleexam, finalexam, assignment, attendent, grade, stuid,
			totalscore, stname;
	JLabel[] �л��й�, �л��̸�, �߰����, �⸻���, ��������, �⼮����, ������, ������;

	public output(Frame owner, boolean modal) {
		super(owner, "��°��â", modal);

		setSize(550, 600);
		setLayout(null);

		JLabel title1;

		title1 = new JLabel("������°��");
		stname = new JLabel("�̸�");
		stuid = new JLabel("�й�");
		middleexam = new JLabel("�߰�");
		finalexam = new JLabel("�⸻");
		assignment = new JLabel("����");
		attendent = new JLabel("�⼮");
		totalscore = new JLabel("������");
		grade = new JLabel("����");

		�л��̸� = new JLabel[12];
		�л��й� = new JLabel[12];
		�߰���� = new JLabel[12];
		�⸻��� = new JLabel[12];
		�������� = new JLabel[12];
		�⼮���� = new JLabel[12];
		������ = new JLabel[12];
		������ = new JLabel[12];

		title1.setBounds(180, 20, 80, 20);
		stname.setBounds(50, 50, 30, 20);
		stuid.setBounds(100, 50, 30, 20);
		middleexam.setBounds(150, 50, 30, 20);
		finalexam.setBounds(200, 50, 30, 20);
		assignment.setBounds(250, 50, 30, 20);
		attendent.setBounds(300, 50, 30, 20);
		totalscore.setBounds(350, 50, 40, 20);
		grade.setBounds(400, 50, 30, 20);

		add(title1);
		add(stname);
		add(stuid);
		add(middleexam);
		add(finalexam);
		add(assignment);
		add(attendent);
		add(totalscore);
		add(grade);

		outbutton = new JButton("���ư���");

		add(outbutton);

		outbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent ex) {
				dispose();
				System.exit(0);
			}
		});

	}

	public void �ڷἳ��(String �̸�[], int �й�[], int �߰�[], int �⸻[], int ����[],
			int �⼮[], double score[], String ����[]) {

		this.�̸� = �̸�;
		this.�й� = �й�;
		this.�߰� = �߰�;
		this.�⸻ = �⸻;
		this.���� = ����;
		this.�⼮ = �⼮;
		this.score = score;
		this.���� = ����;
	}

	public void gradeprint() {
		sort(�й�, �̸�, �߰�, �⸻, ����, �⼮, score, ����, 12);
		int y = 80;
		for (int i = 0; i < 12; i++) {

			�л��̸�[i] = new JLabel(": " + �̸�[i]);
			�л��й�[i] = new JLabel(":" + Integer.toString(�й�[i]));
			�߰����[i] = new JLabel(": " + Integer.toString(�߰�[i]));
			�⸻���[i] = new JLabel(": " + Integer.toString(�⸻[i]));
			��������[i] = new JLabel(": " + Integer.toString(����[i]));
			�⼮����[i] = new JLabel(": " + Integer.toString(�⼮[i]));
			������[i] = new JLabel(": " + Double.toString(score[i]));
			������[i] = new JLabel(": " + ����[i]);

			�л��̸�[i].setBounds(50, y, 60, 20);
			�л��й�[i].setBounds(100, y, 60, 20);
			�߰����[i].setBounds(150, y, 60, 20);
			�⸻���[i].setBounds(200, y, 60, 20);
			��������[i].setBounds(250, y, 60, 20);
			�⼮����[i].setBounds(300, y, 60, 20);
			������[i].setBounds(350, y, 60, 20);
			������[i].setBounds(400, y, 60, 20);

			add(�л��̸�[i]);
			add(�л��й�[i]);
			add(�߰����[i]);
			add(�⸻���[i]);
			add(��������[i]);
			add(�⼮����[i]);
			add(������[i]);
			add(������[i]);

			y = y + 30;

			outbutton.setBounds(180, y + 30, 100, 20);
		}
		setVisible(true);
	}

	public void sort(int[] �й�, String �̸�[], int[] �߰�, int[] �⸻, int[] ����,
			int[] �⼮, double score[], String[] ����, int ����) {
		int index, index2, index3, index4, index5;
		String index1, index6;
		int Max = 0;
		double index7;

		for (int i = 0; i < ����; i++) {
			Max = i - 1;
			index = �й�[i];
			index1 = �̸�[i];
			index2 = �߰�[i];
			index3 = �⸻[i];
			index4 = ����[i];
			index5 = �⼮[i];
			index7 = score[i];
			index6 = ����[i];

			while (Max >= 0 && index < �й�[Max]) {
				�й�[Max + 1] = �й�[Max];
				�̸�[Max + 1] = �̸�[Max];
				�߰�[Max + 1] = �߰�[Max];
				�⸻[Max + 1] = �⸻[Max];
				����[Max + 1] = ����[Max];
				�⼮[Max + 1] = �⼮[Max];
				score[Max + 1] = score[Max];
				����[Max + 1] = ����[Max];

				Max--;
			}
			�й�[Max + 1] = index;
			�̸�[Max + 1] = index1;
			�߰�[Max + 1] = index2;
			�⸻[Max + 1] = index3;
			����[Max + 1] = index4;
			�⼮[Max + 1] = index5;
			score[Max + 1] = index7;
			����[Max + 1] = index6;

		}

	}

}
