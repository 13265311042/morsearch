package com.morsearch.service.impl;

import com.morsearch.common.constant.Constants;
import com.morsearch.dao.Pm_ArchivesMapper;
import com.morsearch.dao.Pm_AttachMapper;
import com.morsearch.model.Pm_Archives;
import com.morsearch.model.Pm_Attach;
import com.morsearch.service.PmAttchService;
import com.morsearch.vo.AppResult;
import com.morsearch.vo.Pm_Ar;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by ywh on 2017-11-02.
 */
@Service("PmAttchService")
public class PmAttchServiceImpl implements PmAttchService {

    @Resource
    private Pm_AttachMapper pmAttachMapper;
    @Resource
    private Pm_ArchivesMapper pmArchivesMapper;

    @Override
    public List<Pm_Attach> selectByPrimaryname(Long id) {
        return pmAttachMapper.selectByPrimaryname(id);
    }

    @Override
    public List<Pm_Archives> addPmattch(String title, Long id) {

       /* Pm_Ar pmArchive = new Pm_Ar();
        Pm_Archives pmArchives1 = new Pm_Archives();
        Pm_Attach pmAttach = new Pm_Attach();

        List<Pm_Archives> pmArchives = pmArchivesMapper.getPmarchives(title);

            Pm_Archives pm = pmArchives.get(0);
            pmArchives1.setPa_title(pm.getPa_title());
            pmArchives1.setPa_major(pm.getPa_major());
            pmArchives1.setPa_style(pm.getPa_style());
            pmArchives1.setPa_filename(pm.getPa_filename());
            pmArchives1.setPa_attachqty(pm.getPa_attachqty());
            pmArchives1.setPa_sharepid(pm.getPa_id());
            pmArchives1.setPa_flagstop(pm.getPa_flagstop());
            pmArchives1.setPa_flagshare(pm.getPa_flagshare());
            pmArchives1.setPa_confirmid(pm.getPa_confirmid());
            pmArchives1.setPa_confirmno(pm.getPa_confirmno());
            pmArchives1.setPa_confirmdate(pm.getPa_confirmdate());
            pmArchives1.setPa_status(pm.getPa_status());
            pmArchives1.setPa_content(pm.getPa_content());
            pmArchives1.setPa_features(pm.getPa_features());
            pmArchives1.setPa_companyname(pm.getPa_companyname());
            pmArchives1.setPa_companyid(pm.getPa_companyid());
            pmArchives1.setPa_createid(Long.valueOf(id));
            pmArchives1.setPa_createno(createno);
            pmArchives1.setPa_createdate(new Date());
            pmArchives1.setPa_flagnews(false);
            pmArchivesMapper.insertSelective(pmArchives1);
            pmArchive.setId(pmArchives1.getPa_id());


            List<Pm_Attach> pm_attaches = pmAttachMapper.selectByPrimaryname(pm.getPa_id());
            for (int i = 0; i < pm_attaches.size(); i++) {
                pmAttach.setAa_filename(pm_attaches.get(i).getAa_filename());
                pmAttach.setAa_filetype(pm_attaches.get(i).getAa_filetype());
                pmAttach.setAa_filetitle(pm_attaches.get(i).getAa_filetitle());
                pmAttach.setAa_archivesid(pmArchives1.getPa_id());
                pmAttach.setAa_pagecount(pm_attaches.get(i).getAa_pagecount());
                pmAttach.setAa_createdate(pm_attaches.get(i).getAa_createdate());
                pmAttachMapper.insertSelective(pmAttach);
                pmAttach.setAa_id(pmAttach.getAa_id()+1+i);

            }*/
        return pmArchivesMapper.get_Pmarchives(title,id);


        }


    @Override
    public  List<Pm_Attach> selectByPid( String aa_filetitle) {
        return pmAttachMapper.selectByPid(aa_filetitle);
    }

    @Override
    public int deleteBy(Long aa_id) {
        return pmAttachMapper.deleteBy(aa_id);
    }

    @Override
    public int insertSelective(Pm_Attach record) {
        return pmAttachMapper.insertSelective(record);
    }

    @Override
    public Pm_Attach selectByname(String aa_archivesid, String aa_filetitle) {
        return pmAttachMapper.selectByname(aa_archivesid,aa_filetitle);
    }
}
