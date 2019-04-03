package com.wjw.ecps.model;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.List;

public class Page {
	/*
	 * 开始行数
	 */
	private int startNo = 0;
	/*
	 * 结束行数
	 */
	private int endNo = 0;
	/*
	 * 页数
	 */
	private int pageNo;
	/*
	 * 总条数
	 */
	private int count;
	/*
	 * 每页记录数
	 */
	private int pageSize = 5;

	private int pageCount;

	public int getPageCount() {
		 pageCount=count/pageSize;
		 if(pageCount==0||count%pageSize!=0)
		 {
			 pageCount++;
		 }
		 return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	private List<?> list;

	public int getStartNo() {
		startNo=(pageNo-1)*pageSize;
		return startNo;
	}

	public void setStartNo(int startNo) {
		this.startNo = startNo;
	}

	public int getEndNo() {
		endNo=pageNo*pageSize+1;
		return endNo;
	}

	public void setEndNo(int endNo) {
		this.endNo = endNo;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List<?> getList() {
		return list;
	}

	public void setList(List<?> list) {
		this.list = list;
	}

}
