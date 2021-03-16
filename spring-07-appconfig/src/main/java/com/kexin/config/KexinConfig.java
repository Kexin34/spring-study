package com.kexin.config;

import com.kexin.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// 这个也会被spring容器托管，注册到容器中，因为它本身是@Component
// @Configuration代表这是一个配置类，就和我们之前看的beans.xml一样
@Configuration
@ComponentScan("com.kexin.pojo")
@Import(KexinConfig2.class)
public class KexinConfig {

    // 通过方法注册一个bean，就相当于之前我们写的一个bean标签
    // 这个方法的名字，就相当于bean标签中的id属性
    // 这个方法的返回值，就相当于bean标签中的class属性
    @Bean
    public User user() {
        return new User();  // 就是返回要注入到bean的对象！
    }
}
