package com.jejunu.finalexam;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

public class discountrate extends JDialog {

	private double �̸�����, �︸����, �縸����, ��������;
	private TextField �̸����̻��, �︸���̻��, �縸���̻��, �������̻��, ����_��������, ����_�ع���, ����_�ſ���,
			����_�ع�����;
	Label title1, ��ⱹ��, ��ġ����, �ᱹ��, ���뱹��, ��������, �ع���, �ſ���, �ع�����;
	private Button check_button;

	public discountrate(Frame owner, boolean modal) {
		super(owner, "������", modal);

		setSize(230, 400);
		setLayout(null);
		Label title1, �̸����̻�, �︸���̻�, �縸���̻�, �������̻�;

		title1 = new Label("������");
		�̸����̻� = new Label("�̸����̻�");
		�︸���̻� = new Label("�︸���̻�");
		�縸���̻� = new Label("�縸���̻�");
		�������̻� = new Label("�������̻�");

		title1.setBounds(80, 40, 60, 20);
		�̸����̻�.setBounds(30, 70, 70, 20);
		�︸���̻�.setBounds(30, 100, 70, 20);
		�縸���̻�.setBounds(30, 130, 70, 20);
		�������̻�.setBounds(30, 160, 70, 20);

		add(title1);
		add(�̸����̻�);
		add(�︸���̻�);
		add(�縸���̻�);
		add(�������̻�);

		�̸����̻�� = new TextField("1");
		�︸���̻�� = new TextField("2");
		�縸���̻�� = new TextField("3");
		�������̻�� = new TextField("5");

		�̸����̻��.setBounds(110, 70, 30, 20);
		�︸���̻��.setBounds(110, 100, 30, 20);
		�縸���̻��.setBounds(110, 130, 30, 20);
		�������̻��.setBounds(110, 160, 30, 20);

		add(�̸����̻��);
		add(�︸���̻��);
		add(�縸���̻��);
		add(�������̻��);

		check_button = new Button("�����ϱ�");
		check_button.setBounds(80, 200, 50, 50);
		add(check_button);

		inputrate();

	}

	private void inputrate() {
		check_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				�̸����� = Integer.parseInt(�̸����̻��.getText());
				�︸���� = Integer.parseInt(�︸���̻��.getText());
				�縸���� = Integer.parseInt(�縸���̻��.getText());
				�������� = Integer.parseInt(�������̻��.getText());

				dispose();
			}
		});
	}
	
	

	public double get�̸�����() {
		return �̸�����;
	}

	public double get�︸����() {
		return �︸����;
	}

	public double get�縸����() {
		return �縸����;
	}

	public double get��������() {
		return ��������;
	}

}
