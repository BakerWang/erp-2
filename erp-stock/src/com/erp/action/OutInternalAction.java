/*
 * @(#)OutInternalAction.java 2015-4-4 ����02:45:11 erp-manufacture
 */
package com.erp.action;

import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.erp.model.OutInternal;
import com.erp.model.OutInternalDetail;
import com.erp.model.Product;

/**
 * OutInternalAction
 * @author wang
 * @version 1.0
 *
 */
@Component("outInternalAction")
@Scope("prototype")
public class OutInternalAction extends BaseAction {
    private OutInternal outInternal;

    private List<OutInternal> outInternalList;

    private OutInternalDetail outInternalDetail;

    private List<OutInternalDetail> outInternalDetailList;

    private Product product;

    private List<Product> productList;

    public String listOutInternal() {
        outInternalList = outInternalService.list();
        return SUCCESS;
    }

    public String saveOutInternal() {
        outInternal.setDate(new Date());
        outInternal.setUser(loginUser);
        outInternalService.saveOrUpdate(outInternal);
        msg = "success";
        return SUCCESS;
    }

    public String destoryOutInternal() {
        outInternal = outInternalService.getEntityById(outInternal.getId());
        for (OutInternalDetail pd : outInternal.getOutInternalDetailList()) {
            outInternalDetailService.delete(pd);
        }
        outInternalService.delete(outInternal);
        return SUCCESS;
    }

    public String listOutInternalDetail() {
        productList = productService.list();
        outInternal = outInternalService.getEntityById(outInternal.getId());
        outInternalDetailList = outInternal.getOutInternalDetailList();
        return SUCCESS;
    }

    public String saveOutInternalDetail() {
        outInternalDetailService.saveOrUpdate(outInternalDetail);
        msg = "success";
        return SUCCESS;
    }

    public String destoryOutInternalDetail() {
        outInternalDetailService.delete(outInternalDetail);
        return SUCCESS;
    }

    /**
     * ����  outInternal
     * @return outInternal
     */
    public OutInternal getOutInternal() {
        return outInternal;
    }

    /**
     * ���� outInternal
     * @param outInternal outInternal
     */
    public void setOutInternal(OutInternal outInternal) {
        this.outInternal = outInternal;
    }

    /**
     * ����  outInternalList
     * @return outInternalList
     */
    public List<OutInternal> getOutInternalList() {
        return outInternalList;
    }

    /**
     * ���� outInternalList
     * @param outInternalList outInternalList
     */
    public void setOutInternalList(List<OutInternal> outInternalList) {
        this.outInternalList = outInternalList;
    }

    /**
     * ����  outInternalDetail
     * @return outInternalDetail
     */
    public OutInternalDetail getOutInternalDetail() {
        return outInternalDetail;
    }

    /**
     * ���� outInternalDetail
     * @param outInternalDetail outInternalDetail
     */
    public void setOutInternalDetail(OutInternalDetail outInternalDetail) {
        this.outInternalDetail = outInternalDetail;
    }

    /**
     * ����  outInternalDetailList
     * @return outInternalDetailList
     */
    public List<OutInternalDetail> getOutInternalDetailList() {
        return outInternalDetailList;
    }

    /**
     * ���� outInternalDetailList
     * @param outInternalDetailList outInternalDetailList
     */
    public void setOutInternalDetailList(List<OutInternalDetail> outInternalDetailList) {
        this.outInternalDetailList = outInternalDetailList;
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
