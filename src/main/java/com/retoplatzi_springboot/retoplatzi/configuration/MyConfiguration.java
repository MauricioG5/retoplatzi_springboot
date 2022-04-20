package com.retoplatzi_springboot.retoplatzi.configuration;

import com.retoplatzi_springboot.retoplatzi.bean.Bean1;
import com.retoplatzi_springboot.retoplatzi.bean.Bean2;
import com.retoplatzi_springboot.retoplatzi.bean.Implement1;
import com.retoplatzi_springboot.retoplatzi.bean.Implement2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    public Bean1 bean1Operation(){
        return new Implement1();
    }

    @Bean
    public Bean2 bean2Operation(){
        return new Implement2();
    }
}
