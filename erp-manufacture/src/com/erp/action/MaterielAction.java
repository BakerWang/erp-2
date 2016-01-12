/*
 * @(#)MaterielAction.java 2015-4-4 ����03:42:44 erp-manufacture
 */
package com.erp.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.erp.model.Materiel;
import com.erp.model.MaterielDetail;
import com.erp.model.Process;
import com.erp.model.ProcessDetail;

/**
 * MaterielAction
 * @author wang
 * @version 1.0
 *
 */
@Component("materielAction")
@Scope("prototype")
public class MaterielAction extends BaseAction {
    private List<Process> processList;

    private Process process;

    private List<Materiel> materielList;

    private Materiel materiel;

    private List<MaterielDetail> materielDetailList;

    private MaterielDetail materielDetail;

    public String listMateriel() {
        materielList = materielService.list();
        return SUCCESS;
    }

    public String saveMateriel() {
        materielService.saveOrUpdate(materiel);
        process = processService.getEntityById(materiel.getProcess().getId());
        for (ProcessDetail pd : process.getProcessDetailList()) {
            MaterielDetail md = new MaterielDetail();
            md.setMateriel(materiel);
            md.setProcessDetail(pd);
            materielDetailService.save(md);
        }
        return SUCCESS;
    }

    public String saveMaterielDetail() {
        materielDetailService.saveOrUpdate(materielDetail);
        msg = "success";
        return SUCCESS;
    }

    public String showMateriel() {
        materiel = materielService.getEntityById(materiel.getId());
        return SUCCESS;
    }

    public String destoryMateriel() {
        materiel = materielService.getEntityById(materiel.getId());
        for (MaterielDetail md : materiel.getMaterielDetailList()) {
            materielDetailService.delete(md);
        }
        materielService.delete(materiel);
        return SUCCESS;
    }

    /**
     * ����  processList
     * @return processList
     */
    public List<Process> getProcessList() {
        return processList;
    }

    /**
     * ���� processList
     * @param processList processList
     */
    public void setProcessList(List<Process> processList) {
        this.processList = processList;
    }

    /**
     * ����  process
     * @return process
     */
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
     * ����  materielList
     * @return materielList
     */
    public List<Materiel> getMaterielList() {
        return materielList;
    }

    /**
     * ���� materielList
     * @param materielList materielList
     */
    public void setMaterielList(List<Materiel> materielList) {
        this.materielList = materielList;
    }

    /**
     * ����  materiel
     * @return materiel
     */
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

    /**
     * ����  materielDetailList
     * @return materielDetailList
     */
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
     * ����  materielDetail
     * @return materielDetail
     */
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
}
