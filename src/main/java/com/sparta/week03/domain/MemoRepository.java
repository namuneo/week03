package com.sparta.week03.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// JpaRepository를 상속해 findall, delete, findBuId등등 사용하겠다.
public interface MemoRepository extends JpaRepository<Memo, Long> { // JpaRepository<클래스, Id 타입>
    List<Memo> findAllByOrderByModifiedAtDesc();
    // findAll By OrderBy ModifiedAt Desc()
    // OrderBy는 정리를 해달라
    // ModifiedAt을 기준으로
    // Desc 내림차순으로 즉 최신으로
}
