/*
 * 2017/03/02 自动生成 新规作成
 *
 * (c) 江苏润和
 */
package com.bms.agif.bean.entity;

import com.framework.base.rest.entity.BaseEntity;

/**
 * <p>表AGIF_PARTNER_ACCOUNT对应的实体AgifPartnerAccount</p>
 *
 * @author 自动生成
 * @version 1.0.0
 */
public class AgifPartnerAccount extends BaseEntity {
    /** 序列号 */
    private static final long serialVersionUID = 1L;
    /** ACCOUNT_ID */
    private Long accountId;
    /** PARTNER_ID */
    private String partnerId;
    /** ACCOUNT_NAME */
    private String accountName;
    /** PASSWORD */
    private String password;
    /** TEL_NO */
    private String telNo;
    /** MAIL_ADDR */
    private String mailAddr;

    /**
     * <p>默认构造函数</p>
     */
    public AgifPartnerAccount() {
    }

    /**
     * <p>ACCOUNT_ID</p>
     *
     * @return ACCOUNT_ID
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * <p>ACCOUNT_ID</p>
     *
     * @param accountId ACCOUNT_ID
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }
    /**
     * <p>PARTNER_ID</p>
     *
     * @return PARTNER_ID
     */
    public String getPartnerId() {
        return partnerId;
    }

    /**
     * <p>PARTNER_ID</p>
     *
     * @param partnerId PARTNER_ID
     */
    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }
    /**
     * <p>ACCOUNT_NAME</p>
     *
     * @return ACCOUNT_NAME
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * <p>ACCOUNT_NAME</p>
     *
     * @param accountName ACCOUNT_NAME
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    /**
     * <p>PASSWORD</p>
     *
     * @return PASSWORD
     */
    public String getPassword() {
        return password;
    }

    /**
     * <p>PASSWORD</p>
     *
     * @param password PASSWORD
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * <p>TEL_NO</p>
     *
     * @return TEL_NO
     */
    public String getTelNo() {
        return telNo;
    }

    /**
     * <p>TEL_NO</p>
     *
     * @param telNo TEL_NO
     */
    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }
    /**
     * <p>MAIL_ADDR</p>
     *
     * @return MAIL_ADDR
     */
    public String getMailAddr() {
        return mailAddr;
    }

    /**
     * <p>MAIL_ADDR</p>
     *
     * @param mailAddr MAIL_ADDR
     */
    public void setMailAddr(String mailAddr) {
        this.mailAddr = mailAddr;
    }

}
