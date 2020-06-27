package com.dxc.feesmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	else if(moption.equalsIgnoreCase("3")) 
	{
		
		try 
		{
			Connection con = DriverManager.getConnection(url);
			PreparedStatement stmtInsert = con.prepareStatement("update  test.accountsection  where name=?");
			System.out.println("enter name");
			stmtInsert.setString(1, scan.next());
			System.out.println("Enter your Choice : ");
			System.out.println("1. Update Email\n2. Update Course\n3. Update Fees\n4. Update Payment Paid\n5. Update Payment Due\n6. Update Address\n7. Update City\n8. Update State\n9. Update Country\n10. Update ContactNo");
			String ch=scan.next();
			switch (Integer.parseInt(ch)) 
			{
			case 1 :	System.out.println("Enter The new Email you want to give : ");
						String Email=scan.next();
						String name = scan.next();
						PreparedStatement stmtInsert0 = con.prepareStatement("update test.accountsection set email=? where name=?");
						stmtInsert0.setString(1, Email); 
						stmtInsert0.setString(2, name); 
						System.out.println(stmtInsert0.executeUpdate() + " No of Student Details Updated");
						break;

			case 2 :	System.out.println("Enter The new Course you want to give : ");
						String nCou=scan.next();
						String name1 = scan.next();
						PreparedStatement stmtInsert1 = con.prepareStatement("update test.accountsection set course=? where name=?");
						stmtInsert1.setString(1, nCou); 
						stmtInsert1.setString(2, name1); 
						System.out.println(stmtInsert1.executeUpdate() + " No of Student Details Updated");
						break;			
						
			case 3 :	System.out.println("Enter The new Fees you want to give : ");
						String nFees=scan.next();
						String name2 = scan.next();
						PreparedStatement stmtInsert2 = con.prepareStatement("update test.accountsection set fees=? where name=?");
						stmtInsert2.setString(1, nFees); 
						stmtInsert2.setString(2, name2); 
						System.out.println(stmtInsert2.executeUpdate() + " No of Student Details Updated");
						break;
			
			case 4 :	System.out.println("Enter The new Payment Paid Amount you want to give : ");
						String nPPaid=scan.next();
						String name4 = scan.next();
						PreparedStatement stmtInsert3 = con.prepareStatement("update test.accountsection set paid=? where name=?");
						stmtInsert3.setString(1, nPPaid); 
						stmtInsert3.setString(2, name4); 
						System.out.println(stmtInsert3.executeUpdate() + " No of Student Details Updated");
						break;			
						
			case 5 :	System.out.println("Enter The new Due Payment Amount you want to give : ");
						String nDpay=scan.next();
						String name5 = scan.next();
						PreparedStatement stmtInsert4 = con.prepareStatement("update test.accountsection set due=? where name=?");
						stmtInsert4.setString(1, nDpay); 
						stmtInsert4.setString(2, name5); 
						System.out.println(stmtInsert4.executeUpdate() + " No of Student Details Updated");
						break;				
						
			case 6 :	System.out.println("Enter The new Address you want to give : ");
						String nAdd=scan.next();
						String name6 = scan.next();
						PreparedStatement stmtInsert5 = con.prepareStatement("update test.accountsection set address=? where name=?");
						stmtInsert5.setString(1, nAdd); 
						stmtInsert5.setString(2, name6); 
						System.out.println(stmtInsert5.executeUpdate() + " No of Student Details Updated");
						break;			
			
			case 7 :	System.out.println("Enter The new City you want to give : ");
						String nCity=scan.next();
						String name7 = scan.next();
						PreparedStatement stmtInsert6 = con.prepareStatement("update test.accountsection set city=? where name=?");
						stmtInsert6.setString(1, nCity); 
						stmtInsert6.setString(2, name7); 
						System.out.println(stmtInsert6.executeUpdate() + " No of Student Details Updated");
						break;	
					
			case 8 :	System.out.println("Enter The new State you want to give : ");
						String nState=scan.next();
						String name8 = scan.next();
						PreparedStatement stmtInsert7 = con.prepareStatement("update test.accountsection set state=? where name=?");
						stmtInsert7.setString(1, nState); 
						stmtInsert7.setString(2, name8); 
						System.out.println(stmtInsert7.executeUpdate() + " No of Student Details Updated");
						break;
			
			case 9 :	System.out.println("Enter The new Country you want to give : ");
						String nCountry=scan.next();
						String name9 = scan.next();
						PreparedStatement stmtInsert8 = con.prepareStatement("update test.accountsection set country=? where name=?");
						stmtInsert8.setString(1, nCountry); 
						stmtInsert8.setString(2, name9); 
						System.out.println(stmtInsert8.executeUpdate() + " No of Student Details Updated");
						break;	
			
			case 10 :	System.out.println("Enter The new Contact No you want to give : ");
						String nCN=scan.next();
						String name10 = scan.next();
						PreparedStatement stmtInsert9 = con.prepareStatement("update test.accountsection set contactno=? where name=?");
						stmtInsert9.setString(1, nCN); 
						stmtInsert9.setString(2, name10); 
						System.out.println(stmtInsert9.executeUpdate() + " No of Student Details Updated");
						break;	
			
			default:
				break;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			scan.close();
		}
	}
	else if(moption.equalsIgnoreCase("4"))
	{
		try {
			Connection con = DriverManager.getConnection(url);
			PreparedStatement stmtInsert = con.prepareStatement("select * from test.accounsection where due!=0");
			ResultSet rst = stmtInsert.executeQuery();
			while(rst.next())
			{
				System.out.println(rst.getString(2));
			}
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
