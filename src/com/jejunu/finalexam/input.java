package com.jejunu.finalexam;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;

public class input extends JDialog {

	private int ��ⱹ��, ��ġ����, �ᱹ��, ���뱹��, ��������, �ع���, �ſ���, �ع�����;
	private TextField ����_��ⱹ��, ����_��ġ����, ����_�ᱹ��, ����_���뱹��, ����_��������, ����_�ع���,
			����_�ſ���, ����_�ع�����;
	private Button check_button;

	public input(Frame owner, boolean modal) {
		super(owner, "�ֹ�ǥ", modal);

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

		title1.setBounds(80, 40, 60, 20);
		��ⱹ��.setBounds(30, 70, 60, 20);
		��ġ����.setBounds(30, 100, 60, 20);
		�ᱹ��.setBounds(30, 130, 60, 20);
		���뱹��.setBounds(30, 160, 60, 20);
		��������.setBounds(30, 190, 60, 20);
		�ع���.setBounds(30, 220, 60, 20);
		�ſ���.setBounds(30, 250, 60, 20);
		�ع�����.setBounds(30, 280, 60, 20);

		add(title1);
		add(��ⱹ��);
		add(��ġ����);
		add(�ᱹ��);
		add(���뱹��);
		add(��������);
		add(�ع���);
		add(�ſ���);
		add(�ع�����);

		����_��ⱹ�� = new TextField();
		����_��ġ���� = new TextField();
		����_�ᱹ�� = new TextField();
		����_���뱹�� = new TextField();
		����_�������� = new TextField();
		����_�ع��� = new TextField();
		����_�ſ��� = new TextField();
		����_�ع����� = new TextField();

		����_��ⱹ��.setBounds(100, 70, 40, 20);
		����_��ġ����.setBounds(100, 100, 40, 20);
		����_�ᱹ��.setBounds(100, 130, 40, 20);
		����_���뱹��.setBounds(100, 160, 40, 20);
		����_��������.setBounds(100, 190, 40, 20);
		����_�ع���.setBounds(100, 220, 40, 20);
		����_�ſ���.setBounds(100, 250, 40, 20);
		����_�ع�����.setBounds(100, 280, 40, 20);

		add(����_��ⱹ��);
		add(����_��ġ����);
		add(����_�ᱹ��);
		add(����_���뱹��);
		add(����_��������);
		add(����_�ع���);
		add(����_�ſ���);
		add(����_�ع�����);

		check_button = new Button("�����ϱ�");
		check_button.setBounds(160, 130, 50, 50);
		add(check_button);
		
		inputdata();

	}

	private void inputdata() {
		check_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				��ⱹ�� = Integer.parseInt(����_��ⱹ��.getText());
				��ġ���� = Integer.parseInt(����_��ġ����.getText());
				�ᱹ�� = Integer.parseInt(����_�ᱹ��.getText());
				���뱹�� = Integer.parseInt(����_���뱹��.getText());
				�������� = Integer.parseInt(����_��������.getText());
				�ع��� = Integer.parseInt(����_�ع���.getText());
				�ſ��� = Integer.parseInt(����_�ſ���.getText());
				�ع����� = Integer.parseInt(����_�ع�����.getText());
				
				

				dispose();
			}
		});
	}

	public int get��ⱹ��() {
		return ��ⱹ��;
	}

	public int get��ġ����() {
		return ��ġ����;
	}

	public int get�ᱹ��() {
		return �ᱹ��;
	}

	public int get���뱹��() {
		return ���뱹��;
	}

	public int get��������() {
		return ��������;
	}

	public int get�ع���() {
		return �ع���;
	}

	public int get�ſ���() {
		return �ſ���;
	}

	public int get�ع�����() {
		return �ع�����;
	}
}
