package com.wjw.ecps.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjw.ecps.dao.EbItemMapper;
import com.wjw.ecps.model.EbItem;
import com.wjw.ecps.service.EbWSItemService;
import com.wjw.ecps.util.ECPSUtils;
import com.wjw.ecps.util.FMutil;
@Service
public class EbWSItemServiceImpl implements EbWSItemService {

	@Autowired
	private EbItemMapper ebItemMapper;
	
	public String publishItem(Long itemId, String password) throws Exception {
		String result = "success";
		if(StringUtils.equals(password, ECPSUtils.readProp("ws_pass")) ){
			EbItem item = ebItemMapper.selectItemDetailById(itemId);
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("item", item);
			map.put("path", ECPSUtils.readProp("portal_path"));
			map.put("request_file_path", ECPSUtils.readProp("request_file_path"));
			FMutil.ouputFile("productDetail.ftl", item.getItemId()+".html", map);
		}else{
			result = "fail";
		}
		return result;
	}

}
