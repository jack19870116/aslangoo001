package net.aslangoo.initBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {
    @PostConstruct
    public void init() {
        System.out.println("jsr250 初始化");
    }

    public JSR250WayService() {
        super();
        System.out.println("初始化构造函数——JSR250WayService");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("jsr250 销毁");
    }
}
