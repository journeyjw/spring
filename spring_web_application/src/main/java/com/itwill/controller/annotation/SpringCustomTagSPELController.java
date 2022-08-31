package com.itwill.controller.annotation;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itwill.dto.Guest;

@Controller
public class SpringCustomTagSPELController {
	@RequestMapping("/jstl_fmt_i18n.do")
	public String jstl_fmt_i18n() {

		return "forward:/WEB-INF/views/jstl_fmt_i18n.jsp";
		// return "jstl_fmt_i18n";
	}

	@RequestMapping("/spring_customtag_spel.do")
	public String spring_customtag_spel(HttpServletRequest request) {
		request.setAttribute("price0", 234234);
		request.setAttribute("name0", "kim eun hi");
		request.setAttribute("price1", 12345);
		request.setAttribute("name1", "lee hyo lee");
		request.setAttribute("married1", true);
		request.setAttribute("price2", 123123);
		request.setAttribute("name2", "김태희");
		request.setAttribute("married2", false);
		request.setAttribute("guest", new Guest(1, "김수미", "2022/08/31", "guard@gmail.com", "http://www.google.com",
				"오늘은 수요일", "Spring Custom Tag,SPEL에 대해 공부합니다"));

		return "spring_customtag_spel";
	}
	@RequestMapping("/spring_customtag_spel_i18n.do")
	public String spring_customtag_spel_i18n() {
		return "spring_customtag_spel_i18n";
	}
}
