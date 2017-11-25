package com.eumji.scheduled.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.Future;

/**
 *
 *  异步调度类
 * @author EumJi
 * @package com.eumji.task.task
 * @name AsyncTask
 * @date 2017/3/29
 * @time 13:17
 */
@Component
public class AsyncTask {
    static Random random = new Random();
    @Async
    public Future<String> taskOne() throws InterruptedException {
        long begin = System.currentTimeMillis();
        System.out.println("任务一调度开始!");
        System.out.println("开始时间:"+begin);
        Thread.sleep(random.nextInt(5000));
        System.out.println("任务一调度结束");
        System.out.println("任务一调度耗时:"+(System.currentTimeMillis()-begin));
        return new AsyncResult<String>("任务二完成");
    }

    @Async
    public Future<String> taskTwo() throws InterruptedException {
        long begin = System.currentTimeMillis();
        System.out.println("任务二调度开始!");
        System.out.println("开始时间:"+begin);
        Thread.sleep(random.nextInt(5000));
        System.out.println("任务二调度结束");
        System.out.println("任务二调度耗时:"+(System.currentTimeMillis()-begin));
        return new AsyncResult<String>("任务二完成");
    }

    @Async
    public Future<String> taskThree() throws InterruptedException {
        long begin = System.currentTimeMillis();
        System.out.println("任务三调度开始!");
        System.out.println("开始时间:"+begin);
        Thread.sleep(random.nextInt(2000));
        System.out.println("任务三调度结束");
        System.out.println("任务三调度耗时:"+(System.currentTimeMillis()-begin));
        return new AsyncResult<String>("任务二完成");
    }

}
