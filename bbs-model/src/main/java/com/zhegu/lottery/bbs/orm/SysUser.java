package com.zhegu.lottery.bbs.orm;

import java.io.Serializable;
import java.util.Date;

public class SysUser implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.GUID
     *
     * @mbg.generated
     */
    private Integer guid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.GROUP_ID
     *
     * @mbg.generated
     */
    private Integer groupId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.NAME
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.EMAIL
     *
     * @mbg.generated
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.PHONE
     *
     * @mbg.generated
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.PASSWORD
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.SEX
     *
     * @mbg.generated
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.AVATAR
     *
     * @mbg.generated
     */
    private String avatar;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.REGIP
     *
     * @mbg.generated
     */
    private String regip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.LOGIN_COUNT
     *
     * @mbg.generated
     */
    private Integer loginCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.CURR_LOGIN_TIME
     *
     * @mbg.generated
     */
    private Date currLoginTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.CURR_LOGIN_IP
     *
     * @mbg.generated
     */
    private String currLoginIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.LAST_LOGIN_TIME
     *
     * @mbg.generated
     */
    private Date lastLoginTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.LAST_LOGIN_IP
     *
     * @mbg.generated
     */
    private String lastLoginIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.SOURE
     *
     * @mbg.generated
     */
    private Integer soure;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.IS_ACTIVE
     *
     * @mbg.generated
     */
    private String isActive;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.STATUS
     *
     * @mbg.generated
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.BIRTHDAY
     *
     * @mbg.generated
     */
    private String birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.QQ
     *
     * @mbg.generated
     */
    private String qq;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.WECHAT
     *
     * @mbg.generated
     */
    private String wechat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.IS_ADMIN
     *
     * @mbg.generated
     */
    private String isAdmin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.FOLLOWS
     *
     * @mbg.generated
     */
    private Integer follows;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.FANS
     *
     * @mbg.generated
     */
    private Integer fans;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.CREATE_TIME
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.UPDATE_TIME
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.ACCOUNT
     *
     * @mbg.generated
     */
    private String account;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_user
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated
     */
    public SysUser(Integer guid, Integer groupId, String name, String email, String phone, String password, String sex, String avatar, String regip, Integer loginCount, Date currLoginTime, String currLoginIp, Date lastLoginTime, String lastLoginIp, Integer soure, String isActive, String status, String birthday, String qq, String wechat, String isAdmin, Integer follows, Integer fans, Date createTime, Date updateTime, String account) {
        this.guid = guid;
        this.groupId = groupId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.sex = sex;
        this.avatar = avatar;
        this.regip = regip;
        this.loginCount = loginCount;
        this.currLoginTime = currLoginTime;
        this.currLoginIp = currLoginIp;
        this.lastLoginTime = lastLoginTime;
        this.lastLoginIp = lastLoginIp;
        this.soure = soure;
        this.isActive = isActive;
        this.status = status;
        this.birthday = birthday;
        this.qq = qq;
        this.wechat = wechat;
        this.isAdmin = isAdmin;
        this.follows = follows;
        this.fans = fans;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.account = account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbg.generated
     */
    public SysUser() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.GUID
     *
     * @return the value of sys_user.GUID
     *
     * @mbg.generated
     */
    public Integer getGuid() {
        return guid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.GUID
     *
     * @param guid the value for sys_user.GUID
     *
     * @mbg.generated
     */
    public void setGuid(Integer guid) {
        this.guid = guid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.GROUP_ID
     *
     * @return the value of sys_user.GROUP_ID
     *
     * @mbg.generated
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.GROUP_ID
     *
     * @param groupId the value for sys_user.GROUP_ID
     *
     * @mbg.generated
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.NAME
     *
     * @return the value of sys_user.NAME
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.NAME
     *
     * @param name the value for sys_user.NAME
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.EMAIL
     *
     * @return the value of sys_user.EMAIL
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.EMAIL
     *
     * @param email the value for sys_user.EMAIL
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.PHONE
     *
     * @return the value of sys_user.PHONE
     *
     * @mbg.generated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.PHONE
     *
     * @param phone the value for sys_user.PHONE
     *
     * @mbg.generated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.PASSWORD
     *
     * @return the value of sys_user.PASSWORD
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.PASSWORD
     *
     * @param password the value for sys_user.PASSWORD
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.SEX
     *
     * @return the value of sys_user.SEX
     *
     * @mbg.generated
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.SEX
     *
     * @param sex the value for sys_user.SEX
     *
     * @mbg.generated
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.AVATAR
     *
     * @return the value of sys_user.AVATAR
     *
     * @mbg.generated
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.AVATAR
     *
     * @param avatar the value for sys_user.AVATAR
     *
     * @mbg.generated
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.REGIP
     *
     * @return the value of sys_user.REGIP
     *
     * @mbg.generated
     */
    public String getRegip() {
        return regip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.REGIP
     *
     * @param regip the value for sys_user.REGIP
     *
     * @mbg.generated
     */
    public void setRegip(String regip) {
        this.regip = regip == null ? null : regip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.LOGIN_COUNT
     *
     * @return the value of sys_user.LOGIN_COUNT
     *
     * @mbg.generated
     */
    public Integer getLoginCount() {
        return loginCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.LOGIN_COUNT
     *
     * @param loginCount the value for sys_user.LOGIN_COUNT
     *
     * @mbg.generated
     */
    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.CURR_LOGIN_TIME
     *
     * @return the value of sys_user.CURR_LOGIN_TIME
     *
     * @mbg.generated
     */
    public Date getCurrLoginTime() {
        return currLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.CURR_LOGIN_TIME
     *
     * @param currLoginTime the value for sys_user.CURR_LOGIN_TIME
     *
     * @mbg.generated
     */
    public void setCurrLoginTime(Date currLoginTime) {
        this.currLoginTime = currLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.CURR_LOGIN_IP
     *
     * @return the value of sys_user.CURR_LOGIN_IP
     *
     * @mbg.generated
     */
    public String getCurrLoginIp() {
        return currLoginIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.CURR_LOGIN_IP
     *
     * @param currLoginIp the value for sys_user.CURR_LOGIN_IP
     *
     * @mbg.generated
     */
    public void setCurrLoginIp(String currLoginIp) {
        this.currLoginIp = currLoginIp == null ? null : currLoginIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.LAST_LOGIN_TIME
     *
     * @return the value of sys_user.LAST_LOGIN_TIME
     *
     * @mbg.generated
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.LAST_LOGIN_TIME
     *
     * @param lastLoginTime the value for sys_user.LAST_LOGIN_TIME
     *
     * @mbg.generated
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.LAST_LOGIN_IP
     *
     * @return the value of sys_user.LAST_LOGIN_IP
     *
     * @mbg.generated
     */
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.LAST_LOGIN_IP
     *
     * @param lastLoginIp the value for sys_user.LAST_LOGIN_IP
     *
     * @mbg.generated
     */
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.SOURE
     *
     * @return the value of sys_user.SOURE
     *
     * @mbg.generated
     */
    public Integer getSoure() {
        return soure;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.SOURE
     *
     * @param soure the value for sys_user.SOURE
     *
     * @mbg.generated
     */
    public void setSoure(Integer soure) {
        this.soure = soure;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.IS_ACTIVE
     *
     * @return the value of sys_user.IS_ACTIVE
     *
     * @mbg.generated
     */
    public String getIsActive() {
        return isActive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.IS_ACTIVE
     *
     * @param isActive the value for sys_user.IS_ACTIVE
     *
     * @mbg.generated
     */
    public void setIsActive(String isActive) {
        this.isActive = isActive == null ? null : isActive.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.STATUS
     *
     * @return the value of sys_user.STATUS
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.STATUS
     *
     * @param status the value for sys_user.STATUS
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.BIRTHDAY
     *
     * @return the value of sys_user.BIRTHDAY
     *
     * @mbg.generated
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.BIRTHDAY
     *
     * @param birthday the value for sys_user.BIRTHDAY
     *
     * @mbg.generated
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.QQ
     *
     * @return the value of sys_user.QQ
     *
     * @mbg.generated
     */
    public String getQq() {
        return qq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.QQ
     *
     * @param qq the value for sys_user.QQ
     *
     * @mbg.generated
     */
    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.WECHAT
     *
     * @return the value of sys_user.WECHAT
     *
     * @mbg.generated
     */
    public String getWechat() {
        return wechat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.WECHAT
     *
     * @param wechat the value for sys_user.WECHAT
     *
     * @mbg.generated
     */
    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.IS_ADMIN
     *
     * @return the value of sys_user.IS_ADMIN
     *
     * @mbg.generated
     */
    public String getIsAdmin() {
        return isAdmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.IS_ADMIN
     *
     * @param isAdmin the value for sys_user.IS_ADMIN
     *
     * @mbg.generated
     */
    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin == null ? null : isAdmin.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.FOLLOWS
     *
     * @return the value of sys_user.FOLLOWS
     *
     * @mbg.generated
     */
    public Integer getFollows() {
        return follows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.FOLLOWS
     *
     * @param follows the value for sys_user.FOLLOWS
     *
     * @mbg.generated
     */
    public void setFollows(Integer follows) {
        this.follows = follows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.FANS
     *
     * @return the value of sys_user.FANS
     *
     * @mbg.generated
     */
    public Integer getFans() {
        return fans;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.FANS
     *
     * @param fans the value for sys_user.FANS
     *
     * @mbg.generated
     */
    public void setFans(Integer fans) {
        this.fans = fans;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.CREATE_TIME
     *
     * @return the value of sys_user.CREATE_TIME
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.CREATE_TIME
     *
     * @param createTime the value for sys_user.CREATE_TIME
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.UPDATE_TIME
     *
     * @return the value of sys_user.UPDATE_TIME
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.UPDATE_TIME
     *
     * @param updateTime the value for sys_user.UPDATE_TIME
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.ACCOUNT
     *
     * @return the value of sys_user.ACCOUNT
     *
     * @mbg.generated
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.ACCOUNT
     *
     * @param account the value for sys_user.ACCOUNT
     *
     * @mbg.generated
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }
}