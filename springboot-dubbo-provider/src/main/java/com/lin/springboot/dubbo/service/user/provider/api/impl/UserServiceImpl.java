package com.lin.springboot.dubbo.service.user.provider.api.impl;

import org.springframework.beans.factory.annotation.Value;

import com.alibaba.dubbo.config.annotation.Service;
import com.lin.springboot.dubbo.service.user.api.UserService;

/***
 * 通过 @Service 注解实现服务提供方
 * @author linmengmeng
 * @date 2020年7月6日下午3:00:16
 */
@Service(version = "${user.service.version}")
public class UserServiceImpl implements UserService {

	@Value("${dubbo.protocol.port}")
	private String port;

	@Override
	public String sayHi() {
		return "Hello Dubbo , i am from port:" + port;
	}
}