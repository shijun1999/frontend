package com.kootour.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.kootour.mapper.entity.BookSummaryEntity;
public interface BookSummaryService {
BookSummaryEntity load(BookSummaryEntity bookSummaryEntity,Map<String,Object> paraMap);
}
