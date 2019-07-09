package com.gxb.sdk.bean.complex.riskanalysis.multi;

import lombok.Data;

/**
 * @author chenzhihui
 * @date 2019/4/23 22:01
 */
@Data
public class ComplexMultiRiskItem {
    private String app_type;
    private Integer app_cnt_7d;
    private Integer app_cnt_15d;
    private Integer app_cnt_30d;
    private Integer app_cnt_90d;
    private Integer app_cnt_180d;
    private Integer app_cnt_out_180d;
}
