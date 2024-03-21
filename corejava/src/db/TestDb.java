package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class TestDb {
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	
	// load Driver ///
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	
	// manage connection or getConnection ////////
			// give url, username , password 
	Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_practice", "root", "");
	
	
	
	//                               insert sql 
	
//	String sql = "insert into user(username , password) values('test1', 'test1')";
//	
//	// create statement ///////
//	
//	Statement stm = con.createStatement();
//	
//	// execute querry 
//	
//	stm.execute(sql);
//	
//	// close db
//	
//	con.close();
//	
//	System.out.println("Successfully inserted data! ");
	
	
	//================================delete sql===============
	
//	String sql = "delete from user where id=1";
//	
//	
//	//============Create statement============
//	Statement stm = con.createStatement();
//	
//	// ======================execute querry =============
//	
//		stm.execute(sql);
//		
//		// close  
//		con.close();
	
	
	String sql1 = "update user set password = 'shyam1234' where id = 3";
	
	Statement stm1 = con.createStatement();
	
	stm1.execute(sql1);
	
	
	
	String sql = "select * from user";
	
	Statement stm = con.createStatement();
	
	ResultSet rs =  stm.executeQuery(sql);
	
	while(rs.next()) {
		
		System.out.println("Id = "+rs.getInt("id"));
		System.out.println("Username = "+rs.getString("username"));
		System.out.println("Password = "+rs.getString("password"));
		
		System.out.println("========================================");
		
		
		
	}

	con.close();
	}

}

