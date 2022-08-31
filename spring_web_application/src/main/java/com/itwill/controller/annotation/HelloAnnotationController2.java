package com.itwill.controller.annotation;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloAnnotationController2 {
	public HelloAnnotationController2() {
		System.out.println("생성자 호출");
	}
	@RequestMapping
	public String hello2(HttpServletRequest request) {
		System.out.println("메소드 호출");
		request.setAttribute("msg", "helloAconntationController안녕");
		return "forward:/WEB-INF/views/hello2.jsp";
	
	}
}
