package com.gxb.sdk.bean.complex.ecommerce;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author chenzhihui
 * @date 2019/4/24 10:25
 */
@Data
public class ComplexTradeRpt {
    /**
     * 交易稳定性
     */
    private BigDecimal trade_amt_month_stab_6m;
    private BigDecimal trade_cnt_month_stab_6m;
    private BigDecimal trade_amt_month_skew_6m;
    private BigDecimal trade_cnt_month_skew_6m;
    private BigDecimal trade_cnt_week_freq_6m;
    private BigDecimal trade_cnt_week_freq_3m;
    private BigDecimal trade_cnt_day_freq_6m;
    private BigDecimal trade_cnt_day_freq_3m;
    private BigDecimal trade_cnt_week_freq_month_stab_6m;
    private BigDecimal trade_cnt_day_freq_month_stab_6m;
    private BigDecimal trade_amt_month_rise_rate_max_6m;
    private BigDecimal trade_amt_month_rise_rate_min_6m;
    private BigDecimal trade_amt_month_rise_rate_mean_6m;
    private BigDecimal trade_cnt_month_rise_rate_max_6m;
    private BigDecimal trade_cnt_month_rise_rate_min_6m;
    private BigDecimal trade_cnt_month_rise_rate_mean_6m;

    private Integer trade_recent_time_span;

    private Integer trade_scene_num_6m;
    private Integer trade_scene_num_3m;
    private Integer trade_scene_num_1m;

    private BigDecimal trade_income_amt_max_6m;
    private BigDecimal trade_income_amt_mean_6m;
    private BigDecimal trade_income_amt_max_3m;
    private BigDecimal trade_income_amt_mean_3m;
    private BigDecimal trade_income_amt_max_1m;
    private BigDecimal trade_income_amt_mean_1m;
    private BigDecimal trade_pay_amt_max_6m;
    private BigDecimal trade_pay_amt_mean_6m;
    private BigDecimal trade_pay_amt_max_3m;
    private BigDecimal trade_pay_amt_mean_3m;
    private BigDecimal trade_pay_amt_max_1m;
    private BigDecimal trade_pay_amt_mean_1m;
    private Integer trade_income_cnt_sum_6m;
    private BigDecimal trade_income_amt_sum_6m;
    private Integer trade_income_cnt_sum_3m;
    private BigDecimal trade_income_amt_sum_3m;
    private Integer trade_income_cnt_sum_1m;
    private BigDecimal trade_income_amt_sum_1m;
    private Integer trade_pay_cnt_sum_6m;
    private BigDecimal trade_pay_amt_sum_6m;
    private Integer trade_pay_cnt_sum_3m;
    private BigDecimal trade_pay_amt_sum_3m;
    private Integer trade_pay_cnt_sum_1m;
    private BigDecimal trade_pay_amt_sum_1m;

    private BigDecimal trade_pay_amt_day_max_6m;
    private BigDecimal trade_pay_amt_day_max_3m;
    private BigDecimal trade_income_amt_day_max_6m;
    private BigDecimal trade_income_amt_day_max_3m;

    private BigDecimal trade_income_amt_month_mean_6m;
    private BigDecimal trade_income_amt_month_mean_3m;
    private BigDecimal trade_income_amt_month_max_6m;
    private BigDecimal trade_income_amt_month_max_3m;
    private BigDecimal trade_pay_amt_month_mean_6m;
    private BigDecimal trade_pay_amt_month_mean_3m;
    private BigDecimal trade_pay_amt_month_max_6m;
    private BigDecimal trade_pay_amt_month_max_3m;

    private BigDecimal trade_income_amt_month_stab_6m;
    private BigDecimal trade_income_cnt_month_stab_6m;
    private BigDecimal trade_pay_amt_month_stab_6m;
    private BigDecimal trade_pay_cnt_month_stab_6m;
}
