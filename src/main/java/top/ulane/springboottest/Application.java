package top.ulane.springboottest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.annotation.EnableLoadTimeWeaving.AspectJWeaving;

@SpringBootApplication
//@SpringBootApplication(scanBasePackages = {""})
@MapperScan(basePackages = {"top.ulane.springboottest.mapper"})
//@EnableDubbo(scanBasePackages = {""})
//@EnableAspectJAutoProxy //启用cglib springbean代理，不开，默认导入aspectjweaver代理就好
//@EnableLoadTimeWeaving(aspectjWeaving=AspectJWeaving.AUTODETECT) //启用普通对象代理, 需要配合启动参数-javaagent:C:\Users\eshonulane\.m2\repository\org\springframework\spring-instrument\5.3.7\spring-instrument-5.3.7.jar
public class Application {
	
	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
	}
	
}
