package com.kootour.service4db;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.PictureCommentEntity;
import com.kootour.mapper.paramentity.PictureCommentParamEntity;

public interface PictureCommentService4DB {

	List<PictureCommentEntity> selectAll();

	List<PictureCommentEntity> selectByPK(PictureCommentParamEntity pictureCommentParamEntity);

	List<PictureCommentEntity> selectByCondition(PictureCommentParamEntity pictureCommentParamEntity);

	void insertOne(PictureCommentEntity PictureCommentEntity);

	void updateByPK(PictureCommentEntity PictureCommentEntity);

}
