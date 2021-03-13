package com.springboot.book.chapter02Test.web.dto;


import com.springboot.book.chapter02.web.dto.HelloResponseDto;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;



public class HelloResponseDtoTest {

  @Test
  public void lombok_feature_test() {
    // given
    String name = "test";
    int amount = 1000;

    // when
    HelloResponseDto dto = new HelloResponseDto(name, amount);

    // then
    assertThat(dto.getName()).isEqualTo(name); // assertThat 은 assertj 테스트검증메서드
    assertThat(dto.getAmount()).isEqualTo(amount); // 메서드 체이닝도 됨~ isEqualTo()의 인자와 값이 같으면 성
  }
}
