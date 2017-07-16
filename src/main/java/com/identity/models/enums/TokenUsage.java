package com.identity.models.enums;

/**
 * Created by zhangpengcheng on 17/7/16.
 */
public enum TokenUsage {
    ReUse(0), OneTimeOnly(1);

    private int val;

    TokenUsage(int v){
        val = v;
    }

    public int val(){
        return val;
    }
}
