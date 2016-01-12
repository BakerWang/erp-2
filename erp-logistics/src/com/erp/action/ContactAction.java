/*
 * @(#)ContactAction.java 2015-4-4 ����02:45:11 erp-manufacture
 */
package com.erp.action;

import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.erp.model.Contact;
import com.erp.model.Product;
import com.erp.model.Record;

/**
 * ContactAction
 * @author wang
 * @version 1.0
 *
 */
@Component("contactAction")
@Scope("prototype")
public class ContactAction extends BaseAction {
    private Contact contact;

    private List<Contact> contactList;

    private Product product;

    private List<Product> productList;

    private List<Record> recordList;

    public String listContact() {
        recordList = recordService.list();
        contactList = contactService.list();
        return SUCCESS;
    }

    public String saveContact() {
        contact.setDate(new Date());
        contact.setUser(loginUser);
        contactService.saveOrUpdate(contact);
        msg = "success";
        return SUCCESS;
    }

    public String destoryContact() {
        contact = contactService.getEntityById(contact.getId());
        contactService.delete(contact);
        return SUCCESS;
    }

    public String listContactDetail() {
        contact = contactService.getEntityById(contact.getId());
        return SUCCESS;
    }

    public String updateContactContent() {
        String content = contact.getContent();
        contact = contactService.getEntityById(contact.getId());
        contact.setContent(content);
        contactService.update(contact);
        return SUCCESS;
    }

    /**
     * ����  contact
     * @return contact
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * ���� contact
     * @param contact contact
     */
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    /**
     * ����  contactList
     * @return contactList
     */
    public List<Contact> getContactList() {
        return contactList;
    }

    /**
     * ���� contactList
     * @param contactList contactList
     */
    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
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

    /**
     * ����  recordList
     * @return recordList
     */
    public List<Record> getRecordList() {
        return recordList;
    }

    /**
     * ���� recordList
     * @param recordList recordList
     */
    public void setRecordList(List<Record> recordList) {
        this.recordList = recordList;
    }

}
