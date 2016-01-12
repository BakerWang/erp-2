/*
 * @(#)OutStockAction.java 2015-4-4 ����02:45:11 erp-manufacture
 */
package com.erp.action;

import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.erp.model.OutStock;
import com.erp.model.OutStockDetail;
import com.erp.model.Product;

/**
 * OutStockAction
 * @author wang
 * @version 1.0
 *
 */
@Component("outStockAction")
@Scope("prototype")
public class OutStockAction extends BaseAction {
    private OutStock outStock;

    private List<OutStock> outStockList;

    private OutStockDetail outStockDetail;

    private List<OutStockDetail> outStockDetailList;

    private Product product;

    private List<Product> productList;

    public String listOutStock() {
        outStockList = outStockService.list();
        return SUCCESS;
    }

    public String saveOutStock() {
        outStock.setDate(new Date());
        outStock.setUser(loginUser);
        outStockService.saveOrUpdate(outStock);
        msg = "success";
        return SUCCESS;
    }

    public String destoryOutStock() {
        outStock = outStockService.getEntityById(outStock.getId());
        for (OutStockDetail pd : outStock.getOutStockDetailList()) {
            outStockDetailService.delete(pd);
        }
        outStockService.delete(outStock);
        return SUCCESS;
    }

    public String listOutStockDetail() {
        productList = productService.list();
        outStock = outStockService.getEntityById(outStock.getId());
        outStockDetailList = outStock.getOutStockDetailList();
        return SUCCESS;
    }

    public String saveOutStockDetail() {
        outStockDetailService.saveOrUpdate(outStockDetail);
        msg = "success";
        return SUCCESS;
    }

    public String destoryOutStockDetail() {
        outStockDetailService.delete(outStockDetail);
        return SUCCESS;
    }

    /**
     * ����  outStock
     * @return outStock
     */
    public OutStock getOutStock() {
        return outStock;
    }

    /**
     * ���� outStock
     * @param outStock outStock
     */
    public void setOutStock(OutStock outStock) {
        this.outStock = outStock;
    }

    /**
     * ����  outStockList
     * @return outStockList
     */
    public List<OutStock> getOutStockList() {
        return outStockList;
    }

    /**
     * ���� outStockList
     * @param outStockList outStockList
     */
    public void setOutStockList(List<OutStock> outStockList) {
        this.outStockList = outStockList;
    }

    /**
     * ����  outStockDetail
     * @return outStockDetail
     */
    public OutStockDetail getOutStockDetail() {
        return outStockDetail;
    }

    /**
     * ���� outStockDetail
     * @param outStockDetail outStockDetail
     */
    public void setOutStockDetail(OutStockDetail outStockDetail) {
        this.outStockDetail = outStockDetail;
    }

    /**
     * ����  outStockDetailList
     * @return outStockDetailList
     */
    public List<OutStockDetail> getOutStockDetailList() {
        return outStockDetailList;
    }

    /**
     * ���� outStockDetailList
     * @param outStockDetailList outStockDetailList
     */
    public void setOutStockDetailList(List<OutStockDetail> outStockDetailList) {
        this.outStockDetailList = outStockDetailList;
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
