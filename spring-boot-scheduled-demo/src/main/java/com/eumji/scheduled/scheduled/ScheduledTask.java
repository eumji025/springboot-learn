package com.eumji.scheduled.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author eumji
 * @package eumji.eumji.task.task
 * @name ScheduledTask
 * @date 2017/3/28
 * @time 14:25
 */
@Component
public class ScheduledTask {

    @Scheduled(fixedDelay = 1000)
    public void task() throws InterruptedException {
        System.out.println("curren Time: "+System.currentTimeMillis());
        Thread.sleep(3000);
    }
}
