package net.aslangoo.conditionl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConfig {
    @Bean
    @Conditional(Windows.class)
    public ListService windowsListService() {
        return new WindowsListServcie();
    }

    @Bean
    @Conditional(Linux.class)
    public ListService linuxListServcie() {
        return new LinuxListService();
    }
}
