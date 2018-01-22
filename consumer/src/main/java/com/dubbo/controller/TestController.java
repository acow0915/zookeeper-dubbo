package com.dubbo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dubbo.client.ClientService;

@RestController
public class TestController {

	@Autowired
	private ClientService clientService;
	
	@RequestMapping("/hi")
	public String callService() throws Exception{
		return clientService.callService("test");
	}
}
