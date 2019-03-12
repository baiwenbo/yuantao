package cn.vo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication
public class BacksrageApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(BacksrageApplication.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(BacksrageApplication.class);
	}
	

}
