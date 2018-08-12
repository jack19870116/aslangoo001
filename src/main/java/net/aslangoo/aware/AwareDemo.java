package net.aslangoo.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

/**
 * 实现两个接口重写方法获取类名称和资源加载
 */
@Component
public class AwareDemo implements BeanNameAware, ResourceLoaderAware {
    private String beanName;
    private ResourceLoader loader;

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    public void outputBeanName() {
        System.out.println("bean 的名称：" + beanName);
        Resource resource = loader.getResource("classpath:config/test.txt");
        try {
            System.out.println("加载内容：+" + IOUtils.toString(resource.getInputStream()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
