package com.gxb.sdk.param;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yaojun on 2019/6/25.
 */
public enum DataTypeEnum {
    OPERATOR("operator"),ECOMMERCE("ecommerce"),DEVICE("device"),ADDRESSBOOK("addressbook"),YOUDUN("youdun");

    private String dataType;

    DataTypeEnum (String dataType){
        this.dataType = dataType;
    }

    private static Map<String, DataTypeEnum> dataTypeMap = new HashMap<String, DataTypeEnum>();

    static {
        for(DataTypeEnum typeEnum : values()) {
            dataTypeMap.put(typeEnum.getDataType(), typeEnum);
        }
    }

    public static DataTypeEnum parse(String dataType) {
        if(dataType != null) {
            return dataTypeMap.get(dataType);
        }
        return null;
    }

    public String getDataType() {
        return dataType;
    }
}