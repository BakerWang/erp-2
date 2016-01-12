/*
 * @(#)InStockDetail.java 2015-4-13 ����07:44:58 erp-stock
 */
package com.erp.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * InStockDetail
 * @author wang
 * @version 1.0
 *
 */
@Entity
public class InStockDetail {
    private Integer id;

    private Product product;

    private String name;

    private Integer curCount;

    private Integer count;

    private InStock inStock;

    private Integer qualified;

    private Integer alreadyCount;

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
     * ����  name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * ���� name
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ����  curCount
     * @return curCount
     */
    public Integer getCurCount() {
        return curCount;
    }

    /**
     * ���� curCount
     * @param curCount curCount
     */
    public void setCurCount(Integer curCount) {
        this.curCount = curCount;
    }

    /**
     * ����  count
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * ���� count
     * @param count count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * ����  product
     * @return product
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
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
     * ����  qualified
     * @return qualified
     */
    public Integer getQualified() {
        return qualified;
    }

    /**
     * ���� qualified
     * @param qualified qualified
     */
    public void setQualified(Integer qualified) {
        this.qualified = qualified;
    }

    /**
     * ����  alreadyCount
     * @return alreadyCount
     */
    public Integer getAlreadyCount() {
        return alreadyCount;
    }

    /**
     * ���� alreadyCount
     * @param alreadyCount alreadyCount
     */
    public void setAlreadyCount(Integer alreadyCount) {
        this.alreadyCount = alreadyCount;
    }

    /**
     * ����  inStock
     * @return inStock
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "in_stock_id")
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
}
