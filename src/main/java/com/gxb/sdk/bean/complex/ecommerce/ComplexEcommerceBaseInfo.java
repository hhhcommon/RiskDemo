package com.gxb.sdk.bean.complex.ecommerce;

import lombok.Data;

/**
 * @author chenzhihui
 * @date 2019/5/21 23:05
 */
@Data
public class ComplexEcommerceBaseInfo {
    private String name_on_alipay;
    private String idcard_on_alipay;
    private String mobile_on_alipay;
    private Integer huabei_status;

    /**
     * 支付宝注册时间距今天数
     * 缺失
     * [0 , 360]
     * (360, 1080]
     * (1080 , 1440]
     * (1440, 2160]
     * (2160 , inf]
     */
    private Integer register_days;

    /**
     * 淘气值
     * 缺失
     * (ninf , 450]
     * (450, 600]
     * (600 , 750]
     * (750, 900]
     * (900 , inf]
     */
    private Integer tao_score;

    /**
     * 天猫积分
     * 缺失
     * (ninf , 100]
     * (100, 500]
     * (500 , 900]
     * (900, 1500]
     * (1500 , inf]
     */
    private Integer tmall_score;

    /**
     * 买家信用
     * 缺失
     * (ninf , 25]
     * (25, 75]
     * (75 , 150]
     * (150 , 300]
     * (300 , inf]
     */
    private Integer credit_level_as_buyer;

    /**
     * 花呗额度(包含临时信用额度)
     * 缺失
     * (ninf , 500]
     * (500, 1000]
     * (1000 , 2000]
     * (2000 , 4000]
     * (4000 , inf]
     */
    private Integer huabei_amount;

    /**
     * 花呗原始额度
     * 缺失
     * (ninf , 500]
     * (500, 1000]
     * (1000 , 2000]
     * (2000 , 4000]
     * (4000 , inf]
     */
    private Integer huabei_original_amount;

    /**
     * 花呗余额
     * 缺失
     * (ninf , 0]
     * (0, 25]
     * (25 , 100]
     * (100 , 500]
     * (500 , inf]
     */
    private Integer huabei_balance;

    /**
     * 花呗的罚息
     * 缺失
     * (ninf , 0]
     * (0, 10]
     * (10 , 30]
     * (30 , 50]
     * (50 , inf]
     */
    private Integer huabei_penalty_amount;

    /**
     * 余额宝余额
     * 缺失
     * (ninf , 0]
     * (0, 10]
     * (10 , 50]
     * (50 , 100]
     * (100 , inf]
     */
    private Integer yuebao_balance;

    /**
     * 余额宝总收入
     * 缺失
     * (ninf , 0]
     * (0, 5]
     * (5 , 20]
     * (20 , 50]
     * (50 , inf]
     */
    private Integer yuebao_income;

    /**
     * 支付宝余额
     * 缺失
     * (ninf , 0]
     * (0, 10]
     * (10 , 50]
     * (50 , 100]
     * (100 , inf]
     */
    private Integer alipay_balance;

    /**
     * 网商贷额度
     * 缺失
     * (ninf , 3000]
     * (3000, 5000]
     * (5000 , 8000]
     * (8000 , 15000]
     * (15000 , inf]
     */
    private Integer mybank_credit_quota;


}
