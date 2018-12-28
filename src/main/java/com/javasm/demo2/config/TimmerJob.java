package com.javasm.demo2.config;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//当前类 注入到spring容器中
@Component
public class TimmerJob {

    @Scheduled(cron = "0/5 * * * * ?")
    public void testJob(){
        System.out.println("----------我是定时任务，我被执行了-----------");
    }

}
