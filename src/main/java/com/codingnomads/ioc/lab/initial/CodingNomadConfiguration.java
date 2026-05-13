package com.codingnomads.ioc.lab.initial;

import com.codingnomads.ioc.lab.completed.OperatingSystem;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.codingnomads.ioc.lab.initial")
public class CodingNomadConfiguration {

    @Bean
    public Framework framework() {
        return Framework.builder().name("Spring Boot").version("3.2").build();
    }

    @Bean
    public IDE ide() {
        return IDE.builder().name("IntelliJ IDEA").version("2023.05").build();
    }

    @Bean
    public JDK jdk() {
        return JDK.builder().name("JDK").version("17").build();
    }

    @Bean
    public Computer computer() {
        return Computer.builder().name("Apple").version("Macbook Air").build();
    }

    @Bean
    public OS os () {
        return OS.builder().name("MacOS").version("26.4.1").build();
    }

}
