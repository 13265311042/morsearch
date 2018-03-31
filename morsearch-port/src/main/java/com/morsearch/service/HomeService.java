package com.morsearch.service;

import com.morsearch.model.HomeV_Detail;
import com.morsearch.model.HomeV_Page;
import com.morsearch.model.Sys_WordList;
import com.morsearch.vo.Base_LableList_list;
import com.morsearch.vo.Sys_WordList_list;

import java.util.List;


/*首页Service*/

public interface HomeService {
	List<HomeV_Page> getHomePage();/*获取首页*/
	List<HomeV_Detail> getHomeDetail(Long userid);/*获取首页明细*/

	List<HomeV_Page> getHomeSearch(String longitude, String latitude, String keyword);/*获取首页查询*/

}
