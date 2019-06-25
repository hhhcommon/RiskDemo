package com.gxb.sdk.param;

import java.io.Serializable;

/**
 * Created by yaojun on 2019/6/25.
 */
public class UploadParam implements Serializable {
    private String sequenceNo;
    private String authItem;
    private long timestamp;
    private String name;
    private String mobile;
    private String idcard;
    private String data;
    // 以下为可选参数
    private String source;

    public UploadParam(String sequenceNo, String authItem, long timestamp, String name, String mobile, String idcard, String data, String source) {
        this.sequenceNo = sequenceNo;
        this.authItem = authItem;
        this.timestamp = timestamp;
        this.name = name;
        this.mobile = mobile;
        this.idcard = idcard;
        this.data = data;
        this.source = source;
    }

    public String getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(String sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public String getAuthItem() {
        return authItem;
    }

    public void setAuthItem(String authItem) {
        this.authItem = authItem;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
