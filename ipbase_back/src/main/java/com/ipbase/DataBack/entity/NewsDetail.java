package com.ipbase.DataBack.entity;

import java.io.Serializable;

/**
 * 新闻详细信息表
 */
public class NewsDetail extends PageEntity implements Serializable {
    private Integer id;

    private Integer briefId;

    private String content;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBriefId() {
        return briefId;
    }

    public void setBriefId(Integer briefId) {
        this.briefId = briefId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}