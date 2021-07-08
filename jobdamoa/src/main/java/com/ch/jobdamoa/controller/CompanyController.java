package com.ch.jobdamoa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ch.jobdamoa.service.CompanyService;

@Controller
public class CompanyController {
	
	@Autowired
	private CompanyService cs;
	
	@RequestMapping("companyLoginForm")
	public String companyLoginForm() {
		return "company/companyLoginForm";
	}
}
