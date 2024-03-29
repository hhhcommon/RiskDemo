package com.gxb.sdk.api;

import com.gxb.sdk.bean.complex.ComplexRpt;
import com.gxb.sdk.bean.complex.ecommerce.ComplexRiskRpt;
import com.gxb.sdk.param.GxbResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by yaojun on 2019/7/4.
 */
public interface RiskComplexApi {
    @GET("risk/v3/risk_complex")
    Call<GxbResponse<ComplexRpt>> queryComplexData(@Query("appId") String appId, @Query("authItem") String authItem,
                                                   @Query("sequenceNo") String sequenceNo, @Query("timestamp") String timestamp,
                                                   @Query("sign") String sign, @Query(value ="bizContent",encoded = true) String bizContent);
}