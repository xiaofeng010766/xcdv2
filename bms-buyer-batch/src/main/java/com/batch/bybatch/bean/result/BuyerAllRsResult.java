package com.batch.bybatch.bean.result;

import java.io.Serializable;
import java.util.Date;

/**
 * @author yuan_zhifei
 * @version 1.0
 */
public class BuyerAllRsResult implements Serializable {
    //买家ID
    private String buyerId;
    //店铺ID
    private Long storeId;
    //买家编码
    private String buyerCode;
    //买家显示编码
    private String displayCode;
    //买家类型
    private String buyerType;
    //买家类型名称
    private String buyerTypeName;
    //买家一级分类
    private String buyerFirstCategory;
    //买家一级分类名称
    private String buyerFirstCategoryName;
    //买家二级分类
    private String buyerSubCategory;
    //买家二级分类名称
    private String buyerSubCategoryName;
    //买家名称
    private String buyerName;
    //买家地址
    private String buyerAddr;
    //物流区ID
    private Long lgcsAreaId;
    //物流区编码
    private String lgcsAreaCode;
    //物流区名称
    private String lgcsAreaName;
    //省ID
    private Long provinceId;
    //省编码
    private String provinceCode;
    //省名称
    private String provinceName;
    //城市ID
    private Long cityId;
    //城市编码
    private String cityCode;
    //城市名称
    private String cityName;
    //区县ID
    private Long districtId;
    //区县编码
    private String districtCode;
    //区县名称
    private String districtName;
    //街道ID
    private Long streetId;
    //街道编码
    private String streetCode;
    //街道名称
    private String streetName;
    //买家QQ
    private String buyerQq;
    //买家微信
    private String buyerWechat;
    //上线状态一级分类
    private String marketingFirstStatus;
    //上线状态一级分类名称
    private String marketingFirstStatusName;
    //上线状态二级分类
    private String marketingSubStatus;
    //上线状态二级分类名称
    private String marketingSubStatusName;
    //是否信息错误
    private boolean infoErrorFlg;
    //信息错误备注
    private String infoErrorRemark;
    //注册来源
    private String registerSource;
    //注册来源名称
    private String registerSourceName;
    //市场ID
    private String marketId;
    //市场编码
    private String marketCode;
    //市场名称
    private String marketName;
    //市场类型
    private String marketType;
    //市场规模
    private String marketScale;
    //是否为账期用户买手
    private Boolean isCreditTermBuyer;
    //是否总部控制采购连锁
    private Boolean isControlPuerchasngChain;
    /**
     * 有多个时以逗号隔开
     */
    private String paymentType;
    //正常收货时间
    private String normalReceiveTime;
    //最早时间
    private String earliestTime;
    //最晚时间
    private String latestTime;
    //电话营销时间段
    private String telMarketingTime;
    //电话营销号码
    private String telMarketingNo;
    //微信营销号
    private String wechatMarketingNo;
    //QQ营销号
    private String qqMarketingNo;
    //法人名称
    private String legalPaperName;
    //法人证件类型
    private String legalPaperType;
    //法人证件号
    private String legalPaperNo;
    //法人证件照地址
    private String legalPaperPic;
    //店铺经营地址
    private String storeAddr;
    //店铺号
    private String storeNo;
    //店铺营业电话
    private String storeTel;
    //店铺网址
    private String storeWebsite;
    //店铺微信公众号
    private String storeWechat;
    //店铺营业执照类型
    private String storeLicenseType;
    //店铺营业执照号
    private String storeLicenseNo;
    //是否默认店铺
    private boolean defaultStoreFlg;
    //登记人
    private String registrantId;
    //登记日
    private Date registrantDate;
    //预注册人
    private String preRegistrantId;
    //预注册日
    private Date preRegistrationDate;
    //老板名称
    private String bossName;
    //老板手机
    private String bossTel;
    //老板微信
    private String bossWechat;
    //老板QQ
    private String bossQq;
    //删除标志
    private boolean delFlg;
    //创建者
    private String crtId;
    //创建时间
    private Date crtTime;
    //更新着
    private String updId;
    //更新时间
    private Date updTime;
    //版本号
    private Integer version;
    //注册帐号名称
    private String accountName;
    //注册邮箱
    private String mailAddr;
    //注册电话
    private String telNo;
    //注册密码
    private String password;
    //物流区划地区主键
    private Long zoneId;
    //物流区划地区编码
    private String zoneCode;
    //物流区划地区名称
    private String zoneName;
    //配送站主键
    private Long distributionId;
    //配送站编码
    private String distributionCode;
    //配送站名称
    private String distributionName;
    //领地ID
    private Long demesneId;
    //领地编码
    private String demesneCode;
    //领地名称
    private String demesneName;
    //常客买家等级（频次）
    private String frequenterLevelF;
    //常客买家等级（量级）
    private String frequenterLevelA;
    //常客买家等级编码
    private String frequenterLevelCode;
    //买家定性评级
    private String grade;
    //账期周期类型
    private String paymentPeriodType;
    //账期周期名称
    private String paymentPeriodName;

    public Boolean getIsCreditTermBuyer() {
        return isCreditTermBuyer;
    }

    public void setIsCreditTermBuyer(Boolean isCreditTermBuyer) {
        this.isCreditTermBuyer = isCreditTermBuyer;
    }

    public Boolean getIsControlPuerchasngChain() {
        return isControlPuerchasngChain;
    }

    public void setIsControlPuerchasngChain(Boolean isControlPuerchasngChain) {
        this.isControlPuerchasngChain = isControlPuerchasngChain;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDisplayCode() {
        return displayCode;
    }

    public void setDisplayCode(String displayCode) {
        this.displayCode = displayCode;
    }

    public String getBossTel() {
        return bossTel;
    }

    public void setBossTel(String bossTel) {
        this.bossTel = bossTel;
    }

    public String getBossWechat() {
        return bossWechat;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getMailAddr() {
        return mailAddr;
    }

    public void setMailAddr(String mailAddr) {
        this.mailAddr = mailAddr;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public void setBossWechat(String bossWechat) {
        this.bossWechat = bossWechat;
    }

    public String getBossQq() {
        return bossQq;
    }

    public void setBossQq(String bossQq) {
        this.bossQq = bossQq;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getBuyerCode() {
        return buyerCode;
    }

    public void setBuyerCode(String buyerCode) {
        this.buyerCode = buyerCode;
    }

    public String getBuyerType() {
        return buyerType;
    }

    public void setBuyerType(String buyerType) {
        this.buyerType = buyerType;
    }

    public String getBuyerTypeName() {
        return buyerTypeName;
    }

    public void setBuyerTypeName(String buyerTypeName) {
        this.buyerTypeName = buyerTypeName;
    }

    public String getBuyerFirstCategory() {
        return buyerFirstCategory;
    }

    public void setBuyerFirstCategory(String buyerFirstCategory) {
        this.buyerFirstCategory = buyerFirstCategory;
    }

    public String getBuyerFirstCategoryName() {
        return buyerFirstCategoryName;
    }

    public void setBuyerFirstCategoryName(String buyerFirstCategoryName) {
        this.buyerFirstCategoryName = buyerFirstCategoryName;
    }

    public String getBuyerSubCategory() {
        return buyerSubCategory;
    }

    public void setBuyerSubCategory(String buyerSubCategory) {
        this.buyerSubCategory = buyerSubCategory;
    }

    public String getBuyerSubCategoryName() {
        return buyerSubCategoryName;
    }

    public void setBuyerSubCategoryName(String buyerSubCategoryName) {
        this.buyerSubCategoryName = buyerSubCategoryName;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerAddr() {
        return buyerAddr;
    }

    public void setBuyerAddr(String buyerAddr) {
        this.buyerAddr = buyerAddr;
    }

    public Long getLgcsAreaId() {
        return lgcsAreaId;
    }

    public void setLgcsAreaId(Long lgcsAreaId) {
        this.lgcsAreaId = lgcsAreaId;
    }

    public String getLgcsAreaCode() {
        return lgcsAreaCode;
    }

    public void setLgcsAreaCode(String lgcsAreaCode) {
        this.lgcsAreaCode = lgcsAreaCode;
    }

    public String getLgcsAreaName() {
        return lgcsAreaName;
    }

    public void setLgcsAreaName(String lgcsAreaName) {
        this.lgcsAreaName = lgcsAreaName;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Long getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Long districtId) {
        this.districtId = districtId;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public Long getStreetId() {
        return streetId;
    }

    public void setStreetId(Long streetId) {
        this.streetId = streetId;
    }

    public String getStreetCode() {
        return streetCode;
    }

    public void setStreetCode(String streetCode) {
        this.streetCode = streetCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getBuyerQq() {
        return buyerQq;
    }

    public void setBuyerQq(String buyerQq) {
        this.buyerQq = buyerQq;
    }

    public String getBuyerWechat() {
        return buyerWechat;
    }

    public void setBuyerWechat(String buyerWechat) {
        this.buyerWechat = buyerWechat;
    }

    public String getMarketingFirstStatus() {
        return marketingFirstStatus;
    }

    public void setMarketingFirstStatus(String marketingFirstStatus) {
        this.marketingFirstStatus = marketingFirstStatus;
    }

    public String getMarketingFirstStatusName() {
        return marketingFirstStatusName;
    }

    public void setMarketingFirstStatusName(String marketingFirstStatusName) {
        this.marketingFirstStatusName = marketingFirstStatusName;
    }

    public String getMarketingSubStatus() {
        return marketingSubStatus;
    }

    public void setMarketingSubStatus(String marketingSubStatus) {
        this.marketingSubStatus = marketingSubStatus;
    }

    public String getMarketingSubStatusName() {
        return marketingSubStatusName;
    }

    public void setMarketingSubStatusName(String marketingSubStatusName) {
        this.marketingSubStatusName = marketingSubStatusName;
    }

    public String getRegisterSource() {
        return registerSource;
    }

    public void setRegisterSource(String registerSource) {
        this.registerSource = registerSource;
    }

    public String getRegisterSourceName() {
        return registerSourceName;
    }

    public void setRegisterSourceName(String registerSourceName) {
        this.registerSourceName = registerSourceName;
    }

    public String getMarketId() {
        return marketId;
    }

    public void setMarketId(String marketId) {
        this.marketId = marketId;
    }

    public String getMarketCode() {
        return marketCode;
    }

    public void setMarketCode(String marketCode) {
        this.marketCode = marketCode;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public String getMarketType() {
        return marketType;
    }

    public void setMarketType(String marketType) {
        this.marketType = marketType;
    }

    public String getMarketScale() {
        return marketScale;
    }

    public void setMarketScale(String marketScale) {
        this.marketScale = marketScale;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getNormalReceiveTime() {
        return normalReceiveTime;
    }

    public void setNormalReceiveTime(String normalReceiveTime) {
        this.normalReceiveTime = normalReceiveTime;
    }

    public String getEarliestTime() {
        return earliestTime;
    }

    public void setEarliestTime(String earliestTime) {
        this.earliestTime = earliestTime;
    }

    public String getLatestTime() {
        return latestTime;
    }

    public void setLatestTime(String latestTime) {
        this.latestTime = latestTime;
    }

    public String getTelMarketingTime() {
        return telMarketingTime;
    }

    public void setTelMarketingTime(String telMarketingTime) {
        this.telMarketingTime = telMarketingTime;
    }

    public String getTelMarketingNo() {
        return telMarketingNo;
    }

    public String getRegistrantId() {
        return registrantId;
    }

    public void setRegistrantId(String registrantId) {
        this.registrantId = registrantId;
    }

    public Date getRegistrantDate() {
        return registrantDate;
    }

    public void setRegistrantDate(Date registrantDate) {
        this.registrantDate = registrantDate;
    }

    public String getPreRegistrantId() {
        return preRegistrantId;
    }

    public void setPreRegistrantId(String preRegistrantId) {
        this.preRegistrantId = preRegistrantId;
    }

    public Date getPreRegistrationDate() {
        return preRegistrationDate;
    }

    public void setPreRegistrationDate(Date preRegistrationDate) {
        this.preRegistrationDate = preRegistrationDate;
    }

    public void setTelMarketingNo(String telMarketingNo) {
        this.telMarketingNo = telMarketingNo;
    }

    public String getWechatMarketingNo() {
        return wechatMarketingNo;
    }

    public void setWechatMarketingNo(String wechatMarketingNo) {
        this.wechatMarketingNo = wechatMarketingNo;
    }

    public String getQqMarketingNo() {
        return qqMarketingNo;
    }

    public void setQqMarketingNo(String qqMarketingNo) {
        this.qqMarketingNo = qqMarketingNo;
    }

    public String getLegalPaperType() {
        return legalPaperType;
    }

    public void setLegalPaperType(String legalPaperType) {
        this.legalPaperType = legalPaperType;
    }

    public String getLegalPaperNo() {
        return legalPaperNo;
    }

    public void setLegalPaperNo(String legalPaperNo) {
        this.legalPaperNo = legalPaperNo;
    }

    public String getLegalPaperPic() {
        return legalPaperPic;
    }

    public void setLegalPaperPic(String legalPaperPic) {
        this.legalPaperPic = legalPaperPic;
    }

    public String getStoreAddr() {
        return storeAddr;
    }

    public void setStoreAddr(String storeAddr) {
        this.storeAddr = storeAddr;
    }

    public String getStoreNo() {
        return storeNo;
    }

    public void setStoreNo(String storeNo) {
        this.storeNo = storeNo;
    }

    public String getStoreTel() {
        return storeTel;
    }

    public void setStoreTel(String storeTel) {
        this.storeTel = storeTel;
    }

    public String getStoreWebsite() {
        return storeWebsite;
    }

    public void setStoreWebsite(String storeWebsite) {
        this.storeWebsite = storeWebsite;
    }

    public String getStoreWechat() {
        return storeWechat;
    }

    public void setStoreWechat(String storeWechat) {
        this.storeWechat = storeWechat;
    }

    public String getStoreLicenseType() {
        return storeLicenseType;
    }

    public void setStoreLicenseType(String storeLicenseType) {
        this.storeLicenseType = storeLicenseType;
    }

    public String getStoreLicenseNo() {
        return storeLicenseNo;
    }

    public void setStoreLicenseNo(String storeLicenseNo) {
        this.storeLicenseNo = storeLicenseNo;
    }

    public boolean isDefaultStoreFlg() {
        return defaultStoreFlg;
    }

    public void setDefaultStoreFlg(boolean defaultStoreFlg) {
        this.defaultStoreFlg = defaultStoreFlg;
    }

    public boolean isDelFlg() {
        return delFlg;
    }

    public void setDelFlg(boolean delFlg) {
        this.delFlg = delFlg;
    }

    public String getCrtId() {
        return crtId;
    }

    public void setCrtId(String crtId) {
        this.crtId = crtId;
    }

    public Date getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    public String getUpdId() {
        return updId;
    }

    public void setUpdId(String updId) {
        this.updId = updId;
    }

    public Date getUpdTime() {
        return updTime;
    }

    public void setUpdTime(Date updTime) {
        this.updTime = updTime;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getBossName() {
        return bossName;
    }

    public void setBossName(String bossName) {
        this.bossName = bossName;
    }

    public String getLegalPaperName() {
        return legalPaperName;
    }

    public void setLegalPaperName(String legalPaperName) {
        this.legalPaperName = legalPaperName;
    }

    public boolean isInfoErrorFlg() {
        return infoErrorFlg;
    }

    public void setInfoErrorFlg(boolean infoErrorFlg) {
        this.infoErrorFlg = infoErrorFlg;
    }

    public String getInfoErrorRemark() {
        return infoErrorRemark;
    }

    public void setInfoErrorRemark(String infoErrorRemark) {
        this.infoErrorRemark = infoErrorRemark;
    }

    public Long getZoneId() {
        return zoneId;
    }

    public void setZoneId(Long zoneId) {
        this.zoneId = zoneId;
    }

    public String getZoneCode() {
        return zoneCode;
    }

    public void setZoneCode(String zoneCode) {
        this.zoneCode = zoneCode;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public Long getDistributionId() {
        return distributionId;
    }

    public void setDistributionId(Long distributionId) {
        this.distributionId = distributionId;
    }

    public String getDistributionCode() {
        return distributionCode;
    }

    public void setDistributionCode(String distributionCode) {
        this.distributionCode = distributionCode;
    }

    public String getDistributionName() {
        return distributionName;
    }

    public void setDistributionName(String distributionName) {
        this.distributionName = distributionName;
    }

    public Long getDemesneId() {
        return demesneId;
    }

    public void setDemesneId(Long demesneId) {
        this.demesneId = demesneId;
    }

    public String getDemesneCode() {
        return demesneCode;
    }

    public void setDemesneCode(String demesneCode) {
        this.demesneCode = demesneCode;
    }

    public String getDemesneName() {
        return demesneName;
    }

    public void setDemesneName(String demesneName) {
        this.demesneName = demesneName;
    }

    public String getFrequenterLevelF() {
        return frequenterLevelF;
    }

    public void setFrequenterLevelF(String frequenterLevelF) {
        this.frequenterLevelF = frequenterLevelF;
    }

    public String getFrequenterLevelA() {
        return frequenterLevelA;
    }

    public void setFrequenterLevelA(String frequenterLevelA) {
        this.frequenterLevelA = frequenterLevelA;
    }

    public String getFrequenterLevelCode() {
        return frequenterLevelCode;
    }

    public void setFrequenterLevelCode(String frequenterLevelCode) {
        this.frequenterLevelCode = frequenterLevelCode;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getPaymentPeriodType() {
        return paymentPeriodType;
    }

    public void setPaymentPeriodType(String paymentPeriodType) {
        this.paymentPeriodType = paymentPeriodType;
    }

    public String getPaymentPeriodName() {
        return paymentPeriodName;
    }

    public void setPaymentPeriodName(String paymentPeriodName) {
        this.paymentPeriodName = paymentPeriodName;
    }
}
