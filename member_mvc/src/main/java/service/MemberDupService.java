package service;

import persistence.MemberDAO;

public class MemberDupService {
	public boolean dupId(String userid) {
		return new MemberDAO().duplicateId(userid); // true 나  false가 넘어감
	}
}
