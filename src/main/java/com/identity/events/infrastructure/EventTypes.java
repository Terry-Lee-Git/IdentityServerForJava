package com.identity.events.infrastructure;

/**
 * Created by zhangpengcheng on 17/7/11.
 */
public enum EventTypes {

    Success(1),

    Failure(2),

    Information(3),

    Error(4);

    private int _val;

    EventTypes(int val){
        _val = val;
    }

    public int val(){
        return _val;
    }
}
