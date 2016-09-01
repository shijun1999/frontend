package com.kootour.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.AccountSummaryEntity;
import com.kootour.mapper.entity.CourseFavoriteVEntity;
import com.kootour.mapper.entity.WishDetailEntity;
public interface AccountSummaryService {
AccountSummaryEntity load(AccountSummaryEntity accountSummaryEntity,Map<String,Object> paraMap);
List<WishDetailEntity> calcMinPrice(List<CourseFavoriteVEntity> courseFavoriteVEntityList, String bgnDate,String endDate); 
List<WishDetailEntity> addCommentInfoToWishDetail(List<WishDetailEntity> WishDetailEntityList) ;


}
