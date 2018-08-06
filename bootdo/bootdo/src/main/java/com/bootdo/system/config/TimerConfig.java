package com.bootdo.system.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Timer;
@Component
public class TimerConfig implements CommandLineRunner {//开机启动执行任务
    @Override
    public void run(String... args) throws Exception {
        java.util.Timer timer = new Timer(true);    //treu就是守护线程
        MyTask task = new MyTask("小明");
//开始执行任务,第一个参数是任务,第二个是延迟时间,第三个是每隔多长时间执行一次
        timer.schedule(task, 60000);
    }
}
