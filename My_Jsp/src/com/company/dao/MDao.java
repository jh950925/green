package com.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.company.dbmanager.DBManager;
import com.company.dto.MDto;

public class MDao {
	
	public int create(MDto dto) {
		String sql = "insert into mvcmember1 (mid,mname,mpass,memail,mip,mphone,msns)"+
				"values (?,?,?,?,?,?,?)";
		DBManager db = new DBManager();
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result =-1;
		
		try { conn = db.conn(); }catch(Exception e) { e.printStackTrace(); }
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getPass());
			pstmt.setString(4, dto.getEmail());
			pstmt.setString(5, dto.getIp());
			pstmt.setString(6, dto.getPhone());
			pstmt.setString(7, dto.getSns());
			result = pstmt.executeUpdate();
			System.out.println("결과반환 : " + result);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(pstmt !=null) { try { pstmt.close(); } catch (Exception e) { e.printStackTrace(); } }
			if(conn !=null) { try { conn.close(); } catch (Exception e) { e.printStackTrace(); } }
		}
		return result;
	}//end create
	public MDto user(String id){
		MDto list = new MDto();
		DBManager db = new DBManager();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet srt = null;
		String sql = "select * from mvcmember1 where mid =?";
		
		try { conn = db.conn(); }catch(Exception e) { e.printStackTrace(); }
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			srt = pstmt.executeQuery();
			if(srt.next()) {
				list = (
						new MDto(
							srt.getInt("mno"),
							srt.getString("mid"),
							srt.getString("mname"),
							srt.getString("mpass"),
							srt.getString("memail"),
							srt.getString("mdate"),
							srt.getString("mip"),
							srt.getString("mphone"),
							srt.getString("msns")
						)
				);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(srt != null) { try { srt.close(); }catch(Exception e) { e.printStackTrace(); } }
			if(pstmt != null) { try { pstmt.close(); }catch(Exception e) { e.printStackTrace(); } }
			if(conn != null) { try { conn.close(); }catch(Exception e) { e.printStackTrace(); } }
		}
		return list;
	}//join_user
	
	public int login(String id, String pass){
		DBManager db = new DBManager();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet srt = null;
		int result = -1;
		String sql = "select count(*) total from mvcmember1 where mid=? and mpass=?";	
		
		try { conn = db.conn(); }catch(Exception e) { e.printStackTrace(); }
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pass);
			srt = pstmt.executeQuery();
			if(srt.next()) { 
				if(srt.getInt("total")==1) {
					result = 1; 
				}else{ 
					result = -1; 
				}
			}
			System.out.println(result);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(srt != null) { try { srt.close(); }catch(Exception e) { e.printStackTrace(); } }
			if(pstmt != null) { try { pstmt.close(); }catch(Exception e) { e.printStackTrace(); } }
			if(conn != null) { try { conn.close(); }catch(Exception e) { e.printStackTrace(); } }
		}
		return result;
	}//login
	
	public MDto user_read(String id) {
		MDto result = new MDto();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet srt = null;
		DBManager db = new DBManager();
		String sql = "select * from mvcmember1 where mid = ?";
		try { conn = db.conn(); }catch(Exception e) { e.printStackTrace(); }
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			srt = pstmt.executeQuery();
			if(srt.next()) {
				result = (new MDto(
						srt.getInt("mno"),
						srt.getString("mid"),
						srt.getString("mname"),
						srt.getString("mpass"),
						srt.getString("memail"),
						srt.getString("mdate"),
						srt.getString("mip"),
						srt.getString("mphone"),
						srt.getString("msns")
						));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(srt != null) { try { srt.close(); }catch(Exception e) { e.printStackTrace(); } }
			if(pstmt != null) { try { pstmt.close(); }catch(Exception e) { e.printStackTrace(); } }
			if(conn != null) { try { conn.close(); }catch(Exception e) { e.printStackTrace(); } }
		}
		return result;
	}//end mypage
	
	public MDto user_edit_list(String id) {
		MDto dto = new MDto();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet srt = null;
		DBManager db = new DBManager();
		String sql = "select * from mvcmember1 where mid = ?";
		try { conn = db.conn(); }catch(Exception e) { e.printStackTrace(); }
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			srt = pstmt.executeQuery();
			if(srt.next()) {
				dto = (new MDto(
						srt.getInt("mno"),
						srt.getString("mid"),
						srt.getString("mname"),
						srt.getString("mpass"),
						srt.getString("memail"),
						srt.getString("mdate"),
						srt.getString("mip"),
						srt.getString("mphone"),
						srt.getString("msns")
						));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(srt != null) { try { srt.close(); }catch(Exception e) { e.printStackTrace(); } }
			if(pstmt != null) { try { pstmt.close(); }catch(Exception e) { e.printStackTrace(); } }
			if(conn != null) { try { conn.close(); }catch(Exception e) { e.printStackTrace(); } }
		}
		return dto;
	}//end mypage_edit
	
	public int user_delete(String id,String pass) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		DBManager db = new DBManager();
		String sql = "delete from mvcmember1 where mid =? and mpass=?";
		int result = -1;
		
		try { conn = db.conn(); }catch(Exception e) { e.printStackTrace(); }
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pass);
			result = pstmt.executeUpdate();
			System.out.println("결과반환 : " + result);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(pstmt !=null) { try { pstmt.close(); } catch (Exception e) { e.printStackTrace(); } }
			if(conn !=null) { try { conn.close(); } catch (Exception e) { e.printStackTrace(); } }
		}
		return result;
	}
	
	public int user_pass_edit(String pass, String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		DBManager db = new DBManager();
		String sql = "update mvcmember1 set mpass=? where mid =?";
		int result = -1;
		
		try { conn = db.conn(); }catch(Exception e) { e.printStackTrace(); }
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pass);
			pstmt.setString(2, id);
			result = pstmt.executeUpdate();
			System.out.println("결과반환 : " + result);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(pstmt !=null) { try { pstmt.close(); } catch (Exception e) { e.printStackTrace(); } }
			if(conn !=null) { try { conn.close(); } catch (Exception e) { e.printStackTrace(); } }
		}
		return result;
	}
	
	public int id_chk(String id) {
		String sql = "select count(*) cnt from mvcmember1 where mid=?";
		PreparedStatement pstmt = null;
		ResultSet srt = null;
		Connection conn = null;
		int result = -1;
		try { DBManager db = new DBManager(); conn = db.conn(); }catch(Exception e) { e.printStackTrace(); }
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			srt = pstmt.executeQuery();
			if(srt.next()) {
				result = srt.getInt("cnt");
				System.out.println("id체크 dao : "+result);
			}
		}catch(Exception e) { e.printStackTrace(); 
		}finally {
			if(pstmt != null) { try { pstmt.close(); }catch(Exception e) { e.printStackTrace(); } }
			if(conn != null) { try { conn.close(); }catch(Exception e) { e.printStackTrace(); } }
		}
		return result;
	}//end id_chk
	
	public int user_edit(MDto dto) {
		int result =-1;
		DBManager db = new DBManager();
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "update mvcmember1 set mname=?, memail=?, mphone=?, msns=? where mid = ?";
		
		try { conn = db.conn(); }catch(Exception e) { e.printStackTrace(); }
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getEmail());
			pstmt.setString(3, dto.getPhone());
			pstmt.setString(4, dto.getSns());
			pstmt.setString(5, dto.getId());
			
			result = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			if(pstmt != null){ try{ pstmt.close(); }catch(Exception e){ e.printStackTrace(); } }
			if(conn != null){ try{ conn.close(); }catch(Exception e){ e.printStackTrace(); } }
		}
		
		return result;
	}//회원정보 수정
}
