package com.spcleaningservice.jadWS.dbaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection getConnection() {
		String dbUrl = "jdbc:postgresql://ep-morning-poetry-a1rs2fqw.ap-southeast-1.aws.neon.tech/jadCA1?sslmode=require";
		String dbUser = "root";
		String dbPassword = "1aNcTzCnogd9";
		String dbClass = "org.postgresql.Driver";
        
        Connection connection = null;
        try {
        	Class.forName(dbClass);
        } catch (ClassNotFoundException e) {
        	e.printStackTrace();
        }
        
        try {
        	connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
        } catch (SQLException e) {
        	e.printStackTrace();
        }
        
        return connection;
	}
}
