/*
 * @(#)InStockAction.java 2015-4-4 ����02:45:11 erp-manufacture
 */
package com.erp.action;

import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.erp.model.InStock;
import com.erp.model.InStockDetail;
import com.erp.model.Product;

/**
 * InStockAction
 * @author wang
 * @version 1.0
 *
 */
@Component("inStockAction")
@Scope("prototype")
public class InStockAction extends BaseAction {
    private InStock inStock;

    private List<InStock> inStockList;

    private InStockDetail inStockDetail;

    private List<InStockDetail> inStockDetailList;

    private Product product;

    private List<Product> productList;

    public String listInStock() {
        inStockList = inStockService.list();
        return SUCCESS;
    }

    public String saveInStock() {
        inStock.setDate(new Date());
        inStock.setUser(loginUser);
        inStockService.saveOrUpdate(inStock);
        msg = "success";
        return SUCCESS;
    }

    public String destoryInStock() {
        inStock = inStockService.getEntityById(inStock.getId());
        for (InStockDetail pd : inStock.getInStockDetailList()) {
            inStockDetailService.delete(pd);
        }
        inStockService.delete(inStock);
        return SUCCESS;
    }

    public String listInStockDetail() {
        productList = productService.list();
        inStock = inStockService.getEntityById(inStock.getId());
        inStockDetailList = inStock.getInStockDetailList();
        return SUCCESS;
    }

    public String saveInStockDetail() {
        inStockDetailService.saveOrUpdate(inStockDetail);
        msg = "success";
        return SUCCESS;
    }

    public String destoryInStockDetail() {
        inStockDetailService.delete(inStockDetail);
        return SUCCESS;
    }

    /**
     * ����  inStock
     * @return inStock
     */
    public InStock getInStock() {
        return inStock;
    }

    /**
     * ���� inStock
     * @param inStock inStock
     */
    public void setInStock(InStock inStock) {
        this.inStock = inStock;
    }

    /**
     * ����  inStockList
     * @return inStockList
     */
    public List<InStock> getInStockList() {
        return inStockList;
    }

    /**
     * ���� inStockList
     * @param inStockList inStockList
     */
    public void setInStockList(List<InStock> inStockList) {
        this.inStockList = inStockList;
    }

    /**
     * ����  inStockDetail
     * @return inStockDetail
     */
    public InStockDetail getInStockDetail() {
        return inStockDetail;
    }

    /**
     * ���� inStockDetail
     * @param inStockDetail inStockDetail
     */
    public void setInStockDetail(InStockDetail inStockDetail) {
        this.inStockDetail = inStockDetail;
    }

    /**
     * ����  inStockDetailList
     * @return inStockDetailList
     */
    public List<InStockDetail> getInStockDetailList() {
        return inStockDetailList;
    }

    /**
     * ���� inStockDetailList
     * @param inStockDetailList inStockDetailList
     */
    public void setInStockDetailList(List<InStockDetail> inStockDetailList) {
        this.inStockDetailList = inStockDetailList;
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
