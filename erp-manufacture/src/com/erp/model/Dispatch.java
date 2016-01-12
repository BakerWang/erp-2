/*
 * @(#)Dispatch.java 2015-4-4 ����01:54:21 erp-manufacture
 */
package com.erp.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * �ɹ�
 * @author wang
 * @version 1.0
 *
 */
@Entity
public class Dispatch {
    private Integer id;

    private String designer;

    private User user;

    private Date date;

    private Date startDate;

    private Date endDate;

    private Product product;

    private String description;

    private Integer count;

    private Materiel materiel;

    private String remark;

    private List<RealCost> realCost;

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
     * ����  materiel
     * @return materiel
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "materiel_id")
    public Materiel getMateriel() {
        return materiel;
    }

    /**
     * ���� materiel
     * @param materiel materiel
     */
    public void setMateriel(Materiel materiel) {
        this.materiel = materiel;
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
     * ����  realCost
     * @return realCost
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "dispatch")
    public List<RealCost> getRealCost() {
        return realCost;
    }

    /**
     * ���� realCost
     * @param realCost realCost
     */
    public void setRealCost(List<RealCost> realCost) {
        this.realCost = realCost;
    }

}
