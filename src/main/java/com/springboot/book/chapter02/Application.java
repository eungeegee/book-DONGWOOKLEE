package com.springboot.book.chapter02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // JPA auditing 활성화
@SpringBootApplication // 스프링부트 프래임워크의 최상단을 나타냄 @SpringBootApplication 이하 부터 설정을 읽어나가기 때문에 최상단 클래스에 어노테이션 추가
public class Application { // 메인 클래스(최상단클래스)
  public static void main(String[] args) { // 메인함수를 담는다
    // SpringApplication.run 으로 내장 WAS(web application server) 실행
    // 내장 WAS 는 톰캣없이 스프링부트로 만들어진 Jar(실행가능한 java 실행파일)로 실행
    SpringApplication.run(Application.class, args);
  }
}
