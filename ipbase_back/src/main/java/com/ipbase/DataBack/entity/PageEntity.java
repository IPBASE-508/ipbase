package com.ipbase.DataBack.entity;

import java.io.Serializable;

/**
 * @author tianyi
 * @date 2019-01-15 22:13
 */
public class PageEntity implements Serializable {

    private int[] ids;

    /**
     * 固定设置为：每页20行
     */
    private int rows = 20;

    // 若 page = 0，则获取所有记录
    private int page = 0;

    private int pageStart;
    
    private String message;

	public int[] getIds() {
		return ids;
	}

	public void setIds(int[] ids) {
		this.ids = ids;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPageStart() {
		return pageStart;
	}

	public void setPageStart(int pageStart) {
		this.pageStart = pageStart;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
    
    
}
