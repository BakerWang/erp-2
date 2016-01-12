/*
 * @(#)InInternalDetail.java 2015-4-13 ����07:37:55 erp-stock
 */
package com.erp.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * InInternalDetail
 * @author wang
 * @version 1.0
 *
 */
@Entity
public class OutInternalDetail {
    private Integer id;

    private OutInternal outInternal;

    private Product product;

    private String unit;

    private Integer count;

    private Integer price;

    private String remark;

    /**
     * ����  id
     * @return id
     */
    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    /**
     * ���� id
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * ����  product
     * @return product
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    public Product getProduct() {
        return product;
    }

    /**
     * ���� product
     * @param product product
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * ����  unit
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * ���� unit
     * @param unit unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * ����  count
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * ���� count
     * @param count count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * ����  price
     * @return price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * ���� price
     * @param price price
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * ����  remark
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * ���� remark
     * @param remark remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * ����  outInternal
     * @return outInternal
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "out_internal_id")
    public OutInternal getOutInternal() {
        return outInternal;
    }

    /**
     * ���� outInternal
     * @param outInternal outInternal
     */
    public void setOutInternal(OutInternal outInternal) {
        this.outInternal = outInternal;
    }

}
