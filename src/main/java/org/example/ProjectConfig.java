package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration                       //Indicate this is a configuration class
@ComponentScan(basePackages = "org.example") // Tells spring to scan the given package for beans
public class ProjectConfig {
    @Value("${activemq.url}")
    private String url;

//    @Bean
//    public Engineer engineer() {
//        Engineer engineer = new Engineer();
//        engineer.setComputer(desktop());
//        return engineer;
//    }

    @Bean // This tells spring to create a bean of the Computer type
    @Primary // If more than one beans are found, spring will use this one
    public Computer desktop() {
        return new DesktopComputer();
    }

    @Bean
    @Qualifier("laptop") // The value of the @Qualifier annotation can be use to get this particular bean when multiple beans are found
    public Computer laptop() {
        return new LaptopComputer();
    }
}
