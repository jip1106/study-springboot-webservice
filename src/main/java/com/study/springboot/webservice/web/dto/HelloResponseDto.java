package com.study.springboot.webservice.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter //1
@RequiredArgsConstructor //2
public class HelloResponseDto {

    private final String name;
    private final int amount;
}

/*
1. 선언된 모든 필드의 get메소드를 생성 해 준다.

2. 선언된 모든 final 필드가 포함된 생성자를 생성 해 준다.
final이 없는 필드는 생성자에 포함 되지 않는다
 */
