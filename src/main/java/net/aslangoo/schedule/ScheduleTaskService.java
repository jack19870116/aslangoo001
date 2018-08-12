package net.aslangoo.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduleTaskService {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)//计划任务 fixedRate每隔一段时间 cron 指定时间
    public void reportTmies() {
        System.out.println("每隔5秒执行一次" + dateFormat.format(new Date()));
    }

    @Scheduled(cron = "0 36 13 ? * *")
    public void fixTimeReportTimes() {
        System.out.println("在指定时间" + dateFormat.format(new Date()) + "执行");
    }
}
