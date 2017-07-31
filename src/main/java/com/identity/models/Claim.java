package com.identity.models;

/**
 * Created by zhangpengcheng on 17/7/18.
 */
public class Claim {

    private String type;
    private String value;
    private String valueType;
    private String issuer;

    public Claim(String t, String v, String vt, String i){
        type = t;
        value = v;
        valueType = vt;
        issuer = i;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }
}
