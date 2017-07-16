package com.identity.models.enums;

/**
 * Created by zhangpengcheng on 17/7/16.
 */
public enum TokenExpiration {
    Sliding(0), Absolute(1);

    private int val;

    TokenExpiration(int v){
        val = v;
    }

    public int val(){
        return val;
    }
}
