package com.sly.resumebp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 
 * @author sly
 * @time 2019年3月5日
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
	/**
	 * 添加视图
	 * 
	 * @param registry
	 * @author sly
	 * @time 2018年12月9日
	 */
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("forward:/index/toIndexHome");
		registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
		WebMvcConfigurer.super.addViewControllers(registry);
	}
}

