package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

import controller.ProInfo;
import controller.UserInfo;

public class MVC_Using implements ActionListener {
	// model
	ArrayList<UserInfo> userinfo = new ArrayList<>();
	ArrayList<ProInfo> proinfo  = new ArrayList<>();
	SimpleDateFormat time;
	// view
	Logo 			logo; 			// 로고화면 네네
	Login 			login; 			// 로그인 후 메인화면
	User_Create		user_create;	// 회원가입
	User_Find 		user_find; 		// 계정찾기
	User_Update 	user_update; 	// 계정정보 수정
	Pro_Create 		pro_create; 	// 상품등록
	Wrh_Position 	wrh_position; 	//창고위치
	Pro_List 		pro_list; 		//재고확인
	Pro_Delete 		pro_delete; 	//상품출고
	Stock_List 		stock_list; 	//출고확인
	//
	boolean chk;
	///////////////////////////////////////////////////////////////////////////////////////////////////////
	public MVC_Using() {
		chk = false;
		time = new SimpleDateFormat("yyyy-MM-dd");
		// user정보
		userinfo = new ArrayList<UserInfo>();
		// view
		logo 		 = new Logo(); 				logo.show();
		login 		 = new Login();
		user_create  = new User_Create();
		user_find	 = new User_Find();
		user_update  = new User_Update();
		pro_create 	 = new Pro_Create();
		wrh_position = new Wrh_Position();
		pro_list 	 = new Pro_List();
		pro_delete 	 = new Pro_Delete();
		stock_list 	 = new Stock_List();
		
		//btn(this)
		/** logo **/
		for(int i=0; i<logo.btn.length;i++) { logo.btn[i].addActionListener(this); }
		
		/** user_create **/
		user_create.btn.addActionListener(this);
		
		/** user_find **/
		for(int i=0; i<user_find.btn.length;i++) { user_find.btn[i].addActionListener(this); }
		
		/** login **/
		for(int i=0; i<login.btn.length;i++) { login.btn[i].addActionListener(this); }
		
		/** user_update **/
		for(int i=0; i<user_update.btn.length;i++) { user_update.btn[i].addActionListener(this); }
		
		/** pro_create **/
		for(int i=0; i<pro_create.btn.length;i++) { pro_create.btn[i].addActionListener(this); }
		
		/** wrh_position **/
		wrh_position.btn.addActionListener(this);
		
		/** pro_list **/
		for(int i=0; i<pro_list.btn.length;i++) { pro_list.btn[i].addActionListener(this); }
		
		/** pro_delete **/
		for(int i=0; i<pro_delete.btn.length;i++) { pro_delete.btn[i].addActionListener(this); }
		
		/** stock_list **/
		for(int i=0; i<stock_list.btn.length;i++) { stock_list.btn[i].addActionListener(this); }
		
	}//end useing()
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public void actionPerformed(ActionEvent e) {
		/************************************************************************************************************/
		/** 로고화면 **/
		if(e.getSource().equals(logo.btn[0])) {			//회원가입
			for(int i=0; i<user_create.text.length;i++) { user_create.text[i].setText(""); } // 버튼 동작하면 text 초기화
			user_create.show();
		}else if(e.getSource().equals(logo.btn[1])) {   //계정찾기
			for(int i=0; i<user_find.text.length;i++) { user_find.text[i].setText(""); }
			user_find.show();
		}else if(e.getSource().equals(logo.btn[2])) {	//로그인
			Iterator<UserInfo> iter = userinfo.iterator();
			while(iter.hasNext()) {
				UserInfo temp = (UserInfo) iter.next();
				if(temp.getId().equals(logo.text.getText())) {
					if(temp.getPass().equals(logo.passtext.getText())) {
						login.show();
						login.label[1].setText(temp.getName());
						login.label[3].setText(temp.getId());
						login.label[5].setText(temp.getUserNo());
						for(int i=0; i<user_create.text.length;i++) { user_create.text[i].setText(""); }
						logo.frame.dispose();
						break;
					}else { JOptionPane.showMessageDialog(null, "비밀번호를 확인해 주세요"); break; }
				}//end if
			}//end while
		}else if(e.getSource().equals(logo.btn[3])) { System.exit(0); } //종료
		/************************************************************************************************************/
		/** 회원가입 **/
		if(e.getSource().equals(user_create.btn)) {
			userinfo.add(new UserInfo(
					user_create.text[0].getText(), user_create.text[1].getText(), 
					user_create.text[2].getText(), user_create.text[3].getText(),
					user_create.text[4].getText(), user_create.text[5].getText(), 
					user_create.text[6].getText(), user_create.text[7].getText())
			);
			user_create.frame.dispose();
			System.out.println(userinfo);
		}//end user_create
		/************************************************************************************************************/
		/** 계정찾기 **/
		if(e.getSource().equals(user_find.btn[0])) { //id확인
			Iterator<UserInfo> iter = userinfo.iterator();
			while(iter.hasNext()) {
				UserInfo temp = iter.next();
				if(temp.getName().equals(user_find.text[0].getText()) 
				&& temp.getUserDate().equals(user_find.text[1].getText())
				&& temp.getUserNo().equals(user_find.text[2].getText())) {
					user_find.text[3].setText(temp.getId());
					break;
				}//end if
			}//end while
		}else if(e.getSource().equals(user_find.btn[1])) { //초기화
			for(int i=0; i<user_find.text.length; i++) {
				user_find.text[i].setText("");
			}
		}else if(e.getSource().equals(user_find.btn[2])) { //비밀번호 확인
			Iterator<UserInfo> iter = userinfo.iterator();
				while(iter.hasNext()) {
					UserInfo temp = iter.next();
					if(temp.getId().equals(user_find.text[4].getText())
					&& temp.getName().equals(user_find.text[5].getText()) 
					&& temp.getUserDate().equals(user_find.text[6].getText())
					&& temp.getUserNo().equals(user_find.text[7].getText())) {
						user_find.text[8].setText(temp.getId());
						user_find.text[9].setText(temp.getPass());
						user_find.text[10].setText(temp.getPass_chk()); 
						break;
				}//end if
			}//end while
		}else if(e.getSource().equals(user_find.btn[3])) { //등록
			Iterator<UserInfo> iter = userinfo.iterator();
			while(iter.hasNext()) {
				UserInfo temp = iter.next();
				if(temp.getId().equals(user_find.text[4].getText())
				&& temp.getName().equals(user_find.text[5].getText()) 
				&& temp.getUserDate().equals(user_find.text[6].getText())
				&& temp.getUserNo().equals(user_find.text[7].getText())) {
					temp.setId(user_find.text[8].getText());
					temp.setPass(user_find.text[9].getText());
					temp.setPass_chk(user_find.text[10].getText());
					System.out.println(userinfo);
					break;
				}//end if
			}//end while
			user_find.frame.dispose();
		}
		/************************************************************************************************************/
		/** 메인화면 **/
		if(e.getSource().equals(login.btn[0])) { //계정수정
			Iterator<UserInfo> iter = userinfo.iterator();
			while(iter.hasNext()) {
				UserInfo temp = iter.next();
				user_update.text[0].setText(temp.getName());
				user_update.text[1].setText(temp.getId());
				user_update.text[2].setText(temp.getPass());
				user_update.text[3].setText(temp.getPass_chk());
				user_update.text[4].setText(temp.getMail());
				user_update.text[5].setText(temp.getPhno());
				user_update.text[6].setText(temp.getUserDate());
				user_update.text[7].setText(temp.getUserNo());
			}
			user_update.show();
		}else if(e.getSource().equals(login.btn[1])) { //상품등록
			pro_create.show();
			login.frame.dispose();
		}else if(e.getSource().equals(login.btn[2])) { //재고확인
			pro_list.show();
			login.frame.dispose();
		}else if(e.getSource().equals(login.btn[3])) { //상품출고
			pro_delete.show();
			login.frame.dispose();
		}else if(e.getSource().equals(login.btn[4])) { //출고확인
			stock_list.show();
			login.frame.dispose();
		}else if(e.getSource().equals(login.btn[5])) { //로그아웃
			logo.text.setText("");
			logo.passtext.setText("");
			logo.show();
			login.frame.dispose();
		}
		/************************************************************************************************************/
		/** 계정수정 **/
		if(e.getSource().equals(user_update.btn[0])) { //수정
			Iterator<UserInfo> iter = userinfo.iterator();
			while(iter.hasNext()) {
				UserInfo temp = iter.next();
				temp.setId(user_update.text[0].getText());
				temp.setPass(user_update.text[1].getText());
				temp.setPass_chk(user_update.text[2].getText());
				temp.setMail(user_update.text[3].getText());
				temp.setPhno(user_update.text[4].getText());
				temp.setUserDate(user_update.text[5].getText());
				temp.setUserNo(user_update.text[6].getText());
				break;
			}
			JOptionPane.showMessageDialog(null, "수정되었습니다.");
		}else if(e.getSource().equals(user_update.btn[1])) { //삭제
			Iterator<UserInfo> iter = userinfo.iterator();
			while(iter.hasNext()) {
				iter.remove();
				user_update.frame.dispose();
				login.frame.dispose();
				logo.show();
			}
		}else if(e.getSource().equals(user_update.btn[2])) { //홍
			logo.text.setText(null);
			logo.passtext.setText(null);
			user_update.frame.dispose();
		}
		/************************************************************************************************************/
		/** 상품등록 **/
		if(e.getSource().equals(pro_create.btn[0])) { //상품등록
			pro_create.show();
			pro_create.frame.dispose();
		}else if(e.getSource().equals(pro_create.btn[1])) { //재고확인
			pro_list.show();
			pro_create.frame.dispose();
		}else if(e.getSource().equals(pro_create.btn[2])) { //상품출금
			pro_delete.show();
			pro_create.frame.dispose();
		}else if(e.getSource().equals(pro_create.btn[3])) { //재고확인
			stock_list.show();
			pro_create.frame.dispose();
		}else if(e.getSource().equals(pro_create.btn[4])) { //홈
			login.show();
			pro_create.frame.dispose();
		}else if(e.getSource().equals(pro_create.btn[5])) { //임시저장
			Object [] rowData = {pro_create.text[0].getText(),pro_create.text[1].getText(),pro_create.text[2].getText()};
			for(int i=0; i<pro_create.text.length;i++) {
				pro_create.text[i].setText(null);
			}
			pro_create.defaultTableModel.addRow(rowData);
		}else if(e.getSource().equals(pro_create.btn[6])) { //초기화
			pro_create.defaultTableModel.setNumRows(0);
		}else if(e.getSource().equals(pro_create.btn[7])) { //등록
//			System.out.println(pro_create.table.getValueAt(0, 0)); //이름		첫번째
//			System.out.println(pro_create.table.getValueAt(0, 1)); //수량		첫번째
//			System.out.println(pro_create.table.getValueAt(0, 2)); //창고이름	첫번째
			String time_add = time.format(System.currentTimeMillis());
			for(int i=0; i<pro_create.table.getRowCount();i++) {
//				if(chk) {
					Object [] row = {
							pro_create.table.getValueAt(i, 0),	//이름
							pro_create.table.getValueAt(i, 1),	//수량
							time_add,							//날짜
							pro_create.table.getValueAt(i, 2)	//창고위치
					};
					pro_list.defaultTableModel.addRow(row);		//재고확인 테이블에 추가
					pro_delete.defaultTableModel[0].addRow(row); //상품출고 테이블에 추가
//				}//end chk = false
//				else {
//					int row = pro_list.table.getSelectedRow();
//					if(row == pro_list.table.getSelectedRow()) {
//						Object [] row2 = {
//								pro_create.table.getValueAt(i, 0),	//이름
//								pro_create.table.getValueAt(i, 1),	//수량
//								time_add,							//날짜
//								pro_create.table.getValueAt(i, 2)	//창고위치
//						};
//						pro_delete.defaultTableModel[0].addRow(row2); //상품출고 테이블에 수정
//						chk=true;
//					}//end if
//				}//end else
			}//end for
			
			//입력창 초기화
			for(int i=0; i<pro_create.text.length;i++) { pro_create.text[i].setText(null); }
			//테이블 초기화
			pro_create.defaultTableModel.setNumRows(0);
		}
		/************************************************************************************************************/
		/** 창고위치 **/
		if(e.getSource().equals(wrh_position.btn)) {
			JOptionPane.showMessageDialog(null, "아직 안했음");
		}
		/************************************************************************************************************/
		/** 재고확인 **/
		if(e.getSource().equals(pro_list.btn[0])) { //상품등록
			pro_create.show();
			pro_list.frame.dispose();
		}else if(e.getSource().equals(pro_list.btn[1])) { //재고확인
			pro_list.show();
			pro_list.frame.dispose();
		}else if(e.getSource().equals(pro_list.btn[2])) { //상품출금
			pro_delete.show();
			pro_list.frame.dispose();
		}else if(e.getSource().equals(pro_list.btn[3])) { //재고확인
			stock_list.show();
			pro_list.frame.dispose();
		}else if(e.getSource().equals(pro_list.btn[4])) { //홈
			login.show();
			pro_list.frame.dispose();
		}else if(e.getSource().equals(pro_list.btn[5])) { //조회
			JOptionPane.showMessageDialog(null, "아직 안했음");
		}else if(e.getSource().equals(pro_list.btn[6])) { //수정
			int row = pro_list.table.getSelectedRow();
			if(row == pro_list.table.getSelectedRow()) {
				pro_create.text[0].setText((String)pro_list.table.getValueAt(row, 0));	//이름
				pro_create.text[1].setText((String)pro_list.table.getValueAt(row, 1));	//수량
				pro_create.text[2].setText((String)pro_list.table.getValueAt(row, 3));	//창고위치
				pro_create.show();
				pro_list.frame.dispose();
				System.out.println(row);
			}//end if
		}else if(e.getSource().equals(pro_list.btn[7])) { //삭제
			int row = pro_list.table.getSelectedRow();
			if(row == pro_list.table.getSelectedRow()) {
				pro_list.defaultTableModel.removeRow(row);
				pro_delete.defaultTableModel[0].removeRow(row);
			}
			System.out.println(row);
		}
		/************************************************************************************************************/
		/** 상품출고 **/
		if(e.getSource().equals(pro_delete.btn[0])) { //상품등록
			pro_create.show();
			pro_delete.frame.dispose();
		}else if(e.getSource().equals(pro_delete.btn[1])) { //재고확인
			pro_list.show();
			pro_delete.frame.dispose();
		}else if(e.getSource().equals(pro_delete.btn[2])) { //상품출금
			pro_delete.show();
			pro_delete.frame.dispose();
		}else if(e.getSource().equals(pro_delete.btn[3])) { //재고확인
			stock_list.show();
			pro_delete.frame.dispose();
		}else if(e.getSource().equals(pro_delete.btn[4])) { //홈
			login.show();
			pro_delete.frame.dispose();
		}else if(e.getSource().equals(pro_delete.btn[5])) { //선택
			int row = pro_delete.table[0].getSelectedRow(); 
			String time_add = time.format(System.currentTimeMillis());
			System.out.println(row);
			if(row == pro_delete.table[0].getSelectedRow()) {
				pro_delete.text[0].setText((String)pro_delete.table[0].getValueAt(row, 0)); //상품명
				pro_delete.text[1].setText((String)pro_delete.table[0].getValueAt(row, 1)); //창고
				pro_delete.text[2].setText((String)pro_delete.table[0].getValueAt(row, 2));
				
				Object [] data = {
						pro_delete.table[0].getValueAt(row, 0),	//이름
						pro_delete.table[0].getValueAt(row, 1),	//수량
						time_add,								//날짜
						pro_delete.table[0].getValueAt(row, 3)	//창고위치
				};//end data
				pro_delete.defaultTableModel[1].addRow(data);
			}//end if
		}else if(e.getSource().equals(pro_delete.btn[6])) { //초기화
			pro_delete.defaultTableModel[1].setNumRows(0);
			for(int i=0; i<pro_delete.text.length;i++) {
				pro_delete.text[i].setText(null);
			}
		}else if(e.getSource().equals(pro_delete.btn[7])) { //출고 ####
			String time_add = time.format(System.currentTimeMillis());
			int row = pro_delete.table[1].getSelectedRow();
			if(row == pro_delete.table[1].getSelectedRow()) {
				System.out.println(row);
				pro_list.defaultTableModel.removeRow(row);
				pro_delete.defaultTableModel[0].removeRow(row);
			}//end if
			for(int i=0; i<pro_delete.table[1].getRowCount();i++) {
				Object [] data = {
						pro_delete.table[1].getValueAt(i, 0),	//이름
						pro_delete.table[1].getValueAt(i, 1),	//수량
						time_add,								//날짜
						pro_delete.table[1].getValueAt(i, 2)	//창고위치
				};//end data
				stock_list.defaultTableModel.addRow(data);
				pro_delete.defaultTableModel[1].removeRow(i);
			}//end for
		}
		/************************************************************************************************************/
		/** 출고확인 **/
		if(e.getSource().equals(stock_list.btn[0])) { //상품등록
			pro_create.show();
			stock_list.frame.dispose();
		}else if(e.getSource().equals(stock_list.btn[1])) { //재고확인
			pro_list.show();
			stock_list.frame.dispose();
		}else if(e.getSource().equals(stock_list.btn[2])) { //상품출금
			pro_delete.show();
			stock_list.frame.dispose();
		}else if(e.getSource().equals(stock_list.btn[3])) { //재고확인
			stock_list.show();
			stock_list.frame.dispose();
		}else if(e.getSource().equals(stock_list.btn[4])) { //홈
			login.show();
			stock_list.frame.dispose();
		}else if(e.getSource().equals(stock_list.btn[5])) { //조회
			JOptionPane.showMessageDialog(null, "아직 안했음");
		}else if(e.getSource().equals(stock_list.btn[6])) { //수정
			JOptionPane.showMessageDialog(null, "아직 안했음");
		}else if(e.getSource().equals(stock_list.btn[7])) { //삭제
			int row = stock_list.table.getSelectedRow();
			if(row == stock_list.table.getSelectedRow()) {
				stock_list.defaultTableModel.removeRow(row);
			}
		}
	}/**end actionPerformed (이벤트 끝남)**/
}//end class
