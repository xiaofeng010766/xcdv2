/*
 * 2017/04/14 自动生成 新規作成
 *
 * (c) 江苏润和.
 */
 package com.bms.linv.services.impl;
import com.bms.linv.dao.InvmLoadAlocDealDetailDao;
import com.bms.linv.services.InvmLoadAlocDealDetailService;
import com.framework.boot.base.BaseDao;
 import com.framework.boot.base.BaseServiceImpl;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 /**
 * <p>InvmLoadAlocDealDetailService接口实现类。</p>
 *
 * @author 自动生成
 * @version 1.00
 */
 @Service
 public class InvmLoadAlocDealDetailServiceImpl extends BaseServiceImpl implements InvmLoadAlocDealDetailService {

    @Autowired
    private InvmLoadAlocDealDetailDao invmLoadAlocDealDetailDao;

    @Override
    public BaseDao getBaseDao() {
      return invmLoadAlocDealDetailDao;
    }
 }