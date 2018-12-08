package com.example.hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class HelloApplication {
	
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/")
	String home() {
	return "Hello World!";
	}
	
	@RequestMapping("/admin")
	String homeadmin(@RequestParam(value="name", defaultValue="World") String name) {
	return "Hello Admin !" + name;
	}
	
/*    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }*/
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		SpringApplication.run(HelloApplication.class, args);
	}
}
