package controller;

import java.util.ArrayList;

import gui.User_Create;

public class UserInfo_Create implements UserInfo_In{

	@Override
	public void exec(ArrayList<UserInfo> users) {
		users.add(new UserInfo());
	}
}
