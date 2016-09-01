package com.kootour.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.LanguageMstEntity;
import com.kootour.mapper.paramentity.LanguageMstParamEntity;
public interface LanguageMstService {
List<LanguageMstEntity> selectAll();
List<LanguageMstEntity> selectByPK( LanguageMstParamEntity languageMstParamEntity );
List<LanguageMstEntity> selectByCondition( LanguageMstParamEntity languageMstParamEntity );

void insertOne( LanguageMstEntity LanguageMstEntity );

void updateByPK( LanguageMstEntity LanguageMstEntity );

}
