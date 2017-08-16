package com.identity.services.interfaces;

/**
 * Created by zhangpengcheng on 17/8/16.
 */
public interface IAuthorizeCodeService {

    String generate();

    void store(String code, String value);

    String generateAndStore(String value);


}
