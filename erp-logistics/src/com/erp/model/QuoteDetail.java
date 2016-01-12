/*
 * @(#)QuoteDetail.java 2015-4-19 ����07:13:51 erp-logistics
 */
package com.erp.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * QuoteDetail
 * @author wang
 * @version 1.0
 *
 */
@Entity
public class QuoteDetail {
    private Integer id;

    private Product product;

    private String description;

    private Integer count;

    private String unit;

    private Integer price;

    private Integer discount;

    private Quote quote;

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
     * ����  description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * ���� description
     * @param description description
     */
    public void setDescription(String description) {
        this.description = description;
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
     * ����  unit
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * ���� unit
     * @param unit unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * ����  price
     * @return price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * ���� price
     * @param price price
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * ����  discount
     * @return discount
     */
    public Integer getDiscount() {
        return discount;
    }

    /**
     * ���� discount
     * @param discount discount
     */
    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    /**
     * ����  quote
     * @return quote
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "quote_id")
    public Quote getQuote() {
        return quote;
    }

    /**
     * ���� quote
     * @param quote quote
     */
    public void setQuote(Quote quote) {
        this.quote = quote;
    }
}
