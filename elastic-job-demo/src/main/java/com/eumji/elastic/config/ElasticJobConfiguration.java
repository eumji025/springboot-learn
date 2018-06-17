package com.eumji.elastic.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @email eumji025@gmail.com
 * @author: EumJi
 * @date: 18-6-17
 * @time: 下午3:26
 */
@ImportResource(locations = {"classpath:application-bean.xml"})
@Configuration
public class ElasticJobConfiguration {
//    @Bean
//    public ZookeeperRegistryCenter createZookeeperRegistryCenter(@Value("${elastic.serviceList:localhost:2821}") String serviceList, @Value("elastic.namespace:eumji-demo") String namespace){
//        ZookeeperRegistryCenter zookeeperRegistryCenter =  new ZookeeperRegistryCenter(new ZookeeperConfiguration(serviceList,namespace));
//        zookeeperRegistryCenter.init();
//        return zookeeperRegistryCenter;
//    }

}
