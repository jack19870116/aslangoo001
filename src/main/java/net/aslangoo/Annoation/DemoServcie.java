package net.aslangoo.Annoation;

import org.springframework.stereotype.Service;

@Service
public class DemoServcie {
    public void outputResult() {
        System.out.println("从组合注解中照样可以得到bean");
    }
}
