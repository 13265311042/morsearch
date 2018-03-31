package com.morsearch.vo;

import com.morsearch.common.constant.Constants;

/**
 * Leo Li
 * Created by hyt on 2017/9/15.
 */
public class AppResult {
    private static final long serialVersionUID = 1L;
    private int status;/*返回状态码*/;
    private String message; /*返回信息*/
    private String errorcode;/*状态错误码*/;
    private AppPage page; /*返回页码*/
    private Object data; /*返回内容列表*/

    public Object getData() {
        return data;
    }
    public AppPage getPage() {
        return page;
    }

    public void setPage(AppPage page) {
        this.page = page;
    }

    public void setData(Object data) {
        this.data = data;
    }
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorcode() {
        return errorcode;
    }

    public void setErrorcode(String errorcode) {
        this.errorcode = errorcode;
    }




}
