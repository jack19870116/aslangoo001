package net.aslangoo.springEvent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 事件监听器
 */
@Component
public class DemoListenter implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("我bean_DemoListenter 接受了 bean_DemoEvent 的message" + msg);
    }
}
