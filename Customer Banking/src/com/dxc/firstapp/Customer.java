package com.dxc.firstapp;

public class Customer
{
	 String Name;
     String Mailid;
	 String Phonenumber;
	 String balance,banktype;
	 public String getBanktype() {
		return banktype;
	}
	public void setBanktype(String banktype) {
		this.banktype = banktype;
	}

	int operationCounter, OpenAccountCounter, DepositCounter, WithdrawlCounter, OpenFDCounter;
	public int getOpenAccountCounter() {
		return OpenAccountCounter;
	}
	public void setOpenAccountCounter(int openAccountCounter) {
		OpenAccountCounter = openAccountCounter;
	}
	public int getDepositCounter() {
		return DepositCounter;
	}
	public void setDepositCounter(int depositCounter) {
		DepositCounter = depositCounter;
	}
	public int getWithdrawlCounter() {
		return WithdrawlCounter;
	}
	public void setWithdrawlCounter(int withdrawlCounter) {
		WithdrawlCounter = withdrawlCounter;
	}
	public int getOpenFDCounter() {
		return OpenFDCounter;
	}
	public void setOpenFDCounter(int openFDCounter) {
		OpenFDCounter = openFDCounter;
	}
	public Customer(String Name, String Mailid, String Phonenumber,String balance)
	{
		super();
		this.Name=Name;
		this.Mailid=Mailid;
		this.Phonenumber=Phonenumber;
		this.balance=balance;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return Name;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getMailid() {
		return Mailid;
	}
	public void setMailid(String mailid) {
		Mailid = mailid;
	}
	public String getPhonenumber() {
		return Phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		Phonenumber = phonenumber;
	}
	public int getOperationCounter() {
		return operationCounter;
	}

	public void setOperationCounter(int operationCounter) {
		this.operationCounter = operationCounter;
	}

}
