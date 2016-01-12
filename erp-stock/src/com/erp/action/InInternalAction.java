/*
 * @(#)InInternalAction.java 2015-4-4 ����02:45:11 erp-manufacture
 */
package com.erp.action;

import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.erp.model.InInternal;
import com.erp.model.InInternalDetail;
import com.erp.model.Product;

/**
 * InInternalAction
 * @author wang
 * @version 1.0
 *
 */
@Component("inInternalAction")
@Scope("prototype")
public class InInternalAction extends BaseAction {
    private InInternal inInternal;

    private List<InInternal> inInternalList;

    private InInternalDetail inInternalDetail;

    private List<InInternalDetail> inInternalDetailList;

    private Product product;

    private List<Product> productList;

    public String listInInternal() {
        inInternalList = inInternalService.list();
        return SUCCESS;
    }

    public String saveInInternal() {
        inInternal.setDate(new Date());
        inInternal.setUser(loginUser);
        inInternalService.saveOrUpdate(inInternal);
        msg = "success";
        return SUCCESS;
    }

    public String destoryInInternal() {
        inInternal = inInternalService.getEntityById(inInternal.getId());
        for (InInternalDetail pd : inInternal.getInInternalDetailList()) {
            inInternalDetailService.delete(pd);
        }
        inInternalService.delete(inInternal);
        return SUCCESS;
    }

    public String listInInternalDetail() {
        productList = productService.list();
        inInternal = inInternalService.getEntityById(inInternal.getId());
        inInternalDetailList = inInternal.getInInternalDetailList();
        return SUCCESS;
    }

    public String saveInInternalDetail() {
        inInternalDetailService.saveOrUpdate(inInternalDetail);
        msg = "success";
        return SUCCESS;
    }

    public String destoryInInternalDetail() {
        inInternalDetailService.delete(inInternalDetail);
        return SUCCESS;
    }

    /**
     * ����  inInternal
     * @return inInternal
     */
    public InInternal getInInternal() {
        return inInternal;
    }

    /**
     * ���� inInternal
     * @param inInternal inInternal
     */
    public void setInInternal(InInternal inInternal) {
        this.inInternal = inInternal;
    }

    /**
     * ����  inInternalList
     * @return inInternalList
     */
    public List<InInternal> getInInternalList() {
        return inInternalList;
    }

    /**
     * ���� inInternalList
     * @param inInternalList inInternalList
     */
    public void setInInternalList(List<InInternal> inInternalList) {
        this.inInternalList = inInternalList;
    }

    /**
     * ����  inInternalDetail
     * @return inInternalDetail
     */
    public InInternalDetail getInInternalDetail() {
        return inInternalDetail;
    }

    /**
     * ���� inInternalDetail
     * @param inInternalDetail inInternalDetail
     */
    public void setInInternalDetail(InInternalDetail inInternalDetail) {
        this.inInternalDetail = inInternalDetail;
    }

    /**
     * ����  inInternalDetailList
     * @return inInternalDetailList
     */
    public List<InInternalDetail> getInInternalDetailList() {
        return inInternalDetailList;
    }

    /**
     * ���� inInternalDetailList
     * @param inInternalDetailList inInternalDetailList
     */
    public void setInInternalDetailList(List<InInternalDetail> inInternalDetailList) {
        this.inInternalDetailList = inInternalDetailList;
    }

    /**
     * ����  product
     * @return product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * ���� product
     * @param product product
     */
    public void setProduct(Product product) {
        this.product = product;
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
