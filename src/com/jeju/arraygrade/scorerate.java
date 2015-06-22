package com.jeju.arraygrade;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class scorerate extends JDialog {
	private double �߰�����, �⸻����, ��������, �⼮����;
	private Button check_button;
	JTextField in_�߰�����, in_�⸻����, in_��������, in_�⼮����;

	public scorerate(Frame owner, boolean modal) {
		super(owner, "�����Է�â", modal);
		guiinputform();
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public void guiinputform() {
		setSize(300, 300);
		setLayout(null);

		JLabel title1, middlerate, finalrate, assignrate, attendrate;

		title1 = new JLabel("�� �� �� ��");
		middlerate = new JLabel("�߰�����");
		finalrate = new JLabel("�⸻����");
		assignrate = new JLabel("��������");
		attendrate = new JLabel("�⼮����");

		title1.setBounds(80, 40, 80, 20);
		middlerate.setBounds(30, 70, 60, 20);
		finalrate.setBounds(30, 100, 60, 20);
		assignrate.setBounds(30, 130, 60, 20);
		attendrate.setBounds(30, 160, 60, 20);

		add(title1);
		add(middlerate);
		add(finalrate);
		add(assignrate);
		add(attendrate);

		in_�߰����� = new JTextField("0.3");
		in_�⸻���� = new JTextField("0.3");
		in_�������� = new JTextField("0.3");
		in_�⼮���� = new JTextField("0.1");

		in_�߰�����.setBounds(100, 70, 40, 20);
		in_�⸻����.setBounds(100, 100, 40, 20);
		in_��������.setBounds(100, 130, 40, 20);
		in_�⼮����.setBounds(100, 160, 40, 20);

		add(in_�߰�����);
		add(in_�⸻����);
		add(in_��������);
		add(in_�⼮����);

		check_button = new Button("�����ϱ�");
		check_button.setBounds(160, 130, 50, 50);

		inputratedata();
		add(check_button);

	}

	public void inputratedata() {
		check_button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				�߰����� = Double.parseDouble(in_�߰�����.getText());
				�⸻���� = Double.parseDouble(in_�⸻����.getText());
				�������� = Double.parseDouble(in_��������.getText());
				�⼮���� = Double.parseDouble(in_�⼮����.getText());

				dispose();
			}
		});
	}

	public double get�߰�����() {
		return �߰�����;
	}

	public double get�⸻����() {
		return �⸻����;
	}

	public double get��������() {
		return ��������;
	}

	public double get�⼮����() {
		return �⼮����;
	}

}
