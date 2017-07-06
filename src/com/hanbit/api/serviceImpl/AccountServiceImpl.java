package com.hanbit.api.serviceImpl;

import java.util.Vector;

import com.hanbit.api.domain.AccountBean;
import com.hanbit.api.service.AccountService;

public class AccountServiceImpl implements AccountService{
	Vector<AccountBean> vec;
	public AccountServiceImpl(){
		vec = new Vector<AccountBean>(10,10);
	}
	@Override
	public void createAccount(AccountBean bean) {
		//계좌개설
		//bean.setAccountNo(accountNo);
		vec.add(bean);
	}
	@Override
	public Vector<AccountBean> getAccountList() {
		//계좌 전체목록
		return vec;
	}
	@Override
	public Vector<AccountBean> searchByName(String name) {
		//이름검색(동명이인허용)
		Vector<AccountBean> temp = new Vector<AccountBean>(10,10);
	//풰이크라능	for(int i=0;i<10;i++) {
			//if(get(i).getName().eq....){
			//temp.add(get(i);}
		
		//}
		return temp;
	}
	@Override
	public AccountBean searchByAccountNo(int AccountNo) {
		// 계좌번호로 조회
		return null;
	}
	@Override
	public int countAccount() {
		// 전체 계좌수
		return vec.size();
	}
	@Override
	public void modifyPassword(AccountBean bean) {
		// 비밀번호 변경
	}
	@Override
	public void deposit(AccountBean bean) {
		// 예금
	}
	@Override
	public void withdraw(AccountBean bean) {
		// 출금
	}
	@Override
	public void delete(int AccountNo) {
		// 계좌 해지
	}



}
