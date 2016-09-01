package com.kootour.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.kootour.mapper.entity.PictureCommentEntity;
import com.kootour.service.PictureCommentService;
import com.kootour.service4db.PictureCommentService4DB;

@Configuration
@Service
public class PictureCommentServiceImpl implements PictureCommentService {
	@Autowired
	private PictureCommentService4DB pictureCommentService4DB;

	@Override
	public PictureCommentEntity clear(PictureCommentEntity pictureCommentEntity, Map<String, Object> paraMap) {
		PictureCommentEntity rtnResult = new PictureCommentEntity();
		// Write logic here !!!
		return (rtnResult);
	}

	@Override
	public PictureCommentEntity save(PictureCommentEntity pictureCommentEntity, Map<String, Object> paraMap) {
		PictureCommentEntity rtnResult = new PictureCommentEntity();
		// Write logic here !!!
		return (rtnResult);
	}

	@Override
	public PictureCommentEntity back(PictureCommentEntity pictureCommentEntity, Map<String, Object> paraMap) {
		PictureCommentEntity rtnResult = new PictureCommentEntity();
		// Write logic here !!!
		return (rtnResult);
	}

	@Override
	public PictureCommentEntity load(PictureCommentEntity pictureCommentEntity, Map<String, Object> paraMap) {
		PictureCommentEntity rtnResult = new PictureCommentEntity();
		// Write logic here !!!
		return (rtnResult);
	}


}
