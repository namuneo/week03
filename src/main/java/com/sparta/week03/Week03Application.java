package com.sparta.week03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // spring 한테 우리 JPA 쓸 건데 뭔가 데이터 변동이 있으면 그거 꼬 JPA가 알아서 반영 하도록 해줘 생성/수정 시간이 바뀌 었을 떄 자동으로 업데이트가 된다.
@SpringBootApplication
public class Week03Application {

    public static void main(String[] args) {
        SpringApplication.run(Week03Application.class, args);
    }

}
