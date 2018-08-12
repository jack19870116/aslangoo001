package net.aslangoo.Annoation;

import org.springframework.stereotype.Service;

@Service
public class DemoMethodService {
    public void add() {
        System.out.println("男人有担当");
    }
    public void update() {
        System.out.println("男人有胆识");
    }
}
