package com.wjw.ecps.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.http.HttpServletResponse;

import org.apache.solr.client.solrj.impl.HttpSolrClient;

public class ECPSUtils {
	
	private static HttpSolrClient solrClient;
	public static String readProp(String name) {
		Properties properties=new Properties();
		InputStream inStream = ECPSUtils.class.getClassLoader().getResourceAsStream("scorepath.properties");
		try {
			properties.load(inStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties.getProperty(name);
	}
	
	public static HttpSolrClient getSolrClient() {
		
		if(solrClient != null){
			return solrClient;
		}else{
			String solrPath = ECPSUtils.readProp("solr_path");
			//建立连接 到core
			solrClient=new HttpSolrClient(solrPath);
			return solrClient;
		}	
	}
	public static void printAjax(HttpServletResponse response, String result){
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		try {
			response.getWriter().write(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
