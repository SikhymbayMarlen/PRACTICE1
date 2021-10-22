package com.example.Sportsmans;

import com.example.Sportsmans.service.SportsmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SportsmansApplication {

    private static SportsmanService service;

    @Autowired
    public void setService(SportsmanService service) {
        this.service = service;
    }

    public static void main(String[] args) {
        SpringApplication.run(SportsmansApplication.class, args);
		service.getAll().forEach(System.out::println);
    }

}
