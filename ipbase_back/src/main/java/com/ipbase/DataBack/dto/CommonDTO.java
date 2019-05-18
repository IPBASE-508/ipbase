package com.ipbase.DataBack.dto;


/**
 * 通用返回模板
 * @author tianyi
 * @date 2018-04-29 01:52
 */
public class CommonDTO<T> {

    /** 错误码. */
    private Integer resultCode;

    /** 提示信息. */
    private String resultMsg;

    /* 内容主体 */
    private T data;

    private Integer allDataNum;

	public Integer getResultCode() {
		return resultCode;
	}

	public void setResultCode(Integer resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMsg() {
		return resultMsg;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Integer getAllDataNum() {
		return allDataNum;
	}

	public void setAllDataNum(Integer allDataNum) {
		this.allDataNum = allDataNum;
	}
}
