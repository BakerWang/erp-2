/*
 * @(#)Materiel.java 2015-4-4 ����01:59:42 erp-manufacture
 */
package com.erp.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * ����
 * @author wang
 * @version 1.0
 *
 */
@Entity
public class Materiel {
    private Integer id;

    private Process process;

    private List<MaterielDetail> materielDetailList;

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
     * ����  materielDetailList
     * @return materielDetailList
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "materiel")
    public List<MaterielDetail> getMaterielDetailList() {
        return materielDetailList;
    }

    /**
     * ���� materielDetailList
     * @param materielDetailList materielDetailList
     */
    public void setMaterielDetailList(List<MaterielDetail> materielDetailList) {
        this.materielDetailList = materielDetailList;
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

}
