package com.gxb.sdk.param;

import java.io.Serializable;

/**
 * Created by yaojun on 2019/6/25.
 */
public class ThreeElement implements Serializable {
    private String name;
    private String idcard;
    private String mobile;

    public ThreeElement(String name, String idcard, String mobile) {
        this.name = name;
        this.idcard = idcard;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
