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

	private int[] 학번, 중간, 기말, 과제, 출석;
	private double[] score;
	private String[] 학점, 이름;
	private JButton outbutton;
	private JLabel middleexam, finalexam, assignment, attendent, grade, stuid,
			totalscore, stname;
	JLabel[] 학생학번, 학생이름, 중간고사, 기말고사, 과제점수, 출석점수, 총점수, 총학점;

	public output(Frame owner, boolean modal) {
		super(owner, "출력결과창", modal);

		setSize(550, 600);
		setLayout(null);

		JLabel title1;

		title1 = new JLabel("학점출력결과");
		stname = new JLabel("이름");
		stuid = new JLabel("학번");
		middleexam = new JLabel("중간");
		finalexam = new JLabel("기말");
		assignment = new JLabel("과제");
		attendent = new JLabel("출석");
		totalscore = new JLabel("총점수");
		grade = new JLabel("학점");

		학생이름 = new JLabel[12];
		학생학번 = new JLabel[12];
		중간고사 = new JLabel[12];
		기말고사 = new JLabel[12];
		과제점수 = new JLabel[12];
		출석점수 = new JLabel[12];
		총점수 = new JLabel[12];
		총학점 = new JLabel[12];

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

		outbutton = new JButton("돌아가기");

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

	public void 자료설정(String 이름[], int 학번[], int 중간[], int 기말[], int 과제[],
			int 출석[], double score[], String 학점[]) {

		this.이름 = 이름;
		this.학번 = 학번;
		this.중간 = 중간;
		this.기말 = 기말;
		this.과제 = 과제;
		this.출석 = 출석;
		this.score = score;
		this.학점 = 학점;
	}

	public void gradeprint() {
		sort(학번, 이름, 중간, 기말, 과제, 출석, score, 학점, 12);
		int y = 80;
		for (int i = 0; i < 12; i++) {

			학생이름[i] = new JLabel(": " + 이름[i]);
			학생학번[i] = new JLabel(":" + Integer.toString(학번[i]));
			중간고사[i] = new JLabel(": " + Integer.toString(중간[i]));
			기말고사[i] = new JLabel(": " + Integer.toString(기말[i]));
			과제점수[i] = new JLabel(": " + Integer.toString(과제[i]));
			출석점수[i] = new JLabel(": " + Integer.toString(출석[i]));
			총점수[i] = new JLabel(": " + Double.toString(score[i]));
			총학점[i] = new JLabel(": " + 학점[i]);

			학생이름[i].setBounds(50, y, 60, 20);
			학생학번[i].setBounds(100, y, 60, 20);
			중간고사[i].setBounds(150, y, 60, 20);
			기말고사[i].setBounds(200, y, 60, 20);
			과제점수[i].setBounds(250, y, 60, 20);
			출석점수[i].setBounds(300, y, 60, 20);
			총점수[i].setBounds(350, y, 60, 20);
			총학점[i].setBounds(400, y, 60, 20);

			add(학생이름[i]);
			add(학생학번[i]);
			add(중간고사[i]);
			add(기말고사[i]);
			add(과제점수[i]);
			add(출석점수[i]);
			add(총점수[i]);
			add(총학점[i]);

			y = y + 30;

			outbutton.setBounds(180, y + 30, 100, 20);
		}
		setVisible(true);
	}

	public void sort(int[] 학번, String 이름[], int[] 중간, int[] 기말, int[] 과제,
			int[] 출석, double score[], String[] 학점, int 길이) {
		int index, index2, index3, index4, index5;
		String index1, index6;
		int Max = 0;
		double index7;

		for (int i = 0; i < 길이; i++) {
			Max = i - 1;
			index = 학번[i];
			index1 = 이름[i];
			index2 = 중간[i];
			index3 = 기말[i];
			index4 = 과제[i];
			index5 = 출석[i];
			index7 = score[i];
			index6 = 학점[i];

			while (Max >= 0 && index < 학번[Max]) {
				학번[Max + 1] = 학번[Max];
				이름[Max + 1] = 이름[Max];
				중간[Max + 1] = 중간[Max];
				기말[Max + 1] = 기말[Max];
				과제[Max + 1] = 과제[Max];
				출석[Max + 1] = 출석[Max];
				score[Max + 1] = score[Max];
				학점[Max + 1] = 학점[Max];

				Max--;
			}
			학번[Max + 1] = index;
			이름[Max + 1] = index1;
			중간[Max + 1] = index2;
			기말[Max + 1] = index3;
			과제[Max + 1] = index4;
			출석[Max + 1] = index5;
			score[Max + 1] = index7;
			학점[Max + 1] = index6;

		}

	}

}
