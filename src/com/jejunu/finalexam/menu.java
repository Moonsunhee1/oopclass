package com.jejunu.finalexam;

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
	private control con;
	private menulist list;
	private discountrate drate;
	// private scorerate rate;
	// // private �������� ��������;
	private JMenuBar menuBar;
	private JMenuItem ������, �ֹ�ǥ, ����ǥ, ��꼭, �μ�, ����, ����, ���κ���, ����;
	private double ����, ���ξ�, �����Ѱ�;
	int ��ⱹ��, ��ġ����, �ᱹ��, ���뱹��, ��������, �ع���, �ſ���, �ع�����;

	public menu(control tmpCom) {
		super("������ ���α׷�");

		con = tmpCom;

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
		JMenu �ڷ��Է� = new JMenu("�ڷ��Է�");
		JMenu �Է�, ���;

		�Է� = new JMenu("�ڷ��Է�");
		�ֹ�ǥ = new JMenuItem("�ֹ�ǥ");
		����ǥ = new JMenuItem("����ǥ");
		��꼭 = new JMenuItem("��꼭");

		�Է�.add(�ֹ�ǥ);
		�Է�.add(����ǥ);
		�Է�.add(��꼭);

		�ڷ��Է�.add(�Է�);

		JMenu ���κ���menu = new JMenu("���κ���");
		���κ��� = new JMenuItem("���κ���");
		���κ���menu.add(���κ���);

		JMenu ����menu = new JMenu("����");
		���� = new JMenuItem("����");
		����menu.add(����);

		menuBar.add(�ڷ��Է�);
		menuBar.add(���κ���menu);

		menuBar.add(����menu);

		Category(�ֹ�ǥ);
		Category(����ǥ);
		Category(��꼭);
		Category(���κ���);
	}

	public void setInput() {
		in = new input(this, true);
		in.setVisible(true);

		int ��ⱹ��, ��ġ����, �ᱹ��, ���뱹��, ��������, �ع���, �ſ���, �ع�����;

		��ⱹ�� = in.get��ⱹ��();
		��ġ���� = in.get��ġ����();
		�ᱹ�� = in.get�ᱹ��();
		���뱹�� = in.get���뱹��();
		�������� = in.get��������();
		�ع��� = in.get�ع���();
		�ſ��� = in.get�ſ���();
		�ع����� = in.get�ع�����();
		con.setContorl(��ⱹ��, ��ġ����, �ᱹ��, ���뱹��, ��������, �ع���, �ſ���, �ع�����);
	}

	public void setMenulist() {
		list = new menulist(this, true);
		list.setVisible(true);
	}

	public void setDiscount() {

		double �̸�����, �︸����, �縸����, ��������;

		drate = new discountrate(this, true);
		drate.setVisible(true);

		�̸����� = drate.get�̸�����();
		�︸���� = drate.get�︸����();
		�縸���� = drate.get�縸����();
		�������� = drate.get��������();

		con.setpoint(�̸�����, �︸����, �縸����, ��������);
	}

	public void setoutput() {
		double ����, ���ξ�, �����Ѱ�;
		int ��ⱹ��, ��ġ����, �ᱹ��, ���뱹��, ��������, �ع���, �ſ���, �ع�����;

		out = new output(this, true);

		con.totalmoney();
		���� = con.get����();
		���ξ� = con.get���ξ�();
		�����Ѱ� = con.get�����Ѱ�();

		��ⱹ�� = in.get��ⱹ��();
		��ġ���� = in.get��ġ����();
		�ᱹ�� = in.get�ᱹ��();
		���뱹�� = in.get���뱹��();
		�������� = in.get��������();
		�ع��� = in.get�ع���();
		�ſ��� = in.get�ſ���();
		�ع����� = in.get�ع�����();

		out.setvalue(��ⱹ��, ��ġ����, �ᱹ��, ���뱹��, ��������, �ع���, �ſ���, �ع�����, ����, ���ξ�, �����Ѱ�);
		out.totaloutput();

	}

	public void Category(JMenuItem tmp) {
		tmp.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(�ֹ�ǥ))
					setInput();
				else if (e.getSource().equals(����ǥ))
					setMenulist();
				else if (e.getSource().equals(���κ���))
					setDiscount();
				else if (e.getSource().equals(��꼭))
					setoutput();

			}
		});
	}
}
