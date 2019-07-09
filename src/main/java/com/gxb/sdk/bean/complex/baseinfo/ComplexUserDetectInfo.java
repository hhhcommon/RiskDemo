package com.gxb.sdk.bean.complex.baseinfo;

import lombok.Data;

import java.util.List;

/**
 * @author chenzhihui
 * @date 2019/5/23 02:07
 * 用户信息检测
 */
@Data
public class ComplexUserDetectInfo {
    private List<String> idcard_related_other_names;
    private List<String> idcard_related_other_phones;
    private List<String> phone_related_other_names;
    private List<String> phone_related_other_idcards;
    private Boolean name_phone_matched_alipay;
    private Boolean name_idcard_matched_alipay;
    private Boolean is_verified;
}
