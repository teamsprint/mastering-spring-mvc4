package kr.co.hanbit.mastering;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(basePackageClasses = HelloController.class)
public class MasteringSpringMvc4Application {
//	@Autowired
//	private ErrorAttributes errorAttributes;
//
//	@Bean
//	public BasicErrorController basicErrorController(){
//		return new BasicErrorController(errorAttributes, null);
//	}

	public static void main(String[] args) {
		SpringApplication.run(MasteringSpringMvc4Application.class, args);
	}
}
