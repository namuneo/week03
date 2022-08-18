package com.sparta.week03.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter // createdAt과 modifiedAt이 private 클래스 이기 떄문에 @Getter 필수
@MappedSuperclass // Entity가 createdA과 modifiedAt을 자동으로 컬럼으로 인식합니다.
@EntityListeners(AuditingEntityListener.class) // 생성/변경 시간을 자동으로 업데이트합니다.
public abstract class Timestamped { // abstract는 상속이 되어야지만 사용할 수 있는 클래스

    @CreatedDate
    private LocalDateTime createdAt; // LocalDateTime은 시간을 나타내는 자료형

    @LastModifiedDate
    private LocalDateTime modifiedAt;
}
