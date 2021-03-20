package com.devfun.settingweb_boot.api;
import java.io.UnsupportedEncodingException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import org.springframework.web.client.RestTemplate;
import java.io.BufferedReader;
import java.io.IOException;

	@Service
	public class RestTemplateService {

		public Object getholiday(String solYear, String solMonth ) throws UnsupportedEncodingException {
		
		 RestTemplate restTemplate =new RestTemplate();
		 restTemplate.getRequestFactory();
		 String url = "http://apis.data.go.kr/B090041/openapi/service/SpcdeInfoService/getRestDeInfo";
	     String serviceKey = "iWB48Nxayf9lPew7m7gVYGnupTOUCduBkFNV9i3WfJHiytUm191V54nM9Ah5HH525HZJXMQVIhCxyFfl+t6liw==";
	     String decodeServiceKey = URLDecoder.decode(serviceKey, "UTF-8");
	     HttpHeaders headers = new HttpHeaders();
	     headers.setContentType(new MediaType("application","json",Charset.forName("UTF-8")));    
	     UriComponents builder = UriComponentsBuilder.fromHttpUrl(url)
	             .queryParam("ServiceKey", decodeServiceKey)
	    		 .queryParam("solYear", solYear)
	             .queryParam("solMonth", solMonth)
	             .queryParam("_type", "application/json")
	             .build(false);    
	     Object response = restTemplate.exchange(builder.toUriString(), HttpMethod.GET, new HttpEntity<String>(headers), String.class);
	     return response;
	 	}
		
	}  
	        
	        
	      

