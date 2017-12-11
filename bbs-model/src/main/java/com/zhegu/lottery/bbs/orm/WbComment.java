package com.zhegu.lottery.bbs.orm;

import java.io.Serializable;
import java.util.Date;

public class WbComment implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wb_comment.GUID
     *
     * @mbg.generated
     */
    private Integer guid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wb_comment.CREATE_TIME
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wb_comment.UPDATE_TIME
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wb_comment.WB_ID
     *
     * @mbg.generated
     */
    private Integer wbId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wb_comment.USER_ACCOUNT
     *
     * @mbg.generated
     */
    private String userAccount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wb_comment.COMMENT_ID
     *
     * @mbg.generated
     */
    private Integer commentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wb_comment.CONTENT
     *
     * @mbg.generated
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wb_comment.STATUS
     *
     * @mbg.generated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wb_comment
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wb_comment
     *
     * @mbg.generated
     */
    public WbComment(Integer guid, Date createTime, Date updateTime, Integer wbId, String userAccount, Integer commentId, String content, String status) {
        this.guid = guid;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.wbId = wbId;
        this.userAccount = userAccount;
        this.commentId = commentId;
        this.content = content;
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wb_comment
     *
     * @mbg.generated
     */
    public WbComment() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wb_comment.GUID
     *
     * @return the value of wb_comment.GUID
     *
     * @mbg.generated
     */
    public Integer getGuid() {
        return guid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wb_comment.GUID
     *
     * @param guid the value for wb_comment.GUID
     *
     * @mbg.generated
     */
    public void setGuid(Integer guid) {
        this.guid = guid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wb_comment.CREATE_TIME
     *
     * @return the value of wb_comment.CREATE_TIME
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wb_comment.CREATE_TIME
     *
     * @param createTime the value for wb_comment.CREATE_TIME
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wb_comment.UPDATE_TIME
     *
     * @return the value of wb_comment.UPDATE_TIME
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wb_comment.UPDATE_TIME
     *
     * @param updateTime the value for wb_comment.UPDATE_TIME
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wb_comment.WB_ID
     *
     * @return the value of wb_comment.WB_ID
     *
     * @mbg.generated
     */
    public Integer getWbId() {
        return wbId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wb_comment.WB_ID
     *
     * @param wbId the value for wb_comment.WB_ID
     *
     * @mbg.generated
     */
    public void setWbId(Integer wbId) {
        this.wbId = wbId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wb_comment.USER_ACCOUNT
     *
     * @return the value of wb_comment.USER_ACCOUNT
     *
     * @mbg.generated
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wb_comment.USER_ACCOUNT
     *
     * @param userAccount the value for wb_comment.USER_ACCOUNT
     *
     * @mbg.generated
     */
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wb_comment.COMMENT_ID
     *
     * @return the value of wb_comment.COMMENT_ID
     *
     * @mbg.generated
     */
    public Integer getCommentId() {
        return commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wb_comment.COMMENT_ID
     *
     * @param commentId the value for wb_comment.COMMENT_ID
     *
     * @mbg.generated
     */
    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wb_comment.CONTENT
     *
     * @return the value of wb_comment.CONTENT
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wb_comment.CONTENT
     *
     * @param content the value for wb_comment.CONTENT
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wb_comment.STATUS
     *
     * @return the value of wb_comment.STATUS
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wb_comment.STATUS
     *
     * @param status the value for wb_comment.STATUS
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}