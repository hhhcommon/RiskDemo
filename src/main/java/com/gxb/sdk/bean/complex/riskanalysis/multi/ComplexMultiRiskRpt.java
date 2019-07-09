package com.gxb.sdk.bean.complex.riskanalysis.multi;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author chenzhihui
 * @date 2019/4/23 21:59
 */
@Data
public class ComplexMultiRiskRpt implements Serializable {
    private Integer last_query_date;
    private List<ComplexMultiRiskItem> query_apps;
}
