/*
 * @(#)InApply.java 2015-4-13 ����07:31:10 erp-stock
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
 * InApply
 * @author wang
 * @version 1.0
 *
 */
@Entity
public class OutApply {
    private Integer id;

    private String designer;

    private String reason;

    private Boolean back;

    private Date backDate;

    private List<OutApplyDetail> outApplyDetailList;

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
     * ����  back
     * @return back
     */
    public Boolean getBack() {
        return back;
    }

    /**
     * ���� back
     * @param back back
     */
    public void setBack(Boolean back) {
        this.back = back;
    }

    /**
     * ����  backDate
     * @return backDate
     */
    public Date getBackDate() {
        return backDate;
    }

    /**
     * ���� backDate
     * @param backDate backDate
     */
    public void setBackDate(Date backDate) {
        this.backDate = backDate;
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

    /**
     * ����  outApplyDetailList
     * @return outApplyDetailList
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "outApply")
    public List<OutApplyDetail> getOutApplyDetailList() {
        return outApplyDetailList;
    }

    /**
     * ���� outApplyDetailList
     * @param outApplyDetailList outApplyDetailList
     */
    public void setOutApplyDetailList(List<OutApplyDetail> outApplyDetailList) {
        this.outApplyDetailList = outApplyDetailList;
    }
}
