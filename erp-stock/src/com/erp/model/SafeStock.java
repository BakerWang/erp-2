/*
 * @(#)SafeStock.java 2015-4-13 ����07:07:10 erp-stock
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
 * SafeStock
 * @author wang
 * @version 1.0
 *
 */
@Entity
public class SafeStock {
    private Integer id;

    private Product product;

    private List<SafeStockDetail> safeStockDetailList;

    private String alertButtom;

    private String alertTop;

    private String designer;

    private User user;

    private Date date;

    private String description;

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
     * ����  safeStockDetailList
     * @return safeStockDetailList
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "safeStock")
    public List<SafeStockDetail> getSafeStockDetailList() {
        return safeStockDetailList;
    }

    /**
     * ���� safeStockDetailList
     * @param safeStockDetailList safeStockDetailList
     */
    public void setSafeStockDetailList(List<SafeStockDetail> safeStockDetailList) {
        this.safeStockDetailList = safeStockDetailList;
    }

    /**
     * ����  alertButtom
     * @return alertButtom
     */
    public String getAlertButtom() {
        return alertButtom;
    }

    /**
     * ���� alertButtom
     * @param alertButtom alertButtom
     */
    public void setAlertButtom(String alertButtom) {
        this.alertButtom = alertButtom;
    }

    /**
     * ����  alertTop
     * @return alertTop
     */
    public String getAlertTop() {
        return alertTop;
    }

    /**
     * ���� alertTop
     * @param alertTop alertTop
     */
    public void setAlertTop(String alertTop) {
        this.alertTop = alertTop;
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
     * ����  description
     * @return description
     */
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
}
