/*
 * @(#)Report.java 2015-5-6 ����07:49:14 erp-office
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
 * Report
 * @author wang
 * @version 1.0
 *
 */
@Entity
public class Report {
    private Integer id;

    private User user;

    private Date date;

    private String type;

    private String content;

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
}
