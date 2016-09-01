package com.kootour.service.impl;

import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.*;
import com.kootour.mapper.paramentity.ExtraOptionParamEntity;
import com.kootour.mapper.paramentity.ScheduleOptionParamEntity;
import com.kootour.model.CourseDetailModel;
import com.kootour.service.BookSummaryService;
import com.kootour.service.CommonService;
import com.kootour.service.PaymentService;
import com.kootour.service4db.ExtraOptionService4DB;
import com.kootour.service4db.ScheduleOptionService4DB;
import com.kootour.service4db.SequenceService4DB;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Configuration
@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired(required = false)
	private ExtraOptionService4DB extraOptionService4DB;

	@Autowired(required = false)
	private ScheduleOptionService4DB scheduleOptionService4DB;

	@Autowired(required = false)
	private SequenceService4DB sequenceService4DB;

	@Autowired(required = false)
	private CommonService commonService = new CommonServiceImpl();

	private static Logger logger = Logger.getLogger(CourseDetailServiceImpl.class);

	@Override
	public BookSummaryEntity load(BookSummaryEntity bookSummaryEntity, Map<String, Object> paraMap) {
		BookSummaryEntity rtnResult = new BookSummaryEntity();
		rtnResult = bookSummaryEntity;
		CourseDetailModel preCourseDetailModel = (CourseDetailModel) paraMap.get(KooConst.ST_COURSE_DETAIL);
		UserOrderEntity userOrderEntity = new UserOrderEntity();
		userOrderEntity.setLocalhostFullName(preCourseDetailModel.getLocalhostFullNameDisp());
		userOrderEntity.setCourseFullName(preCourseDetailModel.getFullName());
		if (preCourseDetailModel.getCoursePictureListDisp() != null
				&& preCourseDetailModel.getCoursePictureListDisp().size() > 0) {
			userOrderEntity.setCoursePicture(preCourseDetailModel.getCoursePictureListDisp().get(0).getFullPath());
		}
		String tDate = KooUtil.convertDate2Yyyymmdd(preCourseDetailModel.getReservationDate());
		userOrderEntity.setOrderDate(tDate);
		userOrderEntity.setLocation(preCourseDetailModel.getTourLocation());
		userOrderEntity.setBgnTime(preCourseDetailModel.getBgnTime());
		userOrderEntity.setTouristNum(Integer.parseInt(preCourseDetailModel.getTouristNum()));

		userOrderEntity.setPersonOrGroup(preCourseDetailModel.getPersonOrGroup());
		
		userOrderEntity.setBgnTime(preCourseDetailModel.getBgnTime() + " - 12:30");

		userOrderEntity.setCourseIdentiNo(preCourseDetailModel.getCourseIdentiNo());
		userOrderEntity.setLocalhostIdentiNo((preCourseDetailModel.getLocalhostIdentiNo()));
		String[] tExtraOptionIDs = preCourseDetailModel.getExtraOptionIDs().split(",");
		List<ExtraOptionEntity> extraOptionList = new ArrayList<>();
		ExtraOptionParamEntity extraOptionParamEntity = new ExtraOptionParamEntity();
		for (String tStr : tExtraOptionIDs) {
			extraOptionParamEntity.setLangId(preCourseDetailModel.getLangId());
			extraOptionParamEntity.setExtraOptionIdentiNo(tStr);
			List<ExtraOptionEntity> tExtraOptionList = extraOptionService4DB.selectByPK(extraOptionParamEntity);
			extraOptionList.addAll(tExtraOptionList);
		}
		List<UserOrderExtraOptionEntity> userOrderExtraOptionEntityList= new ArrayList<>();
		
		for(ExtraOptionEntity t : extraOptionList){
			UserOrderExtraOptionEntity tUserOrderExtraOptionEntity= new UserOrderExtraOptionEntity();
			tUserOrderExtraOptionEntity.setLangId(t.getLangId());
			tUserOrderExtraOptionEntity.setExtraOptionIdentiNo(t.getExtraOptionIdentiNo());
			tUserOrderExtraOptionEntity.setCourseIdentiNo(t.getCourseIdentiNo());
			tUserOrderExtraOptionEntity.setDispOrder(t.getDispOrder());
			tUserOrderExtraOptionEntity.setExtraOptionName(t.getExtraOptionName());
			tUserOrderExtraOptionEntity.setExtraPrice(t.getExtraPrice());
			tUserOrderExtraOptionEntity.setExtraTime(t.getExtraTime());
			tUserOrderExtraOptionEntity.setExtraUnit(t.getExtraUnit());
			tUserOrderExtraOptionEntity.setDelFlg(t.getDelFlg());
			userOrderExtraOptionEntityList.add(tUserOrderExtraOptionEntity);
		}
		userOrderEntity.setUserOrderExtraOptionEntityList(userOrderExtraOptionEntityList);
		
		ScheduleOptionEntity tScheduleOptionEntity=new ScheduleOptionEntity();
		ScheduleOptionParamEntity scheduleOptionParamEntity = new ScheduleOptionParamEntity(); 
		scheduleOptionParamEntity.setLangId(preCourseDetailModel.getLangId());
		scheduleOptionParamEntity.setCourseIdentiNo(preCourseDetailModel.getCourseIdentiNo());
		List<ScheduleOptionEntity> ScheduleOptionEntityList = scheduleOptionService4DB
				.selectByCondition(scheduleOptionParamEntity);
    	Double tTax=0.10;
        if (ScheduleOptionEntityList!=null && ScheduleOptionEntityList.size()>0){
        	tScheduleOptionEntity=ScheduleOptionEntityList.get(0);
            userOrderEntity.setScheduleOptionIdentiNo(tScheduleOptionEntity.getScheduleOptionIdentiNo());
        	Double tSubTotal = commonService.calcSubTotalMoney(userOrderEntity, tScheduleOptionEntity);
        	Double tExtraTotal= commonService.calcExtraMoney(userOrderEntity, tScheduleOptionEntity);
        	Double tTotal=tSubTotal+tExtraTotal;
    		userOrderEntity.setTotalMoney(tTotal);
    		userOrderEntity.setPaidMoney(tTotal+tTotal*tTax);
        }
		userOrderEntity.setTaxVal(tTax);

		rtnResult.setUserOrder(userOrderEntity);

		rtnResult.setExtraOptionList(extraOptionList);
		return (rtnResult);
	}
}
