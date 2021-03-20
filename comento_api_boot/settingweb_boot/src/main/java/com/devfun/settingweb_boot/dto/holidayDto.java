package com.devfun.settingweb_boot.dto;

import lombok.Data;

@Data
public class holidayDto {
   String serviceKey;
   String solYear;
   String solMonth;
   
public String getSolYear() {
	return solYear;
}
public String getSolMonth() {
	return solMonth;
}
public String getServiceKey() {
	return serviceKey;
}

   
  
}
