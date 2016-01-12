/*
 * @(#)PlanAction.java 2015-4-4 ����02:45:11 erp-manufacture
 */
package com.erp.action;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.erp.model.Meeting;
import com.erp.model.Plan;

/**
 * PlanAction
 * @author wang
 * @version 1.0
 *
 */
@Component("planAction")
@Scope("prototype")
public class PlanAction extends BaseAction {
    
    public static final String UPLOAD_PATH = "/upload/plan";
    
    private Plan plan;

    private List<Plan> planList;
    
    private File file;

    private String fileFileName;

    private String fileContentType;
    
    private String content;
    
    private Meeting meeting;
    
    public String listPlan() {
        planList = planService.listByMeeting(meeting);
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
        planService.delete(plan);
        return SUCCESS;
    }

    public String listPlanDetail() {
        plan = planService.getEntityById(plan.getId());
        return SUCCESS;
    }
    
    public String submitContent(){
        plan = planService.getEntityById(plan.getId());
        plan.setContent(content);
        if (file != null) {
            plan.setFileName(fileFileName);
            String realpath = ServletActionContext.getServletContext()
                    .getRealPath(UPLOAD_PATH);
            String uuid = UUID.randomUUID().toString();
            plan.setRealFileName(uuid);
            File newFile = new File(realpath, uuid);
            try {
                FileUtils.copyFile(file, newFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        planService.saveOrUpdate(plan);
        return SUCCESS;
    }

    public String download() {
        plan = planService.getEntityById(plan.getId());
        file = new File(ServletActionContext.getServletContext().getRealPath(
            UPLOAD_PATH), String.valueOf(plan.getRealFileName()));
        try {
            fileFileName = new String(plan.getFileName().getBytes(),
                    "iso-8859-1");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
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
     * ����  file
     * @return file
     */
    public File getFile() {
        return file;
    }

    /**
     * ���� file
     * @param file file
     */
    public void setFile(File file) {
        this.file = file;
    }

    /**
     * ����  fileFileName
     * @return fileFileName
     */
    public String getFileFileName() {
        return fileFileName;
    }

    /**
     * ���� fileFileName
     * @param fileFileName fileFileName
     */
    public void setFileFileName(String fileFileName) {
        this.fileFileName = fileFileName;
    }

    /**
     * ����  fileContentType
     * @return fileContentType
     */
    public String getFileContentType() {
        return fileContentType;
    }

    /**
     * ���� fileContentType
     * @param fileContentType fileContentType
     */
    public void setFileContentType(String fileContentType) {
        this.fileContentType = fileContentType;
    }
    
    /**
     * ����  fileContentType
     * @return fileContentType
     */
    public String getContent() {
        return content;
    }

    /**
     * ���� fileContentType
     * @param fileContentType fileContentType
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * ����  meeting
     * @return meeting
     */
    public Meeting getMeeting() {
        return meeting;
    }

    /**
     * ���� meeting
     * @param meeting meeting
     */
    public void setMeeting(Meeting meeting) {
        this.meeting = meeting;
    }

}
