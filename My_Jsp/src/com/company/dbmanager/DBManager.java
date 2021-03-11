package com.company.dbmanager;

import java.sql.Connection;
import javax.naming.*;
import javax.sql.*;

public class DBManager {
	private static Connection conn;
	public DBManager() { super(); }
	public Connection conn() {
		try {
			//1. server.xml Context 리소스찾기 
			Context initContext = (Context)new InitialContext();
			//2. 환경설정
			Context envContext = (Context)initContext.lookup("java:/comp/env");
			//3. dataSource 설정
			DataSource db = (DataSource)envContext.lookup("jdbc/TestDB");
			//4. connection 얻어오기
			conn = db.getConnection();
		} catch (Exception e) { e.printStackTrace(); }
		return conn;
	}
}
