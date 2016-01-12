/*
 * @(#)InInternal.java 2015-4-13 ����07:36:47 erp-stock
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
 * InInternal
 * @author wang
 * @version 1.0
 *
 */
@Entity
public class InInternal {
    private Integer id;

    private String name;

    private List<InInternalDetail> inInternalDetailList;

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
     * ����  name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * ���� name
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ����  inInternalDetailList
     * @return inInternalDetailList
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "inInternal")
    public List<InInternalDetail> getInInternalDetailList() {
        return inInternalDetailList;
    }

    /**
     * ���� inInternalDetailList
     * @param inInternalDetailList inInternalDetailList
     */
    public void setInInternalDetailList(
            List<InInternalDetail> inInternalDetailList) {
        this.inInternalDetailList = inInternalDetailList;
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
