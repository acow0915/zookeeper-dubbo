package com.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.inf.TestService;

@Service(version = "4.0.0")
public class TestServiceImpl implements TestService {

	@Override
	public String saySomeThing(String someThing) {
		return "hi" + someThing;
	}
}
