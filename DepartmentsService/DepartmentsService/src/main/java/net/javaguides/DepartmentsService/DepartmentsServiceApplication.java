package net.javaguides.DepartmentsService;

import net.javaguides.DepartmentsService.Mapper.DepartmentsMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@EnableDiscoveryClient
public class DepartmentsServiceApplication {

	@Bean
	public DepartmentsMapper modelMapper()
	{
		return new DepartmentsMapper();
	}
	public static void main(String[] args) {
		SpringApplication.run(DepartmentsServiceApplication.class, args);
	}

}
