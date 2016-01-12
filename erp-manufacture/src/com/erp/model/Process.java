/*
 * @(#)Process.java 2015-4-4 ����01:42:12 erp-manufacture
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
 * ��������
 * @author wang
 * @version 1.0
 *
 */
@Entity
public class Process {
    private Integer id;

    private Product product;

    private String designer;

    private List<ProcessDetail> processDetailList;

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
     * ����  processDetailList
     * @return processDetailList
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "process")
    public List<ProcessDetail> getProcessDetailList() {
        return processDetailList;
    }

    /**
     * ���� processDetailList
     * @param processDetailList processDetailList
     */
    public void setProcessDetailList(List<ProcessDetail> processDetailList) {
        this.processDetailList = processDetailList;
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
}
