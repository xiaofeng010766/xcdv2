/*
 * 2017/01/10 自动生成 新規作成
 *
 * (c) 江苏润和.
 */
package com.bms.prce.service;

import com.bms.prce.bean.param.PRCE0210IParam;
import com.framework.boot.base.BaseService;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>PrcePricePlateRefreshService。</p>
 *
 * @author 自动生成
 * @version 1.00
 */
public interface PrcePricePlateRefreshService extends BaseService {
    @Transactional
    void refreshPricePlate(PRCE0210IParam param);
}