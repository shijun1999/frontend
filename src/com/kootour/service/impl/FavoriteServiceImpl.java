package com.kootour.service.impl;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.FavoriteEntity;
import com.kootour.mapper.paramentity.FavoriteParamEntity;
import com.kootour.service.FavoriteService;
import com.kootour.service4db.FavoriteService4DB;
import com.kootour.service4db.SequenceService4DB;

@Configuration
@Service
public class FavoriteServiceImpl implements FavoriteService {
	@Autowired
	private FavoriteService4DB favoriteService4DB;
	@Autowired(required = false)
	private SequenceService4DB sequenceService4DB;
	private static Logger logger = Logger.getLogger(FavoriteServiceImpl.class);

	@Override
	public FavoriteEntity save(FavoriteEntity favoriteEntity, Map<String, Object> paraMap) {

		FavoriteEntity rtnResult = new FavoriteEntity();
		rtnResult=favoriteEntity;
		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();

		if (favoriteEntity.getFavoriteIdentiNo() == null || "".equals(favoriteEntity.getFavoriteIdentiNo())) {

			String strFavoriteIdentiNo = "";
			rtnResult.setLangId(favoriteEntity.getLangId());
			rtnResult.setTouristIdentiNo(favoriteEntity.getTouristIdentiNo());
			rtnResult.setObjType("1");
			rtnResult.setObjIdentiNo(favoriteEntity.getObjIdentiNo());
			rtnResult.setDelFlg(KooConst.ST_NOT_DEL_FLG);
			Date tDate = new Date();
			rtnResult.setOpDate(KooUtil.date2String(tDate, KooConst.ST_yyyyMMdd));;
			rtnResult.setDeleteStatus("0");

			try {

				strFavoriteIdentiNo = sequenceService4DB.createSequence(KooConst.ST_FAVORITE);
				rtnResult.setFavoriteIdentiNo(strFavoriteIdentiNo);
			} catch (Exception e) {

				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM016);
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setErrMsg(KooConst.INFO_MSG_004);
				tErrorInfo.setDispOrder(1);
				tList.add(tErrorInfo);
				paraMap.put(KooConst.ST_ERRORINFO, tList);
				logger.error(KooConst.INFO_MSG_004);
				return (rtnResult);
			}
			try {

				favoriteService4DB.insertOne(rtnResult);
				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM014);
				tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
				tErrorInfo.setErrMsg(KooConst.INFO_MSG_003);
				tErrorInfo.setDispOrder(1);
				tList.add(tErrorInfo);
			} catch (Exception e) {

				ErrorInfo tErrorInfo = new ErrorInfo();
				tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM014 + "[" + favoriteEntity.getLangId() + ","
						+ strFavoriteIdentiNo + "]");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setErrMsg(KooConst.INFO_MSG_005);
				tErrorInfo.setDispOrder(1);
				tList.add(tErrorInfo);
				logger.error(KooConst.INFO_MSG_005);
			}
		} else {
			FavoriteParamEntity favoriteParamEntity = new FavoriteParamEntity();
			favoriteParamEntity.setLangId(favoriteEntity.getLangId());
			favoriteParamEntity.setFavoriteIdentiNo(favoriteEntity.getFavoriteIdentiNo());
			List<FavoriteEntity> favoriteEntityList = favoriteService4DB.selectByPK(favoriteParamEntity);

			if (!favoriteEntityList.isEmpty()) {

				FavoriteEntity favoriteE = favoriteEntityList.get(0);

				favoriteE.setDelFlg(KooConst.ST_DEL_FLG);
				try {

					favoriteService4DB.updateByPK(favoriteE);
					rtnResult.setFavoriteIdentiNo("");
				} catch (Exception e) {

					ErrorInfo tErrorInfo = new ErrorInfo();
					tErrorInfo.setItemName(KooConst.INFO_MSG_PARAM014 + "[" + favoriteEntity.getLangId() + ","
							+ favoriteE.getFavoriteIdentiNo() + "]");
					tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
					tErrorInfo.setErrMsg(KooConst.INFO_MSG_007);
					tErrorInfo.setDispOrder(1);
					tList.add(tErrorInfo);
					logger.error(KooConst.INFO_MSG_007);
				}
			}
		}

		paraMap.put(KooConst.ST_ERRORINFO, tList);
		return (rtnResult);
	}

}
