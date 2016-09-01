package com.kootour.service4db;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.kootour.mapper.entity.CourseDetailEntity;
import com.kootour.mapper.entity.FavoriteEntity;
import com.kootour.mapper.paramentity.FavoriteParamEntity;
public interface FavoriteService4DB {
List<FavoriteEntity> selectAll();
List<FavoriteEntity> selectByPK( FavoriteParamEntity favoriteParamEntity );
List<FavoriteEntity> selectByCondition( FavoriteParamEntity favoriteParamEntity );

void insertOne( FavoriteEntity FavoriteEntity );

void updateByPK( FavoriteEntity FavoriteEntity );
int selectCountByCondition( FavoriteParamEntity favoriteParamEntity );

}
