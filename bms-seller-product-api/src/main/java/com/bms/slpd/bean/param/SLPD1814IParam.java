package com.bms.slpd.bean.param;

import com.framework.base.rest.param.BaseRestPaginationParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(value = "SLPD1809IParam", description = "批量查询单品品牌规格代理商入参")
public class SLPD1814IParam extends BaseRestPaginationParam {

    @ApiModelProperty(value = "代理商实体卖家ID集合")
    private List<Long> asEntitySellerIds;

    /*@ApiModelProperty(value = "单品品牌规格代理商ID")
    private List<Long> asProductIds;
    @ApiModelProperty(value = "代理商产品生产商Sku")
    private String asProductSku;
    @ApiModelProperty(value = "代理商ID集合")
    private List<Long> agentSupplyIds;
    @ApiModelProperty(value = "代理商编码集合")
    private List<String> asProductCodes;
    @ApiModelProperty(value = "制造商产品生产商审核状态集合")
    private List<String> asAuditStus;*/

    @ApiModelProperty(value = "制造商产品生产商ID集合")
    private List<Long> manufacturerProductIds;
    @ApiModelProperty(value = "制造商产品生产商Sku")
    private String manufacturerProductSku;
    @ApiModelProperty(value = "制造商ID集合")
    private List<Long> manufacturerIds;
    @ApiModelProperty(value = "制造商编码集合")
    private List<String> manufacturerCodes;
    @ApiModelProperty(value = "制造名称")
    private String manufacturerName;
    @ApiModelProperty(value = "制造商产品生产商审核状态集合")
    private List<String> manufacturerAuditStus;
    @ApiModelProperty(value = "删除标识")
    private Boolean delFlg;

    @ApiModelProperty(value = "产品生产商ID集合")
    private List<Long> producerProductIds;
    @ApiModelProperty(value = "产品生产商Code")
    private String producerProductCode;
    @ApiModelProperty(value = "产品生产商Code集合")
    private List<String> producerProductCodes;
    @ApiModelProperty(value = "产品生产商Sku")
    private String producerProductSku;
    @ApiModelProperty(value = "产品生产商审核状态")
    private List<String> producerProductAuditStus;
    @ApiModelProperty(value = "生产商ID集合")
    private List<Long> producerIds;
    @ApiModelProperty(value = "生产商编码集合")
    private List<String> producerCodes;
    @ApiModelProperty(value = "生产商名称")
    private String producerName;

    @ApiModelProperty(value = "产品Id集合")
    private List<String> productIds;
    @ApiModelProperty(value = "质量等级集合")
    private List<String> qualityGradeTypes;
    @ApiModelProperty(value = "单品品牌规格Sku")
    private String brandItemPropertySku;
    @ApiModelProperty(value = "净重")
    private String netWeight;
    @ApiModelProperty(value = "产品审核状态集合")
    private List<String> productAuditStus;

    @ApiModelProperty(value = "单品规格ID集合")
    private List<Long> itemPropertyIds;
    @ApiModelProperty(value = "单品规格编码")
    private List<String> itemPropertyCodes;

    @ApiModelProperty(value = "单品品牌ID集合")
    private List<Long> brandItemIds;
    @ApiModelProperty(value = "单品品牌SKU集合")
    private List<String> brandItemSkus;

    @ApiModelProperty(value = "品牌ID集合")
    private List<Long> brandIds;
    @ApiModelProperty(value = "品牌编码集合")
    private List<String> brandCodes;
    @ApiModelProperty(value = "品牌名称")
    private String brandName;
    @ApiModelProperty(value = "品牌类型集合")
    private List<String> brandTypes;

    @ApiModelProperty(value = "单品ID集合")
    private List<Long> itemIds;
    @ApiModelProperty(value = "单品编码集合")
    private List<String> itemCodes;
    @ApiModelProperty(value = "单品SKU集合")
    private List<String> itemSkus;
    @ApiModelProperty(value = "单品名称")
    private String itemName;

    @ApiModelProperty(value = "品种ID集合")
    private List<Long> breedIds;
    @ApiModelProperty(value = "品种编码集合")
    private List<String> breedCodes;
    @ApiModelProperty(value = "品种SKU集合")
    private List<String> breedSkus;
    @ApiModelProperty(value = "品种标准市场销售名")
    private String breedSalesName;

    @ApiModelProperty(value = "二级分类ID集合")
    private List<Long> machiningIds;
    @ApiModelProperty(value = "二级分类编码集合")
    private List<String> machiningCodes;
    @ApiModelProperty(value = "二级分类名称")
    private String machiningName;

    @ApiModelProperty(value = "一级分类ID集合")
    private List<Long> classesIds;
    @ApiModelProperty(value = "一级分类编码集合")
    private List<String> classesCodes;
    @ApiModelProperty(value = "一级分类名称")
    private String classesName;

    public List<Long> getAsEntitySellerIds() {
        return asEntitySellerIds;
    }

    public void setAsEntitySellerIds(List<Long> asEntitySellerIds) {
        this.asEntitySellerIds = asEntitySellerIds;
    }

    public List<Long> getManufacturerProductIds() {
        return manufacturerProductIds;
    }

    public void setManufacturerProductIds(List<Long> manufacturerProductIds) {
        this.manufacturerProductIds = manufacturerProductIds;
    }

    public String getManufacturerProductSku() {
        return manufacturerProductSku;
    }

    public void setManufacturerProductSku(String manufacturerProductSku) {
        this.manufacturerProductSku = manufacturerProductSku;
    }

    public List<Long> getManufacturerIds() {
        return manufacturerIds;
    }

    public void setManufacturerIds(List<Long> manufacturerIds) {
        this.manufacturerIds = manufacturerIds;
    }

    public List<String> getManufacturerCodes() {
        return manufacturerCodes;
    }

    public void setManufacturerCodes(List<String> manufacturerCodes) {
        this.manufacturerCodes = manufacturerCodes;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public List<String> getManufacturerAuditStus() {
        return manufacturerAuditStus;
    }

    public void setManufacturerAuditStus(List<String> manufacturerAuditStus) {
        this.manufacturerAuditStus = manufacturerAuditStus;
    }

    public Boolean getDelFlg() {
        return delFlg;
    }

    public void setDelFlg(Boolean delFlg) {
        this.delFlg = delFlg;
    }

    public List<Long> getProducerProductIds() {
        return producerProductIds;
    }

    public void setProducerProductIds(List<Long> producerProductIds) {
        this.producerProductIds = producerProductIds;
    }

    public String getProducerProductCode() {
        return producerProductCode;
    }

    public void setProducerProductCode(String producerProductCode) {
        this.producerProductCode = producerProductCode;
    }

    public List<String> getProducerProductCodes() {
        return producerProductCodes;
    }

    public void setProducerProductCodes(List<String> producerProductCodes) {
        this.producerProductCodes = producerProductCodes;
    }

    public String getProducerProductSku() {
        return producerProductSku;
    }

    public void setProducerProductSku(String producerProductSku) {
        this.producerProductSku = producerProductSku;
    }

    public List<String> getProducerProductAuditStus() {
        return producerProductAuditStus;
    }

    public void setProducerProductAuditStus(List<String> producerProductAuditStus) {
        this.producerProductAuditStus = producerProductAuditStus;
    }

    public List<Long> getProducerIds() {
        return producerIds;
    }

    public void setProducerIds(List<Long> producerIds) {
        this.producerIds = producerIds;
    }

    public List<String> getProducerCodes() {
        return producerCodes;
    }

    public void setProducerCodes(List<String> producerCodes) {
        this.producerCodes = producerCodes;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public List<String> getProductIds() {
        return productIds;
    }

    public void setProductIds(List<String> productIds) {
        this.productIds = productIds;
    }

    public List<String> getQualityGradeTypes() {
        return qualityGradeTypes;
    }

    public void setQualityGradeTypes(List<String> qualityGradeTypes) {
        this.qualityGradeTypes = qualityGradeTypes;
    }

    public String getBrandItemPropertySku() {
        return brandItemPropertySku;
    }

    public void setBrandItemPropertySku(String brandItemPropertySku) {
        this.brandItemPropertySku = brandItemPropertySku;
    }

    public String getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(String netWeight) {
        this.netWeight = netWeight;
    }

    public List<String> getProductAuditStus() {
        return productAuditStus;
    }

    public void setProductAuditStus(List<String> productAuditStus) {
        this.productAuditStus = productAuditStus;
    }

    public List<Long> getItemPropertyIds() {
        return itemPropertyIds;
    }

    public void setItemPropertyIds(List<Long> itemPropertyIds) {
        this.itemPropertyIds = itemPropertyIds;
    }

    public List<String> getItemPropertyCodes() {
        return itemPropertyCodes;
    }

    public void setItemPropertyCodes(List<String> itemPropertyCodes) {
        this.itemPropertyCodes = itemPropertyCodes;
    }

    public List<Long> getBrandItemIds() {
        return brandItemIds;
    }

    public void setBrandItemIds(List<Long> brandItemIds) {
        this.brandItemIds = brandItemIds;
    }

    public List<String> getBrandItemSkus() {
        return brandItemSkus;
    }

    public void setBrandItemSkus(List<String> brandItemSkus) {
        this.brandItemSkus = brandItemSkus;
    }

    public List<Long> getBrandIds() {
        return brandIds;
    }

    public void setBrandIds(List<Long> brandIds) {
        this.brandIds = brandIds;
    }

    public List<String> getBrandCodes() {
        return brandCodes;
    }

    public void setBrandCodes(List<String> brandCodes) {
        this.brandCodes = brandCodes;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public List<String> getBrandTypes() {
        return brandTypes;
    }

    public void setBrandTypes(List<String> brandTypes) {
        this.brandTypes = brandTypes;
    }

    public List<Long> getItemIds() {
        return itemIds;
    }

    public void setItemIds(List<Long> itemIds) {
        this.itemIds = itemIds;
    }

    public List<String> getItemCodes() {
        return itemCodes;
    }

    public void setItemCodes(List<String> itemCodes) {
        this.itemCodes = itemCodes;
    }

    public List<String> getItemSkus() {
        return itemSkus;
    }

    public void setItemSkus(List<String> itemSkus) {
        this.itemSkus = itemSkus;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public List<Long> getBreedIds() {
        return breedIds;
    }

    public void setBreedIds(List<Long> breedIds) {
        this.breedIds = breedIds;
    }

    public List<String> getBreedCodes() {
        return breedCodes;
    }

    public void setBreedCodes(List<String> breedCodes) {
        this.breedCodes = breedCodes;
    }

    public List<String> getBreedSkus() {
        return breedSkus;
    }

    public void setBreedSkus(List<String> breedSkus) {
        this.breedSkus = breedSkus;
    }

    public String getBreedSalesName() {
        return breedSalesName;
    }

    public void setBreedSalesName(String breedSalesName) {
        this.breedSalesName = breedSalesName;
    }

    public List<Long> getMachiningIds() {
        return machiningIds;
    }

    public void setMachiningIds(List<Long> machiningIds) {
        this.machiningIds = machiningIds;
    }

    public List<String> getMachiningCodes() {
        return machiningCodes;
    }

    public void setMachiningCodes(List<String> machiningCodes) {
        this.machiningCodes = machiningCodes;
    }

    public String getMachiningName() {
        return machiningName;
    }

    public void setMachiningName(String machiningName) {
        this.machiningName = machiningName;
    }

    public List<Long> getClassesIds() {
        return classesIds;
    }

    public void setClassesIds(List<Long> classesIds) {
        this.classesIds = classesIds;
    }

    public List<String> getClassesCodes() {
        return classesCodes;
    }

    public void setClassesCodes(List<String> classesCodes) {
        this.classesCodes = classesCodes;
    }

    public String getClassesName() {
        return classesName;
    }

    public void setClassesName(String classesName) {
        this.classesName = classesName;
    }
}
