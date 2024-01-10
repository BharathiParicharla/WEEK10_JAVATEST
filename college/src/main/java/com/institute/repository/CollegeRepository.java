package com.institute.repository;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.institute.entity.CollegeEntity;
@Repository
@Transactional
public class CollegeRepository {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void save(CollegeEntity entity) {
		hibernateTemplate.save(entity);
	}
	
}
