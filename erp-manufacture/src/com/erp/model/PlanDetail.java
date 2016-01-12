/*
 * @(#)PlanDetail.java 2015-4-4 ����01:50:01 erp-manufacture
 */
package com.erp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

/**
 * �����ƻ�ϸ��
 * @author wang
 * @version 1.0
 *
 */
@Entity
public class PlanDetail {
    private Integer id;

    private Product product;

    private String description;

    private Integer count;

    private String unit;

    private Date startDate;

    private Date endDate;

    private Plan plan;

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
     * ����  description
     * @return description
     */
    @Lob
    public String getDescription() {
        return description;
    }

    /**
     * ���� description
     * @param description description
     */
    public void setDescription(String description) {
        this.description = description;
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
     * ����  startDate
     * @return startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * ���� startDate
     * @param startDate startDate
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * ����  endDate
     * @return endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * ���� endDate
     * @param endDate endDate
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * ����  plan
     * @return plan
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "plan_id")
    public Plan getPlan() {
        return plan;
    }

    /**
     * ���� plan
     * @param plan plan
     */
    public void setPlan(Plan plan) {
        this.plan = plan;
    }
}
