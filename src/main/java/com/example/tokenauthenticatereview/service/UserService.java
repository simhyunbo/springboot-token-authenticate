package com.example.tokenauthenticatereview.service;

import com.example.tokenauthenticatereview.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Value("${jwt.secret}")
    private String secretKey;

    private Long expiredMs = 1000 * 60 * 60L;

    public String login(String userName, String password){

        // 인증과정생략 key는 외부에 노출 x
        return JwtUtil.createJwt(userName,secretKey,expiredMs);
    }


}
