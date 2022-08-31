package com.itwill.controller.annotation;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringModelController {
	@RequestMapping("/model_request.do")
	public String request(HttpServletRequest request) {
		request.setAttribute("req", "리퀘스트데이터");
		return "forward:/WEB-INF/views/spring_model.jsp";
	}
	public String model(Model model) {
		model.addAttribute("model","모델데이터");
		return "forward:/WEB-INF/views/spring_model.jsp";
	}
	
}












