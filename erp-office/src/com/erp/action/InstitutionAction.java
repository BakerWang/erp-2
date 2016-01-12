/*
 * @(#)InstitutionAction.java 2015-4-4 ����02:45:11 erp-manufacture
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

import com.erp.model.Institution;

/**
 * InstitutionAction
 * @author wang
 * @version 1.0
 *
 */
@Component("institutionAction")
@Scope("prototype")
public class InstitutionAction extends BaseAction {
    
    public static final String UPLOAD_PATH = "/upload/institution";
    
    private Institution institution;

    private List<Institution> institutionList;
    
    private File file;

    private String fileFileName;

    private String fileContentType;
    
    private String content;
    
    public String listInstitution() {
        institutionList = institutionService.list();
        return SUCCESS;
    }

    public String saveInstitution() {
        institution.setDate(new Date());
        institution.setUser(loginUser);
        institutionService.saveOrUpdate(institution);
        msg = "success";
        return SUCCESS;
    }

    public String destoryInstitution() {
        institution = institutionService.getEntityById(institution.getId());
        institutionService.delete(institution);
        return SUCCESS;
    }

    public String listInstitutionDetail() {
        institution = institutionService.getEntityById(institution.getId());
        return SUCCESS;
    }
    
    public String submitContent(){
        institution = institutionService.getEntityById(institution.getId());
        institution.setContent(content);
        if (file != null) {
            institution.setFileName(fileFileName);
            String realpath = ServletActionContext.getServletContext()
                    .getRealPath(UPLOAD_PATH);
            String uuid = UUID.randomUUID().toString();
            institution.setRealFileName(uuid);
            File newFile = new File(realpath, uuid);
            try {
                FileUtils.copyFile(file, newFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        institutionService.saveOrUpdate(institution);
        return SUCCESS;
    }

    public String download() {
        institution = institutionService.getEntityById(institution.getId());
        file = new File(ServletActionContext.getServletContext().getRealPath(
            UPLOAD_PATH), String.valueOf(institution.getRealFileName()));
        try {
            fileFileName = new String(institution.getFileName().getBytes(),
                    "iso-8859-1");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }

    /**
     * ����  institution
     * @return institution
     */
    public Institution getInstitution() {
        return institution;
    }

    /**
     * ���� institution
     * @param institution institution
     */
    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    /**
     * ����  institutionList
     * @return institutionList
     */
    public List<Institution> getInstitutionList() {
        return institutionList;
    }

    /**
     * ���� institutionList
     * @param institutionList institutionList
     */
    public void setInstitutionList(List<Institution> institutionList) {
        this.institutionList = institutionList;
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

}
