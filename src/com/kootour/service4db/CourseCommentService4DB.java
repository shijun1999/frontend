package com.kootour.service4db;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.CourseCommentEntity;
import com.kootour.mapper.paramentity.CourseCommentParamEntity;

public interface CourseCommentService4DB {

	List<CourseCommentEntity> selectAll();

	List<CourseCommentEntity> selectByPK(CourseCommentParamEntity courseCommentParamEntity);

	List<CourseCommentEntity> selectByCondition(CourseCommentParamEntity courseCommentParamEntity);

	void insertOne(CourseCommentEntity CourseCommentEntity);

	void updateByPK(CourseCommentEntity CourseCommentEntity);

	int selectCountByCondition(CourseCommentParamEntity courseCommentParamEntity);
}
