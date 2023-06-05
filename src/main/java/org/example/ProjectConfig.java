package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {
    @Value("${activemq.url}")
    private String url;

//    @Bean
//    public Engineer engineer() {
//        Engineer engineer = new Engineer();
//        engineer.setComputer(desktop());
//        return engineer;
//    }

    @Bean
    @Primary
    public Computer desktop() {
        return new DesktopComputer();
    }

    @Bean
    @Qualifier("laptop")
    public Computer laptop() {
        return new LaptopComputer();
    }
}
