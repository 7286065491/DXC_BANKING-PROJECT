package com.dxc.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;

public class DataBaseConnectivityExample 
{
	public static void main(String[] args) throws Exception {
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=mounika");
	PreparedStatement stmtInsert = con.prepareStatement("insert into test.tablename1 values(?,?,?,?,?)");
	stmtInsert.setInt(1, 3);
	stmtInsert.setString(2, "Virender Sehwag");
	stmtInsert.setString(3, "viru@gmail.com");
	stmtInsert.setString(4, "New Delhi");
	stmtInsert.setString(5, "3214569874");
	System.out.println(stmtInsert.executeUpdate());
}
}