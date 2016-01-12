/*
 * @(#)RecommendAction.java 2015-4-4 ����02:45:11 erp-manufacture
 */
package com.erp.action;

import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.erp.model.Product;
import com.erp.model.Recommend;
import com.erp.model.RecommendDetail;
import com.erp.model.Record;

/**
 * RecommendAction
 * @author wang
 * @version 1.0
 *
 */
@Component("recommendAction")
@Scope("prototype")
public class RecommendAction extends BaseAction {
    private Recommend recommend;

    private List<Recommend> recommendList;

    private RecommendDetail recommendDetail;

    private List<RecommendDetail> recommendDetailList;

    private Product product;

    private List<Product> productList;

    private List<Record> recordList;

    public String listRecommend() {
        recommendList = recommendService.list();
        productList = productService.list();
        return SUCCESS;
    }

    public String saveRecommend() {
        recommend.setDate(new Date());
        recommend.setUser(loginUser);
        recommendService.saveOrUpdate(recommend);
        msg = "success";
        return SUCCESS;
    }

    public String destoryRecommend() {
        recommend = recommendService.getEntityById(recommend.getId());
        for (RecommendDetail pd : recommend.getRecommendDetailList()) {
            recommendDetailService.delete(pd);
        }
        recommendService.delete(recommend);
        return SUCCESS;
    }

    public String listRecommendDetail() {
        recordList = recordService.list();
        recommend = recommendService.getEntityById(recommend.getId());
        recommendDetailList = recommend.getRecommendDetailList();
        return SUCCESS;
    }

    public String saveRecommendDetail() {
        recommendDetailService.saveOrUpdate(recommendDetail);
        msg = "success";
        return SUCCESS;
    }

    public String destoryRecommendDetail() {
        recommendDetailService.delete(recommendDetail);
        return SUCCESS;
    }

    /**
     * ����  recommend
     * @return recommend
     */
    public Recommend getRecommend() {
        return recommend;
    }

    /**
     * ���� recommend
     * @param recommend recommend
     */
    public void setRecommend(Recommend recommend) {
        this.recommend = recommend;
    }

    /**
     * ����  recommendList
     * @return recommendList
     */
    public List<Recommend> getRecommendList() {
        return recommendList;
    }

    /**
     * ���� recommendList
     * @param recommendList recommendList
     */
    public void setRecommendList(List<Recommend> recommendList) {
        this.recommendList = recommendList;
    }

    /**
     * ����  recommendDetail
     * @return recommendDetail
     */
    public RecommendDetail getRecommendDetail() {
        return recommendDetail;
    }

    /**
     * ���� recommendDetail
     * @param recommendDetail recommendDetail
     */
    public void setRecommendDetail(RecommendDetail recommendDetail) {
        this.recommendDetail = recommendDetail;
    }

    /**
     * ����  recommendDetailList
     * @return recommendDetailList
     */
    public List<RecommendDetail> getRecommendDetailList() {
        return recommendDetailList;
    }

    /**
     * ���� recommendDetailList
     * @param recommendDetailList recommendDetailList
     */
    public void setRecommendDetailList(List<RecommendDetail> recommendDetailList) {
        this.recommendDetailList = recommendDetailList;
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
