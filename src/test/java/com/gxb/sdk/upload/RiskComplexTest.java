package com.gxb.sdk.upload;

import com.google.gson.Gson;
import com.gxb.sdk.api.RiskComplexApi;
import com.gxb.sdk.client.GxbApiFactory;
import com.gxb.sdk.param.*;
import com.gxb.sdk.util.SignUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Response;

import java.io.File;
import java.net.URLEncoder;

/**
 * Created by yaojun on 2019/7/4.
 */
public class RiskComplexTest {
    private static final Logger logger = LoggerFactory.getLogger(UploadTaskTest.class);

    {
        try {
            System.setProperty("javax.net.ssl.trustStore", new File("cacerts/cacerts").getAbsolutePath());
        } catch (Exception e) {
            logger.warn("init cacerts...");
        }
    }

    protected GxbApiFactory gxbApiFactory = GxbApiFactory.builder().baseUrl("https://prod.gxb.io/datamatrix/").build();;
    /**
     * 此处请使用开户时创建的appid和appSercet，不然调用成功
     */
    protected String appId = "gxba57f2131232132fe2dfa";
    protected String appSercet = "2d1844d9d213123231235c4f8de";
    protected String authItem = "risk_complex";
    /**
     * 此处请使用需要查询用户信息
     */
    protected String name = "zhangsan";
    protected String idcard = "330682191221221410";
    protected String mobile = "18212321452";

    @Test
    public void doRiskComplexTask() throws Exception {
        String bizContent = URLEncoder.encode(new Gson().toJson(new ThreeElement(name, idcard, mobile)), "utf-8");
        /**
         * sequenceNo需要用户自定义小于32位
         */
        String sequenceNo = "abc";
        long timestamp = System.currentTimeMillis();
        String sign = SignUtils.getSign(appId, appSercet, authItem, timestamp, sequenceNo);
        RiskComplexApi riskComplexApi = gxbApiFactory.newApi(RiskComplexApi.class);
        Response<GxbResponse<String>> response =
                riskComplexApi.queryComplexData(appId, authItem, sequenceNo, timestamp+"", sign, bizContent).execute();
        logger.info("调用结果: " + response);
    }

    @Test
    public void createRiskComplexTaskUrl() throws Exception {
        String bizContent = new Gson().toJson(new ThreeElement(name, idcard, mobile));
        /**
         * sequenceNo需要用户自定义小于32位
         */
        String sequenceNo = "abc";
        long timestamp = System.currentTimeMillis();
        String sign = SignUtils.getSign(appId, appSercet, authItem, timestamp, sequenceNo);
        StringBuilder sb = new StringBuilder("https://prod.gxb.io/datamatrix/risk/v3/risk_complex?");
        sb.append("bizContent=").append(URLEncoder.encode(bizContent, "utf-8")).append("&");
        sb.append("sign=").append(sign).append("&");
        sb.append("appId=").append(appId).append("&");
        sb.append("sequenceNo=").append(sequenceNo).append("&");
        sb.append("timestamp=").append(timestamp);
        System.out.println(sb.toString());
    }
}
