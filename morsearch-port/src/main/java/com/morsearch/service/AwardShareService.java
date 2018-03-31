package com.morsearch.service;

import com.morsearch.model.AwardV_Share_List;
import com.morsearch.model.AwardV_Share_Count;
import com.morsearch.model.Award_Share;

import java.util.List;
import java.util.Map;

/**
 * Created by hyt on 2017/11/30.
 */

public interface AwardShareService {
    List<AwardV_Share_List> getAwardV_Share_ListList(Map<String, Object> map);//列表

    Integer getCountAwardV_Share_List(Map<String, Object> map);//总数

    int addAward_Share(Award_Share ba);

    int deleteAward_Share(long l);

    Award_Share getAward_Sharedetail(long l);

    int updateAward_Share(Award_Share ba);

    List<AwardV_Share_Count> getAwardV_Share_CountList(Map<String, Object> map);

    Integer getCountAwardV_Share_Count(Map<String, Object> map);

    List<AwardV_Share_Count> getAwardVShareCountList(Map<String, Object> map);

    int getCountAwardVShareCount(Map<String, Object> map);

}
