package com.morsearch.service;

import com.morsearch.model.PmV_Archives_share;

import java.util.List;

/**
 * Created by hyt on 2017-10-30.
 */
public interface PmVArchivesShareService {

    List<PmV_Archives_share> getShare(String pa_companyname, Long ur_id);

    PmV_Archives_share getArchivesShare(Long pa_id);
}
