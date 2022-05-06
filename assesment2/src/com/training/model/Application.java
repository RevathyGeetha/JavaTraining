package com.training.model;
import java.sql.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con;
		try {
			 con = DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
			 System.out.println(con);

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
