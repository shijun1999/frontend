package com.kootour.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.CourseCommentEntity;
import com.kootour.mapper.paramentity.CourseCommentParamEntity;

public interface CourseCommentService {

	CourseCommentEntity save(CourseCommentEntity courseCommentEntity, Map<String, Object> paraMap);

	CourseCommentEntity load(CourseCommentEntity courseCommentEntity, Map<String, Object> paraMap);

	CourseCommentEntity edit(CourseCommentEntity courseCommentEntity, Map<String, Object> paraMap);

}
