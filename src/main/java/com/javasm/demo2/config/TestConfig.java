package com.javasm.demo2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration//配置类，spring启动时默认加载
public class TestConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //urlPath时用户访问路径
        //后面是访问跳转的页面
        registry.addViewController("/test/css").setViewName("/css");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginIntercept()).addPathPatterns("/**");//拦截
        registry.addInterceptor(new LoginIntercept()).excludePathPatterns("/login/**");//不拦截
    }
}
