/*
 * @(#)ProcessAction.java 2015-4-4 ����02:45:11 erp-manufacture
 */
package com.erp.action;

import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.erp.model.Dispatch;
import com.erp.model.Materiel;
import com.erp.model.Product;
import com.erp.model.RealCost;

/**
 * ProcessAction
 * @author wang
 * @version 1.0
 *
 */
@Component("dispatchAction")
@Scope("prototype")
public class DispatchAction extends BaseAction {

    private List<Materiel> materielLsit;

    private List<Dispatch> dispatchList;

    private List<Product> productList;

    private Dispatch dispatch;

    public String listDispatch() {
        productList = productService.list();
        dispatchList = dispatchService.list();
        return SUCCESS;
    }

    public String saveDispatch() {
        dispatch.setUser(loginUser);
        dispatch.setDate(new Date());
        if (dispatch.getMateriel().getId() == null) {
            dispatch.setMateriel(null);
        }
        dispatchService.saveOrUpdate(dispatch);
        msg = "success";
        return SUCCESS;
    }

    public String updateDispatch() {
        dispatch.setUser(loginUser);
        dispatch.setDate(new Date());
        dispatchService.saveOrUpdate(dispatch);
        return SUCCESS;
    }

    public String destoryDispatch() {
        dispatch = dispatchService.getEntityById(dispatch.getId());
        for (RealCost rc : dispatch.getRealCost()) {
            realCostService.delete(rc);
        }
        dispatchService.delete(dispatch);
        return SUCCESS;
    }

    public String showDispatch() {
        dispatch = dispatchService.getEntityById(dispatch.getId());
        materielLsit = materielService.listByProduct(dispatch.getProduct());
        return SUCCESS;
    }

    /**
     * ����  materielLsit
     * @return materielLsit
     */
    public List<Materiel> getMaterielLsit() {
        return materielLsit;
    }

    /**
     * ���� materielLsit
     * @param materielLsit materielLsit
     */
    public void setMaterielLsit(List<Materiel> materielLsit) {
        this.materielLsit = materielLsit;
    }

    /**
     * ����  dispatchList
     * @return dispatchList
     */
    public List<Dispatch> getDispatchList() {
        return dispatchList;
    }

    /**
     * ���� dispatchList
     * @param dispatchList dispatchList
     */
    public void setDispatchList(List<Dispatch> dispatchList) {
        this.dispatchList = dispatchList;
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

    /**
     * ����  productList
     * @return productList
     */
    public List<Product> getProductList() {
        return productList;
    }

    /**
     * ���� productList
     * @param productList productList
     */
    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

}
