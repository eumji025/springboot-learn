package com.eumji.asyncScheduled;

import com.eumji.scheduled.ScheduledApplication;
import com.eumji.scheduled.task.AsyncTask;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.Future;

/**
 * @author EumJi
 * @package eumji.eumji.task
 * @name AsyncTaskTest
 * @date 2017/3/29
 * @time 13:28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ScheduledApplication.class)
public class AsyncTaskTest {
    @Autowired
    private AsyncTask asyncTask;
    @Test
    public void asyncTest(){

        try {
            long beginTime = System.currentTimeMillis();
            Future<String> taskOne = asyncTask.taskOne();
            Future<String> taskTwo = asyncTask.taskTwo();
            Future<String> taskThree = asyncTask.taskThree();

            while (true){
                if (taskOne.isDone()&&taskTwo.isDone()&&taskThree.isDone()){
                    break;
                }
                Thread.sleep(1000);
            }
            System.out.println("任务全部完成,总耗时:"+(System.currentTimeMillis()-beginTime)+"毫秒");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
