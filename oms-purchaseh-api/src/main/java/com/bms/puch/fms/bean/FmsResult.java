package com.bms.puch.fms.bean;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * Created by yuan_zhifei on 2017/5/3
 *
 * FmsPushBean
 */
@ApiModel(value = "FmsPushBean", description = "FMS返回的内容")
public class FmsResult implements Serializable {
    private static final long serialVersionUID = 5544395295280167843L;
    private String returnCode;
    private String returnMessage;

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }

}
