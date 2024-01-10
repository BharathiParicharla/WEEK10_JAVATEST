package com.institute.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.institute.bean.CollegeBean;
import com.institute.service.CollegeService;
import com.institute.service.CollegeServiceImp;

@Controller
public class CourseController {
	private static Logger log = LoggerFactory
			.getLogger(CourseController.class.getSimpleName());
	
	@Autowired
	private CollegeServiceImp collegeService;

	@RequestMapping(path = "/course", method = RequestMethod.GET)
	public ModelAndView collegeEntity(ModelMap map) {
		map.put("bharathi", "Institute");
		CollegeBean collegeEntity = new CollegeBean();
		collegeEntity.setName("bhargavi");
		return new ModelAndView("college", "collegeBean",collegeEntity ).addAllObjects(map);
		
	}

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public ModelAndView createCollege(@ModelAttribute(name = "collegeBean") CollegeBean collegeBean) {
		
		log.info(collegeBean.toString());
		System.out.println(collegeBean);
		collegeService.save(collegeBean);
		return new ModelAndView("success");
	}
}
