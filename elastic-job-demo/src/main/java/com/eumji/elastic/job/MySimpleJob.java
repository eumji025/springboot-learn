package com.eumji.elastic.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import org.springframework.stereotype.Component;

/**
 * @email eumji025@gmail.com
 * @author: EumJi
 * @date: 18-6-17
 * @time: 下午3:23
 */
@Component
public class MySimpleJob implements SimpleJob {
    @Override
    public void execute(ShardingContext shardingContext) {
        System.out.println("hello, this is my job");
    }
}
