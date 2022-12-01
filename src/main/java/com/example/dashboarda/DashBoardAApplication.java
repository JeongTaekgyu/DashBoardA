package com.example.dashboarda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // Spring Data JPA에서 시간에 대해서 자동으로 값을 넣어주는 기능이다.
@SpringBootApplication
public class DashBoardAApplication {

    public static void main(String[] args) {
        SpringApplication.run(DashBoardAApplication.class, args);
    }

}
