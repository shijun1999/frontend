package com.kootour.mapper;

import java.util.Date;
import java.util.List;
import com.kootour.mapper.entity.CoursePictureEntity;
import com.kootour.mapper.paramentity.CoursePictureParamEntity;
public interface CoursePictureMapper {
List<CoursePictureEntity> selectAll();
List<CoursePictureEntity> selectByPK( CoursePictureParamEntity coursePictureParamEntity );
    List<CoursePictureEntity> selectByCondition( CoursePictureParamEntity coursePictureParamEntity );

void insertOne( CoursePictureEntity coursePictureEntity );

void updateByPK( CoursePictureEntity coursePictureEntity );

}
