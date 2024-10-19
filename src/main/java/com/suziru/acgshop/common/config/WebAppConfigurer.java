package com.suziru.acgshop.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebAppConfigurer implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/image/swiper/**").addResourceLocations("file:../image/swiper/");
        registry.addResourceHandler("/image/bigType/**").addResourceLocations("file:../image/bigType/");
        registry.addResourceHandler("/image/product/**").addResourceLocations("file:../image/product/");
        registry.addResourceHandler("/image/productSwiperImgs/**").addResourceLocations("file:../image/productSwiperImgs/");
        registry.addResourceHandler("/image/productIntroImgs/**").addResourceLocations("file:../image/productIntroImgs/");
        registry.addResourceHandler("/image/productParaImgs/**").addResourceLocations("file:../image/productParaImgs/");
    }
}
