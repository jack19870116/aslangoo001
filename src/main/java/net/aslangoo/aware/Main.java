package net.aslangoo.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareDemo bean = context.getBean(AwareDemo.class);
        bean.outputBeanName();
        context.close();
    }
}
