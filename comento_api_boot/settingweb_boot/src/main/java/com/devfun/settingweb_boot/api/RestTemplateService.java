package com.devfun.settingweb_boot.api;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;


	@Service
	public class RestTemplateService {

		public String getholiday(String solYear, String solMonth ) throws IOException {
			/*
			 * RestTemplate restTemplate =new RestTemplate();
			 * restTemplate.getRequestFactory(); String url =
			 * "http://apis.data.go.kr/B090041/openapi/service/SpcdeInfoService/getRestDeInfo";
			 * String serviceKey =
			 * "iWB48Nxayf9lPew7m7gVYGnupTOUCduBkFNV9i3WfJHiytUm191V54nM9Ah5HH525HZJXMQVIhCxyFfl%2Bt6liw%3D%3D";
			 * String decodeServiceKey = URLDecoder.decode(serviceKey, "UTF-8"); HttpHeaders
			 * headers = new HttpHeaders(); headers.setContentType(new
			 * MediaType("application","json",Charset.forName("UTF-8"))); UriComponents
			 * builder = UriComponentsBuilder.fromHttpUrl(url) .queryParam("ServiceKey",
			 * URLEncoder.encode(decodeServiceKey, "UTF-8")) .queryParam("solYear", solYear)
			 * .queryParam("solMonth", solMonth) .queryParam("_type", "application/json")
			 * .build(false);
			 * 
			 * Object response = restTemplate.exchange(builder.toUriString(),
			 * HttpMethod.GET, new HttpEntity<String>(headers), String.class);
			 * 
			 * System.out.println(response); return response;
			 */
			StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B090041/openapi/service/SpcdeInfoService/getRestDeInfo"); /*URL*/
	        urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "=iWB48Nxayf9lPew7m7gVYGnupTOUCduBkFNV9i3WfJHiytUm191V54nM9Ah5HH525HZJXMQVIhCxyFfl%2Bt6liw%3D%3D"); /*Service Key*/
	        urlBuilder.append("&" + URLEncoder.encode("solYear","UTF-8") + "=" + URLEncoder.encode(solYear, "UTF-8")); /*연*/
	        urlBuilder.append("&" + URLEncoder.encode("solMonth","UTF-8") + "=" + URLEncoder.encode(solMonth, "UTF-8")); /*월*/
	        urlBuilder.append("&" + URLEncoder.encode("_type","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8"));  
	        URL url = new URL(urlBuilder.toString());
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	       // conn.setRequestMethod("GET");
	        //conn.setRequestProperty("Content-type", "application/json");
	        System.out.println("Response code: " + conn.getResponseCode());
	        BufferedReader rd;
	        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
	            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	        } else {
	            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
	        }
	        StringBuilder sb = new StringBuilder();
	       
	      
	        
	        String line;
	        while ((line = rd.readLine()) != null) {
	            sb.append(line);
	        }
	        rd.close();
	        conn.disconnect();
	      
	        System.out.println(sb.toString());	
			return sb.toString();
		 
	    }
		

	}  

