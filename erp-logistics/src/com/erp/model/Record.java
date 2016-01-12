/*
 * @(#)Record.java 2015-4-19 ����07:10:26 erp-logistics
 */
package com.erp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Record
 * @author wang
 * @version 1.0
 *
 */
@Entity
public class Record {
    private Integer id;

    private String name;

    private String level;

    private String category;

    private String area;

    private String liable;

    private String tel;

    private String contactor;
    
    private String url;

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
     * ����  level
     * @return level
     */
    public String getLevel() {
        return level;
    }

    /**
     * ���� level
     * @param level level
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * ����  category
     * @return category
     */
    public String getCategory() {
        return category;
    }

    /**
     * ���� category
     * @param category category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * ����  area
     * @return area
     */
    public String getArea() {
        return area;
    }

    /**
     * ���� area
     * @param area area
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * ����  liable
     * @return liable
     */
    public String getLiable() {
        return liable;
    }

    /**
     * ���� liable
     * @param liable liable
     */
    public void setLiable(String liable) {
        this.liable = liable;
    }

    /**
     * ����  tel
     * @return tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * ���� tel
     * @param tel tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * ����  contactor
     * @return contactor
     */
    public String getContactor() {
        return contactor;
    }

    /**
     * ���� contactor
     * @param contactor contactor
     */
    public void setContactor(String contactor) {
        this.contactor = contactor;
    }

    /**
     * ����  url
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * ���� url
     * @param url url
     */
    public void setUrl(String url) {
        this.url = url;
    }

}
