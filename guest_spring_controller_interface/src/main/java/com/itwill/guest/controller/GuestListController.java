package com.itwill.guest.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.itwill.guest.Guest;
import com.itwill.guest.GuestService;

public class GuestListController implements Controller {
	private GuestService guestService;
	
	public GuestListController() {
		System.out.println("### GuestListController()생성자 호출");
	}

	public void setGuestService(GuestService guestService) {
		System.out.println("### GuestListController : setGuestService(" + guestService + ") 메쏘드 호출");
		this.guestService = guestService;
	}
	
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ArrayList<Guest> guestList=guestService.selectAll();
		request.setAttribute("guestList", guestList);
		
		ModelAndView mv=new ModelAndView("forward:/WEB-INF/views/guest_list.jsp");
		return mv;
	}
	
}
