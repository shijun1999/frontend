package com.kootour.mapper;

import java.util.Date;
import java.util.List;
import com.kootour.mapper.entity.CourseFavoriteVEntity;
import com.kootour.mapper.paramentity.CourseFavoriteVParamEntity;
public interface CourseFavoriteVMapper {
List<CourseFavoriteVEntity> selectAll();
List<CourseFavoriteVEntity> selectByPK( CourseFavoriteVParamEntity courseFavoriteVParamEntity );
    List<CourseFavoriteVEntity> selectByCondition( CourseFavoriteVParamEntity courseFavoriteVParamEntity );

void insertOne( CourseFavoriteVEntity courseFavoriteVEntity );

void updateByPK( CourseFavoriteVEntity courseFavoriteVEntity );

}
