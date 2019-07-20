package com.rajnish.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner
{
	public static void main( String[] args )
	{
		SpringApplication.run(App.class, args);

	}

	//access command line arguments
	@Override
	public void run(String... args) throws Exception {

		//do something
		System.out.println("Start Application...");
	}
}
