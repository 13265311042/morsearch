package com.morsearch.service.impl;

import com.morsearch.dao.*;
import com.morsearch.model.*;
import com.morsearch.service.CommService;
import com.morsearch.service.HomeService;
import com.morsearch.vo.Base_LableList_list;
import com.morsearch.vo.Sys_WordList_list;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*首页Service*/

@Service("HomeService")

public class HomeServiceImpl implements HomeService {
	@Autowired
	private HomeV_PageMapper pageMapper;
	@Autowired
	private HomeV_DetailMapper DetailMapper;


	@Override
	public List<HomeV_Page> getHomePage() {
		return pageMapper.selectByExampleWithBLOBs(null);
	}

	@Override
	public List<HomeV_Detail> getHomeDetail(Long userid) {
		HomeV_DetailExample ll = new HomeV_DetailExample();
		HomeV_DetailExample.Criteria criteria = ll.createCriteria();
		if (userid!=-1) {criteria.andUr_idEqualTo(userid);};
		ll.setOrderByClause(" ur_id asc");
		return DetailMapper.selectByExample(ll);
	}

	@Override
	public List<HomeV_Page> getHomeSearch(String longitude,String latitude,String keyword){
		return pageMapper.getHomeSearch(longitude,latitude,keyword);
	}

}
