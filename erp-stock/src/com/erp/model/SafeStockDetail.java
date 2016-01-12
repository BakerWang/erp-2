/*
 * @(#)SafeStockDetail.java 2015-4-13 ����07:17:09 erp-stock
 */
package com.erp.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * SafeStockDetail
 * @author wang
 * @version 1.0
 *
 */
@Entity
public class SafeStockDetail {
    private Integer id;

    private String name;

    private String address;

    private String maxCount;

    private String unit;

    private SafeStock safeStock;

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
     * ����  address
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * ���� address
     * @param address address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * ����  maxCount
     * @return maxCount
     */
    public String getMaxCount() {
        return maxCount;
    }

    /**
     * ���� maxCount
     * @param maxCount maxCount
     */
    public void setMaxCount(String maxCount) {
        this.maxCount = maxCount;
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
     * ����  safeStock
     * @return safeStock
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "safe_stock_id")
    public SafeStock getSafeStock() {
        return safeStock;
    }

    /**
     * ���� safeStock
     * @param safeStock safeStock
     */
    public void setSafeStock(SafeStock safeStock) {
        this.safeStock = safeStock;
    }
}
