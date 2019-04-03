package com.wjw.ecps.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wjw.ecps.model.EbOrder;
import com.wjw.ecps.model.EbOrderDetail;


public interface EbOrderService {
	
	
	public void saveOrder(EbOrder order, List<EbOrderDetail> detailList,HttpServletRequest request, HttpServletResponse response);
}
