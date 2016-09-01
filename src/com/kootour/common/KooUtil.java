package com.kootour.common;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.time.DateUtils;

import com.kootour.mapper.entity.CourseFilterEntity;
import com.kootour.mapper.entity.ScheduleOptionEntity;
import com.kootour.model.WishDetailModel;

public class KooUtil {

	// MM/dd/yyyy->yyyyMMdd
	public static String convertDate2Yyyymmdd(String strDate) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate parsedDate = LocalDate.parse(strDate, formatter);

		String strD = parsedDate.format(DateTimeFormatter.BASIC_ISO_DATE);
		return (strD);

	}

	// yyyyMMdd -> MM/dd/yyyy
	public static String convertDate2Mm_dd_yyyy(String strDate) {

		SimpleDateFormat sdf1 = new SimpleDateFormat(KooConst.ST_yyyyMMdd);
		SimpleDateFormat sdf2 = new SimpleDateFormat(KooConst.ST_MM_dd_yyyy);
		Date date;
		String strD = "";
		try {
			date = sdf1.parse(strDate);
			strD = sdf2.format(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return (strD);

	}

	public static String nextDay(String strDate) {

		LocalDate date1 = LocalDate.parse(strDate, DateTimeFormatter.BASIC_ISO_DATE);// "YYYYMMDD"

		DayOfWeek dw = date1.getDayOfWeek();
		String iWd = String.valueOf(dw.ordinal());
		String strD = date1.format(DateTimeFormatter.BASIC_ISO_DATE);
		date1 = date1.plusDays(1);
		strD = date1.format(DateTimeFormatter.BASIC_ISO_DATE);
		return (strD);

	}

	public static String date2String(java.util.Date date, String pattern) {

		if ((date == null) || (pattern == null) || pattern.isEmpty()) {
			return null;
		}
		String formatString = null;

		formatString = new SimpleDateFormat(pattern).format(date);

		return (formatString);
	}

	public static Date string2Date(String date, String pattern) {

		if ((date == null) || (pattern == null) || pattern.isEmpty()) {
			return null;
		}
		Date formatedDate = null;

		try {
			formatedDate = new SimpleDateFormat(pattern).parse(date);
		} catch (ParseException e) {
			return null;
		}
		return (formatedDate);
	}

	public static boolean isNotNull(String tStr) {

		if ((tStr == null) || tStr.isEmpty()) {
			return false;
		}
		return (true);
	}

	public static boolean isNotNull(Double dPattern) {

		if (dPattern == null) {
			return false;
		}
		return (true);
	}

	public static boolean isNotDate(String tStr) {

		if (tStr == null || tStr.isEmpty()) {
			return (true);
		} else {
			try {

				DateUtils.parseDateStrictly(tStr, new String[] { KooConst.ST_yyyyMMdd });
			} catch (ParseException e) {
				return (true);
			}
			return (false);
		}
	}

	public static boolean isNotInt(String tStr) {

		return (!NumberUtils.isNumber(tStr));
	}

	public static boolean isNotDouble(String tStr) {

		return (!NumberUtils.isNumber(tStr));
	}

	public static boolean isTooLargeDouble(String tStr, int tSize) {
		int dotIdx = tStr.indexOf(".");
		return (dotIdx > tSize);
	}

	public static boolean isTooLargeInt(String tStr, int tSize) {

		return ((tStr.length() > tSize));
	}

	public static boolean isTooLargeString(String tStr, int tSize) {

		return ((tStr.length() > tSize));
	}

	public static boolean isTooLargeInt(int tItn, int tSize) {
		String tStr = String.valueOf(tItn);
		return ((tStr.length() > tSize));
	}

	public static boolean isTooLargeDouble(Double tDouble, int tSize) {
		String tStr = String.valueOf(tDouble);
		int dotIdx = tStr.indexOf(".");
		return (dotIdx > tSize);
	}

	public static String formatMoney(String tUnitName, String tValStr) {
		String retVal = "";
		if (tValStr == null) {
			retVal = "";
		} else {
			int dotIdx = tValStr.indexOf(".");
			if (dotIdx < 1) {
				retVal = tUnitName + tValStr;
			} else {
				retVal = tUnitName + tValStr.substring(0, dotIdx);
			}

		}
		return (retVal);
	}

	public static String formatPercentage(String tValStr) {
		String retVal = "";
		Double tVal = Double.parseDouble(tValStr);
		retVal = MessageFormat.format("{0,number,#.##%}", tVal);
		return (retVal);
	}

	public static String formatDuration(String tDuration) {
		String retVal = "";

		DecimalFormat df1 = new DecimalFormat("###.##");
		retVal = df1.format(Double.parseDouble(tDuration));
		return (retVal);
	}

	public static String formatDate(String tDate) {
		String retVal = "";
		if (tDate.length() == 8) {
			retVal = tDate.substring(0, 4) + "/" + tDate.substring(4, 6) + "/" + tDate.substring(6, 8);
		}
		return (retVal);
	}

	public static String formatDurationUnit(String tDurationUnit) {
		String retVal = "";

		switch (tDurationUnit) {
		case KooConst.ST_DURATION_UNIT_DAY:
			retVal = KooConst.ST_DURATION_UNIT_NAME_DAY;
			break;
		case KooConst.ST_DURATION_UNIT_HOUR:
			retVal = KooConst.ST_DURATION_UNIT_NAME_HOUR;
			break;
		case KooConst.ST_DURATION_UNIT_MINUTE:
			retVal = KooConst.ST_DURATION_UNIT_NAME_MINUTE;
			break;
		}
		return (retVal);
	}

	public static String formatPersonOrGroup(String tPersonOrGroup) {
		String retVal = "";

		switch (tPersonOrGroup) {
		case KooConst.STR_TYPE_DIV_PERSON:
			retVal = KooConst.STR_TYPE_PERSON;
			break;
		case KooConst.STR_TYPE_DIV_GROUP:
			retVal = KooConst.STR_TYPE_GROUP;
			break;
		default:
			retVal = KooConst.STR_TYPE_PERSON;

		}
		return (retVal);
	}

	public static ScheduleOptionEntity calcDiscount(List<ScheduleOptionEntity> scheduleOptionEntityList) {
		ScheduleOptionEntity retVal = new ScheduleOptionEntity();

		Double tmpDisCount = KooConst.NUM_MAX;

		for (ScheduleOptionEntity tmpVal : scheduleOptionEntityList) {
			Double tVal = tmpVal.getPrice();
			if (tmpVal.getDiscountFlg().equals(KooConst.ST_FLG_YES)) {
				if (tmpVal.getDiscountValue() != null && tmpVal.getDiscountValue() > 0) {
					tVal = tmpVal.getPrice() - tmpVal.getDiscountValue();
				} else if (tmpVal.getDiscountPercent() != null && tmpVal.getDiscountPercent() > 0) {
					tVal = tmpVal.getPrice() - tmpVal.getPrice() * tmpVal.getDiscountPercent();
				}
			}
			if (tmpDisCount > tVal) {
				tmpDisCount = tVal;
				tmpVal.setDiscountPrice(tmpDisCount);
				retVal = tmpVal;
			}
		}

		return (retVal);
	}

	public static List<String> getStarName(Double score) {
		List<String> starList = new ArrayList<String>();
		if (score >= 4) {
			starList.add(KooConst.STR_IMAGES_PATH + "star_100.png");
			starList.add(KooConst.STR_IMAGES_PATH + "star_100.png");
			starList.add(KooConst.STR_IMAGES_PATH + "star_100.png");
			starList.add(KooConst.STR_IMAGES_PATH + "star_100.png");
			if (score - 4 >= 0.75) {
				starList.add(KooConst.STR_IMAGES_PATH + "star_100.png");
			} else if (score - 4 >= 0.5) {
				starList.add(KooConst.STR_IMAGES_PATH + "star_50.png");
			} else {
				starList.add(KooConst.STR_IMAGES_PATH + "star_0.png");
			}
		} else if (score >= 3) {
			starList.add(KooConst.STR_IMAGES_PATH + "star_100.png");
			starList.add(KooConst.STR_IMAGES_PATH + "star_100.png");
			starList.add(KooConst.STR_IMAGES_PATH + "star_100.png");
			if (score - 3 >= 0.75) {
				starList.add(KooConst.STR_IMAGES_PATH + "star_100.png");
			} else if (score - 3 >= 0.5) {
				starList.add(KooConst.STR_IMAGES_PATH + "star_50.png");
			} else {
				starList.add(KooConst.STR_IMAGES_PATH + "star_0.png");
			}
			starList.add(KooConst.STR_IMAGES_PATH + "star_0.png");
		} else if (score >= 2) {
			starList.add(KooConst.STR_IMAGES_PATH + "star_100.png");
			starList.add(KooConst.STR_IMAGES_PATH + "star_100.png");
			if (score - 2 >= 0.75) {
				starList.add(KooConst.STR_IMAGES_PATH + "star_100.png");
			} else if (score - 2 >= 0.5) {
				starList.add(KooConst.STR_IMAGES_PATH + "star_50.png");
			} else {
				starList.add(KooConst.STR_IMAGES_PATH + "star_0.png");
			}
			starList.add(KooConst.STR_IMAGES_PATH + "star_0.png");
			starList.add(KooConst.STR_IMAGES_PATH + "star_0.png");
		} else if (score >= 1) {
			starList.add(KooConst.STR_IMAGES_PATH + "star_100.png");
			if (score - 1 >= 0.75) {
				starList.add(KooConst.STR_IMAGES_PATH + "star_100.png");
			} else if (score - 1 >= 0.5) {
				starList.add(KooConst.STR_IMAGES_PATH + "star_50.png");
			} else {
				starList.add(KooConst.STR_IMAGES_PATH + "star_0.png");
			}
			starList.add(KooConst.STR_IMAGES_PATH + "star_0.png");
			starList.add(KooConst.STR_IMAGES_PATH + "star_0.png");
			starList.add(KooConst.STR_IMAGES_PATH + "star_0.png");
		} else if (score >= 0) {
			if (score >= 0.75) {
				starList.add(KooConst.STR_IMAGES_PATH + "star_100.png");
			} else if (score >= 0.5) {
				starList.add(KooConst.STR_IMAGES_PATH + "star_50.png");
			} else {
				starList.add(KooConst.STR_IMAGES_PATH + "star_0.png");
			}
			starList.add(KooConst.STR_IMAGES_PATH + "star_0.png");
			starList.add(KooConst.STR_IMAGES_PATH + "star_0.png");
			starList.add(KooConst.STR_IMAGES_PATH + "star_0.png");
			starList.add(KooConst.STR_IMAGES_PATH + "star_0.png");
		}
		return starList;
	}

	public static CourseFilterEntity makeCategory(int inCategory) {
		CourseFilterEntity courseFilterEntity = new CourseFilterEntity();
		
		switch (inCategory) {
		case 0:
			courseFilterEntity.setAllType(KooConst.STR_TYPE_CHECK_TRUE);
			break;
		case 1:
			courseFilterEntity.setAdventure(KooConst.ST_FLG_YES);
			break;
		case 2:
			courseFilterEntity.setCultureArts(KooConst.ST_FLG_YES);
			break;
		case 3:
			courseFilterEntity.setFestivalEvents(KooConst.ST_FLG_YES);
			break;
		case 4:
			courseFilterEntity.setFoodDrink(KooConst.ST_FLG_YES);
			break;
		case 5:
			courseFilterEntity.setHistorical(KooConst.ST_FLG_YES);
			break;
		case 6:
			courseFilterEntity.setLeisureSports(KooConst.ST_FLG_YES);
			break;
		case 7:
			courseFilterEntity.setNatureRural(KooConst.ST_FLG_YES);
			break;
		case 8:
			courseFilterEntity.setNightlifeParty(KooConst.ST_FLG_YES);
			break;
		case 9:
			courseFilterEntity.setShoppingMarket(KooConst.ST_FLG_YES);
			break;
		}

		return courseFilterEntity;
	}

	public static String makeSelectLang(String strLang) {
		String tLang = "en";
		switch (strLang) {
		case "0":
			tLang = "en";
			break;
		case "1":
			tLang = "zh";
			break;
		case "2":
			tLang = "ja";
			break;
		default:
			tLang = "en";
			break;			
		}

		return tLang;
	}

	public static String formatLang(String tLang) {

		String strLang ="";
		String[] usedLanArr=tLang.split(";");
		for (String t:usedLanArr){
			if (strLang.length()==0){
				strLang=convertLangName(t);
			}else{
				strLang= strLang +"&"+convertLangName(t);
			}
		}
		return (strLang);

	}
	public static String convertLangName(String tLang) {

		String strLang ="English";
		switch (tLang) {
		case "en":
			strLang = "English";
			break;
		case "zh":
			strLang = "Chinese";
			break;
		case "ja":
			strLang = "Japanese";
			break;
		default:
			strLang = "English";
			break;			
		}
		return (strLang);

	}

}
