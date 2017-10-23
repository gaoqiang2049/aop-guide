package com.example.demo.service;

import com.example.demo.security.CurrentUserHolder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class AuthService {
    public void checkAccess(){
        String user = CurrentUserHolder.get();
        if(!"admin".equals(user)){
            throw new RuntimeException("operation not allow");
        }
    }
}
