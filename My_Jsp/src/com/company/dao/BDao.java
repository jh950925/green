package com.company.dao;

import java.net.InetAddress;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.company.dbmanager.DBManager;
import com.company.dto.BDto;

public class BDao {
	public int listcnt() {
		 DBManager db = new DBManager();
	     Connection conn = null; PreparedStatement pstmt = null; ResultSet srt = null;
	     String sql = "select count(*) cnt from mvcboard1";
	     int result = -1;
	     try{conn = db.conn();} catch (Exception e) {e.printStackTrace();}
	      try {
	         pstmt = conn.prepareStatement(sql);
	         srt = pstmt.executeQuery();
	         if(srt.next()){ result = srt.getInt("cnt"); }
	      } catch (Exception e) {e.printStackTrace();
	      } finally {
	    	if(srt!=null) { try { srt.close(); }catch(Exception e){ e.printStackTrace(); } }
			if(pstmt!=null) { try { pstmt.close(); }catch(Exception e){ e.printStackTrace(); } }
			if(conn!=null) { try { conn.close(); }catch(Exception e){ e.printStackTrace(); } }
	      }
		 return result;
	}//end listcnt()
	
	public ArrayList<BDto> list10(int pstartno){
		//선언
		ArrayList<BDto> list = new ArrayList<BDto>();
		//db선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet srt = null;
		String sql = "select * from mvcboard1 order by  bstep desc, bindent asc, bno desc limit ?,?";
		try { DBManager db = new DBManager(); conn = db.conn(); }catch(Exception e) { e.printStackTrace(); }
		//db사용
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pstartno+0);
			pstmt.setInt(2, pstartno+10);
			srt = pstmt.executeQuery();
			while(srt.next()) {
				list.add(new BDto(
						srt.getInt("bno"),
						srt.getString("bname"),
						srt.getString("bpass"),
						srt.getString("btitle"),
						srt.getString("bcontent"),
						srt.getString("bdate"),
						srt.getInt("bhit"),
						srt.getString("bip"),
						srt.getString("img"),
						srt.getString("bcategory"),
						srt.getInt("bgroup"),
						srt.getInt("bstep"),
						srt.getInt("bindent")
						));
				//System.out.println(list);
			}
		} catch(Exception e) { e.printStackTrace(); 
		} finally {
			if(srt != null) { try { srt.close(); }catch(Exception e) { e.printStackTrace(); } }
			if(pstmt != null) { try { pstmt.close(); }catch(Exception e) { e.printStackTrace(); } }
			if(conn != null) { try { conn.close(); }catch(Exception e) { e.printStackTrace(); } }
		}
		return list;
	}//end list10
	
	public int create (BDto dto) {
		String sql = "insert into mvcboard1 (bname,bpass,btitle,bcontent,bip,img,bgroup,bstep,bindent) values(?,?,?,?,?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = -1;
		try { DBManager db = new DBManager(); conn = db.conn(); }catch(Exception e) { e.printStackTrace(); }
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getBname());
			pstmt.setString(2, dto.getBpass());
			pstmt.setString(3, dto.getBtitle());
			pstmt.setString(4, dto.getBcontent());
			pstmt.setString(5, InetAddress.getLocalHost().getHostAddress());
			pstmt.setString(6, dto.getImg());
			pstmt.setInt(7, dto.getBgroup());
			pstmt.setInt(8, dto.getBstep());
			pstmt.setInt(9, dto.getBindent());
			result = pstmt.executeUpdate();
			
		}catch(Exception e) { e.printStackTrace(); 
		}finally {
			if(pstmt != null) { try { pstmt.close(); }catch(Exception e) { e.printStackTrace(); } }
			if(conn != null) { try { conn.close(); }catch(Exception e) { e.printStackTrace(); } }
		}
		return result;
	}//end create
	
	public int update_hit(BDto dto) {
		String sql = "update mvcboard1 set bhit=bhit+1 where bno=?";
		PreparedStatement pstmt = null;
		Connection conn = null;
		int result = -1;
		try { DBManager db = new DBManager(); conn = db.conn(); }catch(Exception e) { e.printStackTrace(); }
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getBno());
			result = pstmt.executeUpdate();
		}catch(Exception e) { e.printStackTrace(); 
		}finally {
			if(pstmt != null) { try { pstmt.close(); }catch(Exception e) { e.printStackTrace(); } }
			if(conn != null) { try { conn.close(); }catch(Exception e) { e.printStackTrace(); } }
		}
		return result;
	}//end update_hit
	
	public BDto read(BDto dto) {
		BDto result = new BDto();
		String sql = "select * from mvcboard1 where bno=?";
		PreparedStatement pstmt = null;
		Connection conn = null;
		ResultSet srt = null;
		try { DBManager db = new DBManager(); conn = db.conn(); }catch(Exception e) { e.printStackTrace(); }
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getBno());
			srt = pstmt.executeQuery();
			while(srt.next()) {
				result = (new BDto(
						srt.getInt("bno"),
						srt.getString("bname"),
						srt.getString("bpass"),
						srt.getString("btitle"),
						srt.getString("bcontent"),
						srt.getString("bdate"),
						srt.getInt("bhit"),
						srt.getString("bip"),
						srt.getString("img"),
						srt.getString("bcategory"),
						srt.getInt("bgroup"),
						srt.getInt("bstep"),
						srt.getInt("bindent")
						));
			}
		} catch(Exception e) { e.printStackTrace(); 
		} finally {
			if(srt != null) { try { srt.close(); }catch(Exception e) { e.printStackTrace(); } }
			if(pstmt != null) { try { pstmt.close(); }catch(Exception e) { e.printStackTrace(); } }
			if(conn != null) { try { conn.close(); }catch(Exception e) { e.printStackTrace(); } }
		}
		return result;
	}//end read
	
	public int update(BDto dto) {
		String sql = "update mvcboard1 set btitle=?,bcontent=?,img=? where bno=? and bpass=?";
		PreparedStatement pstmt = null;
		int result=-1;
		Connection conn = null;
		try { DBManager db = new DBManager(); conn = db.conn(); }catch(Exception e) { e.printStackTrace(); }
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getBtitle());
			pstmt.setString(2, dto.getBcontent());
			pstmt.setString(3, dto.getImg());
			pstmt.setInt(4, dto.getBno());
			pstmt.setString(5, dto.getBpass());
			
			result = pstmt.executeUpdate();
		}catch(Exception e) { e.printStackTrace(); 
		}finally {
			if(pstmt != null) { try { pstmt.close(); }catch(Exception e) { e.printStackTrace(); } }
			if(conn != null) { try { conn.close(); }catch(Exception e) { e.printStackTrace(); } }
		}
		return result;
	}//end update
	
	public int delete(BDto dto) {
		String sql = "delete from mvcboard1 where bno = ? and bpass=?";
		PreparedStatement pstmt = null;
		int result=-1;
		Connection conn = null;
		try { DBManager db = new DBManager(); conn = db.conn(); }catch(Exception e) { e.printStackTrace(); }
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getBno());
			pstmt.setString(2, dto.getBpass());
			result = pstmt.executeUpdate();
		}catch(Exception e) { e.printStackTrace(); 
		}finally {
			if(pstmt != null) { try { pstmt.close(); }catch(Exception e) { e.printStackTrace(); } }
			if(conn != null) { try { conn.close(); }catch(Exception e) { e.printStackTrace(); } }
		}
		return result;
	}//end delete
	
	public int update_re1(BDto dto) {
		int result = -1;
		Connection conn = null; 
		PreparedStatement pstmt = null; 
//		ResultSet srt = null;
		
		String sql = "update mvcboard1 set bstep = bstep-1 where bstep > ? and bstep < ?";
		try { DBManager db = new DBManager(); conn = db.conn(); }catch(Exception e) { e.printStackTrace(); }
		
		try {
			// 원본글일경우 : 이전 0 > and < 1000 현재
			// ㄴre		: 이전 0 > and < 999  현재
			// 1번원본글 1000 = 0		/ 999 = 0
			// 2번원본글 2000 = 1000	/ 1999 = 1000	1999/1000 => 1.999 => 2 => 2*1000 - 1000
			int curr = dto.getBstep();
			int prev = (int) (Math.ceil(dto.getBstep()/(float)1000)*1000-1000);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, prev );
			pstmt.setInt(2, curr );
			result = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
//	    	if(srt!=null) { try { srt.close(); }catch(Exception e){ e.printStackTrace(); } }
			if(pstmt!=null) { try { pstmt.close(); }catch(Exception e){ e.printStackTrace(); } }
			if(conn!=null) { try { conn.close(); }catch(Exception e){ e.printStackTrace(); } }
	    }
		return result;
	}//end update_re1
//	■ select max(bstep) from mvcboard4;
	public int create_max() {
		int result = -1;
		Connection conn = null; 
		PreparedStatement pstmt = null;
		ResultSet srt = null;
		
		String sql = "select max(bstep) max from mvcboard1";
		try { DBManager db = new DBManager(); conn = db.conn(); }catch(Exception e) { e.printStackTrace(); }
		
		try {
			pstmt = conn.prepareStatement(sql);
			srt = pstmt.executeQuery();
			while(srt.next()) {
				result = srt.getInt("max");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
	    	if(srt!=null) { try { srt.close(); }catch(Exception e){ e.printStackTrace(); } }
			if(pstmt!=null) { try { pstmt.close(); }catch(Exception e){ e.printStackTrace(); } }
			if(conn!=null) { try { conn.close(); }catch(Exception e){ e.printStackTrace(); } }
	    }
		return result;
	}//end create_max
	public ArrayList<BDto> search (String word) {
		ArrayList<BDto> result = new ArrayList<>();
		
		String sql = "select * from mvcboard1 where btitle like ?";
		DBManager db = new DBManager();
		PreparedStatement pstmt = null; Connection conn = null; ResultSet srt =null;
		
		try { conn = db.conn(); }catch(Exception e) { e.printStackTrace(); }
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+word+"%");
			srt = pstmt.executeQuery();
			
			while(srt.next()) {
				result.add(new BDto(
						srt.getInt("bno"),
						srt.getString("bname"),
						srt.getString("bpass"),
						srt.getString("btitle"),
						srt.getString("bcontent"),
						srt.getString("bdate"),
						srt.getInt("bhit"),
						srt.getString("bip"),
						srt.getString("img"),
						srt.getString("bcategory"),
						srt.getInt("bgroup"),
						srt.getInt("bstep"),
						srt.getInt("bindent")
						));
			}
		}catch(Exception e) {e.printStackTrace();
		}finally {
			if(srt!=null) {try { srt.close(); } catch (Exception e) { e.printStackTrace(); }}
			if(pstmt!=null) {try { pstmt.close(); } catch (Exception e) { e.printStackTrace(); }}
			if(conn!=null) {try { conn.close(); } catch (Exception e) { e.printStackTrace(); }}
		}	
		return result;
	}
} 
