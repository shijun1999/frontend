package com.kootour.service;

import com.kootour.mapper.entity.BookSummaryEntity;

import java.util.Map;

public interface PaymentService {
BookSummaryEntity load(BookSummaryEntity bookSummaryEntity, Map<String, Object> paraMap);
}
