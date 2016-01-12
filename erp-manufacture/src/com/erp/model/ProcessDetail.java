/*
 * @(#)Process.java 2015-4-4 ����01:39:02 erp-manufacture
 */
package com.erp.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

/**
 * ��������ϸ��
 * @author wang
 * @version 1.0
 *
 */
@Entity
public class ProcessDetail {
    private Integer id;

    private String name;

    private String description;

    private Integer workTime;

    private String unit;

    private Integer timeCost;
    
    private Process process;

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
     * ����  workTime
     * @return workTime
     */
    public Integer getWorkTime() {
        return workTime;
    }

    /**
     * ���� workTime
     * @param workTime workTime
     */
    public void setWorkTime(Integer workTime) {
        this.workTime = workTime;
    }

    /**
     * ����  unit
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * ���� unit
     * @param unit unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * ����  process
     * @return process
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "process_id")
    public Process getProcess() {
        return process;
    }

    /**
     * ���� process
     * @param process process
     */
    public void setProcess(Process process) {
        this.process = process;
    }

    /**
     * ����  timeCost
     * @return timeCost
     */
    public Integer getTimeCost() {
        return timeCost;
    }

    /**
     * ���� timeCost
     * @param timeCost timeCost
     */
    public void setTimeCost(Integer timeCost) {
        this.timeCost = timeCost;
    }

}
