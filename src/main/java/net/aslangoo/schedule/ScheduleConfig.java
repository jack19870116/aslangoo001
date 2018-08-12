package net.aslangoo.schedule;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("net.buybal.pay.schedule")
@EnableScheduling//启动计划任务
public class ScheduleConfig {

}
