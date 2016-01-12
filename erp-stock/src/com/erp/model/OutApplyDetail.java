/*
 * @(#)InApplyDetail.java 2015-4-13 ����07:32:12 erp-stock
 */
package com.erp.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * InApplyDetail
 * @author wang
 * @version 1.0
 *
 */
@Entity
public class OutApplyDetail {
    private Integer id;

    private Product product;

    private Integer count;

    private String unit;

    private Integer price;

    private OutApply outApply;

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
     * ����  outApply
     * @return outApply
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "out_apply_id")
    public OutApply getOutApply() {
        return outApply;
    }

    /**
     * ���� outApply
     * @param outApply outApply
     */
    public void setOutApply(OutApply outApply) {
        this.outApply = outApply;
    }

}
