package com.gxb.sdk.bean.complex.ecommerce;

import lombok.Data;

/**
 * 电商子模型分
 * @author chenzhihui
 * @date 2019/6/13 17:27
 */
@Data
public class EcommerceChildScoreRpt {
    private Integer score_credit;  //电商信息核验可信分
    private Integer score_timeline;  //支付宝交易时效性风险分
    private Integer score_risk_xf;  //淘宝消费风险分
    private Integer score_risk_trade;  //支付宝交易风险分
    private Integer score_repay;  //支付宝借贷还款风险分
    private Integer score_stab_xf;  //淘宝消费稳定性风险分
    private Integer score_stab_trade;  //支付宝交易稳定性风险分
    private Integer score_xf_prefer;  //淘宝消费偏好分
    private Integer score_xf_level;  //淘宝消费等级分
    private Integer score_xf_ability;  //淘宝消费能力分
    private Integer score_xf_act;  //淘宝消费活跃分
    private Integer score_trade_shouzhi;  //支付宝收支行为风险分
}
