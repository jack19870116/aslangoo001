package net.aslangoo.initBean;

public class BeanWayService {
    public void init() {
        System.out.println("@Bean init_method");
    }

    public BeanWayService() {
        super();
        System.out.println("初始化构造函数");
    }

    public void destroy() {
        System.out.println("@Bean destroy_method");
    }
}
