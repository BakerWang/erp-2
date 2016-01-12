/*
 * @(#)RecommendDetail.java 2015-4-19 ����07:20:52 erp-logistics
 */
package com.erp.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * RecommendDetail
 * @author wang
 * @version 1.0
 *
 */
@Entity
public class RecommendDetail {
    private Integer id;

    private Record record;

    private Recommend recommend;

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
     * ����  recommend
     * @return recommend
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recommend_id")
    public Recommend getRecommend() {
        return recommend;
    }

    /**
     * ���� recommend
     * @param recommend recommend
     */
    public void setRecommend(Recommend recommend) {
        this.recommend = recommend;
    }

}
