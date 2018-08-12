package net.aslangoo.schedule;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.ScheduledExecutorService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScheduleConfig.class);
        context.getBean(ScheduledExecutorService.class);
    }
}
