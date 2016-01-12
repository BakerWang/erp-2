/*
 * @(#)DeliveryAction.java 2015-4-4 ����02:45:11 erp-manufacture
 */
package com.erp.action;

import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.erp.model.Delivery;
import com.erp.model.Product;

/**
 * DeliveryAction
 * @author wang
 * @version 1.0
 *
 */
@Component("deliveryAction")
@Scope("prototype")
public class DeliveryAction extends BaseAction {
    private Delivery delivery;

    private List<Delivery> deliveryList;

    private Product product;

    private List<Product> productList;

    public String listDelivery() {
        deliveryList = deliveryService.list();
        productList = productService.list();
        return SUCCESS;
    }

    public String saveDelivery() {
        delivery.setDate(new Date());
        delivery.setUser(loginUser);
        deliveryService.saveOrUpdate(delivery);
        msg = "success";
        return SUCCESS;
    }

    public String destoryDelivery() {
        delivery = deliveryService.getEntityById(delivery.getId());
        deliveryService.delete(delivery);
        return SUCCESS;
    }

    /**
     * ����  delivery
     * @return delivery
     */
    public Delivery getDelivery() {
        return delivery;
    }

    /**
     * ���� delivery
     * @param delivery delivery
     */
    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    /**
     * ����  deliveryList
     * @return deliveryList
     */
    public List<Delivery> getDeliveryList() {
        return deliveryList;
    }

    /**
     * ���� deliveryList
     * @param deliveryList deliveryList
     */
    public void setDeliveryList(List<Delivery> deliveryList) {
        this.deliveryList = deliveryList;
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
