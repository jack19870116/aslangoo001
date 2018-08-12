package net.aslangoo.Annoation;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {
    @Action(name = "注释拦截的add操作" ,age = 15)
    public void add() {
        System.out.println("女人有气质");
    }
}
