package himedia.contactserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = 
{"himedia.contactserver.mappers"})
@ComponentScan(basePackages= {"himedia.contactserver"})
public class ContactServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactServerApplication.class, args);
	}

}
