package hede.com.spring_boot_demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
}