//Auto Generated 

package com.kootour.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.kootour.common.KooConst;
import com.kootour.common.KooUtil;
import com.kootour.mapper.entity.LocalhostEntity;
import com.kootour.model.LocalhostModel;
import com.kootour.service.LocalhostService;
import com.kootour.service.impl.LocalhostServiceImpl;

public class LocalhostAction extends LocalhostModel {

	@Autowired(required = false)
	private LocalhostService localhostService = new LocalhostServiceImpl();

	public void copyEntity2EntityAction(LocalhostEntity tEntity) {
		this.copyBaseEntity2Model(tEntity);
		if (tEntity.getLangId() == null) {
			setLangId("");
		} else {
			setLangId(tEntity.getLangId());
		}
		if (tEntity.getLocalhostIdentiNo() == null) {
			setLocalhostIdentiNo("");
		} else {
			setLocalhostIdentiNo(tEntity.getLocalhostIdentiNo());
		}
		if (tEntity.getVendorIdentiNo() == null) {
			setVendorIdentiNo("");
		} else {
			setVendorIdentiNo(tEntity.getVendorIdentiNo());
		}
		if (tEntity.getFullName() == null) {
			setFullName("");
		} else {
			setFullName(tEntity.getFullName());
		}
		if (tEntity.getShortName() == null) {
			setShortName("");
		} else {
			setShortName(tEntity.getShortName());
		}
		if (tEntity.getLoginId() == null) {
			setLoginId("");
		} else {
			setLoginId(tEntity.getLoginId());
		}
		if (tEntity.getPassword() == null) {
			setPassword("");
		} else {
			setPassword(tEntity.getPassword());
		}
		if (tEntity.getPostCode() == null) {
			setPostCode("");
		} else {
			setPostCode(tEntity.getPostCode());
		}
		if (tEntity.getState() == null) {
			setState("");
		} else {
			setState(tEntity.getState());
		}
		if (tEntity.getAddr1() == null) {
			setAddr1("");
		} else {
			setAddr1(tEntity.getAddr1());
		}
		if (tEntity.getAddr2() == null) {
			setAddr2("");
		} else {
			setAddr2(tEntity.getAddr2());
		}
		if (tEntity.getAddr3() == null) {
			setAddr3("");
		} else {
			setAddr3(tEntity.getAddr3());
		}
		if (tEntity.getTelCode() == null) {
			setTelCode("");
		} else {
			setTelCode(tEntity.getTelCode());
		}
		if (tEntity.getTelNo() == null) {
			setTelNo("");
		} else {
			setTelNo(tEntity.getTelNo());
		}
		if (tEntity.getEmail() == null) {
			setEmail("");
		} else {
			setEmail(tEntity.getEmail());
		}
		if (tEntity.getPhoto() == null) {
			setPhoto("");
		} else {
			setPhoto(tEntity.getPhoto());
		}
		if (tEntity.getOkFlg() == null) {
			setOkFlg("");
		} else {
			setOkFlg(tEntity.getOkFlg());
		}
		if (tEntity.getUseLangId() == null) {
			setUseLangId("");
		} else {
			setUseLangId(tEntity.getUseLangId());
		}
		if (tEntity.getFirstName() == null) {
			setFirstName("");
		} else {
			setFirstName(tEntity.getFirstName());
		}
		
		if (tEntity.getLastName() == null) {
			setLastName("");
		} else {
			setLastName(tEntity.getLastName());
		}
		if (tEntity.getLoginType() == null) {
			setLoginType("");
		} else {
			setLoginType(tEntity.getLoginType());
		}
		if (tEntity.getMemo() == null) {
			setMemo("");
		} else {
			setMemo(tEntity.getMemo());
		}
		
		if (tEntity.getBankName() == null) {
			setBankName("");
		} else {
			setBankName(tEntity.getBankName());
		}
		if (tEntity.getBankBranch() == null) {
			setBankBranch("");
		} else {
			setBankBranch(tEntity.getBankBranch());
		}
		if (tEntity.getBankAccountNo() == null) {
			setBankAccountNo("");
		} else {
			setBankAccountNo(tEntity.getBankAccountNo());
		}
		if (tEntity.getBankAccountType() == null) {
			setBankAccountType("");
		} else {
			setBankAccountType(tEntity.getBankAccountType());
		}
		if (tEntity.getBankAccountOwner() == null) {
			setBankAccountOwner("");
		} else {
			setBankAccountOwner(tEntity.getBankAccountOwner());
		}
		if (tEntity.getEmailOkFlag() == null) {
			setEmailOkFlag("");
		} else {
			setEmailOkFlag(tEntity.getEmailOkFlag());
		}
		if (tEntity.getPhoneOkFlg() == null) {
			setPhoneOkFlg("");
		} else {
			setPhoneOkFlg(tEntity.getPhoneOkFlg());
		}
		if (tEntity.getDelFlg() == null) {
			setDelFlg("");
		} else {
			setDelFlg(tEntity.getDelFlg());
		}
		if (tEntity.getCreateTime() == null) {
			setCreateTime("");
		} else {
			setCreateTime(KooUtil.date2String(tEntity.getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (tEntity.getModifyTime() == null) {
			setModifyTime("");
		} else {
			setModifyTime(KooUtil.date2String(tEntity.getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
		}

	}

	public LocalhostEntity copyEntityAction2Entity(LocalhostModel tLocalhostModel) {
		LocalhostEntity tEntity = new LocalhostEntity();
		// set common info
		tEntity.setCurTouristIdentiNo(this.getCurTouristIdentiNo());
		tEntity.setCurDate(this.getCurDate());
		tEntity.setSessionInfo(this.getSessionInfo());

		tEntity.setLangId(tLocalhostModel.getLangId());
		tEntity.setLocalhostIdentiNo(tLocalhostModel.getLocalhostIdentiNo());
		tEntity.setVendorIdentiNo(tLocalhostModel.getVendorIdentiNo());
		tEntity.setFullName(tLocalhostModel.getFullName());
		tEntity.setShortName(tLocalhostModel.getShortName());
		tEntity.setLoginId(tLocalhostModel.getLoginId());
		tEntity.setPassword(tLocalhostModel.getPassword());
		tEntity.setPostCode(tLocalhostModel.getPostCode());
		tEntity.setState(tLocalhostModel.getState());
		tEntity.setAddr1(tLocalhostModel.getAddr1());
		tEntity.setAddr2(tLocalhostModel.getAddr2());
		tEntity.setAddr3(tLocalhostModel.getAddr3());
		tEntity.setTelCode(tLocalhostModel.getTelCode());
		tEntity.setTelNo(tLocalhostModel.getTelNo());
		tEntity.setEmail(tLocalhostModel.getEmail());
		tEntity.setPhoto(tLocalhostModel.getPhoto());
		tEntity.setOkFlg(tLocalhostModel.getOkFlg());
		tEntity.setUseLangId(tLocalhostModel.getUseLangId());
		tEntity.setFirstName(tLocalhostModel.getFirstName());
		tEntity.setLastName(tLocalhostModel.getLastName());
		tEntity.setLoginType(tLocalhostModel.getLoginType());
		tEntity.setMemo(tLocalhostModel.getMemo());
		tEntity.setBankName(tLocalhostModel.getBankName());
		tEntity.setBankBranch(tLocalhostModel.getBankBranch());
		tEntity.setBankAccountNo(tLocalhostModel.getBankAccountNo());
		tEntity.setBankAccountType(tLocalhostModel.getBankAccountType());
		tEntity.setBankAccountOwner(tLocalhostModel.getBankAccountOwner());
		tEntity.setEmailOkFlag(tLocalhostModel.getEmailOkFlag());
		tEntity.setPhoneOkFlg(tLocalhostModel.getPhoneOkFlg());
		tEntity.setDelFlg(tLocalhostModel.getDelFlg());
		if (KooUtil.isNotDate(tLocalhostModel.getCreateTime())) {
			tEntity.setCreateTime(null);
		} else {
			tEntity.setCreateTime(KooUtil.string2Date(tLocalhostModel.getCreateTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		if (KooUtil.isNotDate(tLocalhostModel.getModifyTime())) {
			tEntity.setModifyTime(null);
		} else {
			tEntity.setModifyTime(KooUtil.string2Date(tLocalhostModel.getModifyTime(), KooConst.ST_yyyyMMddHHmmss));
		}
		return tEntity;

	}
}
