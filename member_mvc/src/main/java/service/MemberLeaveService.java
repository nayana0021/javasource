package service;

import persistence.MemberDAO;

public class MemberLeaveService {
	public boolean leave(String userid, String passowrd) {
		return new MemberDAO().remove(userid, passowrd);
	}
}
