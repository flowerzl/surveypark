package com.zhaolei.service;

import java.util.List;

import com.zhaolei.model.Survey;

public interface SurveyService {

	void add(Survey survey);

	List<Survey> getALL();
}
