package com.morsearch.vo;

/**
 * 自定义异常
 *
 * Leoli
 * 2018.03.20
 */
public class ApiCustomException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private int status=0;/*返回状态码*/;
    private String message; /*返回信息*/
    private String errorcode="500";/*状态错误码*/;


    public ApiCustomException(String errmsg) {
        super(errmsg);
        this.message = errmsg;
    }

    public ApiCustomException(String errmsg, Throwable e) {
        super(errmsg, e);
        this.message = errmsg;
    }

    public ApiCustomException(String errmsg, String errno) {
        super(errmsg);
        this.message = errmsg;
        this.errorcode = errno;
    }

    public ApiCustomException(String errmsg, String errno, Throwable e) {
        super(errmsg, e);
        this.message = errmsg;
        this.errorcode = errno;
    }


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
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
