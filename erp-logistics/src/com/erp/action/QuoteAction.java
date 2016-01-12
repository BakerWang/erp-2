/*
 * @(#)QuoteAction.java 2015-4-4 ����02:45:11 erp-manufacture
 */
package com.erp.action;

import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.erp.model.Product;
import com.erp.model.Quote;
import com.erp.model.QuoteDetail;
import com.erp.model.Record;

/**
 * QuoteAction
 * @author wang
 * @version 1.0
 *
 */
@Component("quoteAction")
@Scope("prototype")
public class QuoteAction extends BaseAction {
    private Quote quote;

    private List<Quote> quoteList;

    private QuoteDetail quoteDetail;

    private List<QuoteDetail> quoteDetailList;

    private Product product;

    private List<Product> productList;

    private List<Record> recordList;

    public String listQuote() {
        recordList = recordService.list();
        quoteList = quoteService.list();
        return SUCCESS;
    }

    public String saveQuote() {
        quote.setDate(new Date());
        quote.setUser(loginUser);
        quoteService.saveOrUpdate(quote);
        msg = "success";
        return SUCCESS;
    }

    public String destoryQuote() {
        quote = quoteService.getEntityById(quote.getId());
        for (QuoteDetail pd : quote.getQuoteDetailList()) {
            quoteDetailService.delete(pd);
        }
        quoteService.delete(quote);
        return SUCCESS;
    }

    public String listQuoteDetail() {
        productList = productService.list();
        quote = quoteService.getEntityById(quote.getId());
        quoteDetailList = quote.getQuoteDetailList();
        return SUCCESS;
    }

    public String saveQuoteDetail() {
        quoteDetailService.saveOrUpdate(quoteDetail);
        msg = "success";
        return SUCCESS;
    }

    public String destoryQuoteDetail() {
        quoteDetailService.delete(quoteDetail);
        return SUCCESS;
    }

    /**
     * ����  quote
     * @return quote
     */
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

    /**
     * ����  quoteList
     * @return quoteList
     */
    public List<Quote> getQuoteList() {
        return quoteList;
    }

    /**
     * ���� quoteList
     * @param quoteList quoteList
     */
    public void setQuoteList(List<Quote> quoteList) {
        this.quoteList = quoteList;
    }

    /**
     * ����  quoteDetail
     * @return quoteDetail
     */
    public QuoteDetail getQuoteDetail() {
        return quoteDetail;
    }

    /**
     * ���� quoteDetail
     * @param quoteDetail quoteDetail
     */
    public void setQuoteDetail(QuoteDetail quoteDetail) {
        this.quoteDetail = quoteDetail;
    }

    /**
     * ����  quoteDetailList
     * @return quoteDetailList
     */
    public List<QuoteDetail> getQuoteDetailList() {
        return quoteDetailList;
    }

    /**
     * ���� quoteDetailList
     * @param quoteDetailList quoteDetailList
     */
    public void setQuoteDetailList(List<QuoteDetail> quoteDetailList) {
        this.quoteDetailList = quoteDetailList;
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
