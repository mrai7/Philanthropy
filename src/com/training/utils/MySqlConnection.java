package com.training.utils;
import java.sql.*;
import java.util.Properties;
import java.io.*;

public class MySqlConnection {
	
	public static Connection getMyOracleConnection() {
		
		Connection con=null;
		
		try {
			
			Properties props=new Properties();
			
			FileInputStream inStream=new FileInputStream(new File("DbConnection.properties"));
			
			props.load(inStream);
			
			Class.forName(props.getProperty("db.driverClass"));
			
			con=DriverManager.getConnection(props.getProperty("db.driverURL"),
					                    props.getProperty("db.userName"),
					                    props.getProperty("db.passWord"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	

}
