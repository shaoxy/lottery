package com.ai.lottery.core.config;

import nz.net.ultraq.thymeleaf.LayoutDialect;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
//import com.ailk.retail.web.thymeleaf.expression.SmallFunctionHelper;

@Configuration
public class ViewConfiguration {

    @Bean
    public ClassLoaderTemplateResolver templateResolver() {
        ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
        templateResolver.setTemplateMode("HTML5");
        templateResolver.setPrefix("pages/");
        templateResolver.setSuffix(".html");
        templateResolver.setCharacterEncoding("utf-8");
        templateResolver.setOrder(1);

        templateResolver.setCacheable(false);
        return templateResolver;
    }

    @Bean
    public SpringTemplateEngine templateEngine() {
        SpringTemplateEngine engine = new SpringTemplateEngine();
        engine.setTemplateResolver(templateResolver());
//        engine.addDialect(new DataTablesDialect());
        engine.addDialect(new LayoutDialect());
        return engine;
    }

    @Bean
    public ThymeleafViewResolver thymeleafViewResolver() {
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setTemplateEngine(templateEngine());
        viewResolver.setCharacterEncoding("utf-8");
//        SmallFunctionHelper.addSmallFunctionTag(viewResolver);
        return viewResolver;
    }
    
//    @Bean
//    public Jackson2ObjectMapperFactoryBean Jackson2ObjectMapperFactoryBean() {
//    	Jackson2ObjectMapperFactoryBean bean = new Jackson2ObjectMapperFactoryBean();
//    	bean.setSimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//    	bean.setAutoDetectFields(false);
//    	return bean;
//    }

}
