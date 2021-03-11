package com.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.company.dbmanager.DBManager;
import com.company.dto.MainPhotoDto;
import com.company.dto.SubMenueDto;

public class MainDao {
	public ArrayList<MainPhotoDto> img(){
		 ArrayList<MainPhotoDto> result = new ArrayList<>();
		 DBManager db = new DBManager();
	     Connection conn = null; PreparedStatement pstmt = null; ResultSet srt = null;
	     String sql = "select * from main_img";
	     try { db = new DBManager(); conn = db.conn(); }catch(Exception e) { e.printStackTrace(); }
	     
	     try {
	    	 pstmt = conn.prepareStatement(sql);
	    	 System.out.println("pstmt : "+pstmt);
	    	 srt = pstmt.executeQuery();
	    	 while(srt.next()) {
	    		 result.add(new MainPhotoDto( srt.getInt("no"), srt.getString("img") ) );
	    		 System.out.println("result : " + result);
	    	 }
	     }catch(Exception e) {
	    	 e.printStackTrace();
	     }finally {
				if(srt != null) { try { srt.close(); }catch(Exception e) { e.printStackTrace(); } }
				if(pstmt != null) { try { pstmt.close(); }catch(Exception e) { e.printStackTrace(); } }
				if(conn != null) { try { conn.close(); }catch(Exception e) { e.printStackTrace(); } }
		 }
	     
		return result;
	}
	
	//메뉴
	public ArrayList<SubMenueDto> submenue(int menue_no){
		ArrayList<SubMenueDto> result = new ArrayList<>();
		DBManager db = new DBManager();
	    Connection conn = null; PreparedStatement pstmt = null; ResultSet srt = null;
	     String sql = "select a.title,b.sub_menue,c.product,a.no,c.product_img"
	     		+ " from main_category as a"
	     		+ " join submenue as b on a.no = b.main_category"
	     		+ " join productmenue as c on b.no = c.submenue_no"
	     		+ " where a.no = ?"
	     		+ " order by a.title asc";
	     try { db = new DBManager(); conn = db.conn(); }catch(Exception e) { e.printStackTrace(); }
	     	
	     try {
	    	 pstmt = conn.prepareStatement(sql);
	    	 pstmt.setInt(1, menue_no);
	    	 System.out.println("pstmt : "+pstmt);
	    	 srt = pstmt.executeQuery();
	    	 while(srt.next()) {
	    		 result.add(new SubMenueDto(
	    				   srt.getInt("no")
	    				 , srt.getString("title")
	    				 , srt.getString("sub_menue")
	    				 , srt.getString("product")
	    				 , srt.getString("product_img")
	    				 ));
//	    		 System.out.println("json : "+json);
	    	 }
	     }catch(Exception e) {
	    	 e.printStackTrace();
	     }finally {
				if(srt != null) { try { srt.close(); }catch(Exception e) { e.printStackTrace(); } }
				if(pstmt != null) { try { pstmt.close(); }catch(Exception e) { e.printStackTrace(); } }
				if(conn != null) { try { conn.close(); }catch(Exception e) { e.printStackTrace(); } }
		 }
	     
		return result;
	}
}
