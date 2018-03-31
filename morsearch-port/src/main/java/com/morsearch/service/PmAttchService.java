package com.morsearch.service;

import com.morsearch.model.Pm_Archives;
import com.morsearch.model.Pm_Attach;
import com.morsearch.vo.Pm_Ar;

import java.util.List;

/**
 * Created by ywh on 2017-11-02.
 */
public interface PmAttchService {

    List<Pm_Attach> selectByPrimaryname(Long id);

    List<Pm_Archives> addPmattch(String title, Long id);


    List<Pm_Attach> selectByPid(String aa_filetitle);

    int deleteBy(Long aa_id);

    int insertSelective(Pm_Attach record);

    Pm_Attach  selectByname(String aa_archivesid, String aa_filetitle);
}
