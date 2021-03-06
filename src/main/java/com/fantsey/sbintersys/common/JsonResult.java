package com.fantsey.sbintersys.common;

import lombok.Data;

/**
 * @author fantsey
 * @date 2018/11/16
 */
public class JsonResult {
    private String msg;
    private Boolean success;
    private Object data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
