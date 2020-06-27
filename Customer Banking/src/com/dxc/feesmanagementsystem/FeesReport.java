package com.dxc.feesmanagementsystem;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FeesReport 

{
	InputStreamReader isr =null;
	BufferedReader buff=null;
	AdminLogin admin=null;
	AccountLogin account=null;
	String choiceoption;
	
	public static void main(String[] args) throws Exception
	{
		FeesReport feesobject = new FeesReport();
		feesobject.isr =  new InputStreamReader(System.in);
		feesobject.buff = new BufferedReader(feesobject.isr);
		
			System.out.println("welcome to fees repots\n");
			System.out.println("enter your choice");
			System.out.println("1. Adminlogin \n2. AccountLogin");
			String mchoiceoption=feesobject.buff.readLine();
			String continuechoice;
			boolean transaction = true;
			if(mchoiceoption.equalsIgnoreCase("1"))
			{
				AdminLogin admin = new AdminLogin();
				admin.insert();
				admin.select();
				System.out.println("do you want to continue\nyes \nNo");
				continuechoice=feesobject.buff.readLine();
				if(continuechoice.equalsIgnoreCase("No"))
					transaction = false;
			}
			else
			{
				AccountLogin account = new AccountLogin();
				account.accountantSection();
				System.out.println("do you want to continue\nyes \nNo");
				continuechoice=feesobject.buff.readLine();
				if(continuechoice.equalsIgnoreCase("No"))
					transaction = false;
			}
	}

	
}
