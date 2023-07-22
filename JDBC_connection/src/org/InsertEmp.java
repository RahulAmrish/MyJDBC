package org;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertEmp{
	
	public void DoCon() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Driver myDriver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(myDriver);
			String url = "jdbc:mysql://localhost:3306/customers";
			String UserName = "root";
			String Password = "root";
			Connection con = DriverManager.getConnection(url, UserName, Password) ;
			Statement statement = con.createStatement();
			String MyQuery = "insert into customer_info values ( 6, 'amrish', 'dallas', 6246,'america' )";
			statement.executeUpdate(MyQuery);
			System.out.println("Query Executed--->"+MyQuery);
			con.close();
			
			
			
		}catch(Exception e) {
			System.out.println("Exception---"+e);
		}
		
	}

	public static void main(String[] args) {
		InsertEmp i = new InsertEmp();
		i.DoCon();

	}

}
