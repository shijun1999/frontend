package com.kootour.mapper;

import java.util.Date;
import java.util.List;
import com.kootour.mapper.entity.PictureEntity;
import com.kootour.mapper.paramentity.PictureParamEntity;
public interface PictureMapper {
List<PictureEntity> selectAll();
List<PictureEntity> selectByPK( PictureParamEntity pictureParamEntity );
    List<PictureEntity> selectByCondition( PictureParamEntity pictureParamEntity );

void insertOne( PictureEntity pictureEntity );

void updateByPK( PictureEntity pictureEntity );

}
