package com.identity.models.enums;

/**
 * Created by zhangpengcheng on 17/7/16.
 */

/// <summary>
/// OpenID Connect subject types.
/// </summary>
public enum SubjectTypes
{

    Global(0),Ppid(1);

    private int val;

    SubjectTypes(int v){
        val = v;
    }

    public int val(){
        return val;
    }
}
