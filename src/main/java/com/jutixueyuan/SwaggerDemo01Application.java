package com.jutixueyuan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2 // 允许当前项目使用Swagger2
public class SwaggerDemo01Application {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerDemo01Application.class, args);
    }

}
