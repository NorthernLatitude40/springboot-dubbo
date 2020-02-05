package com.cc.usermanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

//@ImportResource(locations="classpath:customer-provider-dubbo.xml")
@SpringBootApplication
@MapperScan(basePackages = "com.cc.usermanage.user.mapper")
public class UsermanageApplication {

	public static void main(String[] args) {

		SpringApplication.run(UsermanageApplication.class, args);
	}

}
