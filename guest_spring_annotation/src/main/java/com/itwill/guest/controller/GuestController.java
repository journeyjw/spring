package com.itwill.guest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itwill.guest.Guest;
import com.itwill.guest.GuestService;

@Controller
public class GuestController {
	/*

	 * <<요청 url(command)>> 
	 * /guest_main 			---forward--->/WEB-INF/views/guest_main.jsp 
	 * /guest_list 			---forward--->/WEB-INF/views/guest_list.jsp 
	 * /guest_view 			---forward--->/WEB-INF/views/guest_view.jsp
	 * /guest_write_form 	---forward--->/WEB-INF/views/guest_write_form.jsp 
	 * /guest_write_action 	---forward--->/WEB-INF/views/guest_write_action.jsp 
	 * /guest_modify_form 	---forward--->/WEB-INF/views/guest_modify_form.jsp 
	 * /guest_modify_action ---forward--->/WEB-INF/views/guest_modify_action.jsp 
	 * /guest_remove_action ---forward--->/WEB-INF/views/guest_remove_action.jsp 
	 * /guest_error 		---forward--->/WEB-INF/views/guest_error.jsp
	
	 */
	@Autowired
	private GuestService guestService;
	
	public GuestController() {
		System.out.println("### GuestController() 생성자");
	}
	
	@RequestMapping("/guest_main")
	public String guest_main() {
		return "forward:/WEB-INF/views/guest_main.jsp";
	}
	@RequestMapping("/guest_list")
	public String guest_list(Model model) throws Exception {
		List<Guest> guestList= guestService.selectAll();
		model.addAttribute("guestList", guestList);
		return "forward:/WEB-INF/views/guest_list.jsp";
	}
}
















