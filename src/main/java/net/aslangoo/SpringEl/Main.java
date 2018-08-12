package net.aslangoo.SpringEl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ELConfig.class);
        ELConfig elConfig = (ELConfig) context.getBean(ELConfig.class);
        elConfig.outputResource();
        context.close();
    }
}
