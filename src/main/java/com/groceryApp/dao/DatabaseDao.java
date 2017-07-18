package com.groceryApp.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseDao {

	public Connection getConnection(){
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
            String url ="jdbc:mysql://azureclouddb.mysql.database.azure.com:3306/grocerydb?verifyServerCertificate=true&useSSL=true&requireSSL=false";
            con = DriverManager.getConnection(url, "shantan94@azureclouddb", "azure123!");
			return con;
		}catch(Exception ex){
			System.out.println(ex.getMessage());
			return null;
		}
	}
	
	public void close(Connection con){
		try{
			con.close();
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
}
