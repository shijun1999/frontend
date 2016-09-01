package com.kootour.mapper;

import java.util.Date;
import java.util.List;
import com.kootour.mapper.entity.PictureCommentEntity;
import com.kootour.mapper.paramentity.PictureCommentParamEntity;
public interface PictureCommentMapper {
List<PictureCommentEntity> selectAll();
List<PictureCommentEntity> selectByPK( PictureCommentParamEntity pictureCommentParamEntity );
    List<PictureCommentEntity> selectByCondition( PictureCommentParamEntity pictureCommentParamEntity );

void insertOne( PictureCommentEntity pictureCommentEntity );

void updateByPK( PictureCommentEntity pictureCommentEntity );

}
