package com.identity.models.enums;

/**
 * Created by zhangpengcheng on 17/7/16.
 */
public enum AccessTokenType {
    Jwt(0),Reference(1);

    private int val;

    AccessTokenType(int v){
        val = v;
    }

    public int val(){
        return val;
    }
}
