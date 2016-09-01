package com.kootour.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.kootour.common.ErrorInfo;
import com.kootour.common.KooConst;
import com.kootour.exception.BusinessException;
import com.kootour.exception.SystemException;
import com.kootour.mapper.UserOrderMapper;
import com.kootour.mapper.entity.UserOrderEntity;
import com.kootour.mapper.paramentity.UserOrderParamEntity;
import com.kootour.service.TestDBUserOrderService;

@Configuration
@Service
public class TestDBUserOrderServiceImpl implements TestDBUserOrderService {
	@Autowired
	private UserOrderMapper userOrderMapper;
	@Override
	public List<ErrorInfo> testSelectByPK() throws BusinessException, SystemException {

		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		ErrorInfo tErrorInfo = new ErrorInfo();
		UserOrderParamEntity userOrderParamEntity = new UserOrderParamEntity();
		List<UserOrderEntity> allUserOrderEntityList = userOrderMapper.selectAll();

		if (allUserOrderEntityList.size() > 0) {
//Test selectByPK 0件
			userOrderParamEntity.setLangId(allUserOrderEntityList.get(0).getLangId());
			userOrderParamEntity.setOrderIdentiNo("");

			try {

				List<UserOrderEntity> userOrderEntityList = userOrderMapper.selectByPK(userOrderParamEntity);

				if (userOrderEntityList.size() == 0) {
					tErrorInfo.setItemName("userOrderMapper.selectByPK");
					tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
					tErrorInfo.setErrMsg("検索が成功します。" + userOrderEntityList.size() + "件");
					tErrorInfo.setDispOrder(1);

					// throw new BusinessException();
				} else {
					tErrorInfo.setItemName("userOrderMapper.selectByPK");
					tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
					tErrorInfo.setErrMsg("検索が成功します。");
					tErrorInfo.setDispOrder(1);
				}

			} catch (Exception e) {

				tErrorInfo.setItemName("userOrderMapper.selectByPK");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setErrMsg("データベースの異常か存在します。");
				tErrorInfo.setDispOrder(1);
			}

			tList.add(tErrorInfo);
//Test selectByPK 1件
			userOrderParamEntity.setLangId(allUserOrderEntityList.get(0).getLangId());
			userOrderParamEntity.setOrderIdentiNo(allUserOrderEntityList.get(0).getOrderIdentiNo());

			tErrorInfo = new ErrorInfo();
			try {

				List<UserOrderEntity> userOrderEntityList = userOrderMapper.selectByPK(userOrderParamEntity);

				if (userOrderEntityList.size() == 0) {
					tErrorInfo.setItemName("userOrderMapper.selectByPK");
					tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
					tErrorInfo.setErrMsg("データか存在しない。");
					tErrorInfo.setDispOrder(1);

					// throw new BusinessException();
				} else {

					tErrorInfo.setItemName("userOrderMapper.selectByPK:" + userOrderEntityList.size() + "件");
					tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
					tErrorInfo.setErrMsg("検索が成功します。" + userOrderEntityList.size() + "件");
					tErrorInfo.setDispOrder(1);
				}

			} catch (Exception e) {

				tErrorInfo.setItemName("userOrderMapper.selectByPK");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setErrMsg("データベースの異常か存在します。");
				tErrorInfo.setDispOrder(1);
			}

			tList.add(tErrorInfo);

			
			
		}

		return tList;
	}

	@Override
	public List<ErrorInfo> testSelectAll() throws BusinessException, SystemException {

		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		ErrorInfo tErrorInfo = new ErrorInfo();

		try {

			List<UserOrderEntity> userOrderEntityList = userOrderMapper.selectAll();

			if (userOrderEntityList.size() == 0) {
				tErrorInfo.setItemName("userOrderMapper.selectByPK");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setErrMsg("データか存在しない。");
				tErrorInfo.setDispOrder(1);
			} else {

				tErrorInfo.setItemName("userOrderMapper.selectByPK");
				tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
				tErrorInfo.setErrMsg("検索が成功します。");
				tErrorInfo.setDispOrder(1);
			}

		} catch (Exception e) {

			tErrorInfo.setItemName("userOrderMapper.selectByPK");
			tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
			tErrorInfo.setErrMsg("データベースの異常か存在します。");
			tErrorInfo.setDispOrder(1);
		}
		tList.add(tErrorInfo);
		return tList;
	}

	@Override
	public List<ErrorInfo> testInsertOne() throws BusinessException, SystemException {

		List<ErrorInfo> tList = new ArrayList<ErrorInfo>();
		ErrorInfo tErrorInfo = new ErrorInfo();
		UserOrderParamEntity userOrderParamEntity = new UserOrderParamEntity();
		List<UserOrderEntity> allUserOrderEntityList = userOrderMapper.selectAll();

		if (allUserOrderEntityList.size() > 0) {
//Test selectByPK 0件
			UserOrderEntity userOrderEntity = new UserOrderEntity();
			try {

				userOrderMapper.insertOne(userOrderEntity);
					tErrorInfo.setItemName("userOrderMapper.selectByPK");
					tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
					tErrorInfo.setErrMsg("検索が成功します。");
					tErrorInfo.setDispOrder(1);


			} catch (Exception e) {

				tErrorInfo.setItemName("userOrderMapper.selectByPK");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setErrMsg("データベースの異常か存在します。");
				tErrorInfo.setDispOrder(1);
			}

			tList.add(tErrorInfo);
//Test selectByPK 1件
			userOrderParamEntity.setLangId(allUserOrderEntityList.get(0).getLangId());
			userOrderParamEntity.setOrderIdentiNo(allUserOrderEntityList.get(0).getOrderIdentiNo());

			tErrorInfo = new ErrorInfo();
			try {

				List<UserOrderEntity> userOrderEntityList = userOrderMapper.selectByPK(userOrderParamEntity);

				if (userOrderEntityList.size() == 0) {
					tErrorInfo.setItemName("userOrderMapper.selectByPK");
					tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
					tErrorInfo.setErrMsg("データか存在しない。");
					tErrorInfo.setDispOrder(1);

					// throw new BusinessException();
				} else {

					tErrorInfo.setItemName("userOrderMapper.selectByPK:" + userOrderEntityList.size() + "件");
					tErrorInfo.setErrKbn(KooConst.INT_INFO_KBN);
					tErrorInfo.setErrMsg("検索が成功します。" + userOrderEntityList.size() + "件");
					tErrorInfo.setDispOrder(1);
				}

			} catch (Exception e) {

				tErrorInfo.setItemName("userOrderMapper.selectByPK");
				tErrorInfo.setErrKbn(KooConst.INT_ERROR_KBN);
				tErrorInfo.setErrMsg("データベースの異常か存在します。");
				tErrorInfo.setDispOrder(1);
			}

			tList.add(tErrorInfo);

			
			
		}

		return tList;
	}	
}
