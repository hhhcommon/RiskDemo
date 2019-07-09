package com.gxb.sdk.bean.complex.ecommerce;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author chenzhihui
 * @date 2019/4/26 13:45
 */
@Data
public class ComplexRiskRpt {

    /**
     * 基于手机号
     */
    private Integer phone_receive_order_num_1y;
    private Integer phone_receive_order_num_6m;
    private Integer phone_receive_order_num_3m;
    private Integer phone_receive_addr_num_1y;
    private Integer phone_receive_addr_num_6m;
    private Integer phone_receive_addr_num_3m;

    private Integer phone_stab_days_1y;
    private Integer phone_use_num_1y;

    /**
     * 基于收获地址
     */
    private Integer oneself_receive_addr_num;
    private Integer oneself_receive_phone_num;
    private Integer receive_addr_num;
    private Integer receive_user_num;
    private Integer receive_phone_num;
    private Integer default_addr_city_level;

    private Integer receive_addr_first_tier_city_num_1y;
    private Integer receive_addr_second_tier_city_num_1y;
    private Integer receive_addr_third_tier_city_num_1y;
    private Integer receive_addr_fourth_tier_city_num_1y;
    private Integer receive_addr_first_tier_city_num_6m;
    private Integer receive_addr_second_tier_city_num_6m;
    private Integer receive_addr_third_tier_city_num_6m;
    private Integer receive_addr_fourth_tier_city_num_6m;
    private Integer receive_addr_first_tier_city_num_3m;
    private Integer receive_addr_second_tier_city_num_3m;
    private Integer receive_addr_third_tier_city_num_3m;
    private Integer receive_addr_fourth_tier_city_num_3m;

    private Integer diff_receive_addr_num_1y;
    private Integer diff_receive_addr_num_6m;
    private Integer diff_receive_addr_num_3m;
    private Integer diff_receive_user_num_1y;
    private Integer diff_receive_user_num_6m;
    private Integer diff_receive_user_num_3m;
    private Integer diff_receive_phone_num_1y;
    private Integer diff_receive_phone_num_6m;
    private Integer diff_receive_phone_num_3m;
    private Integer onself_order_num_1y;
    private Integer onself_order_num_6m;
    private Integer onself_order_num_3m;
    private Integer onself_receive_addr_num_1y;
    private Integer onself_receive_addr_num_6m;
    private Integer onself_receive_addr_num_3m;

    private BigDecimal onself_order_num_prop_1y;
    private BigDecimal onself_order_num_prop_6m;
    private BigDecimal onself_order_num_prop_3m;

    /**
     * 基于银行卡
     */
    private BigDecimal debit_card_prop;
    private BigDecimal credit_card_prop;
    private Integer bank_card_num;
    private Integer bank_num;
    private Integer debit_card_num;
    private Integer credit_card_num;

    /**
     * 淘宝交易风险
     */
    private BigDecimal tb_dawn_order_amt_max_1y;
    private BigDecimal tb_daytime_order_amt_max_1y;
    private BigDecimal tb_night_order_amt_max_1y;
    private BigDecimal tb_dawn_order_amt_prop_1y;
    private BigDecimal tb_daytime_order_amt_prop_1y;
    private BigDecimal tb_night_order_amt_prop_1y;
    private BigDecimal tb_dawn_order_cnt_prop_1y;
    private BigDecimal tb_daytime_order_cnt_prop_1y;
    private BigDecimal tb_night_order_cnt_prop_1y;

    private BigDecimal tb_dawn_order_amt_month_stab_1y;
    private BigDecimal tb_daytime_order_amt_month_stab_1y;
    private BigDecimal tb_night_order_amt_month_stab_1y;
    private BigDecimal tb_dawn_order_cnt_month_stab_1y;
    private BigDecimal tb_daytime_order_cnt_month_stab_1y;
    private BigDecimal tb_night_order_cnt_month_stab_1y;

    private BigDecimal tb_dawn_order_amt_max_6m;
    private BigDecimal tb_daytime_order_amt_max_6m;
    private BigDecimal tb_night_order_amt_max_6m;
    private BigDecimal tb_dawn_order_amt_prop_6m;
    private BigDecimal tb_daytime_order_amt_prop_6m;
    private BigDecimal tb_night_order_amt_prop_6m;
    private BigDecimal tb_dawn_order_cnt_prop_6m;
    private BigDecimal tb_daytime_order_cnt_prop_6m;
    private BigDecimal tb_night_order_cnt_prop_6m;
    private BigDecimal tb_dawn_order_amt_max_3m;
    private BigDecimal tb_daytime_order_amt_max_3m;
    private BigDecimal tb_night_order_amt_max_3m;
    private BigDecimal tb_dawn_order_amt_prop_3m;
    private BigDecimal tb_daytime_order_amt_prop_3m;
    private BigDecimal tb_night_order_amt_prop_3m;
    private BigDecimal tb_dawn_order_cnt_prop_3m;
    private BigDecimal tb_daytime_order_cnt_prop_3m;
    private BigDecimal tb_night_order_cnt_prop_3m;
    private BigDecimal tb_dawn_order_amt_max_1m;
    private BigDecimal tb_daytime_order_amt_max_1m;
    private BigDecimal tb_night_order_amt_max_1m;
    private BigDecimal tb_dawn_order_amt_prop_1m;
    private BigDecimal tb_daytime_order_amt_prop_1m;
    private BigDecimal tb_night_order_amt_prop_1m;
    private BigDecimal tb_dawn_order_cnt_prop_1m;
    private BigDecimal tb_daytime_order_cnt_prop_1m;
    private BigDecimal tb_night_order_cnt_prop_1m;

    /**
     * 支付宝风险
     */
    private BigDecimal trade_dawn_amt_max_6m;
    private BigDecimal trade_daytime_amt_max_6m;
    private BigDecimal trade_night_amt_max_6m;
    private BigDecimal trade_dawn_amt_prop_6m;
    private BigDecimal trade_daytime_amt_prop_6m;
    private BigDecimal trade_night_amt_prop_6m;
    private BigDecimal trade_dawn_cnt_prop_6m;
    private BigDecimal trade_daytime_cnt_prop_6m;
    private BigDecimal trade_night_cnt_prop_6m;

    private BigDecimal trade_dawn_amt_month_stab_6m;
    private BigDecimal trade_daytime_amt_month_stab_6m;
    private BigDecimal trade_night_amt_month_stab_6m;
    private BigDecimal trade_dawn_cnt_month_stab_6m;
    private BigDecimal trade_daytime_cnt_month_stab_6m;
    private BigDecimal trade_night_cnt_month_stab_6m;

    private BigDecimal trade_amt_month_max_6m;
    private BigDecimal trade_amt_month_max_3m;
    private Integer trade_cnt_month_max_6m;
    private Integer trade_cnt_month_max_3m;
    private BigDecimal trade_amt_month_mean_6m;
    private BigDecimal trade_amt_month_mean_3m;
    private BigDecimal trade_cnt_month_mean_6m;
    private BigDecimal trade_cnt_month_mean_3m;

    private BigDecimal trade_time_span_stab_6m;
    private BigDecimal trade_time_span_max_6m;
    private BigDecimal trade_time_span_min_6m;
    private BigDecimal trade_time_span_mean_6m;

    private BigDecimal trade_amt_day_max_6m;
    private BigDecimal trade_amt_day_max_3m;
    private BigDecimal trade_amt_day_max_1m;
    private Integer trade_cnt_day_max_6m;
    private Integer trade_cnt_day_max_3m;
    private Integer trade_cnt_day_max_1m;

    private BigDecimal trade_amt_max_6m;
    private BigDecimal trade_amt_min_6m;
    private BigDecimal trade_amt_mean_6m;
    private BigDecimal trade_amt_max_3m;
    private BigDecimal trade_amt_min_3m;
    private BigDecimal trade_amt_mean_3m;
    private BigDecimal trade_amt_max_1m;
    private BigDecimal trade_amt_min_1m;
    private BigDecimal trade_amt_mean_1m;
    private BigDecimal trade_amt_sum_6m;
    private BigDecimal trade_amt_sum_3m;
    private BigDecimal trade_amt_sum_1m;
    private Integer trade_cnt_sum_6m;
    private Integer trade_cnt_sum_3m;
    private Integer trade_cnt_sum_1m;

    private BigDecimal trade_lottery_order_amt_sum_1m;
    private BigDecimal trade_lottery_order_amt_mean_1m;
    private BigDecimal trade_lottery_order_amt_max_1m;
    private BigDecimal trade_lottery_order_amt_sum_prop_1m;
    private Integer trade_lottery_order_cnt_sum_1m;
    private BigDecimal trade_lottery_order_cnt_sum_prop_1m;
    private BigDecimal trade_lottery_order_amt_sum_3m;
    private BigDecimal trade_lottery_order_amt_mean_3m;
    private BigDecimal trade_lottery_order_amt_max_3m;
    private BigDecimal trade_lottery_order_amt_sum_prop_3m;
    private Integer trade_lottery_order_cnt_sum_3m;
    private BigDecimal trade_lottery_order_cnt_sum_prop_3m;
    private BigDecimal trade_lottery_order_amt_sum_6m;
    private BigDecimal trade_lottery_order_amt_mean_6m;
    private BigDecimal trade_lottery_order_amt_max_6m;
    private BigDecimal trade_lottery_order_amt_sum_prop_6m;
    private Integer trade_lottery_order_cnt_sum_6m;
    private BigDecimal trade_lottery_order_cnt_sum_prop_6m;

    /**
     * 疑似风险
     */
    private Integer trade_cheat_order_cnt_sum_1m;
    private Integer trade_cheat_order_cnt_sum_3m;
    private Integer trade_cheat_order_cnt_sum_6m;
    private Integer trade_gambling_order_cnt_sum_1m;
    private Integer trade_gambling_order_cnt_sum_3m;
    private Integer trade_gambling_order_cnt_sum_6m;
    private Integer trade_drug_order_cnt_sum_1m;
    private Integer trade_drug_order_cnt_sum_3m;
    private Integer trade_drug_order_cnt_sum_6m;
    private Integer trade_cashout_order_cnt_sum_1m;
    private Integer trade_cashout_order_cnt_sum_3m;
    private Integer trade_cashout_order_cnt_sum_6m;
}
