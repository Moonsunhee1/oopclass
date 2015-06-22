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

	private int 고기국수, 멸치국수, 콩국수, 순대국밥, 돼지국밥, 해물탕, 매운탕, 해물파전;
	private TextField 수량_고기국수, 수량_멸치국수, 수량_콩국수, 수량_순대국밥, 수량_돼지국밥, 수량_해물탕,
			수량_매운탕, 수량_해물파전;
	private Button check_button;

	public input(Frame owner, boolean modal) {
		super(owner, "주문표", modal);

		setSize(230, 400);
		setLayout(null);

		Label title1, 고기국수, 멸치국수, 콩국수, 순대국밥, 돼지국밥, 해물탕, 매운탕, 해물파전;

		title1 = new Label("주 문 표");
		고기국수 = new Label("고기국수");
		멸치국수 = new Label("멸치국수");
		콩국수 = new Label("콩국수");
		순대국밥 = new Label("순대국밥");
		돼지국밥 = new Label("돼지국밥");
		해물탕 = new Label("해물탕");
		매운탕 = new Label("매운탕");
		해물파전 = new Label("해물파전");

		title1.setBounds(80, 40, 60, 20);
		고기국수.setBounds(30, 70, 60, 20);
		멸치국수.setBounds(30, 100, 60, 20);
		콩국수.setBounds(30, 130, 60, 20);
		순대국밥.setBounds(30, 160, 60, 20);
		돼지국밥.setBounds(30, 190, 60, 20);
		해물탕.setBounds(30, 220, 60, 20);
		매운탕.setBounds(30, 250, 60, 20);
		해물파전.setBounds(30, 280, 60, 20);

		add(title1);
		add(고기국수);
		add(멸치국수);
		add(콩국수);
		add(순대국밥);
		add(돼지국밥);
		add(해물탕);
		add(매운탕);
		add(해물파전);

		수량_고기국수 = new TextField();
		수량_멸치국수 = new TextField();
		수량_콩국수 = new TextField();
		수량_순대국밥 = new TextField();
		수량_돼지국밥 = new TextField();
		수량_해물탕 = new TextField();
		수량_매운탕 = new TextField();
		수량_해물파전 = new TextField();

		수량_고기국수.setBounds(100, 70, 40, 20);
		수량_멸치국수.setBounds(100, 100, 40, 20);
		수량_콩국수.setBounds(100, 130, 40, 20);
		수량_순대국밥.setBounds(100, 160, 40, 20);
		수량_돼지국밥.setBounds(100, 190, 40, 20);
		수량_해물탕.setBounds(100, 220, 40, 20);
		수량_매운탕.setBounds(100, 250, 40, 20);
		수량_해물파전.setBounds(100, 280, 40, 20);

		add(수량_고기국수);
		add(수량_멸치국수);
		add(수량_콩국수);
		add(수량_순대국밥);
		add(수량_돼지국밥);
		add(수량_해물탕);
		add(수량_매운탕);
		add(수량_해물파전);

		check_button = new Button("적용하기");
		check_button.setBounds(160, 130, 50, 50);
		add(check_button);
		
		inputdata();

	}

	private void inputdata() {
		check_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				고기국수 = Integer.parseInt(수량_고기국수.getText());
				멸치국수 = Integer.parseInt(수량_멸치국수.getText());
				콩국수 = Integer.parseInt(수량_콩국수.getText());
				순대국밥 = Integer.parseInt(수량_순대국밥.getText());
				돼지국밥 = Integer.parseInt(수량_돼지국밥.getText());
				해물탕 = Integer.parseInt(수량_해물탕.getText());
				매운탕 = Integer.parseInt(수량_매운탕.getText());
				해물파전 = Integer.parseInt(수량_해물파전.getText());
				
				

				dispose();
			}
		});
	}

	public int get고기국수() {
		return 고기국수;
	}

	public int get멸치국수() {
		return 멸치국수;
	}

	public int get콩국수() {
		return 콩국수;
	}

	public int get순대국밥() {
		return 순대국밥;
	}

	public int get돼지국밥() {
		return 돼지국밥;
	}

	public int get해물탕() {
		return 해물탕;
	}

	public int get매운탕() {
		return 매운탕;
	}

	public int get해물파전() {
		return 해물파전;
	}
}
