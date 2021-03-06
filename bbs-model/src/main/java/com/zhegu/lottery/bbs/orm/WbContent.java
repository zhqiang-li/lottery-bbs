package com.zhegu.lottery.bbs.orm;

import java.io.Serializable;
import java.util.Date;

public class WbContent implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wb_content.GUID
     *
     * @mbg.generated
     */
    private Integer guid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wb_content.CREATE_TIME
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wb_content.UPDATE_TIME
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wb_content.USER_ACCOUNT
     *
     * @mbg.generated
     */
    private String userAccount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wb_content.TYPE
     *
     * @mbg.generated
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wb_content.CONTENT
     *
     * @mbg.generated
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wb_content.FAVOR
     *
     * @mbg.generated
     */
    private Integer favor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wb_content.STATUS
     *
     * @mbg.generated
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wb_content.IS_VALID
     *
     * @mbg.generated
     */
    private String isValid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wb_content.LOTTERY
     *
     * @mbg.generated
     */
    private String lottery;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wb_content.LOTTERY_DATE
     *
     * @mbg.generated
     */
    private String lotteryDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wb_content.IS_TOP
     *
     * @mbg.generated
     */
    private String isTop;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wb_content
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wb_content
     *
     * @mbg.generated
     */
    public WbContent(Integer guid, Date createTime, Date updateTime, String userAccount, String type, String content, Integer favor, String status, String isValid, String lottery, String lotteryDate, String isTop) {
        this.guid = guid;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.userAccount = userAccount;
        this.type = type;
        this.content = content;
        this.favor = favor;
        this.status = status;
        this.isValid = isValid;
        this.lottery = lottery;
        this.lotteryDate = lotteryDate;
        this.isTop = isTop;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wb_content
     *
     * @mbg.generated
     */
    public WbContent() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wb_content.GUID
     *
     * @return the value of wb_content.GUID
     *
     * @mbg.generated
     */
    public Integer getGuid() {
        return guid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wb_content.GUID
     *
     * @param guid the value for wb_content.GUID
     *
     * @mbg.generated
     */
    public void setGuid(Integer guid) {
        this.guid = guid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wb_content.CREATE_TIME
     *
     * @return the value of wb_content.CREATE_TIME
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wb_content.CREATE_TIME
     *
     * @param createTime the value for wb_content.CREATE_TIME
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wb_content.UPDATE_TIME
     *
     * @return the value of wb_content.UPDATE_TIME
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wb_content.UPDATE_TIME
     *
     * @param updateTime the value for wb_content.UPDATE_TIME
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wb_content.USER_ACCOUNT
     *
     * @return the value of wb_content.USER_ACCOUNT
     *
     * @mbg.generated
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wb_content.USER_ACCOUNT
     *
     * @param userAccount the value for wb_content.USER_ACCOUNT
     *
     * @mbg.generated
     */
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wb_content.TYPE
     *
     * @return the value of wb_content.TYPE
     *
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wb_content.TYPE
     *
     * @param type the value for wb_content.TYPE
     *
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wb_content.CONTENT
     *
     * @return the value of wb_content.CONTENT
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wb_content.CONTENT
     *
     * @param content the value for wb_content.CONTENT
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wb_content.FAVOR
     *
     * @return the value of wb_content.FAVOR
     *
     * @mbg.generated
     */
    public Integer getFavor() {
        return favor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wb_content.FAVOR
     *
     * @param favor the value for wb_content.FAVOR
     *
     * @mbg.generated
     */
    public void setFavor(Integer favor) {
        this.favor = favor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wb_content.STATUS
     *
     * @return the value of wb_content.STATUS
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wb_content.STATUS
     *
     * @param status the value for wb_content.STATUS
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wb_content.IS_VALID
     *
     * @return the value of wb_content.IS_VALID
     *
     * @mbg.generated
     */
    public String getIsValid() {
        return isValid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wb_content.IS_VALID
     *
     * @param isValid the value for wb_content.IS_VALID
     *
     * @mbg.generated
     */
    public void setIsValid(String isValid) {
        this.isValid = isValid == null ? null : isValid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wb_content.LOTTERY
     *
     * @return the value of wb_content.LOTTERY
     *
     * @mbg.generated
     */
    public String getLottery() {
        return lottery;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wb_content.LOTTERY
     *
     * @param lottery the value for wb_content.LOTTERY
     *
     * @mbg.generated
     */
    public void setLottery(String lottery) {
        this.lottery = lottery == null ? null : lottery.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wb_content.LOTTERY_DATE
     *
     * @return the value of wb_content.LOTTERY_DATE
     *
     * @mbg.generated
     */
    public String getLotteryDate() {
        return lotteryDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wb_content.LOTTERY_DATE
     *
     * @param lotteryDate the value for wb_content.LOTTERY_DATE
     *
     * @mbg.generated
     */
    public void setLotteryDate(String lotteryDate) {
        this.lotteryDate = lotteryDate == null ? null : lotteryDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wb_content.IS_TOP
     *
     * @return the value of wb_content.IS_TOP
     *
     * @mbg.generated
     */
    public String getIsTop() {
        return isTop;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wb_content.IS_TOP
     *
     * @param isTop the value for wb_content.IS_TOP
     *
     * @mbg.generated
     */
    public void setIsTop(String isTop) {
        this.isTop = isTop == null ? null : isTop.trim();
    }
}