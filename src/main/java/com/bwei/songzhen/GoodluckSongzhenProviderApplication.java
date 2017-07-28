package com.bwei.songzhen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GoodluckSongzhenProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoodluckSongzhenProviderApplication.class, args);
	}
}
