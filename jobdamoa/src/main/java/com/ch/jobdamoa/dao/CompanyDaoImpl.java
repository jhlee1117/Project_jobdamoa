package com.ch.jobdamoa.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ch.jobdamoa.model.Company;

@Repository
public class CompanyDaoImpl implements CompanyDao {
	
	@Autowired
	private SqlSessionTemplate sst;

	@Override
	public Company selectCom_nm(int com_num) {
		return sst.selectOne("companyns.selectCom_nm", com_num);
	}

	@Override
	public Company selectCom(int com_num) {
		return sst.selectOne("companyns.selectCom", com_num);
	}

	@Override
	public Company selectLogin(String com_id) {
		return sst.selectOne("companyns.selectLogin", com_id);
	}

	@Override
	public Company findComId(String com_email) {
		return sst.selectOne("companyns.findComId", com_email);
	}

	@Override
	public int newComPw(Company com) {
		return sst.update("companyns.newComPw", com);
	}
}
