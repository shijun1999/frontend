package com.kootour.service4db.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import com.kootour.mapper.PictureCommentMapper;
import com.kootour.service.PictureCommentService;
import com.kootour.service4db.CourseInExclusionService4DB;
import com.kootour.service4db.PictureCommentService4DB;
import com.kootour.mapper.entity.PictureCommentEntity;
import com.kootour.mapper.paramentity.PictureCommentParamEntity;
import com.kootour.mapper.SequenceMapper;
import freemarker.core.Environment;

@Configuration
@Service
public class PictureCommentService4DBImpl implements PictureCommentService4DB  {
	@Autowired
	private PictureCommentMapper pictureCommentMapper;
	@Autowired
	private SequenceMapper sequenceMapper;


	@Override
	public List<PictureCommentEntity> selectAll() {
		List<PictureCommentEntity> lstPictureCommentEntity = new ArrayList<PictureCommentEntity>();
		lstPictureCommentEntity = pictureCommentMapper.selectAll();
		return lstPictureCommentEntity;
	}

	@Override
	public List<PictureCommentEntity> selectByPK(PictureCommentParamEntity tParamEntity) {
		List<PictureCommentEntity> lstPictureCommentEntity = new ArrayList<PictureCommentEntity>();

		lstPictureCommentEntity = pictureCommentMapper.selectByPK(tParamEntity);
		return lstPictureCommentEntity;
	}

	@Override
	public List<PictureCommentEntity> selectByCondition(PictureCommentParamEntity tParamEntity) {
		List<PictureCommentEntity> lstPictureCommentEntity = new ArrayList<PictureCommentEntity>();

		lstPictureCommentEntity = pictureCommentMapper.selectByCondition(tParamEntity);
		return lstPictureCommentEntity;
	}

	@Override
	public void insertOne(PictureCommentEntity pictureCommentEntity) {

		pictureCommentMapper.insertOne(pictureCommentEntity);
	}

	@Override
	public void updateByPK(PictureCommentEntity pictureCommentEntity) {

		pictureCommentMapper.updateByPK(pictureCommentEntity);
	}

}
