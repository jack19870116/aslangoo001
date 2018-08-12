package net.aslangoo.taskExcutor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * spring通过任务执行器（TaskExecutor）来实现多线程和并发编程
 */
@Configuration
@ComponentScan("net.buybal.pay.taskExcutor")
@EnableAsync
public class TaskExcutorConfig implements AsyncConfigurer {


    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor executor=new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(15);//核心线程数
        executor.setMaxPoolSize(24);//最大线程数
        executor.setKeepAliveSeconds(300);//线程最大空闲时间
        executor.setQueueCapacity(200);//队列大小
        executor.setThreadNamePrefix("aslangoo");//排查错误
        executor.shutdown();
        int maxPoolSize = executor.getMaxPoolSize();
        int activeCount = executor.getActiveCount();
        executor.initialize();

        return null;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }
}
