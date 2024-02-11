package ru.gb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
//@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringAopDemoApplication {

	// OOP (Object oriented programing)
	// AOP (Aspect oriented programming)

	// CGLib extends MyServiceBean
	// DynamicProxy implements ...

	// @Transactional

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringAopDemoApplication.class, args);
	}

}
