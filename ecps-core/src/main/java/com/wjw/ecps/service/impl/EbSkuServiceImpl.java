package com.wjw.ecps.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjw.ecps.dao.EbSkuMapper;
import com.wjw.ecps.model.EbItem;
import com.wjw.ecps.model.EbSku;
import com.wjw.ecps.model.EbSkuExample;
import com.wjw.ecps.model.EbSpecValue;
import com.wjw.ecps.service.EbSkuService;
import com.wjw.ecps.util.ECPSUtils;

import redis.clients.jedis.Jedis;

@Service
public class EbSkuServiceImpl implements EbSkuService {
	@Autowired
	private EbSkuMapper ebSkuMapper;

	@Override
	public int insert(EbSku record) {
		return ebSkuMapper.insert(record);
	}

	@Override
	public int insertSelective(EbSku record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<EbSku> selectByExample(EbSkuExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EbSku selectByPrimaryKey(Long skuId) {
		// TODO Auto-generated method stub
		return ebSkuMapper.selectByPrimaryKey(skuId);
	}

	@Override
	public int updateByExampleSelective(EbSku record, EbSkuExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(EbSku record, EbSkuExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(EbSku record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(EbSku record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countByExample(EbSkuExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(EbSkuExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Long skuId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public EbSku getSkuDetailByIdWithRedis(Long skuId) {
		Jedis jedis = new Jedis(ECPSUtils.readProp("redis_ip"), new Integer(ECPSUtils.readProp("redis_port")));
		// 从redis中去sku数据
		String skuPrice = jedis.hget("sku:" + skuId, "skuPrice");
		String stockInventory = jedis.hget("sku:" + skuId, "stockInventory");
		String marketPrice = jedis.hget("sku:" + skuId, "marketPrice");
		String itemId = jedis.hget("sku:" + skuId, "itemId");

		EbSku sku = new EbSku();
		sku.setSkuId(skuId);
		sku.setSkuPrice(new BigDecimal(skuPrice));
		sku.setMarketPrice(new BigDecimal(marketPrice));
		sku.setStockInventory(new Integer(stockInventory));
		sku.setItemId(new Long(itemId));
		// 从redis中取sku所属的item的数据
		String itemName = jedis.hget("sku:" + sku.getSkuId() + ":item:" + itemId, "itemName");
		String itemNo = jedis.hget("sku:" + sku.getSkuId() + ":item:" + itemId, "itemNo");
		String imgs = jedis.hget("sku:" + sku.getSkuId() + ":item:" + itemId, "imgs");
		EbItem item = new EbItem();
		item.setItemId(new Long(itemId));
		item.setItemName(itemName);
		item.setItemNo(itemNo);
		item.setImgs(imgs);
		sku.setItem(item);
		// 获得去规格集合的过程
		List<EbSpecValue> specList = new ArrayList<EbSpecValue>();
		List<String> specIds = jedis.lrange("sku:" + skuId + ":specList", 0, -1);
		for (String specId : specIds) {
			EbSpecValue sv = new EbSpecValue();
			String specValue = jedis.hget("sku:" + skuId + ":spec:" + specId, "specValue");
			sv.setSkuId(skuId);
			sv.setSpecId(new Long(specId));
			sv.setSpecValue(specValue);
			specList.add(sv);
		}
		sku.setEbSpecValues(specList);
		return sku;
	}

}
