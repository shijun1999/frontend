package com.kootour.mapper;

import java.util.Date;
import java.util.List;
import com.kootour.mapper.entity.LanguageMstEntity;
import com.kootour.mapper.paramentity.LanguageMstParamEntity;
public interface LanguageMstMapper {
List<LanguageMstEntity> selectAll();
List<LanguageMstEntity> selectByPK( LanguageMstParamEntity languageMstParamEntity );
    List<LanguageMstEntity> selectByCondition( LanguageMstParamEntity languageMstParamEntity );

void insertOne( LanguageMstEntity languageMstEntity );

void updateByPK( LanguageMstEntity languageMstEntity );

}
