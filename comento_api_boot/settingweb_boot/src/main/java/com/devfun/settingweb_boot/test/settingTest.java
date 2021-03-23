package com.devfun.settingweb_boot.test;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
 
import com.devfun.settingweb_boot.dao.StatisticMapper;
import com.devfun.settingweb_boot.service.StatisticService;
 
 
 
@RestController
public class settingTest {
    
 
    @Autowired
    private StatisticService service;
    
    @ResponseBody 
    @RequestMapping( {"/api/year/{year}"})
    public Map<String, Object> sqltest(@PathVariable String year) throws Exception{ 
        
        return service.yearloginNum(year);
    }
    
    
    @ResponseBody 
    @RequestMapping( {"/api/yearMonth/{yearMonth}"})
    public Map<String, Object> yearMonthloginCnt(@PathVariable String yearMonth) throws Exception{ 
        
        return service.yearMonthloginNum(yearMonth);
    }
    @ResponseBody 
    @RequestMapping( {"/api/date/{date}"})
    public Map<String, Object> dateloginCnt(@PathVariable String date) throws Exception{ 
       
        return service.dateloginNum(date);
    }
    
    
    
    
    @ResponseBody 
    @RequestMapping( {"/api/yearMonth/{yearMonth}/{dept}"})
    public Map<String, Object> DeptMonthloginCnt(@PathVariable String yearMonth,@PathVariable String dept) throws Exception{ 
       
        return service.DeptMonthloginNum(yearMonth, dept);
    }
    
    
    
    
    @RequestMapping("/test") 
    public ModelAndView test() throws Exception{ 
        ModelAndView mav = new ModelAndView("test"); 
        mav.addObject("name", "devfunpj"); 
        List<String> resultList = new ArrayList<String>(); 
        resultList.add("!!!HELLO WORLD!!!"); 
        resultList.add("설정 TEST!!!"); 
        resultList.add("설정 TEST!!!"); 
        resultList.add("설정 TEST!!!!!"); 
        resultList.add("설정 TEST!!!!!!"); 
        mav.addObject("list", resultList); 
        return mav; 
    }
 
}
