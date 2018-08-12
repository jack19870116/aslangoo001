package net.aslangoo.Annoation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("net.buybal.pay.Annoation")
@EnableAspectJAutoProxy
public class AspectConfig {

}
