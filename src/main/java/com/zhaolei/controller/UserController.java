package com.zhaolei.controller;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhaolei.model.User;
import com.zhaolei.service.UserService;
import com.zhaolei.util.DataUtil;

@Controller
@RequestMapping("user")
public class UserController {

	@Resource
	private UserService us;

	@RequestMapping("toreg")
	public String toreg() {

		return "reg";
	}

	@RequestMapping("reg")
	public String reg(@Valid User user, BindingResult br, HttpSession session) {
		System.out.println(user);
		if (br.hasErrors()) {
			System.out.println(23232);
			return "forward:/user/toreg";
		}
		user.setRegDate(new Date());
		user.setPassword(DataUtil.MD5(user.getPassword()));
		us.save(user);
		session.setAttribute("loginuser", user);
		return "forward:/index.jsp";
	}
}
