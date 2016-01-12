/*
 * @(#)RealCostAction.java 2015-4-4 ����07:27:28 erp-manufacture
 */
package com.erp.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.erp.model.Dispatch;
import com.erp.model.MaterielDetail;
import com.erp.model.RealCost;

/**
 * RealCostAction
 * @author wang
 * @version 1.0
 *
 */
@Component("realCostAction")
@Scope("prototype")
public class RealCostAction extends BaseAction {
    private RealCost realCost;

    private List<RealCost> realCostList;

    private Dispatch dispatch;

    public String listRealCost() {
        realCostList = realCostService.listByDispatch(dispatch);
        dispatch = dispatchService.getEntityById(dispatch.getId());
        if (realCostList.isEmpty()) {
            for (MaterielDetail md : dispatch.getMateriel()
                    .getMaterielDetailList()) {
                RealCost rc = new RealCost();
                rc.setMaterielDetail(md);
                rc.setDispatch(dispatch);
                realCostService.save(rc);
            }
            realCostList = realCostService.listByDispatch(dispatch);
        }
        return SUCCESS;
    }

    public String saveRealCost() {
        realCostService.saveOrUpdate(realCost);
        msg = "success";
        return SUCCESS;
    }

    public String destoryRealCost() {
        realCostService.delete(realCost);
        return SUCCESS;
    }

    /**
     * ����  realCost
     * @return realCost
     */
    public RealCost getRealCost() {
        return realCost;
    }

    /**
     * ���� realCost
     * @param realCost realCost
     */
    public void setRealCost(RealCost realCost) {
        this.realCost = realCost;
    }

    /**
     * ����  realCostList
     * @return realCostList
     */
    public List<RealCost> getRealCostList() {
        return realCostList;
    }

    /**
     * ���� realCostList
     * @param realCostList realCostList
     */
    public void setRealCostList(List<RealCost> realCostList) {
        this.realCostList = realCostList;
    }

    /**
     * ����  dispatch
     * @return dispatch
     */
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
