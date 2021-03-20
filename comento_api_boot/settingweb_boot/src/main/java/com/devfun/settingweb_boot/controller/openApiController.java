package com.devfun.settingweb_boot.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.devfun.settingweb_boot.api.RestTemplateService;
import com.devfun.settingweb_boot.dto.holidayDto;

@Controller
public class openApiController {
	
	@Autowired
	RestTemplateService restTemplateService;
	
	
	@RequestMapping(value="/holiday" , method = {RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public Object getData( holidayDto request) throws UnsupportedEncodingException {
		String solYear= request.getSolYear();
        String solMonth = request.getSolMonth();
        String ServiceKey=request.getServiceKey();
        Object response =  restTemplateService.getholiday(solYear, solMonth);
				
		
		return response;
	    }
	}
	

