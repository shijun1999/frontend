package com.kootour.service.impl;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import com.kootour.service.ShareKootourService;
import com.kootour.mapper.entity.ShareKootourEntity;
import freemarker.core.Environment;
@Configuration
@Service
public class ShareKootourServiceImpl implements ShareKootourService{	
@Override
public ShareKootourEntity load(ShareKootourEntity shareKootourEntity,Map<String,Object> paraMap){
ShareKootourEntity rtnResult =  new ShareKootourEntity();
// Write logic  here !!!
return (rtnResult);
}
}
