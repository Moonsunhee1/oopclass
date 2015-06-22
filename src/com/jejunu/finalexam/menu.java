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
	// // private 점수기준 점수기준;
	private JMenuBar menuBar;
	private JMenuItem 할인율, 주문표, 차림표, 계산서, 인쇄, 저장, 종료, 할인비율, 도움말;
	private double 총합, 할인액, 최종총계;
	int 고기국수, 멸치국수, 콩국수, 순대국밥, 돼지국밥, 해물탕, 매운탕, 해물파전;

	public menu(control tmpCom) {
		super("음식점 프로그램");

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
		JMenu 자료입력 = new JMenu("자료입력");
		JMenu 입력, 결과;

		입력 = new JMenu("자료입력");
		주문표 = new JMenuItem("주문표");
		차림표 = new JMenuItem("차림표");
		계산서 = new JMenuItem("계산서");

		입력.add(주문표);
		입력.add(차림표);
		입력.add(계산서);

		자료입력.add(입력);

		JMenu 할인비율menu = new JMenu("할인비율");
		할인비율 = new JMenuItem("할인비율");
		할인비율menu.add(할인비율);

		JMenu 도움말menu = new JMenu("도움말");
		도움말 = new JMenuItem("도움말");
		도움말menu.add(도움말);

		menuBar.add(자료입력);
		menuBar.add(할인비율menu);

		menuBar.add(도움말menu);

		Category(주문표);
		Category(차림표);
		Category(계산서);
		Category(할인비율);
	}

	public void setInput() {
		in = new input(this, true);
		in.setVisible(true);

		int 고기국수, 멸치국수, 콩국수, 순대국밥, 돼지국밥, 해물탕, 매운탕, 해물파전;

		고기국수 = in.get고기국수();
		멸치국수 = in.get멸치국수();
		콩국수 = in.get콩국수();
		순대국밥 = in.get순대국밥();
		돼지국밥 = in.get돼지국밥();
		해물탕 = in.get해물탕();
		매운탕 = in.get매운탕();
		해물파전 = in.get해물파전();
		con.setContorl(고기국수, 멸치국수, 콩국수, 순대국밥, 돼지국밥, 해물탕, 매운탕, 해물파전);
	}

	public void setMenulist() {
		list = new menulist(this, true);
		list.setVisible(true);
	}

	public void setDiscount() {

		double 이만원비, 삼만원비, 사만원비, 육만원비;

		drate = new discountrate(this, true);
		drate.setVisible(true);

		이만원비 = drate.get이만원비();
		삼만원비 = drate.get삼만원비();
		사만원비 = drate.get사만원비();
		육만원비 = drate.get육만원비();

		con.setpoint(이만원비, 삼만원비, 사만원비, 육만원비);
	}

	public void setoutput() {
		double 총합, 할인액, 최종총계;
		int 고기국수, 멸치국수, 콩국수, 순대국밥, 돼지국밥, 해물탕, 매운탕, 해물파전;

		out = new output(this, true);

		con.totalmoney();
		총합 = con.get총합();
		할인액 = con.get할인액();
		최종총계 = con.get최종총계();

		고기국수 = in.get고기국수();
		멸치국수 = in.get멸치국수();
		콩국수 = in.get콩국수();
		순대국밥 = in.get순대국밥();
		돼지국밥 = in.get돼지국밥();
		해물탕 = in.get해물탕();
		매운탕 = in.get매운탕();
		해물파전 = in.get해물파전();

		out.setvalue(고기국수, 멸치국수, 콩국수, 순대국밥, 돼지국밥, 해물탕, 매운탕, 해물파전, 총합, 할인액, 최종총계);
		out.totaloutput();

	}

	public void Category(JMenuItem tmp) {
		tmp.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(주문표))
					setInput();
				else if (e.getSource().equals(차림표))
					setMenulist();
				else if (e.getSource().equals(할인비율))
					setDiscount();
				else if (e.getSource().equals(계산서))
					setoutput();

			}
		});
	}
}
