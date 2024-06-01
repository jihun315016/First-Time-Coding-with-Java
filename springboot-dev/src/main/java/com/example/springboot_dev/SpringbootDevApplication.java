package com.example.springboot_dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDevApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDevApplication.class, args);
	}

	// 폴더 구조
	// Templates : HTML과 같은 뷰 파일
	// static : js, css, 이미지와 같은 정적 파일
}
