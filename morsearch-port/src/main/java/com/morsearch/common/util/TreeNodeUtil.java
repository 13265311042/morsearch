package com.morsearch.common.util;

import com.morsearch.vo.JsonTreeData;

import java.util.ArrayList;
import java.util.List;

/**
* @ClassName: TreeNodeUtil
* @Description 描述: 获取树节点集合
* @author： duanfangcheng
*
*/
public class TreeNodeUtil {
	/**
	    * @Title: getfatherNode
	    * @Description 方法描述: 父节点
	    * @param 设定文件： @param treeDataList
	    * @param 设定文件： @return    
	    * @return 返回类型：List<JsonTreeData>    
	    * @throws
	    */
	    public final static List<JsonTreeData> getfatherNode(List<JsonTreeData> treeDataList) {
	        List<JsonTreeData> newTreeDataList = new ArrayList<JsonTreeData>();
	        for (JsonTreeData jsonTreeData : treeDataList) {
	            if(jsonTreeData.getPid() == null) {
	                //获取父节点下的子节点
	                jsonTreeData.setChildren(getChildrenNode(jsonTreeData.getId(),treeDataList));
	                jsonTreeData.setState("open");
	                newTreeDataList.add(jsonTreeData);
	            }
	        }
	        return newTreeDataList;
	    }
	     
	    /**
	    * @Title: getChildrenNode
	    * @Description 方法描述: 子节点
	    * @param 设定文件： @param pid
	    * @param 设定文件： @param treeDataList
	    * @param 设定文件： @return    
	    * @return 返回类型：List<JsonTreeData>    
	    * @throws
	    */
	    private final static List<JsonTreeData> getChildrenNode(String pid , List<JsonTreeData> treeDataList) {
	        List<JsonTreeData> newTreeDataList = new ArrayList<JsonTreeData>();
	        for (JsonTreeData jsonTreeData : treeDataList) {
	            if(jsonTreeData.getPid() == null)  continue;
	            //这是一个子节点
	            if(jsonTreeData.getPid().equals(pid)){
	                //递归获取子节点下的子节点
	                jsonTreeData.setChildren(getChildrenNode(jsonTreeData.getId() , treeDataList));
	                newTreeDataList.add(jsonTreeData);
	            }
	        }
	        return newTreeDataList;
	    }
}
