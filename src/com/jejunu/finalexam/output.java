package com.jejunu.finalexam;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class output extends Dialog {

	private int ��ⱹ��, ��ġ����, �ᱹ��, ���뱹��, ��������, �ع���, �ſ���, �ع�����;
	private Label ����_��ⱹ��, ����_��ġ����, ����_�ᱹ��, ����_���뱹��, ����_��������, ����_�ع���, ����_�ſ���,
			����_�ع�����, �հ�, ���αݾ�, ���ɾ�;
	private Button check_button;
	private double ���ξ�, �����Ѱ�, ����;

	public output(Frame frame, boolean modal) {
		super(frame, "��꼭", modal);

		setSize(300, 500);
		setLayout(null);

		Label title1, ��ⱹ��, ��ġ����, �ᱹ��, ���뱹��, ��������, �ع���, �ſ���, �ع�����, �հ�ݾ�, ���αݾ�, ���ɱݾ�;

		title1 = new Label("�� �� ��");
		��ⱹ�� = new Label("��ⱹ��");
		��ġ���� = new Label("��ġ����");
		�ᱹ�� = new Label("�ᱹ��");
		���뱹�� = new Label("���뱹��");
		�������� = new Label("��������");
		�ع��� = new Label("�ع���");
		�ſ��� = new Label("�ſ���");
		�ع����� = new Label("�ع�����");
		�հ�ݾ� = new Label("�հ�ݾ�");
		���αݾ� = new Label("���αݾ�");
		���ɱݾ� = new Label("���ɱݾ�");

		title1.setBounds(80, 40, 60, 20);
		��ⱹ��.setBounds(30, 70, 60, 20);
		��ġ����.setBounds(30, 100, 60, 20);
		�ᱹ��.setBounds(30, 130, 60, 20);
		���뱹��.setBounds(30, 160, 60, 20);
		��������.setBounds(30, 190, 60, 20);
		�ع���.setBounds(30, 220, 60, 20);
		�ſ���.setBounds(30, 250, 60, 20);
		�ع�����.setBounds(30, 280, 60, 20);
		�հ�ݾ�.setBounds(30, 310, 60, 20);
		���αݾ�.setBounds(30, 340, 60, 20);
		���ɱݾ�.setBounds(30, 370, 60, 20);

		add(title1);
		add(��ⱹ��);
		add(��ġ����);
		add(�ᱹ��);
		add(���뱹��);
		add(��������);
		add(�ع���);
		add(�ſ���);
		add(�ع�����);
		add(�հ�ݾ�);
		add(���αݾ�);
		add(���ɱݾ�);

		check_button = new Button("���ư���");
		check_button.setBounds(130, 400, 50, 50);
		add(check_button);
		returnaction();

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
	}

	public void setvalue(int ��ⱹ��, int ��ġ����, int �ᱹ��, int ���뱹��, int ��������,
			int �ع���, int �ſ���, int �ع�����, double ����, double ���ξ�, double �����Ѱ�) {
		this.��ⱹ�� = ��ⱹ��;
		this.��ġ���� = ��ġ����;
		this.�ᱹ�� = �ᱹ��;
		this.���뱹�� = ���뱹��;
		this.�������� = ��������;
		this.�ع��� = �ع���;
		this.�ſ��� = �ſ���;
		this.�ع����� = �ع�����;
		this.���� = ����;
		this.���ξ� = ���ξ�;
		this.�����Ѱ� = �����Ѱ�;

	}

	public void totaloutput() {

		����_��ⱹ�� = new Label(":" + Integer.toString(��ⱹ��) + "��");
		����_��ġ���� = new Label(":" + Integer.toString(��ġ����) + "��");
		����_�ᱹ�� = new Label(":" + Integer.toString(�ᱹ��) + "��");
		����_���뱹�� = new Label(":" + Integer.toString(���뱹��) + "��");
		����_�������� = new Label(":" + Integer.toString(��������) + "��");
		����_�ع��� = new Label(":" + Integer.toString(�ع���) + "��");
		����_�ſ��� = new Label(":" + Integer.toString(�ſ���) + "��");
		����_�ع����� = new Label(":" + Integer.toString(�ع�����) + "��");
		�հ� = new Label(":" + Double.toString(����) + "��");
		���αݾ� = new Label(":" + Double.toString(���ξ�) + "��");
		���ɾ� = new Label(":" + Double.toString(�����Ѱ�) + "��");

		����_��ⱹ��.setBounds(100, 70, 40, 20);
		����_��ġ����.setBounds(100, 100, 40, 20);
		����_�ᱹ��.setBounds(100, 130, 40, 20);
		����_���뱹��.setBounds(100, 160, 40, 20);
		����_��������.setBounds(100, 190, 40, 20);
		����_�ع���.setBounds(100, 220, 40, 20);
		����_�ſ���.setBounds(100, 250, 40, 20);
		����_�ع�����.setBounds(100, 280, 40, 20);
		�հ�.setBounds(100, 310, 60, 20);
		���αݾ�.setBounds(100, 340, 60, 20);
		���ɾ�.setBounds(100, 370, 60, 20);

		add(����_��ⱹ��);
		add(����_��ġ����);
		add(����_�ᱹ��);
		add(����_���뱹��);
		add(����_��������);
		add(����_�ع���);
		add(����_�ſ���);
		add(����_�ع�����);
		add(�հ�);
		add(���αݾ�);
		add(���ɾ�);

		setVisible(true);

	}

	private void returnaction() {
		check_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}

}
