package com.lin.springboot.dubbo.service.user.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

@EnableDubbo
@SpringBootApplication
public class SpringbootDubboServiceUserProviderMergerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDubboServiceUserProviderMergerApplication.class, args);
		// 启动 Provider 容器，注意这里的 Main 是 com.alibaba.dubbo.container 包下的
		//Main.main(args);
	}
}
