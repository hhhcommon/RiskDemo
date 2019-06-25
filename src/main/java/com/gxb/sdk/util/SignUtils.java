package com.gxb.sdk.util;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * Created by yaojun on 2019/6/25.
 */
public class SignUtils {

    public static String getSign(String appId, String appSercet, String authItem, long timestamp, String sequenceNo){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(appId);
        stringBuilder.append(appSercet);
        stringBuilder.append(authItem);
        stringBuilder.append(timestamp);
        stringBuilder.append(sequenceNo);
        return DigestUtils.md5Hex(stringBuilder.toString());
    }

}