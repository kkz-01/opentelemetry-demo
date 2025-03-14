package com.kkz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;
import java.util.Map;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Main.class, args);
        Map<String, DataSource> beansOfType = run.getBeansOfType(DataSource.class);
        System.out.println(beansOfType);
        DataSource dataSource = beansOfType.get("dataSource");
        System.out.println("dataSource:" + dataSource);
    }
}