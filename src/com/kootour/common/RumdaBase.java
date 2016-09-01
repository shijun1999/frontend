//Auto Generated 
package com.kootour.common;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.kootour.mapper.entity.CourseCommentEntity;
import com.kootour.mapper.entity.CourseDiscountEntity;
import com.kootour.mapper.entity.CourseEntity;
import com.kootour.mapper.entity.CourseFavoriteVEntity;
import com.kootour.mapper.entity.CourseInExclusionEntity;
import com.kootour.mapper.entity.CourseLocalhostVEntity;
import com.kootour.mapper.entity.CourseOrderVEntity;
import com.kootour.mapper.entity.CoursePictureEntity;
import com.kootour.mapper.entity.CourseScheduleEntity;
import com.kootour.mapper.entity.ExtraOptionEntity;
import com.kootour.mapper.entity.FavoriteEntity;
import com.kootour.mapper.entity.KootourMstEntity;
import com.kootour.mapper.entity.KootourPromoEntity;
import com.kootour.mapper.entity.LanguageMatrixEntity;
import com.kootour.mapper.entity.LanguageMstEntity;
import com.kootour.mapper.entity.LocalhostEntity;
import com.kootour.mapper.entity.LocationMstEntity;
import com.kootour.mapper.entity.MessageEntity;
import com.kootour.mapper.entity.PictureCommentEntity;
import com.kootour.mapper.entity.PictureEntity;
import com.kootour.mapper.entity.ScheduleOptionEntity;
import com.kootour.mapper.entity.TouristEntity;
import com.kootour.mapper.entity.UserOrderEntity;

public class RumdaBase {
	public List<CourseEntity> seekCourseLst(List<CourseEntity> list, Predicate<CourseEntity> predicate) {
		List<CourseEntity> tList = new ArrayList<>();
		if (list != null && list.size() > 0) {
			Stream<CourseEntity> tStream = list.stream().filter(predicate);
			try {
				tList = tStream.collect(Collectors.toList());
			} catch (Exception e) {
				tList = new ArrayList<>();
			}
		}
		return (tList);
	}

	public List<CourseCommentEntity> seekCourseCommentLst(List<CourseCommentEntity> list,
			Predicate<CourseCommentEntity> predicate) {
		List<CourseCommentEntity> tList = new ArrayList<>();
		if (list != null && list.size() > 0) {
			Stream<CourseCommentEntity> tStream = list.stream().filter(predicate);
			try {
				tList = tStream.collect(Collectors.toList());
			} catch (Exception e) {
				tList = new ArrayList<>();
			}
		}
		return (tList);
	}

	public List<CourseDiscountEntity> seekCourseDiscountLst(List<CourseDiscountEntity> list,
			Predicate<CourseDiscountEntity> predicate) {
		List<CourseDiscountEntity> tList = new ArrayList<>();
		if (list != null && list.size() > 0) {
			Stream<CourseDiscountEntity> tStream = list.stream().filter(predicate);
			try {
				tList = tStream.collect(Collectors.toList());
			} catch (Exception e) {
				tList = new ArrayList<>();
			}
		}
		return (tList);
	}

	public List<CourseInExclusionEntity> seekCourseInExclusionLst(List<CourseInExclusionEntity> list,
			Predicate<CourseInExclusionEntity> predicate) {
		List<CourseInExclusionEntity> tList = new ArrayList<>();
		if (list != null && list.size() > 0) {
			Stream<CourseInExclusionEntity> tStream = list.stream().filter(predicate);
			try {
				tList = tStream.collect(Collectors.toList());
			} catch (Exception e) {
				tList = new ArrayList<>();
			}
		}
		return (tList);
	}

	public List<CoursePictureEntity> seekCoursePictureLst(List<CoursePictureEntity> list,
			Predicate<CoursePictureEntity> predicate) {
		List<CoursePictureEntity> tList = new ArrayList<>();
		if (list != null && list.size() > 0) {
			Stream<CoursePictureEntity> tStream = list.stream().filter(predicate);
			try {
				tList = tStream.collect(Collectors.toList());
			} catch (Exception e) {
				tList = new ArrayList<>();
			}
		}
		return (tList);
	}

	public List<CourseScheduleEntity> seekCourseScheduleLst(List<CourseScheduleEntity> list,
			Predicate<CourseScheduleEntity> predicate) {
		List<CourseScheduleEntity> tList = new ArrayList<>();
		if (list != null && list.size() > 0) {
			Stream<CourseScheduleEntity> tStream = list.stream().filter(predicate);
			try {
				tList = tStream.collect(Collectors.toList());
			} catch (Exception e) {
				tList = new ArrayList<>();
			}
		}
		return (tList);
	}

	public List<ExtraOptionEntity> seekExtraOptionLst(List<ExtraOptionEntity> list,
			Predicate<ExtraOptionEntity> predicate) {
		List<ExtraOptionEntity> tList = new ArrayList<>();
		if (list != null && list.size() > 0) {
			Stream<ExtraOptionEntity> tStream = list.stream().filter(predicate);
			try {
				tList = tStream.collect(Collectors.toList());
			} catch (Exception e) {
				tList = new ArrayList<>();
			}
		}
		return (tList);
	}

	public List<FavoriteEntity> seekFavoriteLst(List<FavoriteEntity> list, Predicate<FavoriteEntity> predicate) {
		List<FavoriteEntity> tList = new ArrayList<>();
		if (list != null && list.size() > 0) {
			Stream<FavoriteEntity> tStream = list.stream().filter(predicate);
			try {
				tList = tStream.collect(Collectors.toList());
			} catch (Exception e) {
				tList = new ArrayList<>();
			}
		}
		return (tList);
	}

	public List<KootourMstEntity> seekKootourMstLst(List<KootourMstEntity> list,
			Predicate<KootourMstEntity> predicate) {
		List<KootourMstEntity> tList = new ArrayList<>();
		if (list != null && list.size() > 0) {
			Stream<KootourMstEntity> tStream = list.stream().filter(predicate);
			try {
				tList = tStream.collect(Collectors.toList());
			} catch (Exception e) {
				tList = new ArrayList<>();
			}
		}
		return (tList);
	}

	public List<KootourPromoEntity> seekKootourPromoLst(List<KootourPromoEntity> list,
			Predicate<KootourPromoEntity> predicate) {
		List<KootourPromoEntity> tList = new ArrayList<>();
		if (list != null && list.size() > 0) {
			Stream<KootourPromoEntity> tStream = list.stream().filter(predicate);
			try {
				tList = tStream.collect(Collectors.toList());
			} catch (Exception e) {
				tList = new ArrayList<>();
			}
		}
		return (tList);
	}

	public List<LanguageMatrixEntity> seekLanguageMatrixLst(List<LanguageMatrixEntity> list,
			Predicate<LanguageMatrixEntity> predicate) {
		List<LanguageMatrixEntity> tList = new ArrayList<>();
		if (list != null && list.size() > 0) {
			Stream<LanguageMatrixEntity> tStream = list.stream().filter(predicate);
			try {
				tList = tStream.collect(Collectors.toList());
			} catch (Exception e) {
				tList = new ArrayList<>();
			}
		}
		return (tList);
	}

	public List<LanguageMstEntity> seekLanguageMstLst(List<LanguageMstEntity> list,
			Predicate<LanguageMstEntity> predicate) {
		List<LanguageMstEntity> tList = new ArrayList<>();
		if (list != null && list.size() > 0) {
			Stream<LanguageMstEntity> tStream = list.stream().filter(predicate);
			try {
				tList = tStream.collect(Collectors.toList());
			} catch (Exception e) {
				tList = new ArrayList<>();
			}
		}
		return (tList);
	}

	public List<LocalhostEntity> seekLocalhostLst(List<LocalhostEntity> list, Predicate<LocalhostEntity> predicate) {
		List<LocalhostEntity> tList = new ArrayList<>();
		if (list != null && list.size() > 0) {
			Stream<LocalhostEntity> tStream = list.stream().filter(predicate);
			try {
				tList = tStream.collect(Collectors.toList());
			} catch (Exception e) {
				tList = new ArrayList<>();
			}
		}
		return (tList);
	}

	public List<LocationMstEntity> seekLocationMstLst(List<LocationMstEntity> list,
			Predicate<LocationMstEntity> predicate) {
		List<LocationMstEntity> tList = new ArrayList<>();
		if (list != null && list.size() > 0) {
			Stream<LocationMstEntity> tStream = list.stream().filter(predicate);
			try {
				tList = tStream.collect(Collectors.toList());
			} catch (Exception e) {
				tList = new ArrayList<>();
			}
		}
		return (tList);
	}

	public List<MessageEntity> seekMessageLst(List<MessageEntity> list, Predicate<MessageEntity> predicate) {
		List<MessageEntity> tList = new ArrayList<>();
		if (list != null && list.size() > 0) {
			Stream<MessageEntity> tStream = list.stream().filter(predicate);
			try {
				tList = tStream.collect(Collectors.toList());
			} catch (Exception e) {
				tList = new ArrayList<>();
			}
		}
		return (tList);
	}

	public List<PictureEntity> seekPictureLst(List<PictureEntity> list, Predicate<PictureEntity> predicate) {
		List<PictureEntity> tList = new ArrayList<>();
		if (list != null && list.size() > 0) {
			Stream<PictureEntity> tStream = list.stream().filter(predicate);
			try {
				tList = tStream.collect(Collectors.toList());
			} catch (Exception e) {
				tList = new ArrayList<>();
			}
		}
		return (tList);
	}

	public List<PictureCommentEntity> seekPictureCommentLst(List<PictureCommentEntity> list,
			Predicate<PictureCommentEntity> predicate) {
		List<PictureCommentEntity> tList = new ArrayList<>();
		if (list != null && list.size() > 0) {
			Stream<PictureCommentEntity> tStream = list.stream().filter(predicate);
			try {
				tList = tStream.collect(Collectors.toList());
			} catch (Exception e) {
				tList = new ArrayList<>();
			}
		}
		return (tList);
	}

	public List<ScheduleOptionEntity> seekScheduleOptionLst(List<ScheduleOptionEntity> list,
			Predicate<ScheduleOptionEntity> predicate) {
		List<ScheduleOptionEntity> tList = new ArrayList<>();
		if (list != null && list.size() > 0) {
			Stream<ScheduleOptionEntity> tStream = list.stream().filter(predicate);
			try {
				tList = tStream.collect(Collectors.toList());
			} catch (Exception e) {
				tList = new ArrayList<>();
			}
		}
		return (tList);
	}

	public List<TouristEntity> seekTouristLst(List<TouristEntity> list, Predicate<TouristEntity> predicate) {
		List<TouristEntity> tList = new ArrayList<>();
		if (list != null && list.size() > 0) {
			Stream<TouristEntity> tStream = list.stream().filter(predicate);
			try {
				tList = tStream.collect(Collectors.toList());
			} catch (Exception e) {
				tList = new ArrayList<>();
			}
		}
		return (tList);
	}

	public List<UserOrderEntity> seekUserOrderLst(List<UserOrderEntity> list, Predicate<UserOrderEntity> predicate) {
		List<UserOrderEntity> tList = new ArrayList<>();
		if (list != null && list.size() > 0) {
			Stream<UserOrderEntity> tStream = list.stream().filter(predicate);
			try {
				tList = tStream.collect(Collectors.toList());
			} catch (Exception e) {
				tList = new ArrayList<>();
			}
		}
		return (tList);
	}

	public List<CourseFavoriteVEntity> seekCourseFavoriteVLst(List<CourseFavoriteVEntity> list,
			Predicate<CourseFavoriteVEntity> predicate) {
		List<CourseFavoriteVEntity> tList = new ArrayList<>();
		if (list != null && list.size() > 0) {
			Stream<CourseFavoriteVEntity> tStream = list.stream().filter(predicate);
			try {
				tList = tStream.collect(Collectors.toList());
			} catch (Exception e) {
				tList = new ArrayList<>();
			}
		}
		return (tList);
	}

	public List<CourseLocalhostVEntity> seekCourseLocalhostVLst(List<CourseLocalhostVEntity> list,
			Predicate<CourseLocalhostVEntity> predicate) {
		List<CourseLocalhostVEntity> tList = new ArrayList<>();
		if (list != null && list.size() > 0) {
			Stream<CourseLocalhostVEntity> tStream = list.stream().filter(predicate);
			try {
				tList = tStream.collect(Collectors.toList());
			} catch (Exception e) {
				tList = new ArrayList<>();
			}
		}
		return (tList);
	}

	public List<CourseOrderVEntity> seekCourseOrderVLst(List<CourseOrderVEntity> list,
			Predicate<CourseOrderVEntity> predicate) {
		List<CourseOrderVEntity> tList = new ArrayList<>();
		if (list != null && list.size() > 0) {
			Stream<CourseOrderVEntity> tStream = list.stream().filter(predicate);
			try {
				tList = tStream.collect(Collectors.toList());
			} catch (Exception e) {
				tList = new ArrayList<>();
			}
		}
		return (tList);
	}

}
