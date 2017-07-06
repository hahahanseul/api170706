package com.hanbit.api.controller;

import java.util.Vector;

import javax.swing.JOptionPane;

import com.hanbit.api.domain.AccountBean;
import com.hanbit.api.service.AccountService;
import com.hanbit.api.serviceImpl.AccountServiceImpl;

public class AccountController {
	public static void main(String[] args) {
		AccountService service = new AccountServiceImpl();
		AccountBean bean = new AccountBean();
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 1.계좌개설 2. 계좌전체목록 3.이름겁색(동명이인 허용) 4.계좌번호로 조회 5.전체계좌수 6. 비밀번호변경 7.예금 8.출금 9.계좌해지")) {
			case "0":
				return;
			case"1":
				String[] info=JOptionPane.showInputDialog("이름, 비번, 아이디, 입금액, 거래날짜, SSN").split(",");
				bean.setName(info[0]);
				bean.setPassword(info[1]);
				bean.setId(info[2]);
				bean.setMoney(Integer.parseInt(info[3]));
				bean.setTxDate(info[4]);
				bean.setSsn(info[5]);
				service.createAccount(bean);
				JOptionPane.showMessageDialog(null,"계좌생성완료" );
				break;
			case"2":
				Vector<AccountBean> vec = service.getAccountList();
				JOptionPane.showMessageDialog(null, "리스트");
				break;
			case"3":
				Vector<AccountBean> vec2 =service.searchByName(JOptionPane.showInputDialog("이름검색"));
				JOptionPane.showMessageDialog(null, "리스트");
				break;
			case"4":
				JOptionPane.showInputDialog("계좌번호조회");
				int accountNo = 0;
				service.searchByAccountNo(accountNo);
				JOptionPane.showMessageDialog(null, "빈객체");				
				break;
			case"5":
				JOptionPane.showMessageDialog(null, "계좌수");				
				break;
			case"6":
				String[] foo=JOptionPane.showInputDialog("계좌번호/비밀번호").split("/");
				bean.setAccountNo(Integer.parseInt(foo[0]));
				bean.setPassword(foo[1]);
				service.modifyPassword(bean);
				JOptionPane.showMessageDialog(null, "비밀번호변경완료");
				break;
			case"7":
				String[] foo2=JOptionPane.showInputDialog("계좌번호/예금금액").split("/");
				bean.setAccountNo(Integer.parseInt(foo2[0]));
				bean.setMoney(Integer.parseInt(foo2[1]));
				service.deposit(bean);
				JOptionPane.showMessageDialog(null, "예금완료");
				break;
			case"8":
				String[] foo3=JOptionPane.showInputDialog("계좌번호/출금금액").split("/");
				bean.setAccountNo(Integer.parseInt(foo3[0]));
				bean.setMoney(Integer.parseInt(foo3[1]));
				service.withdraw(bean);
				JOptionPane.showMessageDialog(null, "출금완료");
				break;
			case"9":
				Integer.parseInt(JOptionPane.showInputDialog("계좌 해지"));
				int accountNo2=0;
				service.delete(accountNo2);
				JOptionPane.showMessageDialog(null, "계좌해지완료");
				break;
			}
		}
	}
}
