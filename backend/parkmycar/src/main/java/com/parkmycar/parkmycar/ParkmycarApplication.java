package com.parkmycar.parkmycar;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

/**
 * Created by Siddesh on 03/Nov/18.
 */

@SpringBootApplication (exclude = { SecurityAutoConfiguration.class })
public class ParkmycarApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkmycarApplication.class, args);
	}
}
