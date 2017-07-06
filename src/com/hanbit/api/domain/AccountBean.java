package com.hanbit.api.domain;

public class AccountBean {
	public final static String BANK_NAME = "국민은행"; 
	private int accountNo, money;
	private String name, id, password, txDate, ssn;

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setMoney(int money) {
		this.money=money;
	}
	public int getMoney() {
		return money;
	}
	public void setName(String name) {
		this.name =name;
	}
	public String getName() {
		return name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public String getPassword() {
		return password;
	}
	public void setTxDate(String txDate) {
		this.txDate= txDate;
	}
	public String getTxDate() {
		return txDate;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return ssn;
	}
	public String toString() {
		return  String.format("계좌정보 [이름:%s, 번호: %d, 잔액: %d]",name,accountNo,money);
	}
}
