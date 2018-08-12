package net.aslangoo.springEvent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher bean = context.getBean(DemoPublisher.class);
        bean.publish("多么想");
        context.close();
    }
}
