package com.identity.services;

import com.identity.services.interfaces.ITokenService;
import org.jose4j.json.JsonUtil;
import org.jose4j.jwk.RsaJsonWebKey;
import org.jose4j.jws.AlgorithmIdentifiers;
import org.jose4j.jws.JsonWebSignature;
import org.jose4j.jwt.JwtClaims;
import org.jose4j.jwt.NumericDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.security.PrivateKey;

/**
 * Created by zhangpengcheng on 17/8/9.
 */
@Service
public class TokenService implements ITokenService {

    @Value("${token.keyId}")
    private String keyId;

    @Autowired
    StringRedisTemplate redisTemplate;

    public String createIdToken(String subject){

        JwtClaims claims = new JwtClaims();
        claims.setGeneratedJwtId();
        claims.setIssuedAtToNow();
        NumericDate date = NumericDate.now();
        date.addSeconds(120);
        claims.setExpirationTime(date);
        claims.setNotBeforeMinutesInThePast(1);
        claims.setSubject(subject);
        claims.setAudience("www.test.com");
        return generateJwtToken(claims);
    }

    private String generateJwtToken(JwtClaims claims){
        JsonWebSignature jws = new JsonWebSignature();
        jws.setAlgorithmHeaderValue(AlgorithmIdentifiers.RSA_USING_SHA256);
        jws.setKeyIdHeaderValue(keyId);
        jws.setPayload(claims.toJson());
        String privateKeyText = redisTemplate.opsForValue().get(keyId + "-private");
        try{
            PrivateKey privateKey = new RsaJsonWebKey(JsonUtil.parseJson(privateKeyText)).getPrivateKey();
            jws.setKey(privateKey);
            return jws.getCompactSerialization();
        }catch (Exception ex){
            return null;
        }

    }
}
