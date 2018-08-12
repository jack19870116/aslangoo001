package net.aslangoo.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class TestConfig {
    @Bean
    @Profile("dev")
    public TestBean devTestConfig() {
        return new TestBean("from development profiles");
    }
    @Bean
    @Profile("prod")
    public TestBean proTestConfig() {
        return new TestBean("from product profiles");
    }
}
