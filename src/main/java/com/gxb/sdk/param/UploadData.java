package com.gxb.sdk.param;

import org.apache.commons.codec.digest.DigestUtils;

import java.io.Serializable;

/**
 * Created by yaojun on 2019/6/25.
 */
public class UploadData implements Serializable {
    //必要参数
    private String data;
    private String sequenceNo;
    private String timestamp;
    private ThreeElement bizContent;
    private String sign;
    private String authItem;
    private String appId;
    //可选参数
    private String source;

    public UploadData(UploadDataBuilder builder) {
        this.appId = builder.appId;
        this.sign = builder.sign;
        this.sequenceNo = builder.sequenceNo;
        this.authItem = builder.authItem;
        this.timestamp = String.valueOf(builder.timestamp);
        this.bizContent = new ThreeElement(builder.name, builder.idcard, builder.mobile);
        this.source = builder.source;
        this.data = builder.data;
    }

    public static UploadDataBuilder builder(String appId, String appSercet, String sequenceNo, long timestamp, String authItem) {
        return new UploadDataBuilder(appId, appSercet, sequenceNo, timestamp, authItem);
    }

    public static class UploadDataBuilder {
        private final String appId;
        private final String appSecert;
        private final String sequenceNo;
        private final String authItem;
        private final long timestamp;
        private String sign;
        private String name;
        private String mobile;
        private String idcard;
        private String data;
        // 以下为可选参数
        private String source;

        public UploadDataBuilder(String appId, String appSecert, String sequenceNo, long timestamp, String authItem) {
            this.appId = appId;
            this.appSecert = appSecert;
            this.sequenceNo = sequenceNo;
            this.authItem = authItem;
            this.timestamp = timestamp;
        }

        public UploadDataBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UploadDataBuilder mobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        public UploadDataBuilder idcard(String idcard) {
            this.idcard = idcard;
            return this;
        }

        public UploadDataBuilder data(String data) {
            this.data = data;
            return this;
        }

        public UploadDataBuilder source(String source) {
            this.source = source;
            return this;
        }

        public UploadData build() {
            // sign = md5(appId+appSecret+authItem+timestamp+sequenceNo); 顺序不能调换
            this.sign = DigestUtils.md5Hex(String.format("%s%s%s%s%s", appId, appSecert, authItem, timestamp, sequenceNo));
            return new UploadData(this);
        }
    }
}