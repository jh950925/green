package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

import controller.UserInfo;

public class MVC_Using {
	// model
	ArrayList<UserInfo> userinfo = new ArrayList<>();
	// view
	Logo logo; // 로고화면
	Login login; // 로그인 후 메인화면
	User_Create user_create; // 회원가입
	User_Find user_find; // 계정찾기
	User_Update user_update; // 계정정보 수정
	Pro_Create pro_create; // 상품등록
	// controller
//	UserInfo_In controller;
//	UserInfo_In[] crud;

	//////////////////////////////////////////////////////////////////////////////////////////////////////
	public MVC_Using() {
		// user정보
		userinfo = new ArrayList<UserInfo>();

		// view
		logo = new Logo();
		logo.show();
		login = new Login();
		user_create = new User_Create();
		user_find = new User_Find();
		user_update = new User_Update();
		pro_create = new Pro_Create();

		// controller
//		controller = null;
//		crud = new UserInfo_In[] { new UserInfo_Create() };
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////
	/** logo_mvc **/
	public void logo_mvc() {
		// 회원가입
		logo.btn[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				user_create.show();
				User_Create_MVC();
			}
		});
		// 계정찾기
		logo.btn[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				user_find.show();
				User_Find_MVC();
			}
		});
		// 로그인
		logo.btn[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Iterator<UserInfo> iter = userinfo.iterator();
				while(iter.hasNext()) {
					UserInfo temp = (UserInfo) iter.next();
					if(temp.getId().equals(logo.text.getText())) {
						if(temp.getPass().equals(logo.passtext.getText())) {
							login.show();
							Login_MVC();
							logo.frame.dispose();
							break;
						}else { JOptionPane.showMessageDialog(null, "비밀번호를 확인해 주세요"); break; }
					}//end if
				}//end while
			}//end actionPerformed
		});//end btn[2]
		// 종료
		logo.btn[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
	}// end [logo_mvc]

	/** User_Create_MVC **/
	public void User_Create_MVC() {
		user_create.btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				userinfo.add(new UserInfo(
						user_create.text[0].getText(), user_create.text[1].getText(), 
						user_create.text[2].getText(), user_create.text[3].getText(),
						user_create.text[4].getText(), user_create.text[5].getText(), 
						user_create.text[6].getText(), user_create.text[7].getText()));
				System.out.println(userinfo);
//				controller = crud[0];
//				controller.exec(userinfo, user_create);
				user_create.frame.dispose();
			}
		});
	}// end [User_Create_MVC]

	/** User_Find_MVC **/
	public void User_Find_MVC() {
		user_find.btn[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				user_find.frame.dispose();
			}
		});
	}// end [User_Find_MVC]

	/** Login_MVC **/
	public void Login_MVC() {
		// 계정 정보 수정
		login.btn[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				user_update.show();
				User_Update_MVC();
			}
		});
		// 상품등록
		login.btn[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pro_create.show();
				Pro_Create_MVC();
				login.frame.dispose();
			}
		});
		// 로그아웃
		login.btn[5].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				logo.show();
				login.frame.dispose();
			}
		});
	}// end [User_Login_MVC]

	/** User_Update_MVC **/
	public void User_Update_MVC() {
		user_update.btn[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				user_update.frame.dispose();
			}
		});
	}// end [User_Update_MVC]

	/** Pro_Create_MVC **/
	public void Pro_Create_MVC() {
		pro_create.btn[4].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				login.show();
				pro_create.frame.dispose();
			}
		});
	}// end [Pro_Create_MVC]
}
