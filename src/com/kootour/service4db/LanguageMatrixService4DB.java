package com.kootour.service4db;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.LanguageMatrixEntity;
import com.kootour.mapper.paramentity.LanguageMatrixParamEntity;
public interface LanguageMatrixService4DB {
List<LanguageMatrixEntity> selectAll();
List<LanguageMatrixEntity> selectByPK( LanguageMatrixParamEntity languageMatrixParamEntity );
List<LanguageMatrixEntity> selectByCondition( LanguageMatrixParamEntity languageMatrixParamEntity );

void insertOne( LanguageMatrixEntity LanguageMatrixEntity );

void updateByPK( LanguageMatrixEntity LanguageMatrixEntity );

}
