package com.kootour.mapper;

import java.util.Date;
import java.util.List;
import com.kootour.mapper.entity.CourseCommentEntity;
import com.kootour.mapper.paramentity.CourseCommentParamEntity;
public interface CourseCommentMapper {
List<CourseCommentEntity> selectAll();
List<CourseCommentEntity> selectByPK( CourseCommentParamEntity courseCommentParamEntity );
    List<CourseCommentEntity> selectByCondition( CourseCommentParamEntity courseCommentParamEntity );

void insertOne( CourseCommentEntity courseCommentEntity );

void updateByPK( CourseCommentEntity courseCommentEntity );

int selectCountByCondition( CourseCommentParamEntity courseCommentParamEntity );

}
