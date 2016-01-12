/*
 * @(#)Delivery.java 2015-4-19 ����07:29:58 erp-logistics
 */
package com.erp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Delivery
 * @author wang
 * @version 1.0
 *
 */
@Entity
public class Delivery {
    private Integer id;

    private String consumer;

    private Product product;

    private Integer count;

    private Integer deliverCount;

    private User user;

    private Date date;
    
    private Integer price;

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
     * ����  consumer
     * @return consumer
     */
    public String getConsumer() {
        return consumer;
    }

    /**
     * ���� consumer
     * @param consumer consumer
     */
    public void setConsumer(String consumer) {
        this.consumer = consumer;
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
     * ����  deliverCount
     * @return deliverCount
     */
    public Integer getDeliverCount() {
        return deliverCount;
    }

    /**
     * ���� deliverCount
     * @param deliverCount deliverCount
     */
    public void setDeliverCount(Integer deliverCount) {
        this.deliverCount = deliverCount;
    }

    /**
     * ����  user
     * @return user
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    public User getUser() {
        return user;
    }

    /**
     * ���� user
     * @param user user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * ����  date
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * ���� date
     * @param date date
     */
    public void setDate(Date date) {
        this.date = date;
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
}
