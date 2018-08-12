package net.aslangoo.taskExcutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 异步执行类
 */
@Service
public class AsyncTaskService {
    @Async//如果放在类所有方法都是异步方法,这里的方法自动注入使用ThreadPoolTaskExecutor作为TaskExecutor
    public void excuteAsyncTask(Integer i) {
        System.out.println("执行异步任务：" + i);
    }

    @Async
    public void excuteAsyncTaskPlus(Integer i) {
        System.out.println("执行异步任务+1:" + i);
    }
}
