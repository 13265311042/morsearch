package com.morsearch.dao;

import com.morsearch.model.Acc_Wallet;
import com.morsearch.model.Acc_WalletExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Acc_WalletMapper {
    int countByExample(Acc_WalletExample example);

    int deleteByExample(Acc_WalletExample example);

    int deleteByPrimaryKey(Long wl_userid);

    int insert(Acc_Wallet record);

    int insertSelective(Acc_Wallet record);

    List<Acc_Wallet> selectByExample(Acc_WalletExample example);

    Acc_Wallet selectByPrimaryKey(Long wl_userid);

    int updateByExampleSelective(@Param("record") Acc_Wallet record, @Param("example") Acc_WalletExample example);

    int updateByExample(@Param("record") Acc_Wallet record, @Param("example") Acc_WalletExample example);

    int updateByPrimaryKeySelective(Acc_Wallet record);

    int updateByPrimaryKey(Acc_Wallet record);


    Acc_Wallet getIntegral(Long userid);

    int getWl_account(Long userid);

    int getCount_userid(long ur_id);
}