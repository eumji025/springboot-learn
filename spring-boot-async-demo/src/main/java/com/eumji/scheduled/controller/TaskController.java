package com.eumji.scheduled.controller;

import com.eumji.scheduled.task.AsyncTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;

/**
 * @email eumji025@gmail.eumji
 * @author:EumJi
 * @date: 2017/11/25
 * @time: 20:22
 */
@RestController
public class TaskController {
    @Autowired
    private AsyncTask asyncTask;

    @GetMapping("/task")
    public String task(){

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
            return String.valueOf(System.currentTimeMillis()-beginTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
