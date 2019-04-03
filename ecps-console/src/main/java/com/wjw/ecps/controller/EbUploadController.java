package com.wjw.ecps.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.wjw.ecps.util.ECPSUtils;
import com.wjw.ecps.util.UploadResponse; 

import org.apache.commons.lang.StringUtils;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/upload")
public class EbUploadController {
	@RequestMapping("uploadPic")
	public void uploadPic(@RequestParam MultipartFile imgsFile,HttpServletResponse response,String lastPath) throws Exception {
		//定义上传后的名字
		String fileName=new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
		//获取随机数
		Random random=new Random();
		for (int i = 0; i < 3; i++) {
			//获取十以内的随机数
			fileName+=random.nextInt(10);
		}
		
		//获取文件真实名ujh
		String originalFilename = imgsFile.getOriginalFilename();
		//获取后缀名
		String last = originalFilename.substring(originalFilename.lastIndexOf("."));
		//获取上传路径 
		String realPath=	ECPSUtils.readProp("upload_file_path")+"upload/"+fileName+last;
		String relativePath="upload/"+fileName+last;
		//基于webservice上传
		Client client=Client.create();
		//请求路径
		WebResource wr = client.resource(realPath);
		//放弃输入流
		wr.put(imgsFile.getBytes());
		//判断是不是第一次上传
		try {
			if(StringUtils.isNotBlank(lastPath)){
				wr = client.resource(lastPath);
				wr.delete();
			}
		} catch (Exception e) {
			System.out.println("没图片");
		}
		
		JSONObject jsonObject=new JSONObject();
		//放置原属
		jsonObject.accumulate("realPath", realPath);
		jsonObject.accumulate("relativePath", relativePath);
		//回写
		response.getWriter().write(jsonObject.toString());
	}
	/*
	 * 这种不需要name也可以接收
	 */
	@RequestMapping("uploadForFck")
	public void uploadForFck(HttpServletRequest request,HttpServletResponse response) throws Exception {
		//定义上传后的名字
		String fileName=new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
		//获取随机数
		Random random=new Random();
		for (int i = 0; i < 3; i++) {
			//获取十以内的随机数
			fileName+=random.nextInt(10);
		}
		//强制转换
		MultipartHttpServletRequest mr=(MultipartHttpServletRequest) request;
		//获取表单名字
		Iterator<String> fileNames = mr.getFileNames();
		String inputName=fileNames.next();
		//获得文件
		MultipartFile imgsFile = mr.getFile(inputName);
		
		//获取文件
		//获取文件真实名ujh
		String originalFilename = imgsFile.getOriginalFilename();
		//获取后缀名
		String last = originalFilename.substring(originalFilename.lastIndexOf("."));
		//获取上传路径 
		String realPath=	ECPSUtils.readProp("upload_file_path")+"upload/"+fileName+last;
		String relativePath="upload/"+fileName+last;
		//基于webservice上传
		Client client=Client.create();
		//请求路径
		WebResource wr = client.resource(realPath);
		//放弃输入流
		wr.put(imgsFile.getBytes());
		//回写 放置成功标识 和路径 以便前台回写
		UploadResponse ur=new UploadResponse(UploadResponse.EN_OK,realPath);
		response.getWriter().print(ur);
	}
}
