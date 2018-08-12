package net.aslangoo.initBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
        context.getEnvironment().setActiveProfiles("prod");
        context.register(PrePostConfig.class);
        context.refresh();
        BeanWayService bean = context.getBean(BeanWayService.class);
        JSR250WayService bean1 = context.getBean(JSR250WayService.class);
        context.close();
    }
}
