/*
 * @(#)Ad.java 2015-5-6 ����07:44:21 erp-office
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
 * Ad
 * @author wang
 * @version 1.0
 *
 */
@Entity
public class Ad {
    private Integer id;

    private String title;

    private String type;

    private String organ;

    private String content;

    private String realFileName;
    
    private String fileName;

    private String remark;

    private User user;

    private Date date;

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
     * ����  title
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * ���� title
     * @param title title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * ����  type
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * ���� type
     * @param type type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * ����  organ
     * @return organ
     */
    public String getOrgan() {
        return organ;
    }

    /**
     * ���� organ
     * @param organ organ
     */
    public void setOrgan(String organ) {
        this.organ = organ;
    }

    /**
     * ����  content
     * @return content
     */
    @Lob
    public String getContent() {
        return content;
    }

    /**
     * ���� content
     * @param content content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * ����  fileName
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * ���� fileName
     * @param fileName fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
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
     * ����  realFileName
     * @return realFileName
     */
    public String getRealFileName() {
        return realFileName;
    }

    /**
     * ���� realFileName
     * @param realFileName realFileName
     */
    public void setRealFileName(String realFileName) {
        this.realFileName = realFileName;
    }
}
