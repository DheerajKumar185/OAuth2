package com.tech.ssOauth;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tech.ssOauth.models.User;
import com.tech.ssOauth.services.DataService;


/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/api/users")
public class HomeController {

	@Autowired
	DataService dataService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public List<User> list() {
		return dataService.getUserList();

	}
}
