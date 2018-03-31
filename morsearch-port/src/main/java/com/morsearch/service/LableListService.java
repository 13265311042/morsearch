package com.morsearch.service;

import com.morsearch.dao.Base_LableListMapper;
import com.morsearch.model.Base_LableList;
import com.morsearch.model.Base_LableType;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.util.List;
import java.util.Map;


/*公用Service*/

public interface LableListService {
	List<Base_LableList> getManageList(int pageindex, int pagesize); /*得到列表*/
	int addLableList(Base_LableList record);/*新增*/
	int delLableList(Integer sid);/*删除ID*/
	int getLableListCount(String bl_type, String bl_name);/*查询数量*/
	int updateLableList(Base_LableList record);/*修改*/
	Base_LableList getLableListDetail(Integer sid);/*读取明细*/

	//int addLableList(Base_LableList lb,);/*新增*/
	List<Base_LableType> getLableTypeList();/*查询标签大类列表*/
	int  getCountlistlist(String bl_type);
	int getCountlable(Map<String, Object> map);
	List<Base_LableList> getLableList(Map<String, Object> map);
	int deleteLableListById(long bl_id);
	Base_LableList getLableListdetail(Long bl_id);

	Boolean getLableTypeAllow(String type);/*检查标签大类是否允许新增*/
	Base_LableType getLableTypedetail(String bt_type);//大类的详细情况
    int  updateLableType(Base_LableType bl);

	Base_LableList getLableId(String name);

	List<Base_LableList>  getLableName(String bl_type);

	Base_LableList  getName(String bl_type);

	List<Base_LableList> getBl_name(String bl_type);

	List<Long> getLableList1idlist(String bl_type);

	List<Base_LableList> getLableListidfirst(Map<String, Object> map);///首页品牌添加的除去id的方法

	Integer getCountLableListidfirst(Map<String, Object> map);//首页品牌添加的除去id的方法

	List<Base_LableList> getLableListidlast(Map<String, Object> map);//首页专业添加的除去ID的方法

	String saveT(MultipartFile imgfile);//上传标签的图片

	Integer getCountLableListidlast(Map<String, Object> map);//首页专业添加的除去ID的方法

	int updateBase_LableListcheck(Base_LableList bl);//审核标签通过

	List<Base_LableList> getLableList1(Map<String, Object> map);//审核标签列表

	Integer getCountlable1(Map<String, Object> map);//审核标签列表条数

	List<Base_LableList> getCountIndex();

	List<Base_LableList> getLableListname(Map<String, Object> map);//得到所有

	List<Base_LableList> getjorListname();

	List<Base_LableList> getbrandListname();

	List<Base_LableList> getworkageListname();
}
