package com.gxb.sdk.bean.complex.riskanalysis;

import lombok.Data;

/**
 * @author chenzhihui
 * @date 2019/5/23 02:53
 */
@Data
public class ComplexAntiFraudRpt {
    private Boolean name_phone_blacklist;
    private Boolean name_idcard_blacklist;
    private Boolean name_idcard_court_shixin;
    private Boolean name_idcard_caac_shixin;
    private Boolean name_idcard_tax_legal_shixin;
    private Boolean name_idcard_tax_nature_shixin;
    private Boolean name_idcard_train_shixin;
    private Integer lock_realaccount_total_cnt;
    private Integer lock_realaccount_cnt;
}
