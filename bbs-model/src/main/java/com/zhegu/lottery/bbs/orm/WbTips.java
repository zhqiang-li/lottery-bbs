package com.zhegu.lottery.bbs.orm;

import java.io.Serializable;
import java.util.Date;

public class WbTips implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wb_tips.GUID
     *
     * @mbg.generated
     */
    private Integer guid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wb_tips.WB_ID
     *
     * @mbg.generated
     */
    private Integer wbId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wb_tips.USER_ACCOUNT
     *
     * @mbg.generated
     */
    private String userAccount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wb_tips.CONTENT
     *
     * @mbg.generated
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wb_tips.IS_VERIFIED
     *
     * @mbg.generated
     */
    private String isVerified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wb_tips.IS_HANDLE
     *
     * @mbg.generated
     */
    private String isHandle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wb_tips.CREATE_TIME
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wb_tips
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wb_tips
     *
     * @mbg.generated
     */
    public WbTips(Integer guid, Integer wbId, String userAccount, String content, String isVerified, String isHandle, Date createTime) {
        this.guid = guid;
        this.wbId = wbId;
        this.userAccount = userAccount;
        this.content = content;
        this.isVerified = isVerified;
        this.isHandle = isHandle;
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wb_tips
     *
     * @mbg.generated
     */
    public WbTips() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wb_tips.GUID
     *
     * @return the value of wb_tips.GUID
     *
     * @mbg.generated
     */
    public Integer getGuid() {
        return guid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wb_tips.GUID
     *
     * @param guid the value for wb_tips.GUID
     *
     * @mbg.generated
     */
    public void setGuid(Integer guid) {
        this.guid = guid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wb_tips.WB_ID
     *
     * @return the value of wb_tips.WB_ID
     *
     * @mbg.generated
     */
    public Integer getWbId() {
        return wbId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wb_tips.WB_ID
     *
     * @param wbId the value for wb_tips.WB_ID
     *
     * @mbg.generated
     */
    public void setWbId(Integer wbId) {
        this.wbId = wbId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wb_tips.USER_ACCOUNT
     *
     * @return the value of wb_tips.USER_ACCOUNT
     *
     * @mbg.generated
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wb_tips.USER_ACCOUNT
     *
     * @param userAccount the value for wb_tips.USER_ACCOUNT
     *
     * @mbg.generated
     */
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wb_tips.CONTENT
     *
     * @return the value of wb_tips.CONTENT
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wb_tips.CONTENT
     *
     * @param content the value for wb_tips.CONTENT
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wb_tips.IS_VERIFIED
     *
     * @return the value of wb_tips.IS_VERIFIED
     *
     * @mbg.generated
     */
    public String getIsVerified() {
        return isVerified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wb_tips.IS_VERIFIED
     *
     * @param isVerified the value for wb_tips.IS_VERIFIED
     *
     * @mbg.generated
     */
    public void setIsVerified(String isVerified) {
        this.isVerified = isVerified == null ? null : isVerified.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wb_tips.IS_HANDLE
     *
     * @return the value of wb_tips.IS_HANDLE
     *
     * @mbg.generated
     */
    public String getIsHandle() {
        return isHandle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wb_tips.IS_HANDLE
     *
     * @param isHandle the value for wb_tips.IS_HANDLE
     *
     * @mbg.generated
     */
    public void setIsHandle(String isHandle) {
        this.isHandle = isHandle == null ? null : isHandle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wb_tips.CREATE_TIME
     *
     * @return the value of wb_tips.CREATE_TIME
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wb_tips.CREATE_TIME
     *
     * @param createTime the value for wb_tips.CREATE_TIME
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}