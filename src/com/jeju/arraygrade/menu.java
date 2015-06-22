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

	private int �й�, �߰�, �⸻, ����, �⼮;
	private double score;
	private String ����;
	JMenuBar menuBar;
	JMenuItem �й���, �̸���, ������, ������, �����Է�, �����б�, �μ�, ����, ����, ��������, �����ο���, ����������,
			����������, ����;

	public menu(Controller Gcon) {
		super("�������ϱ� ���α׷�");

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
		JMenu ����ó�� = new JMenu("����ó��");
		JMenu �Է�, ���;

		�Է� = new JMenu("�ڷ��Է�");
		�����Է� = new JMenuItem("�����Է�");
		�����б� = new JMenuItem("�����б�");

		��� = new JMenu("�������");
		�й��� = new JMenuItem("�й���");
		�̸��� = new JMenuItem("�̸���");
		������ = new JMenuItem("������");
		������ = new JMenuItem("������");

		�μ� = new JMenuItem("����μ�");
		���� = new JMenuItem("�������");
		���� = new JMenuItem("����");

		�Է�.add(�����Է�);
		�Է�.add(�����б�);
		���.add(�й���);
		���.add(�̸���);
		���.add(������);
		���.add(������);

		����ó��.add(�Է�);
		����ó��.add(���);
		����ó��.add(�μ�);
		����ó��.add(����);
		����ó��.add(����);

		JMenu ��������menu = new JMenu("��������");
		�������� = new JMenuItem("��������");
		��������menu.add(��������);

		JMenu �������� = new JMenu("��������");
		�����ο��� = new JMenuItem("�ο���");
		���������� = new JMenuItem("������");
		���������� = new JMenuItem("������");

		��������.add(�����ο���);
		��������.add(����������);
		��������.add(����������);

		JMenu ����menu = new JMenu("����");
		���� = new JMenuItem("����");
		����menu.add(����);

		menuBar.add(����ó��);
		menuBar.add(��������menu);
		menuBar.add(��������);
		menuBar.add(����menu);

		menuforvalue(�����Է�);
		menuforvalue(�й���);
		menuforvalue(��������);

	}

	public void setInput() {

		in = new input(this, true);
		in.setVisible(true);

		int[] �й�, �߰�, �⸻, ����, �⼮;
		String[] �̸�;
		�̸� = in.get�̸�();
		�й� = in.get�й�();
		�߰� = in.get�߰�();
		�⸻ = in.get�⸻();
		���� = in.get����();
		�⼮ = in.get�⼮();

		con.setControl(�̸�, �й�, �߰�, �⸻, ����, �⼮);
	}

	public void setOutput() {

		String[] �̸� = new String[12], ����;
		int[] �߰� = new int[12], �⸻ = new int[12], ���� = new int[12], �⼮ = new int[12], �й� = new int[12];
		double[] score;

		st = con.getStudent();
		out = new output(this, true);

		con.result();

		score = con.getScore();
		���� = con.get����();

		for (int i = 0; i < 12; i++) {
			�̸�[i] = st[i].get�̸�();
			�й�[i] = st[i].get�й�();
			�߰�[i] = st[i].get�߰�();
			�⸻[i] = st[i].get�⸻();
			����[i] = st[i].get����();
			�⼮[i] = st[i].get�⼮();
		}
		out.�ڷἳ��(�̸�, �й�, �߰�, �⸻, ����, �⼮, score, ����);
		out.gradeprint();
	}

	public void setInputrate() {

		srate = new scorerate(this, true);
		srate.setVisible(true);

		double �߰�����, �⸻����, ��������, �⼮����;
		�߰����� = srate.get�߰�����();
		�⸻���� = srate.get�⸻����();
		�������� = srate.get��������();
		�⼮���� = srate.get�⼮����();

		con.setrate(�߰�����, �⸻����, ��������, �⼮����);
	}

	public void menuforvalue(JMenuItem flag) {
		flag.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(�����Է�))
					setInput();
				else if (e.getSource().equals(�й���))
					setOutput();
				else if (e.getSource().equals(��������))
					setInputrate();
			}
		});
	}

}