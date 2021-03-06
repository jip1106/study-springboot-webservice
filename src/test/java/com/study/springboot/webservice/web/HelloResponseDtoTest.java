package com.study.springboot.webservice.web;

import com.study.springboot.webservice.web.dto.HelloResponseDto;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트() {
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
        assertThat(dto.getName()).isEqualTo(name);          //1,2
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}

/*
1. assertTaht
 - assertj라는 테스트 검증 라이브러리의 검증 메소드.
 - 검증하고 싶은 대상을 메소드의 인자로 받는다.
 - 메소드체이닝이 지원되어 isEqualTo 와 같이 메소드를 이어서 사용 할 수 있다.

2. isEqualTo
 - assertj의 동등 비교 메소드
 - assertTaht에 있는 값과 isEqualTo의 값을 비교해서 같을때만 성공.
 */
