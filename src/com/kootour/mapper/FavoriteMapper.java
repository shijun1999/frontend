package com.kootour.mapper;

import java.util.Date;
import java.util.List;
import com.kootour.mapper.entity.FavoriteEntity;
import com.kootour.mapper.paramentity.FavoriteParamEntity;
public interface FavoriteMapper {
List<FavoriteEntity> selectAll();
List<FavoriteEntity> selectByPK( FavoriteParamEntity favoriteParamEntity );
    List<FavoriteEntity> selectByCondition( FavoriteParamEntity favoriteParamEntity );

void insertOne( FavoriteEntity favoriteEntity );

void updateByPK( FavoriteEntity favoriteEntity );

int selectCountByCondition(FavoriteParamEntity favoriteParamEntity );
}
