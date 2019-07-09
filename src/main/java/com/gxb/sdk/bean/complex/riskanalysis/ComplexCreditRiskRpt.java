package com.gxb.sdk.bean.complex.riskanalysis;

import com.gxb.sdk.bean.complex.riskanalysis.creditrisk.CreditChangeTrendRpt;
import lombok.Data;

/**
 * @author chenzhihui
 * @date 2019/5/23 10:56
 * 信用风险
 */
@Data
public class ComplexCreditRiskRpt {
    private Boolean receive_phone_is_same;
    private CreditChangeTrendRpt credit_change_trend_rpt;
}
