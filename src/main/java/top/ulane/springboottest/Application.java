package top.ulane.springboottest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootApplication(scanBasePackages = {""})
@MapperScan(basePackages = {"top.ulane.springboottest.mapper"})
//@EnableDubbo(scanBasePackages = {""})
public class Application {
	
	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
	}
	
}
