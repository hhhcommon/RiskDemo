package com.gxb.sdk.bean.complex.baseinfo;

import lombok.Data;

/**
 * @author chenzhihui
 * @date 2019/5/21 22:39
 */
@Data
public class ComplexUserBaseInfo {
    private String name;
    private String idcard;
    private Integer gender;
    private String mobile;
    private Long input_timestamp;

    /**
     * 年龄 从传入身份证获得
     * (ninf , 22]
     * (22 , 28]
     * (28 , 35]
     * (35 , 45]
     * (45 , inf]
     */
    private Integer age;
}
