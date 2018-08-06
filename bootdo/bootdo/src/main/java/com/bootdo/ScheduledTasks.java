package com.bootdo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description 定时任务类
 * @author  cjc
 * @Date  2018/8/6 9:50
 **/
@Component
public class ScheduledTasks {
    private  static  final SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
    /**
     * 定时任务每隔五秒执行一次
     */
    //fixedRate函数，它指定的是从调用开始时间到指定时间之后，单位毫秒。还有 fixedDelay指定从
    //完成任务测量的时间间隔。还可以指定具体时间，使用 Scheduled(cron="... ")
   /* @Scheduled(fixedRate = 5000)//每隔5s执行
    public void reportCurrent(){
        System.out.println("现在时间："+ sdf.format(new Date()));
    }*/

    @Scheduled(cron = "0 15 10 ? * *")//每天上午十点
    public void reportCurrentOne(){
        System.out.println("执行定时任务"+ sdf.format(new Date()));
    }
}
