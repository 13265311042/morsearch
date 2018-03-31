package com.morsearch.model;

import java.util.Date;

public class Msg_News {
    private Long mn_id;

    private Integer mn_index;

    private String mn_title;

    private String mn_headpic;

    private Boolean mn_headisv;

    private String mn_keyword;

    private Integer mn_clickqty;

    private Byte mn_type;

    private String mn_createno;

    private Date mn_createdate;

    private Byte mn_status;

    private String mn_content;

    public Long getMn_id() {
        return mn_id;
    }

    public void setMn_id(Long mn_id) {
        this.mn_id = mn_id;
    }

    public Integer getMn_index() {
        return mn_index;
    }

    public void setMn_index(Integer mn_index) {
        this.mn_index = mn_index;
    }

    public String getMn_title() {
        return mn_title;
    }

    public void setMn_title(String mn_title) {
        this.mn_title = mn_title;
    }

    public String getMn_headpic() {
        return mn_headpic;
    }

    public void setMn_headpic(String mn_headpic) {
        this.mn_headpic = mn_headpic;
    }

    public Boolean getMn_headisv() {
        return mn_headisv;
    }

    public void setMn_headisv(Boolean mn_headisv) {
        this.mn_headisv = mn_headisv;
    }

    public String getMn_keyword() {
        return mn_keyword;
    }

    public void setMn_keyword(String mn_keyword) {
        this.mn_keyword = mn_keyword;
    }

    public Integer getMn_clickqty() {
        return mn_clickqty;
    }

    public void setMn_clickqty(Integer mn_clickqty) {
        this.mn_clickqty = mn_clickqty;
    }

    public Byte getMn_type() {
        return mn_type;
    }

    public void setMn_type(Byte mn_type) {
        this.mn_type = mn_type;
    }

    public String getMn_createno() {
        return mn_createno;
    }

    public void setMn_createno(String mn_createno) {
        this.mn_createno = mn_createno;
    }

    public Date getMn_createdate() {
        return mn_createdate;
    }

    public void setMn_createdate(Date mn_createdate) {
        this.mn_createdate = mn_createdate;
    }

    public Byte getMn_status() {
        return mn_status;
    }

    public void setMn_status(Byte mn_status) {
        this.mn_status = mn_status;
    }

    public String getMn_content() {
        return mn_content;
    }

    public void setMn_content(String mn_content) {
        this.mn_content = mn_content;
    }
}