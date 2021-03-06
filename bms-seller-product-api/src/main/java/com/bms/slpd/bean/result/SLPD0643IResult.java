package com.bms.slpd.bean.result;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

@ApiModel(value = "SLPD0643IResult",
        description = "新增储存运输标准指标差异接口出参")
public class SLPD0643IResult implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "新增数量")
    private Integer count;
    @ApiModelProperty(value = "新增储存运输标准指标差异Id列表")
    private List<Long> tspDifStdIds;
    @ApiModelProperty(value = "返回消息")
    private String[] message;


    public List<Long> getTspDifStdIds() {
        return tspDifStdIds;
    }

    public void setTspDifStdIds(List<Long> tspDifStdIds) {
        this.tspDifStdIds = tspDifStdIds;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String[] getMessage() {
        return message;
    }

    public void setMessage(String[] message) {
        this.message = message;
    }
}
