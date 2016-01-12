/*
 * @(#)Product.java 2015-4-4 ����01:33:18
 * erp-manufacture
 */
package com.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Product
 * @author wang
 * @version 1.0
 *
 */
@Entity
public class Product {
    private Integer id;
    
    private String name;

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
    
}
