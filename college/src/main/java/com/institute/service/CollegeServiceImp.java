package com.institute.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.institute.bean.CollegeBean;
import com.institute.entity.CollegeEntity;
import com.institute.repository.CollegeRepository;
@Service
public class CollegeServiceImp implements CollegeService{
	private static Logger log=LoggerFactory.getLogger(CollegeServiceImp.class.getSimpleName());
	@Autowired
	private CollegeRepository collegeRepository;
	@Override
	public void save(CollegeBean collegeBean) {
		CollegeEntity entity=new CollegeEntity();
		entity.setCode(collegeBean.getCode());
		entity.setCount(collegeBean.getCount());
		entity.setFaculty(collegeBean.getFaculty());
		entity.setName(collegeBean.getName());
		collegeRepository.save(entity);
		log.info("College details saved ",collegeBean);
	}

}
