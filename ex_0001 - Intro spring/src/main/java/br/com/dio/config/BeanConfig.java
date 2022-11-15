package br.com.dio.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class BeanConfig {

//	@Bean
//	public UserRepository userpoRepository() {
//		System.out.println("Iniciando");
//		
//		return new UserRepository();
//	}

	@Bean
	//@Scope("singleton")
	@Scope("prototype")
	public BeanTeste metodoBeanSingleProto() {
		return new BeanTeste();
	}
	
	@Bean
	//@RequestScope
	//@SessionScope
	//@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
	@Scope(value = "websocket", proxyMode = ScopedProxyMode.TARGET_CLASS)
	public BeanTeste2 metodoBeanReqSes() {
		return new BeanTeste2();
	}

}
