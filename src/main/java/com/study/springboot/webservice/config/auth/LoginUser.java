package com.study.springboot.webservice.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)          //1
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginUser {           //2
}


/*
1. 어느테이션이 생성될 수 있는 위치를 지정
   PARAMETER로 지정 했기 때문에, 메서드의 파리머터로 선언된 객체에서만 사용 가능
   이 외에도 클래스 선언문에 쓸 수 있는 TYPE 등이 있음
   
   
2. 이 파일을 어노테이션 클래스로 지정
   LoginUser라는 이름을 가진 어노테이션이 생성 된 거라고 생각하면 됨

 */