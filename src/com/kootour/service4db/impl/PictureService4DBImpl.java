package com.kootour.service4db.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import com.kootour.mapper.PictureMapper;
import com.kootour.service4db.PictureService4DB;
import com.kootour.mapper.entity.PictureEntity;
import com.kootour.mapper.paramentity.PictureParamEntity;
import com.kootour.mapper.SequenceMapper;

@Configuration
@Service
public class PictureService4DBImpl implements PictureService4DB  {
	@Autowired
	private PictureMapper pictureMapper;
	@Autowired
	private SequenceMapper sequenceMapper;


	@Override
	public List<PictureEntity> selectAll() {
		List<PictureEntity> lstPictureEntity = new ArrayList<PictureEntity>();
		lstPictureEntity = pictureMapper.selectAll();
		return lstPictureEntity;
	}

	@Override
	public List<PictureEntity> selectByPK(PictureParamEntity tParamEntity) {
		List<PictureEntity> lstPictureEntity = new ArrayList<PictureEntity>();

		lstPictureEntity = pictureMapper.selectByPK(tParamEntity);
		return lstPictureEntity;
	}

	@Override
	public List<PictureEntity> selectByCondition(PictureParamEntity tParamEntity) {
		List<PictureEntity> lstPictureEntity = new ArrayList<PictureEntity>();

		lstPictureEntity = pictureMapper.selectByCondition(tParamEntity);
		return lstPictureEntity;
	}

	@Override
	public void insertOne(PictureEntity pictureEntity) {

		pictureMapper.insertOne(pictureEntity);
	}

	@Override
	public void updateByPK(PictureEntity pictureEntity) {

		pictureMapper.updateByPK(pictureEntity);
	}


}
