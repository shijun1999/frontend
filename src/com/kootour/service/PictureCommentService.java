package com.kootour.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.PictureCommentEntity;
import com.kootour.mapper.paramentity.PictureCommentParamEntity;

public interface PictureCommentService {
	PictureCommentEntity clear(PictureCommentEntity pictureCommentEntity, Map<String, Object> paraMap);

	PictureCommentEntity save(PictureCommentEntity pictureCommentEntity, Map<String, Object> paraMap);

	PictureCommentEntity back(PictureCommentEntity pictureCommentEntity, Map<String, Object> paraMap);

	PictureCommentEntity load(PictureCommentEntity pictureCommentEntity, Map<String, Object> paraMap);

}
