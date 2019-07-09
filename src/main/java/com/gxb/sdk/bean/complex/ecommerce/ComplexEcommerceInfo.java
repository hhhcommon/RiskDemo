package com.gxb.sdk.bean.complex.ecommerce;

import lombok.Data;

import java.util.Date;

/**
 * @author chenzhihui
 * @date 2019/5/21 23:03
 */
@Data
public class ComplexEcommerceInfo {
    private Boolean is_cover;
    private Date ecommerce_update_time;
    private ComplexEcommerceBaseInfo ecommerce_base_info;
    private ComplexConsumeRpt ecommerce_consume_rpt;
    private ComplexTradeRpt ecommerce_trade_rpt;
    private ComplexLoanRpt ecommerce_loan_rpt;
    private ComplexRiskRpt ecommerce_risk_rpt;
    private EcommerceChildScoreRpt ecommerce_child_score_rpt;
}
