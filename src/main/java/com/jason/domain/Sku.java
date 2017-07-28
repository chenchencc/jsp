package com.jason.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by jasoncc on 26/07/17.
 */
public class Sku implements Serializable{

    private long id;
    private long liveId;
    private long skuid;
    private int isdelete;
    private Date createTime;
    private Date updateTime;
    private int sort;
    private byte top;
    private Date explainTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getLiveId() {
        return liveId;
    }

    public void setLiveId(long liveId) {
        this.liveId = liveId;
    }

    public long getSkuid() {
        return skuid;
    }

    public void setSkuid(long skuid) {
        this.skuid = skuid;
    }

    public int getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(int isdelete) {
        this.isdelete = isdelete;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public byte getTop() {
        return top;
    }

    public void setTop(byte top) {
        this.top = top;
    }

    public Date getExplainTime() {
        return explainTime;
    }

    public void setExplainTime(Date explainTime) {
        this.explainTime = explainTime;
    }
}
