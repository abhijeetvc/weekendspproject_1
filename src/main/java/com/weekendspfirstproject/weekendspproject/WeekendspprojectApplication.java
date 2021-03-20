package com.weekendspfirstproject.weekendspproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

//@RestController     // = @Controller + @ResponseBody
//@RequestMapping("/c1")
@SpringBootApplication  // = @Configuration + @EnableAutoConfiguration + @ComponentScan
public class WeekendspprojectApplication {

	public static void main(String[] args) {
         //ConfigurableApplicationContext
		SpringApplication.run(WeekendspprojectApplication.class, args);
	}

//	@GetMapping("/check")    //endpoint
//	public String check(){
//		return "Hello Spring";
//	}
//
//	@GetMapping("/add/{num1}/{num2}")
//	public int getResult(@PathVariable Integer num1,@PathVariable Integer num2){
//		return num1+num2;
//	}
//
//	@PostMapping("/employee")
//	public String getEmployee(@RequestBody Employee employee){
//		System.out.println("Name: "+employee.getName());
//		System.out.println("City: "+employee.getCity());
//		System.out.println("Salary: "+employee.getSalary());
//		return "Data saved";
//	}
}

//class Employee{
//	private String name;
//	private String city;
//	private Double salary;
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getCity() {
//		return city;
//	}
//
//	public void setCity(String city) {
//		this.city = city;
//	}
//
//	public Double getSalary() {
//		return salary;
//	}
//
//	public void setSalary(Double salary) {
//		this.salary = salary;
//	}
//}

// mvnw spring-boot:run