/*
 * 2017/03/01 自动生成 新規作成
 *
 * (c) 江苏润和.
 */
package com.bms.agif.service;

import com.bms.agif.bean.param.ButlerAddressRsParam;
import com.framework.boot.base.BaseService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>AgifButlerAddressService接口。</p>
 *
 * @author 自动生成
 * @version 1.00
 */
public interface AgifButlerAddressService extends BaseService {
    @Transactional
    int addButlerAddressList(List<ButlerAddressRsParam> butlerAddressList);
}