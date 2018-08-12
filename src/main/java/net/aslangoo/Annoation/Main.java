package net.aslangoo.Annoation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WiseLyConfig.class);
        DemoServcie bean = context.getBean(DemoServcie.class);
        bean.outputResult();
        context.close();
    }
}
