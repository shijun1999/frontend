package com.kootour.service4db;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.CourseFavoriteVEntity;
import com.kootour.mapper.paramentity.CourseFavoriteVParamEntity;
public interface CourseFavoriteVService4DB {
List<CourseFavoriteVEntity> selectByCondition( CourseFavoriteVParamEntity courseFavoriteVParamEntity );
}
