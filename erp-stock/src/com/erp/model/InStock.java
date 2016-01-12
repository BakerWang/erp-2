/*
 * @(#)InStock.java 2015-4-13 ����07:44:37 erp-stock
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
 * InStock
 * @author wang
 * @version 1.0
 *
 */
@Entity
public class InStock {
    private Integer id;

    private String reason;

    private List<InStockDetail> inStockDetailList;

    private User user;

    private Date date;

    private Integer count;

    private Integer actualCount;

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
     * ����  actualCount
     * @return actualCount
     */
    public Integer getActualCount() {
        return actualCount;
    }

    /**
     * ���� actualCount
     * @param actualCount actualCount
     */
    public void setActualCount(Integer actualCount) {
        this.actualCount = actualCount;
    }

    /**
     * ����  reason
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * ���� reason
     * @param reason reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * ����  inStockDetailList
     * @return inStockDetailList
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "inStock")
    public List<InStockDetail> getInStockDetailList() {
        return inStockDetailList;
    }

    /**
     * ���� inStockDetailList
     * @param inStockDetailList inStockDetailList
     */
    public void setInStockDetailList(List<InStockDetail> inStockDetailList) {
        this.inStockDetailList = inStockDetailList;
    }

}
