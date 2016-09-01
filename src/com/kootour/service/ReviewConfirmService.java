package com.kootour.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.ReviewConfirmEntity;
public interface ReviewConfirmService {
	ReviewConfirmEntity okExit(ReviewConfirmEntity reviewConfirmEntity, Map<String, Object> paraMap);
	ReviewConfirmEntity back(ReviewConfirmEntity reviewConfirmEntity, Map<String, Object> paraMap);
	ReviewConfirmEntity load(ReviewConfirmEntity reviewConfirmEntity, Map<String, Object> paraMap);
	ReviewConfirmEntity reviewDetail(ReviewConfirmEntity reviewConfirmEntity, Map<String, Object> paraMap);
}
