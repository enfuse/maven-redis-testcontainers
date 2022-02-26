package com.Bench.Practice1.benchpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.DependsOn;

@SpringBootApplication
@DependsOn("jedisConnectionFactory") //necessary?
public class BenchPracticeApplication {


	public static void main(String[] args) {
		SpringApplication.run(BenchPracticeApplication.class, args);

	}

}
