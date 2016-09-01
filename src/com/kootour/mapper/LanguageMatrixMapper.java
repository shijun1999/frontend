package com.kootour.mapper;

import java.util.Date;
import java.util.List;
import com.kootour.mapper.entity.LanguageMatrixEntity;
import com.kootour.mapper.paramentity.LanguageMatrixParamEntity;
public interface LanguageMatrixMapper {
List<LanguageMatrixEntity> selectAll();
List<LanguageMatrixEntity> selectByPK( LanguageMatrixParamEntity languageMatrixParamEntity );
    List<LanguageMatrixEntity> selectByCondition( LanguageMatrixParamEntity languageMatrixParamEntity );

void insertOne( LanguageMatrixEntity languageMatrixEntity );

void updateByPK( LanguageMatrixEntity languageMatrixEntity );

}
