/*
 * @(#)MaterielDetail.java 2015-4-4 ����01:59:49 erp-manufacture
 */
package com.erp.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * ����ϸ��
 * @author wang
 * @version 1.0
 *
 */
@Entity
public class MaterielDetail {
    private Integer id;

    private ProcessDetail processDetail;

    private Integer cost;

    private Materiel materiel;

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
     * ����  processDetail
     * @return processDetail
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "process_detail_id")
    public ProcessDetail getProcessDetail() {
        return processDetail;
    }

    /**
     * ���� processDetail
     * @param processDetail processDetail
     */
    public void setProcessDetail(ProcessDetail processDetail) {
        this.processDetail = processDetail;
    }

    /**
     * ����  cost
     * @return cost
     */
    public Integer getCost() {
        return cost;
    }

    /**
     * ���� cost
     * @param cost cost
     */
    public void setCost(Integer cost) {
        this.cost = cost;
    }

    /**
     * ����  materiel
     * @return materiel
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "materiel_id")
    public Materiel getMateriel() {
        return materiel;
    }

    /**
     * ���� materiel
     * @param materiel materiel
     */
    public void setMateriel(Materiel materiel) {
        this.materiel = materiel;
    }

}
