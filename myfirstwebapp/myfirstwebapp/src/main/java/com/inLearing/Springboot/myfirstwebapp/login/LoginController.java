package com.inLearing.Springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.inLearing.Springboot.myfirstwebapp.AthenticationService.AthenticationService;




@Controller
public class LoginController {
	private AthenticationService athenticationService;

	public LoginController(AthenticationService athenticationService) {
		super();
		this.athenticationService = athenticationService;
	}
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String goToLoginGet() {
		return "login";
	}
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String goToLoginPost(@RequestParam String name, @RequestParam String password, ModelMap model) {
		if(athenticationService.athenticate(name, password)) {
		model.put("name", name);
		return "welcome";
		}
		model.put("ErrorMessage", "InValid Credentials ! plaese try again");
		
		return "login";
	}

}
