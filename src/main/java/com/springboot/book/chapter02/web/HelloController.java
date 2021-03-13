package com.springboot.book.chapter02.web;

import com.springboot.book.chapter02.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // 1: json 을 반환하는 컨트롤러를 만듬, 이전 @ResponseBody 의 업그레이드판?
public class HelloController {

  // 이전 @RequestMapping(method=RequestMethod.GET) 방식의 업그레이드
  @GetMapping("/hello") // 2: HTTP GET 요청을 받는 API 만듬, HTTP GET 도메인/hello 를 처리
  public String hello() {
    return "hello";
  }

  @GetMapping("/hello/dto")
  public HelloResponseDto helloDto(@RequestParam("name") String name, // @RequestParam : 요청에서 파라미터를 가져옴
                                   @RequestParam("amount") int amount){
    return new HelloResponseDto(name, amount);
  }
}
