package com.sda.imoproject.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sda.imoproject.dao.entity.User;
import com.sda.imoproject.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/createUser", method = RequestMethod.GET)
	public String createUser(@ModelAttribute(value = "user") User user) {
		System.out.println(user.getEmail());
		// acceseaza getAllUsers din userService, din UserService accesezi UserDao cu
		// (userDao.getAllUsers()) care UserDao face leg cu BD
		return "createUser";

	}

	@RequestMapping(value = "/createUser", method = RequestMethod.POST)
	public String saveUser(Model model, @ModelAttribute("user") User user) {
		// salveaza-mi userul
		userService.saveUser(user);

		model.addAttribute("user", user);
		return "registrationSuccess";
	}

	@RequestMapping(value = "/userList", method = RequestMethod.GET)
	public String userList(Model model) {
		model.addAttribute("userList", userService.getAllUsers());
		return "userInfo";
	}

	@RequestMapping(value = "/startPage", method = RequestMethod.GET)
	public String startPage(Model model) {
		return "startPage";
	}

	@RequestMapping(value = "/registrationSuccessful", method = RequestMethod.GET)
	public String registrationSuccess(Model model) {
		return "registrationSuccess";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String succesLogin(Model model, @RequestParam("username") String username,
			@RequestParam("password") String password) {
		if (userService.loginUser(username, password) == true) {
			model.addAttribute("user", userService.getUserByUsername(username));
			return "startPage";
		} else {
			model.addAttribute("user", new User());
			return "createuser";

		}
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginUser() {
		return "login";
	}

	@RequestMapping(value = "/userbyid", method = RequestMethod.GET)
	public String getUserById(Model model, @PathVariable(value = "id") int id) {

		User user = userService.getUserById(id);
		model.addAttribute("userById", user);

		return "startPage";
	}

	@RequestMapping(value = "/deleteUser/{userId}", method = RequestMethod.GET)
	public String delete(Model model, @PathVariable int userId) {
		userService.getUserById(userId);
		User user = userService.getUserById(userId);
		userService.deleteUser(user);

		model.addAttribute("userList", userService.getAllUsers());
		return "userInfo";

	}

	@RequestMapping(value = "/sitePage", method = RequestMethod.GET)
	public String sitePage(Model model) {
		return "sitePage";
	}
	@RequestMapping(value = "/NewFile", method = RequestMethod.GET)
	public String newFile(Model model) {
		return "NewFile";
	}
	// @RequestMapping(value = "/deleteUser/{userId}", method = RequestMethod.GET)
	// public String edit(Model model, @PathVariable int userId) {

}
