package com.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.company.dbmanager.DBManager;
import com.company.dto.Ask2Dto;
import com.company.dto.AskDto;

public class AskDao {

	public ArrayList<AskDto> list(){
		ArrayList<AskDto> list = new ArrayList<AskDto>();
		DBManager db = new DBManager();
		PreparedStatement pstmt = null;
		Connection conn = null;
		ResultSet srt = null;
		
		String sql = "select * from askmain;";
		try { conn = db.conn(); }catch(Exception e) { e.printStackTrace(); }
		try {
			pstmt = conn.prepareStatement(sql);
			srt = pstmt.executeQuery();
			while(srt.next()) {
				list.add(
						new AskDto(
							srt.getInt("no"),
							srt.getString("category")
						)
				);
				System.out.println("AskDao_List : " + list);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(srt != null) { try { srt.close(); }catch(Exception e) { e.printStackTrace(); } }
			if(pstmt != null) { try { pstmt.close(); }catch(Exception e) { e.printStackTrace(); } }
			if(conn != null) { try { conn.close(); }catch(Exception e) { e.printStackTrace(); } }
		}
		
		return list;
	}
	public ArrayList<Ask2Dto> ask(){
		ArrayList<Ask2Dto> list = new ArrayList<Ask2Dto>();
		DBManager db = new DBManager();
		PreparedStatement pstmt = null;
		Connection conn = null;
		ResultSet srt = null;
		
		String sql = "select * from ask;";
		try { conn = db.conn(); }catch(Exception e) { e.printStackTrace(); }
		try {
			pstmt = conn.prepareStatement(sql);
			srt = pstmt.executeQuery();
			while(srt.next()) {
				list.add(
						new Ask2Dto(
							srt.getInt("no"),
							srt.getString("title"),
							srt.getString("content")
						)
				);
				System.out.println("Ask2Dao_List : " + list);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(srt != null) { try { srt.close(); }catch(Exception e) { e.printStackTrace(); } }
			if(pstmt != null) { try { pstmt.close(); }catch(Exception e) { e.printStackTrace(); } }
			if(conn != null) { try { conn.close(); }catch(Exception e) { e.printStackTrace(); } }
		}
		return list;
	}
}
