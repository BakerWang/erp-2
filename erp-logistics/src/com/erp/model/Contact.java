/*
 * @(#)Contact.java 2015-4-19 ����07:26:26 erp-logistics
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
 * Contact
 * @author wang
 * @version 1.0
 *
 */
@Entity
public class Contact {
    private Integer id;

    private Record record;

    private String reason;

    private String content;

    private Date date;

    private User user;

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
     * ����  record
     * @return record
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "record_id")
    public Record getRecord() {
        return record;
    }

    /**
     * ���� record
     * @param record record
     */
    public void setRecord(Record record) {
        this.record = record;
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

}
