package com.zhaolei.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhaolei.dao.impl.SurveyDao;
import com.zhaolei.model.Survey;
import com.zhaolei.service.SurveyService;

@Service("ssi")
public class SurveyServiceImpl implements SurveyService {

	@Resource
	private SurveyDao surveyDao;

	@Override
	public void add(Survey s) {
		surveyDao.save(s);
	}

	@Override
	public List<Survey> getALL() {

		return surveyDao.getAll();
	}

}
