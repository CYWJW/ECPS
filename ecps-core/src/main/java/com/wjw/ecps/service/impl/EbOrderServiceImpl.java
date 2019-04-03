package com.wjw.ecps.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjw.ecps.dao.EbOrderDetailMapper;
import com.wjw.ecps.dao.EbOrderMapper;
import com.wjw.ecps.dao.EbSkuMapper;
import com.wjw.ecps.exception.EbStockException;
import com.wjw.ecps.model.EbOrder;
import com.wjw.ecps.model.EbOrderDetail;
import com.wjw.ecps.service.EbCartService;
import com.wjw.ecps.service.EbOrderService;
import com.wjw.ecps.util.ECPSUtils;

import redis.clients.jedis.Jedis;

@Service
public class EbOrderServiceImpl implements EbOrderService {

	
	@Autowired
	private EbSkuMapper skuMapper;
	
	@Autowired
	private EbOrderMapper orderMapper;
	
	@Autowired
	private EbOrderDetailMapper orderDetailMapper;
	
	@Autowired
	private EbCartService cartService;

	public void saveOrder(EbOrder order, List<EbOrderDetail> detailList,HttpServletRequest request, HttpServletResponse response) {
		orderMapper.insert(order);
		Map<String,Object> map = new HashMap<String,Object>();
		for(EbOrderDetail detail: detailList){
			detail.setOrderId(order.getOrderId());
			orderDetailMapper.insert(detail);
			map.put("skuId", detail.getSkuId());
			map.put("quantity", detail.getQuantity());
			//返回跟新的数量
			int flag = skuMapper.updateStock(map);
			if(flag == 0){
				throw new EbStockException();
			}
			//扣减redis库存
			Jedis jedis = new Jedis(ECPSUtils.readProp("redis_ip"), new Integer(ECPSUtils.readProp("redis_port")));
			Long skuId = (Long) map.get("skuId");
			Integer quantity = (Integer) map.get("quantity");
			jedis.hset("sku:"+skuId, "stockInventory", (new Integer(jedis.hget("sku:"+skuId, "stockInventory")) - quantity)+"");
			
			/**
			EbSku sku = skuDao.getSkuById(detail.getSkuId());
			sku.setStockInventory(sku.getStockInventory() - detail.getQuantity());
			int flag = skuDao.update(sku);
			if(flag == 0){
				EbSku sku = skuDao.getSkuById(detail.getSkuId());
				if(sku.getStock() < detail.getQuantity()){
					throw EbStockException();
				}else{
					throw EbCurrException();
				}
		
			}
			**/
		}
		
		cartService.clearCart(request, response);
		
		
	}
	
	
	
	
	
}
