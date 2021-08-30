package info.jongwoo.Boot_pj_01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("info.jongwoo.Boot_pj_01.dao")
@SpringBootApplication
public class BootPj01Application {

	public static void main(String[] args) {
		SpringApplication.run(BootPj01Application.class, args);
	}

}
