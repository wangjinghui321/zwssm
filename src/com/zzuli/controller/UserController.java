package com.zzuli.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zzuli.po.User;
import com.zzuli.service.UserService;

@Controller
public class UserController {
	//×¢Èëservice
	@Autowired
	private UserService userService;
	@RequestMapping("/login")
	public String login(HttpSession session,User user)throws Exception{
		User u = userService.findUser(user);
		if(u!=null){
			String username = u.getUsername();
			session.setAttribute("username", username);
			return "redirect:/index.jsp";
		}
		return "redirect:/login.jsp";
		
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session)throws Exception{
		session.invalidate();
		return "redirect:/login.jsp";
	}
	
	//×¢²á
	@RequestMapping("/regist")
	public String regist(User user)throws Exception{
		userService.insertUser(user);
		return "redirect:login.jsp";
	}
}
