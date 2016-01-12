/*
 * @(#)Plan.java 2015-5-6 ����07:37:33 erp-office
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
 * Plan
 * @author wang
 * @version 1.0
 *
 */
@Entity
public class Plan {
    private Integer id;

    private String title;

    private String type;

    private Meeting meeting;

    private String organ;

    private String name;

    private Date startDate;

    private Date endDate;

    private String content;

    private String realFileName;

    private String fileName;

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
     * ����  meeting
     * @return meeting
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "meeting_id")
    public Meeting getMeeting() {
        return meeting;
    }

    /**
     * ���� meeting
     * @param meeting meeting
     */
    public void setMeeting(Meeting meeting) {
        this.meeting = meeting;
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
