package com.springboot.book.chapter02.web;

import com.springboot.book.chapter02.service.PostsService;

import com.springboot.book.chapter02.web.dto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model; // 서버 템플릿엔진에서 사용할수 있는 객체를 저장할 수 있음
import org.springframework.web.bind.annotation.PathVariable;
// postsService.findAllDesc()로 가져온 결과를 posts 로 index.mustache 에 전달

@RequiredArgsConstructor
@Controller
public class IndexController {

  private final PostsService postsService;

  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("posts", postsService.findAllDesc());
    return "index"; // 머스태쉬가 자동 반응하기 때문에 resource/index.mustache 가 반환된다
  }

  @GetMapping("/posts/save")
  public String postsSave() {
    return "posts-save"; // 템플릿 폴더의 posts-save.mustache 를 응답함
  }

  @GetMapping("/posts/update/{id}")
  public String postsUpdate(@PathVariable Long id, Model model) {
    PostsResponseDto dto = postsService.findById(id);
    model.addAttribute("post", dto);
    return "posts-update";
  }
}