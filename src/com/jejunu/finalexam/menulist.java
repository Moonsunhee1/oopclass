package com.jejunu.finalexam;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;

public class menulist extends JDialog {
	private int ��ⱹ��, ��ġ����, �ᱹ��, ���뱹��, ��������, �ع���, �ſ���, �ع�����;
	private Button check_button;

	public menulist(Frame owner, boolean modal) {
		super(owner, "����ǥ", modal);

		setSize(230, 400);
		setLayout(null);
		Label title1, ��ⱹ��, ��ġ����, �ᱹ��, ���뱹��, ��������, �ع���, �ſ���, �ع�����;

		title1 = new Label("�� �� ǥ");
		��ⱹ�� = new Label("��ⱹ��");
		��ġ���� = new Label("��ġ����");
		�ᱹ�� = new Label("�ᱹ��");
		���뱹�� = new Label("���뱹��");
		�������� = new Label("��������");
		�ع��� = new Label("�ع���");
		�ſ��� = new Label("�ſ���");
		�ع����� = new Label("�ع�����");

		Label ��ⱹ������ = new Label("5000");
		Label ��ġ�������� = new Label("4500");
		Label �ᱹ������ = new Label("6000");
		Label ���뱹�䰡�� = new Label("5000");
		Label �������䰡�� = new Label("6000");
		Label �ع������� = new Label("8000");
		Label �ſ������� = new Label("7000");
		Label �ع��������� = new Label("10000");

		title1.setBounds(80, 40, 60, 20);
		��ⱹ��.setBounds(30, 70, 60, 20);
		��ġ����.setBounds(30, 100, 60, 20);
		�ᱹ��.setBounds(30, 130, 60, 20);
		���뱹��.setBounds(30, 160, 60, 20);
		��������.setBounds(30, 190, 60, 20);
		�ع���.setBounds(30, 220, 60, 20);
		�ſ���.setBounds(30, 250, 60, 20);
		�ع�����.setBounds(30, 280, 60, 20);

		��ⱹ������.setBounds(100, 70, 60, 20);
		��ġ��������.setBounds(100, 100, 60, 20);
		�ᱹ������.setBounds(100, 130, 60, 20);
		���뱹�䰡��.setBounds(100, 160, 60, 20);
		�������䰡��.setBounds(100, 190, 60, 20);
		�ع�������.setBounds(100, 220, 60, 20);
		�ſ�������.setBounds(100, 250, 60, 20);
		�ع���������.setBounds(100, 280, 60, 20);

		add(title1);
		add(��ⱹ��);
		add(��ġ����);
		add(�ᱹ��);
		add(���뱹��);
		add(��������);
		add(�ع���);
		add(�ſ���);
		add(�ع�����);

		add(��ⱹ������);
		add(��ġ��������);
		add(�ᱹ������);
		add(���뱹�䰡��);
		add(�������䰡��);
		add(�ع�������);
		add(�ſ�������);
		add(�ع���������);

		check_button = new Button("���ư���");
		check_button.setBounds(80, 300, 70, 50);
		add(check_button);

		backaction();
	}

	private void backaction() {
		check_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}

}
