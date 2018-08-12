package net.aslangoo.SpringEl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("net.buybal.pay.SpringEl")
@PropertySource(value = {"classpath:config/test.properties"})
public class ELConfig {
    @Value("中文也行")
    private String normal;
    @Value("#{systemProperties['os.name']}")
    private String osName;
    @Value("#{T(java.lang.Math).random()*100.0}")
    private double radomNumber;
    @Value("#{demoService.another}")
    private String otherName;
    @Value("classpath:test.txt")
    private Resource testFile;
    @Value("${book.author}")
    private String author;
    @Value("https://www.baidu.com/")
    private Resource testUrl;
    @Autowired
    private Environment ev;

 /*   @Bean
    public static PropertyPlaceholderConfigurer propertyconfig() {
        return new PropertyPlaceholderConfigurer();
    }*/

    /*      解决 IllegalArgumentException: Could not resolve placeholder in string value "${XXXXXX}"
          导致这一问题的原因：使用了重复的property-placeholder*/
    public void outputResource() {
        try {
            System.out.println("author-----" + author);
//            System.out.println("normal-----" + normal);
//            System.out.println("osName-----" + osName);
//            System.out.println("radomNumber-----" + radomNumber);
//            System.out.println("otherName-----" + otherName);
//            System.out.println("testFile-----" + org.apache.commons.io.IOUtils.toString(testFile.getInputStream()));
//            System.out.println("testUrl-----" + IOUtils.toString(testUrl.getInputStream()));
            System.out.println("Envir-----" + ev.getProperty("book.author"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
