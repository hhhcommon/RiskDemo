package com.gxb.sdk.bean.complex;

import com.gxb.sdk.bean.complex.baseinfo.ComplexUserInfo;
import com.gxb.sdk.bean.complex.ecommerce.ComplexEcommerceInfo;
import com.gxb.sdk.bean.complex.riskanalysis.ComplexRiskAnalysis;
import com.gxb.sdk.bean.complex.zmscore.ComplexZmScoreInfo;
import lombok.Data;

/**
 * @author chenzhihui
 * @date 2019/5/21 22:21
 * 宝盒综合报告v2 对外根结构
 */
@Data
public class ComplexRpt {
    private String token;
    private String version;
    private ComplexUserInfo user_info;
    private ComplexRiskAnalysis risk_analysis;
    private ComplexZmScoreInfo zm_score_info;
    private ComplexEcommerceInfo ecommerce_info;
}
