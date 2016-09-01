package com.kootour.service.impl;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import com.kootour.service.ReviewConfirmService;
import com.kootour.mapper.entity.ReviewConfirmEntity;
import freemarker.core.Environment;
@Configuration
@Service
public class ReviewConfirmServiceImpl implements ReviewConfirmService {
	@Override
	public ReviewConfirmEntity okExit(ReviewConfirmEntity reviewConfirmEntity, Map<String, Object> paraMap) {
		ReviewConfirmEntity rtnResult = new ReviewConfirmEntity();
		// Write logic here !!!
		return (rtnResult);
	}
	@Override
	public ReviewConfirmEntity back(ReviewConfirmEntity reviewConfirmEntity, Map<String, Object> paraMap) {
		ReviewConfirmEntity rtnResult = new ReviewConfirmEntity();
		// Write logic here !!!
		return (rtnResult);
	}
	@Override
	public ReviewConfirmEntity load(ReviewConfirmEntity reviewConfirmEntity, Map<String, Object> paraMap) {
		ReviewConfirmEntity rtnResult = new ReviewConfirmEntity();
		// Write logic here !!!
		return (rtnResult);
	}
	@Override
	public ReviewConfirmEntity reviewDetail(ReviewConfirmEntity reviewConfirmEntity, Map<String, Object> paraMap) {
		ReviewConfirmEntity rtnResult = new ReviewConfirmEntity();
		// Write logic here !!!
		return (rtnResult);
	}
}
