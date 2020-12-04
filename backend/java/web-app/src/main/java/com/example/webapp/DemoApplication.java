package com.example.webapp;

import com.example.webapp.redis.RedisDao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
		applicationContext.getBean(RedisDao.class).getByAudioList();
	}

}
