package com.sparta.week03.service;

import com.sparta.week03.domain.Memo;
import com.sparta.week03.domain.MemoRepository;
import com.sparta.week03.domain.MemoRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor // final로 선언된 변수가 있으면 생성 할 때 무조건 넣어준다.
@Service // Spring에 Service인 것을 알려줌
public class MemoService {
    // 꼭 필요한 정보기 떄문에 final 사용
    private final MemoRepository memoRepository; // 필요한 정보(username, contents) 찾기 업데이트 할 내용을 멤버 변수로 선언

    @Transactional // 업데이트를 할 때 DB에 꼭 반영이 되야 한다고 알려주는 역할
    public Long update(Long id, MemoRequestDto requestDto) { // 어떤 id가진 내용을 변경할지, 변경할 내용 Dto가 들고 다닌다.
        Memo memo = memoRepository.findById(id).orElseThrow( // findById -> 아이디로 찾고 orElseThrow -> 아이디가 존재하지 않을 경우
                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
                // NullPointerException 가리키는 값이 없다.
                // IllegalArgumentException 매개변수가 잘못 되었다.
        );
        memo.update(requestDto);
        return memo.getId();
    }
}
