package com.sri.demo.demoapp;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/demo")
public class DemoApplication {

	
	
	@RequestMapping(value="/getdata",method = RequestMethod.GET)
	public String getData(String name,String city) {
		return "Welcome:" + name + ":" + city;
		
	}
	
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    
   
}
