package com.prolik.java.springbootstudy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * 第二种方式，更改 格式化json 使用的方式为 fastjson
 * @author kang.li
 * @version $Id: .java, v 1.0 2019/10/26 kang.li Exp
 */
//@Configuration
public class MyWebMvcConfig implements WebMvcConfigurer {

   /* @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        @Override
        public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
            FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
            FastJsonConfig config = new FastJsonConfig();
            config.setDateFormat("yyyy-MM-dd");
            config.setCharset(Charset.forName("UTF-8"));
            config.setSerializerFeatures(
                    SerializerFeature.WriteClassName,
                    SerializerFeature.WriteMapNullValue,
                    SerializerFeature.PrettyFormat,
                    SerializerFeature.WriteNullListAsEmpty,
                    SerializerFeature.WriteNullStringAsEmpty
            );
            converter.setFastJsonConfig(config);
            converters.add(converter);
        }
    }*/


    /**
     * 第二种方式自定义配置文件过滤规则
     */
   /* @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");
    }*/
}
