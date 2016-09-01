package com.kootour.service4db;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.CourseDiscountEntity;
import com.kootour.mapper.paramentity.CourseDiscountParamEntity;
public interface CourseDiscountService4DB {
List<CourseDiscountEntity> selectAll();
List<CourseDiscountEntity> selectByPK( CourseDiscountParamEntity courseDiscountParamEntity );
List<CourseDiscountEntity> selectByCondition( CourseDiscountParamEntity courseDiscountParamEntity );

void insertOne( CourseDiscountEntity CourseDiscountEntity );

void updateByPK( CourseDiscountEntity CourseDiscountEntity );


}
