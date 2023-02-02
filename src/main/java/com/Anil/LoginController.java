package com.Anil;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	@RequestMapping(value = "/", method = RequestMethod.GET) 
	public String home(Model m)
	{
		Login login= new Login();
		m.addAttribute("login",login); 
		return "login";
	}
	@RequestMapping(value="/req1",method=RequestMethod.POST)
	public String printDetails(@ModelAttribute Login login,Model m)
	{
		m.addAttribute("login",login);
		return "result";
	}
}
