package com.morsearch.model;

import java.util.Date;

public class DesigV_Collect_Pm {
    private Long dm_id;

    private Long dm_archivesid;

    private Long dm_createid;

    private String dm_createno;

    private Date dm_createdate;

    private Date dateshort;

    private String pa_title;

    private Long pa_userid;

    private String pa_username;

    public Long getDm_id() {
        return dm_id;
    }

    public void setDm_id(Long dm_id) {
        this.dm_id = dm_id;
    }

    public Long getDm_archivesid() {
        return dm_archivesid;
    }

    public void setDm_archivesid(Long dm_archivesid) {
        this.dm_archivesid = dm_archivesid;
    }

    public Long getDm_createid() {
        return dm_createid;
    }

    public void setDm_createid(Long dm_createid) {
        this.dm_createid = dm_createid;
    }

    public String getDm_createno() {
        return dm_createno;
    }

    public void setDm_createno(String dm_createno) {
        this.dm_createno = dm_createno;
    }

    public Date getDm_createdate() {
        return dm_createdate;
    }

    public void setDm_createdate(Date dm_createdate) {
        this.dm_createdate = dm_createdate;
    }

    public Date getDateshort() {
        return dateshort;
    }

    public void setDateshort(Date dateshort) {
        this.dateshort = dateshort;
    }

    public String getPa_title() {
        return pa_title;
    }

    public void setPa_title(String pa_title) {
        this.pa_title = pa_title;
    }

    public Long getPa_userid() {
        return pa_userid;
    }

    public void setPa_userid(Long pa_userid) {
        this.pa_userid = pa_userid;
    }

    public String getPa_username() {
        return pa_username;
    }

    public void setPa_username(String pa_username) {
        this.pa_username = pa_username;
    }
}