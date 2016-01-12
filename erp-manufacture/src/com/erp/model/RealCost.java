/*
 * @(#)RealCost.java 2015-4-4 ����02:12:17 erp-manufacture
 */
package com.erp.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * ʵ�ʳɱ�
 * @author wang
 * @version 1.0
 *
 */
@Entity
public class RealCost {
    private Integer id;

    private MaterielDetail materielDetail;

    private Integer time;

    private Integer timeCost;

    private Integer materielCost;

    private Dispatch dispatch;

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
     * ����  materielDetail
     * @return materielDetail
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "materiel_detail_id")
    public MaterielDetail getMaterielDetail() {
        return materielDetail;
    }

    /**
     * ���� materielDetail
     * @param materielDetail materielDetail
     */
    public void setMaterielDetail(MaterielDetail materielDetail) {
        this.materielDetail = materielDetail;
    }

    /**
     * ����  time
     * @return time
     */
    public Integer getTime() {
        return time;
    }

    /**
     * ���� time
     * @param time time
     */
    public void setTime(Integer time) {
        this.time = time;
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

    /**
     * ����  materielCost
     * @return materielCost
     */
    public Integer getMaterielCost() {
        return materielCost;
    }

    /**
     * ���� materielCost
     * @param materielCost materielCost
     */
    public void setMaterielCost(Integer materielCost) {
        this.materielCost = materielCost;
    }

    /**
     * ����  dispatch
     * @return dispatch
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dispatch_id")
    public Dispatch getDispatch() {
        return dispatch;
    }

    /**
     * ���� dispatch
     * @param dispatch dispatch
     */
    public void setDispatch(Dispatch dispatch) {
        this.dispatch = dispatch;
    }
}
