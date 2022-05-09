package org.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ProjectName：springboot-stu
 * @PackageName：org.springboot.config
 * @Description：
 * @Author：GF
 * @Date：2022/4/11 19:57
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket createDocket() {
        // 配置swagger核心Docket
        return new Docket(DocumentationType.SWAGGER_2) //指定Swagger2版本
                // 配置Swagger文档的基础信息
                .apiInfo(apiInfo())
                // 是否开启Swagger，生产环境下为了系统安全和性能，一般关闭Swagger
                .enable(true)
                /**
                 * 选择需要生成swagger文档的API，RequestHandlerSelectors选择器中有以下处理方式：
                 *   any：扫描所有
                 *   basePackage：扫描包路径
                 *   withClassAnnotation：扫描类上的注解
                 *   withMethodAnnotation：扫描方法上的注解
                 *   none：关闭扫描
                 * 还可以根据路径匹配：
                 *   any：匹配所有
                 *   ant：匹配路径
                 *   none：都不匹配
                 *   regex：正则匹配
                 */
                .select()
                .apis(RequestHandlerSelectors.basePackage("org.springboot"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger接口文档")
                .description("springboot继承swagger")
                .contact(new Contact("gaofv", "http://www.baidu.com", "gaofv@gmail.com"))
                .license("license.....")
                .licenseUrl("http://license....")
                .termsOfServiceUrl("http://127.0.0.1:9091")
                .version("1.0.0")
                .build();
    }
}
