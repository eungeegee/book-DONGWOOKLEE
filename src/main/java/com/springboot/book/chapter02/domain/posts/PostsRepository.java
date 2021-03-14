package com.springboot.book.chapter02.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

// 테이블(Entity) 클래스와 Repository 인터페이스는 같은 경로에 위치한다
public interface PostsRepository extends JpaRepository<Posts, Long> { // < 테이블클래스, pk 타입 >
  // DB 접근자는 interface 로 생성, CRUD 메서드가 자동 생성됨

  // SpringDataJpa 에서 제공하지 않는 메소드는 @Query 와 함께 로우쿼리 사용
  @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
  List<Posts> findAllDesc();
}
