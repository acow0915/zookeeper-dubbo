package com.dubbo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ConsumerConfig;
import com.alibaba.dubbo.config.RegistryConfig;

//@Configuration
public class ProfileConsumerDubboConfiguration {

//    @Autowired
//    private ProfileProperties config;

    @Bean(name = "profileApplicationConfig")
    public ApplicationConfig applicationConfig(){
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("profile-present-service");
        applicationConfig.setOwner("profile");
        applicationConfig.setOrganization("touna");
        return applicationConfig;
    }

    @Bean(name = "profileConsumerConfig")
    public ConsumerConfig consumerConfig() {
        ConsumerConfig consumerConfig = new ConsumerConfig();
        consumerConfig.setTimeout(600);
        return consumerConfig;
    }

    @Bean(name = "profileRegistryConfig")
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://localhost:2181");  //如果协议是zookeeper，则依赖zookeeper
        registryConfig.setClient("curator");  //依赖curator-framework
        return registryConfig;
    }

//    @Bean
//    public ProfileVariableConfService profileVariableConfService(){
//        ReferenceConfig<ProfileVariableConfService> reference = new ReferenceConfig<>(); 
//        reference.setApplication(applicationConfig());
//        reference.setRegistry(registryConfig()); // 多个注册中心可以用setRegistries()
//        reference.setInterface(ProfileVariableConfService.class);
//        return reference.get();
//    }
}
