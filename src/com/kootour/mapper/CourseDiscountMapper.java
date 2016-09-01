package com.kootour.mapper;

import java.util.Date;
import java.util.List;
import com.kootour.mapper.entity.CourseDiscountEntity;
import com.kootour.mapper.paramentity.CourseDiscountParamEntity;
public interface CourseDiscountMapper {
List<CourseDiscountEntity> selectAll();
List<CourseDiscountEntity> selectByPK( CourseDiscountParamEntity courseDiscountParamEntity );
    List<CourseDiscountEntity> selectByCondition( CourseDiscountParamEntity courseDiscountParamEntity );

void insertOne( CourseDiscountEntity courseDiscountEntity );

void updateByPK( CourseDiscountEntity courseDiscountEntity );

}
