package com.dxc.firstapp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Putting Extra Comment for Demonstration of Git Commit and Push
// This is My Customer Banking Class
class MyBankClass <T> { // T -> ICIC / Hdfc / AXIS
	T obj;
	
	void create(T obj) { // T-> ICIC / Hdfc / AXIS
		this.obj = obj;
	}
	
	T getInstance() { // T -> ICIC / Hdfc / AXIS
		return obj;
	}
}

public class CustomerBanking {

	InputStreamReader isr = null;
	BufferedReader buff = null;
	ICIC mIcic = null;
	Hdfc mHdfc = null;
	AXIS mAxis = null;
	private Object mICIC;
	
	public static void main(String[] args) throws Exception {
		
		CustomerBanking mObject = new CustomerBanking();
		
		mObject.isr = new InputStreamReader(System.in);
		mObject.buff = new BufferedReader(mObject.isr);
		
		System.out.println("Welcome to INDIAN BANKING SYSTEM\n");
		System.out.println("SELECT  YOUR BANK\n1. ICICI\n2. HDFC\n3. AXIS");
		String mBankChoice = mObject.buff.readLine();
		
		String mOperationChoice, continueChoice;
		boolean transaction = true;
		
		switch(Integer.parseInt(mBankChoice))
		{
		case 1: MyBankClass<ICIC> obj = new MyBankClass<ICIC>();
				obj.create(new ICIC());
				mObject.mIcic = obj.getInstance();
				do {
					System.out.println("SELECT  YOUR  Operation\n1. Open Account\n2. Deposit\n3. WithDrawl\n4. Open FD");
					mOperationChoice = mObject.buff.readLine();
					switch(Integer.parseInt(mOperationChoice)) {
					case 1: mObject.mIcic.openAccount(mObject.buff);
							break;
					case 2: mObject.mIcic.deposit(mObject.buff);
							break;
					case 3: mObject.mIcic.withdrawl(mObject.buff);
							break;
					case 4: mObject.mIcic.openFD(mObject.buff);
							break;
					default: System.out.println("No Operation Choice Selected");
					}
					System.out.println("Do you Want to Continue\nYes\nNo");
					continueChoice = mObject.buff.readLine();
					if(continueChoice.equalsIgnoreCase("No"))
						transaction = false;
				}while(transaction);
				break;
		
		case 2: MyBankClass<Hdfc> obj1 = new MyBankClass<Hdfc>();
				obj1.create(new Hdfc());
				mObject.mHdfc = obj1.getInstance();
				do {
					System.out.println("SELECT  YOUR  Operation\n1. Open Account\n2. Deposit\n3. WithDrawl\n4. Open FD");
					mOperationChoice = mObject.buff.readLine();
					switch(Integer.parseInt(mOperationChoice)) {
					case 1: mObject.mHdfc.openAccount(mObject.buff);
							break;
					case 2: mObject.mHdfc.deposit(mObject.buff);
							break;
					case 3: mObject.mHdfc.withdrawl(mObject.buff);
							break;
					case 4:  mObject.mHdfc.openFD(mObject.buff);
							break;
					default: System.out.println("No Operation Choice Selected");
					}
					System.out.println("Do you Want to Continue\nYes\nNo");
					continueChoice = mObject.buff.readLine();
					if(continueChoice.equalsIgnoreCase("No"))
						transaction = false;
				}while(transaction);
				break;
		
		case 3: MyBankClass<AXIS> obj2 = new MyBankClass<AXIS>();
				obj2.create(new AXIS());
				mObject.mAxis = obj2.getInstance();
				do {
					System.out.println("SELECT  YOUR  Operation\n1. Open Account\n2. Deposit\n3. WithDrawl\n4. Open FD");
					mOperationChoice = mObject.buff.readLine();
					switch(Integer.parseInt(mOperationChoice)) {
					case 1: mObject.mAxis.openAccount(mObject.buff);
							break;
					case 2: mObject.mAxis.deposit(mObject.buff);
							break;
					case 3: mObject.mAxis.withdrawl(mObject.buff);
							break;
					case 4:  mObject.mAxis.openFD(mObject.buff);
							break;
					default: System.out.println("No Operation Choice Selected");
					}
					System.out.println("Do you Want to Continue\nYes\nNo");
					continueChoice = mObject.buff.readLine();
					if(continueChoice.equalsIgnoreCase("No"))
						transaction = false;
				}while(transaction);
				break;
		
		default: System.out.println("No Choice of Bank Done");
		}
	}	
}
