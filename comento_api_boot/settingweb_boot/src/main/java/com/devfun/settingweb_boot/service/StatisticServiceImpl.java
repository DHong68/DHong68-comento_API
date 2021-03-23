package com.devfun.settingweb_boot.service;

import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devfun.settingweb_boot.dao.StatisticMapper;

@Service
public class StatisticServiceImpl implements StatisticService {
   
   
   @Autowired
   private StatisticMapper uMapper;
   
   @Override
   public HashMap<String, Object> yearloginNum (String year) {
       // TODO Auto-generated method stub
       HashMap<String, Object> retVal = new HashMap<String,Object>();
       
       try {
           retVal = uMapper.selectYearLogin(year);
           retVal.put("year", year);
           retVal.put("is_success", true);
           
       }catch(Exception e) {
           retVal.put("totCnt", -999);
           retVal.put("year", year);
           retVal.put("is_success", false);
       }
       
       return retVal;
   }

   @Override
   public HashMap<String, Object> yearMonthloginNum(String yearMonth) {

	
       HashMap<String, Object> retVal = new HashMap<String,Object>();
    	
       try {
    	
    	   retVal = uMapper.selectMonthLogin(yearMonth);
    	   retVal.put("yearMonth", yearMonth);
    	   retVal.put("is_success", true);
    	
      }catch (Exception e) {
          retVal.put("totCnt", -999);
 	      retVal.put("yearMonth", yearMonth);
       	  retVal.put("is_success", false);
	  }
       
       return retVal;
    
   }
   
   @Override
   public HashMap<String, Object> dateloginNum(String date) {

       HashMap<String, Object> retVal = new HashMap<String,Object>();

   		try {
   			
   		   retVal = uMapper.selectDateLogin(date);
     	   retVal.put("date", date);
     	   retVal.put("is_success", true);
   			
   		}catch (Exception e) {
		 
   		 retVal.put("totCnt", -999);
   	     retVal.put("date", date);
   		 retVal.put("is_success", false);
		}
   	
   	return retVal;
   }
   
   
   

   @Override
   public HashMap<String, Object> DeptMonthloginNum(String yearMonth,String dept) {
	   
	   HashMap<String, Object> retVal = new HashMap<String,Object>();
	   
	   try {
		   
		   retVal = uMapper.selectDeptMonthLogin(yearMonth, dept);
		   retVal.put("yearMonth", yearMonth);
		   retVal.put("dept",dept);
		   retVal.put("is_success", true);
		   
	   }catch (Exception e) {
	       retVal.put("totCnt", -999);
		   retVal.put("yearMonth", yearMonth);
		   retVal.put("dept",dept);
		   retVal.put("is_success", false);
	}
	   
	return retVal;
}


    
}
   
   
   
   