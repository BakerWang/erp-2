/*
 * @(#)Recommend.java 2015-4-19 ����07:20:44 erp-logistics
 */
package com.erp.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Recommend
 * @author wang
 * @version 1.0
 *
 */
@Entity
public class Recommend {
    private Integer id;

    private Product product;

    private String designer;

    private List<RecommendDetail> recommendDetailList;

    private User user;

    private Date date;

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
     * ����  designer
     * @return designer
     */
    public String getDesigner() {
        return designer;
    }

    /**
     * ���� designer
     * @param designer designer
     */
    public void setDesigner(String designer) {
        this.designer = designer;
    }

    /**
     * ����  recommendDetailList
     * @return recommendDetailList
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "recommend")
    public List<RecommendDetail> getRecommendDetailList() {
        return recommendDetailList;
    }

    /**
     * ���� recommendDetailList
     * @param recommendDetailList recommendDetailList
     */
    public void setRecommendDetailList(List<RecommendDetail> recommendDetailList) {
        this.recommendDetailList = recommendDetailList;
    }

    /**
     * ����  user
     * @return user
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    public User getUser() {
        return user;
    }

    /**
     * ���� user
     * @param user user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * ����  date
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * ���� date
     * @param date date
     */
    public void setDate(Date date) {
        this.date = date;
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
}
