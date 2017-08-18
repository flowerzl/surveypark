package com.zhaolei.controller;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
	public String reg(@Valid User user, BindingResult br, HttpSession session, ModelMap model) {

		if (br.hasErrors()) {
			return "forward:/user/toreg";
		}
		if (us.getOne(user.getName()) != null) {
			model.put("error", "用户名存在");
			return "forward:/user/toreg";
		}

		user.setRegDate(new Date());
		user.setPassword(DataUtil.MD5(user.getPassword()));
		us.save(user);
		session.setAttribute("loginuser", user);
		return "forward:/index.jsp";
	}

	@RequestMapping("login")
	public String login(User user, HttpSession session, ModelMap model) {

		String password = DataUtil.MD5(user.getPassword());
		if (us.getOne(user.getName()) == null || !us.getOne(user.getName()).getPassword().equals(password)) {
			model.put("error", "用户名或密码不正确");
			model.put("user", user);
			return "forward:/login.jsp";
		}

		session.setAttribute("loginuser", user);
		return "forward:/index.jsp";
	}

	@RequestMapping("logout")
	public String login(HttpSession session) {
		session.removeAttribute("loginuser");
		return "forward:/index.jsp";
	}
}
