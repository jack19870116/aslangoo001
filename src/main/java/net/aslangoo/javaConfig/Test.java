package net.aslangoo.javaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        FunctionService bean = context.getBean(FunctionService.class);
        System.out.println(bean.sayHello("你好"));
        context.close();
    }
}
