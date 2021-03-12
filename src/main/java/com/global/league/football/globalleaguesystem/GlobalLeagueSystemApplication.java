package com.global.league.football.globalleaguesystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GlobalLeagueSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(GlobalLeagueSystemApplication.class, args);
	}

}
