package com.springboot.book.chapter02.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter // 선언된 모든 필드의 GET 메서드 생성
@RequiredArgsConstructor // 선언된 모든 final 필드가 포함된 생성자 생성, final 이 없는 필드는 생성자에 포함안함
public class HelloResponseDto {

  private final String name;
  private final int amount;

}
