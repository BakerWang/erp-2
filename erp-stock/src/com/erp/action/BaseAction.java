package com.erp.action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.interceptor.SessionAware;

import com.erp.model.User;
import com.erp.service.InApplyDetailService;
import com.erp.service.InApplyService;
import com.erp.service.InInternalDetailService;
import com.erp.service.InInternalService;
import com.erp.service.InStockDetailService;
import com.erp.service.InStockService;
import com.erp.service.OutApplyDetailService;
import com.erp.service.OutApplyService;
import com.erp.service.OutInternalDetailService;
import com.erp.service.OutInternalService;
import com.erp.service.OutStockDetailService;
import com.erp.service.OutStockService;
import com.erp.service.ProductService;
import com.erp.service.SafeStockDetailService;
import com.erp.service.SafeStockService;
import com.erp.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class BaseAction extends ActionSupport implements SessionAware {

    @Resource(name = "userService")
    protected UserService userService;

    @Resource(name = "inApplyService")
    protected InApplyService inApplyService;

    @Resource(name = "inApplyDetailService")
    protected InApplyDetailService inApplyDetailService;

    @Resource(name = "inInternalService")
    protected InInternalService inInternalService;

    @Resource(name = "inInternalDetailService")
    protected InInternalDetailService inInternalDetailService;

    @Resource(name = "inStockService")
    protected InStockService inStockService;

    @Resource(name = "inStockDetailService")
    protected InStockDetailService inStockDetailService;

    @Resource(name = "outApplyService")
    protected OutApplyService outApplyService;

    @Resource(name = "outApplyDetailService")
    protected OutApplyDetailService outApplyDetailService;

    @Resource(name = "outInternalService")
    protected OutInternalService outInternalService;

    @Resource(name = "outInternalDetailService")
    protected OutInternalDetailService outInternalDetailService;

    @Resource(name = "outStockService")
    protected OutStockService outStockService;

    @Resource(name = "outStockDetailService")
    protected OutStockDetailService outStockDetailService;

    @Resource(name = "safeStockService")
    protected SafeStockService safeStockService;

    @Resource(name = "safeStockDetailService")
    protected SafeStockDetailService safeStockDetailService;

    @Resource(name = "productService")
    protected ProductService productService;

    //���õ�ҳ�����
    protected User user;

    protected User loginUser;

    protected String msg = "";

    protected String value;

    protected Integer id;

    protected int page;

    protected int rows = 20;

    protected Map<String, Object> session;

    protected ValueStack getValueStack() {
        return ActionContext.getContext().getValueStack();
    }

    public InputStream getInputStream() {
        return new ByteArrayInputStream(msg.getBytes());
    }

    /**
     * ����  user
     * @return user
     */
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
     * ����  msg
     * @return msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * ���� msg
     * @param msg msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * ����  id
     * @return id
     */
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
     * ����  loginUser
     * @return loginUser
     */
    public User getLoginUser() {
        return loginUser;
    }

    /**
     * ���� loginUser
     * @param loginUser loginUser
     */
    public void setLoginUser(User loginUser) {
        this.loginUser = loginUser;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    /**
     * ����  page
     * @return page
     */
    public int getPage() {
        return page;
    }

    /**
     * ���� page
     * @param page page
     */
    public void setPage(int page) {
        this.page = page;
    }

    /**
     * ����  rows
     * @return rows
     */
    public int getRows() {
        return rows;
    }

    /**
     * ���� rows
     * @param rows rows
     */
    public void setRows(int rows) {
        this.rows = rows;
    }

    /**
     * ����  value
     * @return value
     */
    public String getValue() {
        return value;
    }

    /**
     * ���� value
     * @param value value
     */
    public void setValue(String value) {
        this.value = value;
    }
}
