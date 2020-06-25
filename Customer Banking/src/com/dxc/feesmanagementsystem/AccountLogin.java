package com.dxc.feesmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AccountLogin 
{
public void accountantSection()
{
	String url="jdbc:mysql://localhost:3306?user=root&password=mounika";
	String option=null;
	Scanner scan = new Scanner(System.in);
	System.out.println("welcome to accountantsection");
	System.out.println("choose the option");
	System.out.println("1. Add Student\n2. view Student\n3. Edit Student\n4. Due Fees\n5. Logout");
	String moption=scan.next();
	if(moption.equalsIgnoreCase("1"))
	{
		 
		try {
			Connection con = DriverManager.getConnection(url);
			PreparedStatement stmtInsert = con.prepareStatement("insert into test.accountsection values(?,?,?,?,?,?,?,?,?,?,?)");
			System.out.println("enter name");
			stmtInsert.setString(1, scan.next());
			System.out.println("enter the email");
			stmtInsert.setString(2, scan.next());
			System.out.println("enter the course");
			stmtInsert.setString(3, scan.next());
			System.out.println("enter the fee");
			stmtInsert.setString(4, scan.next());
			System.out.println("enter the paid");
			stmtInsert.setString(5, scan.next());
			System.out.println("enter the due");
			stmtInsert.setString(6, scan.next());
			System.out.println("enter the Address");
			stmtInsert.setString(7, scan.next());
			System.out.println("enter the city");
			stmtInsert.setString(8, scan.next());
			System.out.println("enter the state");
			stmtInsert.setString(9, scan.next());
			System.out.println("enter the country");
			stmtInsert.setString(10, scan.next());
			System.out.println("enter the contact no");
			stmtInsert.setString(11, scan.next());
			System.out.println(stmtInsert.executeUpdate());
			System.out.println("Add");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	else if(moption.equalsIgnoreCase("2"))
	{
		try {
			Connection con = DriverManager.getConnection(url);
			PreparedStatement stmtInsert = con.prepareStatement("select name from test.accountsection where values(?,?,?,?,?,?,?,?,?,?,?)");
			System.out.println("enter name");
			stmtInsert.setString(1, scan.next());
			System.out.println("enter the email");
			stmtInsert.setString(2, scan.next());
			System.out.println("enter the course");
			stmtInsert.setString(3, scan.next());
			System.out.println("enter the fee");
			stmtInsert.setString(4, scan.next());
			System.out.println("enter the paid");
			stmtInsert.setString(5, scan.next());
			System.out.println("enter the due");
			stmtInsert.setString(6, scan.next());
			System.out.println("enter the Address");
			stmtInsert.setString(7, scan.next());
			System.out.println("enter the city");
			stmtInsert.setString(8, scan.next());
			System.out.println("enter the state");
			stmtInsert.setString(9, scan.next());
			System.out.println("enter the country");
			stmtInsert.setString(10, scan.next());
			System.out.println("enter the contact no");
			stmtInsert.setString(11, scan.next());
			System.out.println(stmtInsert.executeUpdate());
			System.out.println("Add");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	else if(moption.equalsIgnoreCase("3")) {
		
		try {
			Connection con = DriverManager.getConnection(url);
			PreparedStatement stmtInsert = con.prepareStatement("update  test.accountsection set course=? where name=?");
			System.out.println("enter name");
			stmtInsert.setString(1, scan.next());
			System.out.println("enter the email");
			stmtInsert.setString(2, scan.next());
			System.out.println("enter the course");
			System.out.println(stmtInsert.executeUpdate());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	else if(moption.equalsIgnoreCase("4"))
	{
		try {
			Connection con = DriverManager.getConnection(url);
			PreparedStatement stmtInsert = con.prepareStatement("select name=? from test.accounsection where due=?");
			System.out.println("enter the name");
			stmtInsert.setString(1, scan.next());
			System.out.println("enter the due");
			stmtInsert.setString(2, scan.next());
			System.out.println(stmtInsert.executeUpdate());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	else
	{
		System.out.println("logout");
	}
}
}
