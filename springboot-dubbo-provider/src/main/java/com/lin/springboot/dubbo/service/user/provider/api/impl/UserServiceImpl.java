package com.lin.springboot.dubbo.service.user.provider.api.impl;
    
    import com.alibaba.dubbo.config.annotation.Service;
import com.lin.springboot.dubbo.service.user.api.UserService;
    
    @Service(version = "${user.service.version}")
    public class UserServiceImpl implements UserService {
        @Override
        public String sayHi() {
            return "Hello Dubbo";
        }
    }