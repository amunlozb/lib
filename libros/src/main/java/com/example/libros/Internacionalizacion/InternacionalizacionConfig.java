package com.example.libros.Internacionalizacion;

import org.springframework.context.annotation.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
public class InternacionalizacionConfig {


    @Configuration
    public class WebMvcConfiguration implements WebMvcConfigurer{
        @Bean
        public CookieLocaleResolver localeResolver() {
            return new CookieLocaleResolver();
        }
        @Bean
        public LocaleChangeInterceptor localeInterceptor() {
            LocaleChangeInterceptor localInterceptor = new LocaleChangeInterceptor();
            localInterceptor.setParamName("lang");
            return localInterceptor;
        }
        @Override
        public void addInterceptors(InterceptorRegistry registry) {
            registry.addInterceptor(localeInterceptor());
        }


    }
}
