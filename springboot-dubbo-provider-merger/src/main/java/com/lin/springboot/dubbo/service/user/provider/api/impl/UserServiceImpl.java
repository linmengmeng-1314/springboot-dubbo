package com.lin.springboot.dubbo.service.user.provider.api.impl;

import org.springframework.beans.factory.annotation.Value;

import com.alibaba.dubbo.config.annotation.Service;
import com.lin.springboot.dubbo.service.user.api.UserService;

@Service(version = "${user.service.version}")
public class UserServiceImpl implements UserService {

	@Value("${dubbo.protocol.port}")
	private String port;

	@Override
	public String sayHi() {
		return "Hello Dubbo , i am from port:" + port;
	}
}