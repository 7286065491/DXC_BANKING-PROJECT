package com.dxc.feesmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AdminLogin 
{
	static String url="jdbc:mysql://localhost:3306?user=root&password=mounika";
	public  void insert()
	{
		Scanner scan = new Scanner(System.in);
		try {
			Connection con = DriverManager.getConnection(url);
			PreparedStatement stmtInsert = con.prepareStatement("insert into test.logintable values(?,?,?,?,?)");
			
			System.out.println("enter id");
			stmtInsert.setInt(1, scan.nextInt());
			System.out.println("enter the name");
			stmtInsert.setString(2, scan.next());
			System.out.println("enter the mailid");
			stmtInsert.setString(3, scan.next());
			System.out.println("enter the password");
			stmtInsert.setString(4, scan.next());
			System.out.println("enter the phonenumber");
			stmtInsert.setString(5, scan.next());
			System.out.println(stmtInsert.executeUpdate());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			scan.close();
		}
		
	}
	public  void select()
	{
		String option=null;
		 Scanner scan1 = new Scanner(System.in);
		try {
			Connection con1 = DriverManager.getConnection(url);
			PreparedStatement pst = con1.prepareStatement("select name from test.logintable where phonenumber=? and password=?");
		   
		    System.out.println("enter the phonenumber");
		    pst.setString(1, scan1.next());
		    System.out.println("enter the password");
		    pst.setString(2, scan1.next());
		    ResultSet resultset = pst.executeQuery();
		    System.out.println("login");
		    if(resultset.next())
		    {
		    	String name = resultset.getString("name");
		    	System.out.println("welcome "+name);
		    	System.out.println("welcome to admin section");
		    	System.out.println("choose the option");
		    	System.out.println("1.Add Account\n2. View Account\n3.logout");
		    	String moption=scan1.next();
		    	if(moption.equalsIgnoreCase("1"))
		    	{
		    		AdminLogin admin = new AdminLogin();
		    		admin.adminSection();
		    		System.out.println("Add Account");
		    		
		    	}
		    	else if(moption.equalsIgnoreCase("2"))
		    	{
		    		AdminLogin admin = new AdminLogin();
		    		admin.viewAccount();
		    		
		    	}
		    	else {
		    		System.out.println("Logout");
		    	}
		    }
		    else {
		    	System.out.println("Invalid login");
		    }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			scan1.close();
			
		}
		
	}
	public void adminSection()
	{
		Scanner scan = new Scanner(System.in);
		try {
			Connection con = DriverManager.getConnection(url);
			PreparedStatement stmtInsert = con.prepareStatement("insert into test.adminsection values(?,?,?,?)");
			
			System.out.println("enter id");
			stmtInsert.setInt(1, scan.nextInt());
			System.out.println("enter the name");
			stmtInsert.setString(2, scan.next());
			System.out.println("enter the mailid");
			stmtInsert.setString(3, scan.next());
			System.out.println("enter the phonenumber");
			stmtInsert.setString(4, scan.next());
			System.out.println(stmtInsert.executeUpdate());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			scan.close();
		}
	}
	public void viewAccount()
	{
		Scanner scan = new Scanner(System.in);
		try {
			Connection con = DriverManager.getConnection(url);
			PreparedStatement stmtInsert = con.prepareStatement("select id from test.adminsection where values(?,?,?,?");
			
			System.out.println("enter id");
			stmtInsert.setInt(1, scan.nextInt());
			System.out.println("enter the name");
			stmtInsert.setString(2, scan.next());
			System.out.println("enter the mailid");
			stmtInsert.setString(3, scan.next());
			System.out.println("enter the phonenumber");
			stmtInsert.setString(4, scan.next());
			System.out.println(stmtInsert.executeUpdate());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			scan.close();
		}
	}
}
