package com.lyy.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class LoginController {
	@RequestMapping(value = "/toLogin", method = RequestMethod.GET)
	public String list(Model model) {
		return "login";// WEB-INF/jsp/"list".jsp
	}
}
