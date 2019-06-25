package com.gxb.sdk.param;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yaojun on 2019/6/11.
 */
public enum SourceTypeEnum {
    GXB("gxb"),MOXIE("moxie"),BAIQISHI("baiqishi"),TIANJI("tianji"),JUXINLI("juxinli"),TONGDUN("tongdun"),YOUDUN("youdun");

    private String sourceType;

    SourceTypeEnum(String sourceType){
        this.sourceType = sourceType;
    }

    private static Map<String, SourceTypeEnum> sourceTypeMap = new HashMap<String, SourceTypeEnum>();

    static {
        for(SourceTypeEnum typeEnum : values()) {
            sourceTypeMap.put(typeEnum.getSourceType(), typeEnum);
        }
    }

    public static SourceTypeEnum parse(String sourceType) {
        if(sourceType != null) {
            return sourceTypeMap.get(sourceType);
        }
        return null;
    }

    public String getSourceType() {
        return sourceType;
    }
}