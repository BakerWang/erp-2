/*
 * @(#)PlanAction.java 2015-4-4 ����02:45:11 erp-manufacture
 */
package com.erp.action;

import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.erp.model.Plan;
import com.erp.model.PlanDetail;
import com.erp.model.Product;

/**
 * PlanAction
 * @author wang
 * @version 1.0
 *
 */
@Component("planAction")
@Scope("prototype")
public class PlanAction extends BaseAction {
    private Plan plan;

    private List<Plan> planList;

    private PlanDetail planDetail;

    private List<PlanDetail> planDetailList;

    private Product product;

    private List<Product> productList;

    public String listPlan() {
        planList = planService.list();
        return SUCCESS;
    }

    public String savePlan() {
        plan.setDate(new Date());
        plan.setUser(loginUser);
        planService.saveOrUpdate(plan);
        msg = "success";
        return SUCCESS;
    }

    public String destoryPlan() {
        plan = planService.getEntityById(plan.getId());
        for (PlanDetail pd : plan.getPlanDetailList()) {
            planDetailService.delete(pd);
        }
        planService.delete(plan);
        return SUCCESS;
    }

    public String listPlanDetail() {
        productList = productService.list();
        plan = planService.getEntityById(plan.getId());
        planDetailList = plan.getPlanDetailList();
        return SUCCESS;
    }

    public String savePlanDetail() {
        planDetailService.saveOrUpdate(planDetail);
        msg = "success";
        return SUCCESS;
    }

    public String destoryPlanDetail() {
        planDetailService.delete(planDetail);
        return SUCCESS;
    }

    /**
     * ����  plan
     * @return plan
     */
    public Plan getPlan() {
        return plan;
    }

    /**
     * ���� plan
     * @param plan plan
     */
    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    /**
     * ����  planList
     * @return planList
     */
    public List<Plan> getPlanList() {
        return planList;
    }

    /**
     * ���� planList
     * @param planList planList
     */
    public void setPlanList(List<Plan> planList) {
        this.planList = planList;
    }

    /**
     * ����  planDetail
     * @return planDetail
     */
    public PlanDetail getPlanDetail() {
        return planDetail;
    }

    /**
     * ���� planDetail
     * @param planDetail planDetail
     */
    public void setPlanDetail(PlanDetail planDetail) {
        this.planDetail = planDetail;
    }

    /**
     * ����  planDetailList
     * @return planDetailList
     */
    public List<PlanDetail> getPlanDetailList() {
        return planDetailList;
    }

    /**
     * ���� planDetailList
     * @param planDetailList planDetailList
     */
    public void setPlanDetailList(List<PlanDetail> planDetailList) {
        this.planDetailList = planDetailList;
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
