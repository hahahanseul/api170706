package com.hanbit.api.service;

import java.util.Vector;

import com.hanbit.api.domain.AccountBean;

public interface AccountService {
	public void createAccount(AccountBean bean);
	public Vector<AccountBean> getAccountList();
	public Vector<AccountBean> searchByName(String name);
	public AccountBean searchByAccountNo(int AccountNo);
	public int countAccount();
	public void modifyPassword(AccountBean bean);
	public void deposit(AccountBean bean);
	public void withdraw(AccountBean bean);
	public void delete(int AccountNo);


	/*CRUD 
	 
	CREATE - VOID
	createAccount   void  accountBean
	
	getAccountList  list
	findByAccountNo  
	findByName
	countAccount
	
	
	UPDATE   -VOID
	depositMoney
	withdrawMoney
	modifyPassword
	
	DELETE
	deleteAccount
	
	*/
	
}
