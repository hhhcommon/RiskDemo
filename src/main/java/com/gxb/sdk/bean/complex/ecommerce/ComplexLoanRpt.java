package com.gxb.sdk.bean.complex.ecommerce;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author chenzhihui
 * @date 2019/4/26 13:44
 */
@Data
public class ComplexLoanRpt {

    /**
     * 借贷还款
     */
    private Integer trade_loan_repay_cnt_6m;
    private BigDecimal trade_loan_repay_amt_6m;
    private Integer trade_loan_repay_cnt_3m;
    private BigDecimal trade_loan_repay_amt_3m;
    private Integer trade_loan_repay_cnt_1m;
    private BigDecimal trade_loan_repay_amt_1m;
    private BigDecimal trade_loan_repay_amt_prop_6m;
    private BigDecimal trade_loan_repay_amt_prop_3m;
    private BigDecimal trade_loan_repay_amt_prop_1m;
    private Integer trade_loan_repay_scene_num_6m;
    private Integer trade_loan_repay_scene_num_3m;
    private Integer trade_loan_repay_scene_num_1m;

    private Integer trade_loan_repay_months_6m;
    private Integer trade_loan_repay_months_3m;

    /**
     * 细分借贷场景
     */
    private BigDecimal trade_credit_repay_amt_6m;
    private BigDecimal trade_credit_repay_amt_prop_6m;
    private BigDecimal trade_credit_repay_amt_3m;
    private BigDecimal trade_credit_repay_amt_prop_3m;
    private BigDecimal trade_credit_repay_amt_1m;
    private BigDecimal trade_credit_repay_amt_prop_1m;
    private BigDecimal trade_receip_repay_amt_6m;
    private BigDecimal trade_receip_repay_amt_prop_6m;
    private BigDecimal trade_receip_repay_amt_3m;
    private BigDecimal trade_receip_repay_amt_prop_3m;
    private BigDecimal trade_receip_repay_amt_1m;
    private BigDecimal trade_receip_repay_amt_prop_1m;
    private BigDecimal trade_non_receip_repay_amt_6m;
    private BigDecimal trade_non_receip_repay_amt_prop_6m;
    private BigDecimal trade_non_receip_repay_amt_3m;
    private BigDecimal trade_non_receip_repay_amt_prop_3m;
    private BigDecimal trade_non_receip_repay_amt_1m;
    private BigDecimal trade_non_receip_repay_amt_prop_1m;

    private Integer trade_credit_repay_cnt_6m;
    private Integer trade_credit_repay_cnt_3m;
    private Integer trade_credit_repay_cnt_1m;
    private Integer trade_receip_repay_cnt_6m;
    private Integer trade_receip_repay_cnt_3m;
    private Integer trade_receip_repay_cnt_1m;
    private Integer trade_non_receip_repay_cnt_6m;
    private Integer trade_non_receip_repay_cnt_3m;
    private Integer trade_non_receip_repay_cnt_1m;
}
