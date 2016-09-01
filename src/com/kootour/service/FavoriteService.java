package com.kootour.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.kootour.mapper.entity.CourseDetailEntity;
import com.kootour.mapper.entity.FavoriteEntity;
import com.kootour.mapper.paramentity.FavoriteParamEntity;
public interface FavoriteService {
	FavoriteEntity save(FavoriteEntity favoriteEntity,Map<String,Object> paraMap);
}
