package com.morsearch.service;

import com.morsearch.model.Sys_User_Visiting;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * Created by ywh on 2018-1-16.
 */
public interface UserVisitingService {

    Sys_User_Visiting selectByPrimaryKey(Long uv_id);

    int saveSys_User_Visiting(String userid, String base, CommonsMultipartFile photo);
}
