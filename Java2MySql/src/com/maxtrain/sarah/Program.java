package com.maxtrain.sarah;


import java.sql.*;
/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;*/

public class Program {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/salesdb", "root", "Train@MAX");
		PreparedStatement stmt = conn.prepareStatement("SELECT * from customers where Id = ?;");
		stmt.setInt(1, 1);	//sets the first parameter(?) in statement as 1
		
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			var id = rs.getInt("Id");
			var name = rs.getNString("Name");
			System.out.println(id + " | " + name);
			
			
		}
		
		
	}

}
