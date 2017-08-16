package com.identity.services;

import com.identity.services.interfaces.IAuthorizeCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by zhangpengcheng on 17/8/16.
 */

@Service
public class AuthorizeCodeService implements IAuthorizeCodeService{

    @Autowired
    private RedisTemplate redis;

    @Override
    public String generate() {
        return new UUID(16, 16).toString();
    }

    @Override
    public void store(String code, String value) {
        redis.opsForValue().set(code, value);
    }

    @Override
    public String generateAndStore(String value) {
        String code = generate();
        store(code, value);
        return code;
    }
}
