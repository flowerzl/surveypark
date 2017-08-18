package com.zhaolei.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhaolei.model.Survey;
import com.zhaolei.model.User;
import com.zhaolei.service.SurveyService;
import com.zhaolei.service.UserService;

@Controller
@RequestMapping("survey")
public class SurveyController {

	@Resource
	private SurveyService ssi;

	@Resource
	private UserService us;

	@RequestMapping("newsurvey")
	public String newsurvey(Survey survey, HttpSession session) {
		User user;
		if ((user = (User) session.getAttribute("loginuser")) == null) {
			return "forward:/login.jsp";
		}

		survey.setUser(us.getOne(user.getName()));
		survey.setCreateTime(new Date());
		ssi.add(survey);
		return "forward:/index.jsp";
	}

	@ModelAttribute
	public void getModel(ModelMap model) {
		if (!model.containsAttribute("survey")) {
			model.put("survey", new Survey());
		}
	}

	@RequestMapping("tonewsurvey")
	public String tonewsurvey() {
		return "createsurvey";
	}

	@RequestMapping("tomysurvey")
	public String tomynewsurvey(HttpSession session, ModelMap model) {
		User user;
		if ((user = (User) session.getAttribute("loginuser")) == null) {
			return "forward:/login.jsp";
		}

		List<Survey> l = ssi.getALL();
		model.put("surveys", l);
		return "mysurvey";
	}

}
