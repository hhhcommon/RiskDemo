package com.gxb.sdk.bean.complex.baseinfo;

import lombok.Data;

/**
 * @author chenzhihui
 * @date 2019/5/21 22:21
 */
@Data
public class ComplexUserInfo {
    private ComplexUserBaseInfo user_base_info;
    private ComplexUserDetectInfo user_detect_info;
}
