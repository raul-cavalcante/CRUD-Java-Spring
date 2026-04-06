package dev.Raul.Cadastro.CRUD;

import org.h2.server.web.JakartaWebServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public ServletRegistrationBean<JakartaWebServlet> h2ConsoleServlet() {
		ServletRegistrationBean<JakartaWebServlet> bean =
				new ServletRegistrationBean<>(new JakartaWebServlet(), "/h2-console/*");
		bean.addInitParameter("webAllowOthers", "true");
		return bean;
	}
}