package com.jeju.arraygrade;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class menu extends JFrame {

	private input in;
	private output out;
	private Controller con;
	private Student[] st;
	private scorerate srate;

	private int 학번, 중간, 기말, 과제, 출석;
	private double score;
	private String 학점;
	JMenuBar menuBar;
	JMenuItem 학번별, 이름별, 성적별, 도형별, 직접입력, 파일읽기, 인쇄, 저장, 종료, 점수비율, 학점인원별, 학점점수별,
			학점비율별, 도움말;

	public menu(Controller Gcon) {
		super("성적구하기 프로그램");

		con = Gcon;

		menuBar = new JMenuBar();

		setSize(340, 200);
		setLayout(null);

		MenuBar();

		setJMenuBar(menuBar);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
	}

	public void MenuBar() {
		JMenu 성적처리 = new JMenu("성적처리");
		JMenu 입력, 결과;

		입력 = new JMenu("자료입력");
		직접입력 = new JMenuItem("직접입력");
		파일읽기 = new JMenuItem("파일읽기");

		결과 = new JMenu("결과보기");
		학번별 = new JMenuItem("학번별");
		이름별 = new JMenuItem("이름별");
		성적별 = new JMenuItem("성적별");
		도형별 = new JMenuItem("도형별");

		인쇄 = new JMenuItem("결과인쇄");
		저장 = new JMenuItem("결과저장");
		종료 = new JMenuItem("종료");

		입력.add(직접입력);
		입력.add(파일읽기);
		결과.add(학번별);
		결과.add(이름별);
		결과.add(성적별);
		결과.add(도형별);

		성적처리.add(입력);
		성적처리.add(결과);
		성적처리.add(인쇄);
		성적처리.add(저장);
		성적처리.add(종료);

		JMenu 점수비율menu = new JMenu("점수비율");
		점수비율 = new JMenuItem("점수비율");
		점수비율menu.add(점수비율);

		JMenu 학점점수 = new JMenu("학점점수");
		학점인원별 = new JMenuItem("인원별");
		학점점수별 = new JMenuItem("점수별");
		학점비율별 = new JMenuItem("비율별");

		학점점수.add(학점인원별);
		학점점수.add(학점점수별);
		학점점수.add(학점비율별);

		JMenu 도움말menu = new JMenu("도움말");
		도움말 = new JMenuItem("도움말");
		도움말menu.add(도움말);

		menuBar.add(성적처리);
		menuBar.add(점수비율menu);
		menuBar.add(학점점수);
		menuBar.add(도움말menu);

		menuforvalue(직접입력);
		menuforvalue(학번별);
		menuforvalue(점수비율);

	}

	public void setInput() {

		in = new input(this, true);
		in.setVisible(true);

		int[] 학번, 중간, 기말, 과제, 출석;
		String[] 이름;
		이름 = in.get이름();
		학번 = in.get학번();
		중간 = in.get중간();
		기말 = in.get기말();
		과제 = in.get과제();
		출석 = in.get출석();

		con.setControl(이름, 학번, 중간, 기말, 과제, 출석);
	}

	public void setOutput() {

		String[] 이름 = new String[12], 학점;
		int[] 중간 = new int[12], 기말 = new int[12], 과제 = new int[12], 출석 = new int[12], 학번 = new int[12];
		double[] score;

		st = con.getStudent();
		out = new output(this, true);

		con.result();

		score = con.getScore();
		학점 = con.get학점();

		for (int i = 0; i < 12; i++) {
			이름[i] = st[i].get이름();
			학번[i] = st[i].get학번();
			중간[i] = st[i].get중간();
			기말[i] = st[i].get기말();
			과제[i] = st[i].get과제();
			출석[i] = st[i].get출석();
		}
		out.자료설정(이름, 학번, 중간, 기말, 과제, 출석, score, 학점);
		out.gradeprint();
	}

	public void setInputrate() {

		srate = new scorerate(this, true);
		srate.setVisible(true);

		double 중간비율, 기말비율, 과제비율, 출석비율;
		중간비율 = srate.get중간비율();
		기말비율 = srate.get기말비율();
		과제비율 = srate.get과제비율();
		출석비율 = srate.get출석비율();

		con.setrate(중간비율, 기말비율, 과제비율, 출석비율);
	}

	public void menuforvalue(JMenuItem flag) {
		flag.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(직접입력))
					setInput();
				else if (e.getSource().equals(학번별))
					setOutput();
				else if (e.getSource().equals(점수비율))
					setInputrate();
			}
		});
	}

}