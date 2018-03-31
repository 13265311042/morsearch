package com.morsearch.dao;

import com.morsearch.model.Sys_WordList;
import com.morsearch.model.Sys_WordListExample;
import com.morsearch.model.Sys_WordListKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Sys_WordListMapper {
    int countByExample(Sys_WordListExample example);

    int deleteByExample(Sys_WordListExample example);

    int deleteByPrimaryKey(Sys_WordListKey key);

    int insert(Sys_WordList record);

    int insertSelective(Sys_WordList record);

    List<Sys_WordList> selectByExample(Sys_WordListExample example);

    Sys_WordList selectByPrimaryKey(Sys_WordListKey key);

    int updateByExampleSelective(@Param("record") Sys_WordList record, @Param("example") Sys_WordListExample example);

    int updateByExample(@Param("record") Sys_WordList record, @Param("example") Sys_WordListExample example);

    int updateByPrimaryKeySelective(Sys_WordList record);

    int updateByPrimaryKey(Sys_WordList record);

    /*自定义*/
    List<Sys_WordList> getSysWordList(@Param("sw_type") String sw_type, @Param("flag") int flag);/*按类别获取标签列表*/
    String getWordTypeName(@Param("type") String type);/*获取系统用词类型*/

    Sys_WordList getSys_WordCodeDetail(@Param("type") String type, @Param("code") String code);/*通过代码获取明细*/

    List<Sys_WordList> getAcc_DepositNoType(@Param("userid") Long userid);/*返回库存没有的种类*/

    String  getWordTypeCode(String sw_name); //城市名称 获取 代码



}