package com.jutixueyuan.config;


import com.google.common.base.Predicates;
import com.jutixueyuan.annotation.SwaggerUIAnncation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * swagger配置
 */
@Configuration
public class SwaggerConfig {

    // 创建对象
    @Bean
    public Docket docket(){
        // ApiInfo构建对象
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
        // 设置标题
        apiInfoBuilder.title("欢迎使用XXX管理系统接口文档");
        // 设置版本
        apiInfoBuilder.version("1.1");
        // 设置描述
        apiInfoBuilder.description("这是一个给前端访问API，包括Android，IOS,前端");
        // 设置网址 邮箱
        Contact contact = new Contact("巨梯学院", "http://www.jutixueyuan.com", "admin@juti.com");
        apiInfoBuilder.contact(contact);

        // ApiIndo对象 。 swagger-ui.html上面配置信息都在此配置
        ApiInfo apiInfo = apiInfoBuilder.build();

        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo) // 配置api信息
                .select()
                // 配置要生成api的包
                //.apis(RequestHandlerSelectors.basePackage("com.jutixueyuan.api"))
                // 设置贴过对应注解的才会生成API
                //.apis(RequestHandlerSelectors.withMethodAnnotation(SwaggerUIAnncation.class))
                // 设置贴过对应注解的不会生成API
                //.apis(Predicates.not(RequestHandlerSelectors.withMethodAnnotation(SwaggerUIAnncation.class)))

                // 配置路径
                .paths(Predicates.or(
                        PathSelectors.regex("/user/.*"),
                        PathSelectors.regex("/student/.*")
                ))
                .build();

        return docket;
    }

}
