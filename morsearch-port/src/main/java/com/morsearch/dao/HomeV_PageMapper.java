package com.morsearch.dao;

import com.morsearch.model.HomeV_Page;
import com.morsearch.model.HomeV_PageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HomeV_PageMapper {
    int countByExample(HomeV_PageExample example);

    int deleteByExample(HomeV_PageExample example);

    int insert(HomeV_Page record);

    int insertSelective(HomeV_Page record);

    List<HomeV_Page> selectByExampleWithBLOBs(HomeV_PageExample example);

    List<HomeV_Page> selectByExample(HomeV_PageExample example);

    int updateByExampleSelective(@Param("record") HomeV_Page record, @Param("example") HomeV_PageExample example);

    int updateByExampleWithBLOBs(@Param("record") HomeV_Page record, @Param("example") HomeV_PageExample example);

    int updateByExample(@Param("record") HomeV_Page record, @Param("example") HomeV_PageExample example);
	
/*自定义*/
    HomeV_Page getHomePageDetail(@Param("lng") String longitude, @Param("lat") String latitude);
    String getHomePagelist();
    List<HomeV_Page> getHomeSearch(@Param("lng") String longitude, @Param("lat") String latitude, @Param("keyword") String keyword);/*查询*/

}