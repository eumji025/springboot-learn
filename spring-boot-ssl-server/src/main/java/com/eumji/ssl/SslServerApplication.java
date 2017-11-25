package com.eumji.ssl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SslServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}


	/**
	 * 将http请求重定向到https
	 * @return
	 */
	@Bean
	public EmbeddedServletContainerFactory servletContainer() {
	  TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory() {
	      @Override
	      protected void postProcessContext(Context context) {
	        SecurityConstraint securityConstraint = new SecurityConstraint();
	        securityConstraint.setUserConstraint("CONFIDENTIAL");
	        SecurityCollection collection = new SecurityCollection();
	        collection.addPattern("/*");
	        securityConstraint.addCollection(collection);
	        context.addConstraint(securityConstraint);
	      }
	    };
	  
	  tomcat.addAdditionalTomcatConnectors(redirectConnector());
	  return tomcat;
	}

	private Connector redirectConnector() {
	  Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
	  connector.setScheme("http");
	  connector.setPort(80);
	  connector.setSecure(false);
	  connector.setRedirectPort(10234);
	  return connector;
	}
}
@RestController
class SecuredServerController{
	
	@RequestMapping("/secured")
	public String secured(){
		//System.out.println("this is secured request");
		return "Hello user !!!  北京时间 : " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:MM:ss"));
	}
}

