package com.morsearch.service.impl;

import com.morsearch.common.util.CommonUtil;
import com.morsearch.common.util.FtpUtil;
import com.morsearch.common.util.HttpConnection;
import com.morsearch.common.util.SequenceCreator;
import com.morsearch.dao.Base_LableListMapper;
import com.morsearch.dao.Base_LableTypeMapper;
import com.morsearch.model.*;
import com.morsearch.service.CommService;
import com.morsearch.service.LableListService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Properties;


@Service("LableListService")

public class LableListServiceImpl implements LableListService {
	@Autowired
	private Base_LableListMapper base_LableListMapper;

	@Autowired
	private Base_LableTypeMapper base_LableTypeMapper;

	@Resource
	private CommService commService;
	@Override
	public List<Base_LableList> getManageList(int pageindex, int pagesize) {
		return null;
	}

	@Override
	public int addLableList(Base_LableList record) {
		return base_LableListMapper.insertSelective(record);
	}

	@Override
	public int delLableList(Integer sid) {
		return 0;
	}

	@Override
	public Base_LableList getLableId(String name) {
	return base_LableListMapper.getLableID(name);
	}

	@Override
	public List<Base_LableList> getLableName(String bl_type) {
		return base_LableListMapper.getLableName(bl_type);
	}

	@Override
	public Base_LableList getName(String bl_type) {
		return base_LableListMapper.getName(bl_type);
	}

	@Override
	public List<Long> getLableList1idlist(String bl_type) {
		return base_LableListMapper.getLableList1idlist(bl_type);
	}

	@Override
	public List<Base_LableList> getLableListidfirst(Map<String, Object> map) {
		return base_LableListMapper.getLableListidfirst(map);
	}

	@Override
	public Integer getCountLableListidfirst(Map<String, Object> map) {
		return base_LableListMapper.getCountLableListidfirst(map);
	}

	@Override
	public List<Base_LableList> getLableListidlast(Map<String, Object> map) {
		return base_LableListMapper.getLableListidlast(map);
	}

	@Override
	public String saveT(MultipartFile imgfile) {
		int rut=0;
		String  filename = SequenceCreator.createNewFileName() + ".jpg";
		try {
			Properties p = new Properties();
			InputStream is = null;
			is = Thread.currentThread().getContextClassLoader().getResourceAsStream("ftp.properties");
			p.load(is);
			String ADDRESS = p.getProperty("FTP_ADDRESS");
			String PORT = p.getProperty("FTP_PORT");
			String USERNAME = p.getProperty("FTP_USERNAME");
			String PASSWORD = p.getProperty("FTP_PASSWORD");

			//上传图片啊
			Boolean ftprut= FtpUtil.uploadFile(ADDRESS, Integer.parseInt(PORT), USERNAME, PASSWORD, "images", filename, imgfile.getInputStream());


			/*调用文档接口 leoli begin */
			String httppath=commService.getSysConfigValue("pdf_api");
			if (CommonUtil.isEmpty(httppath)==true){return  null;};/*没设置文档服务器*/
			httppath=httppath+"/imagesapi?filename="+filename;
			JSONObject jsonObject =new JSONObject(HttpConnection.get(httppath));
			if ("0".equals(jsonObject.get("status"))){return  filename;};
			/*调用文档接口 end*/

			}catch (Exception e) {
				return null;
			}
			return filename;
	}

	@Override
	public Integer getCountLableListidlast(Map<String, Object> map) {
		return base_LableListMapper.getCountLableListidlast(map);
	}

	@Override
	public int updateBase_LableListcheck(Base_LableList bl) {
		return base_LableListMapper.updateByPrimaryKeySelective(bl);
	}

	@Override
	public List<Base_LableList> getLableList1(Map<String, Object> map) {
		return base_LableListMapper.getLableList1(map);
	}

	@Override
	public Integer getCountlable1(Map<String, Object> map) {
		return base_LableListMapper.getCountlable1(map);
	}

	@Override
	public List<Base_LableList> getCountIndex() {
		return base_LableListMapper.getCountIndex();
	}

	@Override
	public List<Base_LableList> getLableListname(Map<String, Object> map) {
		return base_LableListMapper.getLableListname(map);
	}

	@Override
	public List<Base_LableList> getjorListname() {
		return base_LableListMapper.getjorListname();
	}

	@Override
	public List<Base_LableList> getbrandListname() {
		return base_LableListMapper.getbrandListname();
	}

	@Override
	public List<Base_LableList> getworkageListname() {
		return base_LableListMapper.getworkageListname();
	}


	@Override
	public List<Base_LableList> getBl_name(String bl_type) {
		return base_LableListMapper.getBl_name(bl_type);
	}

	@Override
	public int getLableListCount(String bl_type, String bl_name) {
		Base_LableListExample ll = new Base_LableListExample();
		/*Base_LableListExample.Criteria criteria = ll.createCriteria();
		criteria.andBl_typeEqualTo(bl_type);
		if (bl_name!=null){criteria.andBl_nameEqualTo(bl_name);};*/
		Base_LableListExample.Criteria criteria = ll.createCriteria();
		/*我添加的这个条件*/
		if (!CommonUtil.isNullOrEmpty(bl_type)) {
			criteria.andBl_typeEqualTo(bl_type);
		}
		if (bl_name != null) {
			criteria.andBl_nameEqualTo(bl_name);
		}
		return base_LableListMapper.countByExample(ll);
		//	return base_LableListMapper.getLableListCount(bl_type,bl_name);
	}


	@Override
	public int updateLableList(Base_LableList record) {
		return  base_LableListMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public Base_LableList getLableListDetail(Integer sid) {
		return null;
	}


	/*zuoxiaochao*/
	@Override
	public List<Base_LableType> getLableTypeList() {
		Base_LableTypeExample example = new Base_LableTypeExample();
		Base_LableTypeExample.Criteria criteria = example.createCriteria();
		example.setOrderByClause("bt_index  asc");
		List<Base_LableType> base_lableTypeList = base_LableTypeMapper.selectByExample(example);
		if (base_lableTypeList != null && base_lableTypeList.size() > 0) {
			return base_lableTypeList;
		}

		return null;
	}

	@Override
	public int getCountlistlist(String bl_type) {
		Base_LableListExample example = new Base_LableListExample();
		Base_LableListExample.Criteria criteria = example.createCriteria();
		if (!CommonUtil.isNullOrEmpty(bl_type)) {
			criteria.andBl_typeEqualTo(bl_type);
		}

		List<Base_LableList> base_lableLists = base_LableListMapper.selectByExample(example);
		if (base_lableLists != null && base_lableLists.size() > 0) {
			return base_lableLists.size();
		}
		return 0;
	}


	/*zuoxiaochao*/
	@Override
	public List<Base_LableList> getLableList(Map<String, Object> map) {

		List<Base_LableList> lableListlist = base_LableListMapper.getLableListlist(map);
		return lableListlist;

	}
	/*删除子标签根据bl_id*/
	@Override
	public int deleteLableListById(long bl_id) {
		Base_LableListExample example = new Base_LableListExample();
		Base_LableListExample.Criteria criteria = example.createCriteria();
		criteria.andBl_idEqualTo(bl_id);
		return base_LableListMapper.deleteByExample(example);
	}

	/*根据子标签ID来查询整个对象*/
	@Override
	public Base_LableList getLableListdetail(Long bl_id) {
		Base_LableListExample example = new Base_LableListExample();
		Base_LableListExample.Criteria criteria = example.createCriteria();
		criteria.andBl_idEqualTo(bl_id);
		List<Base_LableList> base_lableLists = base_LableListMapper.selectByExample(example);
		if(base_lableLists!=null&&base_lableLists.size()>0){
			return base_lableLists.get(0);
		}
		return null;
	}

	@Override
/*检查大类是否允许新增*/
	public Boolean getLableTypeAllow(String type) {
		Base_LableType lt=base_LableTypeMapper.selectByPrimaryKey(type);
		if (lt.getBt_allowflag()==null){lt.setBt_allowflag(false);};
		return lt.getBt_allowflag();
	}

	@Override
	public Base_LableType getLableTypedetail(String bt_type) {

		return base_LableTypeMapper.selectByPrimaryKey( bt_type);
	}

	@Override
	public int updateLableType(Base_LableType bl) {
		return base_LableTypeMapper.updateByPrimaryKeySelective(bl);
	}

	/*zuoxiaochao*/
	//得到总记录数
	@Override
	public int getCountlable(Map<String, Object> map) {
			return 	base_LableListMapper.getLableListCountList(map);
	}




}
