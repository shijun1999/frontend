package com.kootour.service4db.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import com.kootour.common.KooConst;
import com.kootour.mapper.CourseMapper;
import com.kootour.mapper.SequenceMapper;
import com.kootour.service.CourseService;
import com.kootour.service4db.CourseInExclusionService4DB;
import com.kootour.service4db.SequenceService4DB;
import com.kootour.mapper.entity.CourseEntity;
import com.kootour.mapper.paramentity.CourseParamEntity;
import freemarker.core.Environment;

@Configuration
@Service
public class SequenceService4DBImpl implements SequenceService4DB  {
	@Autowired
	private SequenceMapper sequenceMapper;

	@Override
	public String createSequence(String inSequenceType) {

		String outSequence = "";
		int intVal = 0;
		intVal = sequenceMapper.selectNext(inSequenceType);
		sequenceMapper.updateNext(inSequenceType);
		switch (inSequenceType) {
		case KooConst.ST_COURSE:
			outSequence="AA"+String.format("%09d", intVal);
			break;
			case KooConst.ST_COURSECOMMENT:
			outSequence="AB"+String.format("%09d", intVal);
			break;
			case KooConst.ST_COURSEPICTURE:
			outSequence="AC"+String.format("%09d", intVal);
			break;
			case KooConst.ST_COURSESCHEDULE:
			outSequence="AD"+String.format("%09d", intVal);
			break;
			case KooConst.ST_LOCALHOST:
			outSequence="AE"+String.format("%09d", intVal);
			break;
			case KooConst.ST_LOCATIONMST:
			outSequence="AF"+String.format("%09d", intVal);
			break;
			case KooConst.ST_PICTURE:
			outSequence="AG"+String.format("%09d", intVal);
			break;
			case KooConst.ST_PICTURECOMMENT:
			outSequence="AH"+String.format("%09d", intVal);
			break;
			case KooConst.ST_TOURIST:
			outSequence="AI"+String.format("%09d", intVal);
			break;
			case KooConst.ST_USERORDER:
			outSequence="AJ"+String.format("%09d", intVal);
			break;			
			case KooConst.ST_MESSAGE:
			outSequence="AK"+String.format("%09d", intVal);
			break;		
			case KooConst.ST_FAVORITE:
			outSequence="AL"+String.format("%09d", intVal);
			break;
			case KooConst.ST_COURSE_DISCOUNT:
			outSequence="AM"+String.format("%09d", intVal);
			break;
			case KooConst.ST_COURSE_IN_EXCLUSION:
			outSequence="AN"+String.format("%09d", intVal);
			break;
			case KooConst.ST_KOOTOUR_PROMO:
			outSequence="AO"+String.format("%09d", intVal);
			break;
			case KooConst.ST_SCHEDULE_OPTION:
			outSequence="AP"+String.format("%09d", intVal);
			break;
			case KooConst.ST_EXTRA_OPTION:
			outSequence="AQ"+String.format("%09d", intVal);
			break;
			case KooConst.ST_USER_ORDER_EXTRA_OPTION:
			outSequence="AR"+String.format("%09d", intVal);
			break;
			case KooConst.ST_KOOTOUR_MST:
			outSequence="AS"+String.format("%09d", intVal);
			break;

			case KooConst.ST_DUMMY_TOURIST:
			outSequence="ZZ"+String.format("%09d", intVal);
			break;

		}

		return (outSequence);
	}

}
