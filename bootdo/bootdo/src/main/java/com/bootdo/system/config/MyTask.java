package com.bootdo.system.config;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

public class MyTask extends java.util.TimerTask {
    private  static  final SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
    String name;
    @Override
    public void run() {
        System.out.println(name+"++++++++++++++++++++++"+sdf.format(new Date()));
    }

    public MyTask(String name) {
        super();
        this.name = name;
    }
}
