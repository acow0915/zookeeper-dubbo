package com.dubbo.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.remoting.zookeeper.curator.CuratorZookeeperClient;
import com.dubbo.inf.TestService;

@Component
public class ClientService {
	
	@Reference(version = "4.0.0", interfaceClass = TestService.class)
	private TestService testService;
	
//	@Autowired
//	private CuratorFramework client;
	
//	@Autowired
//	private CuratorZookeeperClient client;
	
	public String callService(String someString) throws Exception{
		
//		client.getChildren("/dubbo");
		return testService.saySomeThing(someString);
	}
}
