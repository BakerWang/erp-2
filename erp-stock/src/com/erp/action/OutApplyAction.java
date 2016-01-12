/*
 * @(#)OutApplyAction.java 2015-4-4 ����02:45:11 erp-manufacture
 */
package com.erp.action;

import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.erp.model.OutApply;
import com.erp.model.OutApplyDetail;
import com.erp.model.Product;

/**
 * OutApplyAction
 * @author wang
 * @version 1.0
 *
 */
@Component("outApplyAction")
@Scope("prototype")
public class OutApplyAction extends BaseAction {
    private OutApply outApply;

    private List<OutApply> outApplyList;

    private OutApplyDetail outApplyDetail;

    private List<OutApplyDetail> outApplyDetailList;

    private Product product;

    private List<Product> productList;

    public String listOutApply() {
        outApplyList = outApplyService.list();
        return SUCCESS;
    }

    public String saveOutApply() {
        outApply.setDate(new Date());
        outApply.setUser(loginUser);
        outApplyService.saveOrUpdate(outApply);
        msg = "success";
        return SUCCESS;
    }

    public String destoryOutApply() {
        outApply = outApplyService.getEntityById(outApply.getId());
        for (OutApplyDetail pd : outApply.getOutApplyDetailList()) {
            outApplyDetailService.delete(pd);
        }
        outApplyService.delete(outApply);
        return SUCCESS;
    }

    public String listOutApplyDetail() {
        productList = productService.list();
        outApply = outApplyService.getEntityById(outApply.getId());
        outApplyDetailList = outApply.getOutApplyDetailList();
        return SUCCESS;
    }

    public String saveOutApplyDetail() {
        outApplyDetailService.saveOrUpdate(outApplyDetail);
        msg = "success";
        return SUCCESS;
    }

    public String destoryOutApplyDetail() {
        outApplyDetailService.delete(outApplyDetail);
        return SUCCESS;
    }

    /**
     * ����  outApply
     * @return outApply
     */
    public OutApply getOutApply() {
        return outApply;
    }

    /**
     * ���� outApply
     * @param outApply outApply
     */
    public void setOutApply(OutApply outApply) {
        this.outApply = outApply;
    }

    /**
     * ����  outApplyList
     * @return outApplyList
     */
    public List<OutApply> getOutApplyList() {
        return outApplyList;
    }

    /**
     * ���� outApplyList
     * @param outApplyList outApplyList
     */
    public void setOutApplyList(List<OutApply> outApplyList) {
        this.outApplyList = outApplyList;
    }

    /**
     * ����  outApplyDetail
     * @return outApplyDetail
     */
    public OutApplyDetail getOutApplyDetail() {
        return outApplyDetail;
    }

    /**
     * ���� outApplyDetail
     * @param outApplyDetail outApplyDetail
     */
    public void setOutApplyDetail(OutApplyDetail outApplyDetail) {
        this.outApplyDetail = outApplyDetail;
    }

    /**
     * ����  outApplyDetailList
     * @return outApplyDetailList
     */
    public List<OutApplyDetail> getOutApplyDetailList() {
        return outApplyDetailList;
    }

    /**
     * ���� outApplyDetailList
     * @param outApplyDetailList outApplyDetailList
     */
    public void setOutApplyDetailList(List<OutApplyDetail> outApplyDetailList) {
        this.outApplyDetailList = outApplyDetailList;
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
