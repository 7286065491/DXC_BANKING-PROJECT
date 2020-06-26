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
		FeesReport fees = new FeesReport();
		fees.isr =  new InputStreamReader(System.in);
		fees.buff = new BufferedReader(fees.isr);
		
			System.out.println("welcome to fees repots\n");
			System.out.println("enter your choice");
			System.out.println("1. Adminlogin \n2. AccountLogin");
			String mchoiceoption=fees.buff.readLine();
			String continuechoice;
			boolean transaction = true;
			if(mchoiceoption.equalsIgnoreCase("1"))
			{
				AdminLogin admin = new AdminLogin();
				admin.insert();
				admin.select();
				System.out.println("do you want to continue\nyes \nNo");
				continuechoice=fees.buff.readLine();
				if(continuechoice.equalsIgnoreCase("No"))
					transaction = false;
			}
			else
			{
				AccountLogin account = new AccountLogin();
				account.accountantSection();
				System.out.println("do you want to continue\nyes \nNo");
				continuechoice=fees.buff.readLine();
				if(continuechoice.equalsIgnoreCase("No"))
					transaction = false;
			}
	}

	
}
