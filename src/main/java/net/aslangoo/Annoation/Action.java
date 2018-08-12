package net.aslangoo.Annoation;

import java.lang.annotation.*;

/**
 * 自定义注解，开始我的git之旅
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();

    int age();
}
