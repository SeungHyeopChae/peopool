package com.ssafy.peopool.model.service;

import java.sql.SQLException;
import java.util.List;

import com.ssafy.peopool.model.EntCard;
import com.ssafy.peopool.model.ProfileOfEnterprise;

public interface ProfileOfEnterpriseService {
	
	// 전체 프로필 조회
	List<EntCard> getAllProfile() throws SQLException;

	// 프로필 수정
	boolean modifyProfileOfEnterprise(ProfileOfEnterprise profileOfEnterprise) throws SQLException;

	// 프로필 삭제
	boolean deleteProfileOfEnterprise(int index) throws SQLException;

	// 프로필 조회
	EntCard getProfileOfEnterprise(int index) throws SQLException;

	// 이름으로 회사 검색
	EntCard getNameOfEnterprise(String name) throws SQLException;

}