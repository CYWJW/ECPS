package com.wjw.ecps.service;

import java.util.List;

import com.wjw.ecps.model.EbItem;
import com.wjw.ecps.model.EbItemClob;
import com.wjw.ecps.model.EbParaValue;
import com.wjw.ecps.model.EbSku;
import com.wjw.ecps.model.Page;
import com.wjw.ecps.model.query.EbItemQuery;

public interface EbItemService {
	int selectCountByQuery(EbItemQuery eq);

	Page getPageByQurey(EbItemQuery eq);

	void saveItem(EbItem ebItem, EbItemClob ebItemClob, List<EbSku> ebSkus, List<EbParaValue> paraList);

	void auditItem(Long itemId, Short auditStatus, String itemNote);

	void showItem(Long itemId, Short showStatus, String notes);

	List<EbItem> selectByQurey(String price, String brandName, String featValues, String keyWords) throws Exception;

	EbItem selectByPrimaryKey(Long itemId);

	EbItem selectItemDetailById(Long itemId);
	
	public String publsihItem(Long itemId, String password);
}
