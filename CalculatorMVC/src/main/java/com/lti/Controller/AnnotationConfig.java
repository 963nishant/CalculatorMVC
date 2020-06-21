package com.lti.Controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Component
@ComponentScan( {"com.lti.Controller" } )
public class AnnotationConfig {
	
	@Bean
	public InternalResourceViewResolver viewResover(){
		
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/");
		vr.setSuffix(".jsp");
		
		return vr;
	}

}
