package com.morsearch.service.impl;

import com.morsearch.dao.PmV_Archives_shareMapper;
import com.morsearch.model.PmV_Archives_share;
import com.morsearch.service.PmVArchivesShareService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by hyt on 2017-10-30.
 */

@Service("PmVArchivesService")
public class PmVArchivesShareServiceImpl implements PmVArchivesShareService {
    @Resource
    private PmV_Archives_shareMapper pmV_archives_shareMapper;

    @Override
    public List<PmV_Archives_share> getShare(String pa_companyname,Long ur_id) {
        return pmV_archives_shareMapper.getShare(pa_companyname,ur_id);
    }

    @Override
    public PmV_Archives_share getArchivesShare(Long pa_id) {
        return pmV_archives_shareMapper.getArchivesShare(pa_id);
    }
}
