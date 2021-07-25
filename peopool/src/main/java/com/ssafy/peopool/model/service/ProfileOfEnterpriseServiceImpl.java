package com.ssafy.peopool.model.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.peopool.dto.ProfileOfEnterprise;
import com.ssafy.peopool.model.repo.ProfileOfEnterpriseRepo;

@Service
public class ProfileOfEnterpriseServiceImpl implements ProfileOfEnterpriseService {

	@Autowired
	ProfileOfEnterpriseRepo profileOfEnterpriseRepo;
	
	
	@Override
	public void modifyProfileOfEnterprise(ProfileOfEnterprise profileOfEnterprise) throws SQLException {
		// TODO Auto-generated method stub
		profileOfEnterpriseRepo.modifyProfileOfEnterprise(profileOfEnterprise);
	}

	@Override
	public void deleteProfileOfEnterprise(int index) throws SQLException {
		// TODO Auto-generated method stub
		profileOfEnterpriseRepo.deleteProfileOfEnterprise(index);
	}

	@Override
	public ProfileOfEnterprise getProfileOfEnterprise(int index) throws SQLException {
		// TODO Auto-generated method stub
		return profileOfEnterpriseRepo.getProfileOfEnterprise(index);
	}

	@Override
	public ProfileOfEnterprise getNameOfEnterprise(String name) throws SQLException {
		// TODO Auto-generated method stub
		return profileOfEnterpriseRepo.getNameOfEnterprise(name);
	}
}