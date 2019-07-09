package com.gxb.sdk.bean.complex.zmscore;

import lombok.Data;

import java.util.Date;

/**
 * @author chenzhihui
 * @date 2019/5/21 22:50
 */
@Data
public class ComplexZmScoreInfo {
    private Boolean is_cover;
    private Date zm_score_update_time;
    /**
     * 缺失
     * (ninf , 350]
     * (350, 550]
     * (550 , 600]
     * (600 , 650]
     * (650 , 700]
     * (700 , 950]
     * (950 , inf]
     */
    private Integer zm_score;
}
