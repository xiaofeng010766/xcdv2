package com.bms.issue.rest;

import java.util.ArrayList;
import java.util.List;

import com.bms.issue.archive.impl.QuestionItem;
import com.bms.issue.common.rest.result.RestSucceedData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.bms.issue.archive.impl.Operator;
import com.bms.issue.bean.param.ISSU0206IBean;
import com.bms.issue.common.rest.BusinessRestParam;
import com.bms.issue.common.rest.BusinessRestResult;
import com.bms.issue.common.rest.result.RestFailedData;
import com.bms.issue.service.ISSU0206IService;
import com.bms.issue.validator.ISSU0206IRestValidator;
import com.framework.boot.base.BaseRestController;
import com.framework.exception.BusinessException;
import com.framework.exception.bean.BusinessExceptionMessage;
import com.framework.i18n.util.MessageManager;
import com.framework.validator.annotation.Validator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 问题点新增接口Controller
 *
 * @author li_huiqian
 */
@RestController
@Api(tags = {"ISSU0206IRestController"}, description = "问题点新增接口")
public class ISSU0206IRestController extends BaseRestController {

    @Autowired
    private ISSU0206IService service;

    /**
     * 接收问题点信息，新增问题点
     *
     * @param param BusinessRestParam
     * @return BusinessRestResult
     */
    @ApiOperation(value = "问题点新增接口", notes = "接收问题点信息，新增问题点")
    @Validator(validatorClass = ISSU0206IRestValidator.class)
    @RequestMapping(value = "/issue/question/item/_create", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public BusinessRestResult execute(@RequestBody BusinessRestParam<ISSU0206IBean> param) {
        List<ISSU0206IBean> beans = param.getBeans();
        Operator operator = Operator.Builder.build(param.getOperator());
        BusinessRestResult result = new BusinessRestResult();

        int processedCount = 0; // 处理条数
        int succeedCount = 0; // 处理成功条数
        int failedCount = 0; // 处理失败条数

        for (int i = 0; i < beans.size(); i++) {
            ISSU0206IBean bean = beans.get(i);
            try {
                QuestionItem questionItem = service.execute(operator, bean);
                RestSucceedData succeedData = new RestSucceedData();
                succeedData.setSucceedId(questionItem.getEntity().getItemId());
                succeedData.setIndex(i);
                result.putSucceedData(succeedData);
                succeedCount++;
            } catch (BusinessException e) {
                e.printStackTrace();
                BusinessExceptionMessage bem = e.getBusinessExceptionMessages().get(0); // 没有多message的Exception
                RestFailedData failedData = new RestFailedData();
                failedData.setIndex(i);
                failedData.setErrorParams(bem.getMessageParams());
                failedData.setModuleName(bem.getModuleName());
                failedData.setErrorCode(bem.getMessageCode());
                failedData.setErrorMessage(MessageManager.getMessage(bem.getMessageCode(), bem.getMessageParams()));
                result.putFailedData(failedData);
                failedCount ++;
            } finally {
                processedCount++;
            }
        }

        result.setProcessedCount(processedCount);
        result.setSucceedCount(succeedCount);
        result.setFailedCount(failedCount);
        return result;
    }
}
