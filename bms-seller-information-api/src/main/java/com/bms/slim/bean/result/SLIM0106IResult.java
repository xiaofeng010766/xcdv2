package com.bms.slim.bean.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

@ApiModel(value = "SLIM0106IResult", description = "新增卖家经营资质API的返回对象")
public class SLIM0106IResult implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "提示信息")
    private String[] messages;
    @ApiModelProperty(value = "修改成功条数")
    private int count;
    @ApiModelProperty(value = "修改的卖家实体ID集合")
    private List<Long> sbqIds;

    public String[] getMessages() {
        return messages;
    }

    public void setMessages(String[] messages) {
        this.messages = messages;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Long> getSbqIds() {
        return sbqIds;
    }

    public void setSbqIds(List<Long> sbqIds) {
        this.sbqIds = sbqIds;
    }
}
