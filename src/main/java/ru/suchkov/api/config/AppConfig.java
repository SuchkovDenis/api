package ru.suchkov.api.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("ru.suchkov.api")
public class AppConfig implements WebMvcConfigurer {

}
