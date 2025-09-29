package com.springbootapp.content_calendar;

import com.springbootapp.content_calendar.config.ContentCalendarProperties;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Objects;

@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class ContentCalendarApplication {

	public static void main(String[] args) {

      ConfigurableApplicationContext context = SpringApplication.run(ContentCalendarApplication.class, args);
        Object restTemplate = (RestTemplate)context.getBean("restTemplate");
//        System.out.println(restTemplate);

//      Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

	}

}
