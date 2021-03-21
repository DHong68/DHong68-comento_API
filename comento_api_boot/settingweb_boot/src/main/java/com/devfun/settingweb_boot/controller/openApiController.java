package com.devfun.settingweb_boot.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	
	@RequestMapping(value="/rest", method = {RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public Object getData( holidayDto request) throws IOException {
		String solYear= "2020";
        String solMonth = "09";
        restTemplateService.getholiday(solYear, solMonth);
				
		
		return restTemplateService.getholiday(solYear, solMonth);
	    }
	}
	

