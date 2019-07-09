package com.gxb.sdk.bean.complex.riskanalysis;

import com.gxb.sdk.bean.complex.riskanalysis.multi.ComplexMultiRiskRpt;
import lombok.Data;

/**
 * @author chenzhihui
 * @date 2019/5/21 22:46
 */
@Data
public class ComplexRiskAnalysis {
    private ComplexMultiRiskRpt multi_risk_rpt;
    private ComplexAntiFraudRpt anti_fraud_rpt;
    private ComplexCreditRiskRpt credit_risk_rpt;
}
