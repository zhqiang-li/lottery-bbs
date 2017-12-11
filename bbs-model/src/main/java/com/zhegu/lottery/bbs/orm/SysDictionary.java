package com.zhegu.lottery.bbs.orm;

import java.io.Serializable;
import java.util.Date;

public class SysDictionary implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dictionary.GUID
     *
     * @mbg.generated
     */
    private Integer guid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dictionary.CREATE_TIME
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dictionary.UPDATE_TIME
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dictionary.NAME
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dictionary.CODE
     *
     * @mbg.generated
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dictionary.DICT_TYPE
     *
     * @mbg.generated
     */
    private String dictType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dictionary.SORT_VALUE
     *
     * @mbg.generated
     */
    private Integer sortValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_dictionary
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dictionary
     *
     * @mbg.generated
     */
    public SysDictionary(Integer guid, Date createTime, Date updateTime, String name, String code, String dictType, Integer sortValue) {
        this.guid = guid;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.name = name;
        this.code = code;
        this.dictType = dictType;
        this.sortValue = sortValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dictionary
     *
     * @mbg.generated
     */
    public SysDictionary() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dictionary.GUID
     *
     * @return the value of sys_dictionary.GUID
     *
     * @mbg.generated
     */
    public Integer getGuid() {
        return guid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dictionary.GUID
     *
     * @param guid the value for sys_dictionary.GUID
     *
     * @mbg.generated
     */
    public void setGuid(Integer guid) {
        this.guid = guid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dictionary.CREATE_TIME
     *
     * @return the value of sys_dictionary.CREATE_TIME
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dictionary.CREATE_TIME
     *
     * @param createTime the value for sys_dictionary.CREATE_TIME
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dictionary.UPDATE_TIME
     *
     * @return the value of sys_dictionary.UPDATE_TIME
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dictionary.UPDATE_TIME
     *
     * @param updateTime the value for sys_dictionary.UPDATE_TIME
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dictionary.NAME
     *
     * @return the value of sys_dictionary.NAME
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dictionary.NAME
     *
     * @param name the value for sys_dictionary.NAME
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dictionary.CODE
     *
     * @return the value of sys_dictionary.CODE
     *
     * @mbg.generated
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dictionary.CODE
     *
     * @param code the value for sys_dictionary.CODE
     *
     * @mbg.generated
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dictionary.DICT_TYPE
     *
     * @return the value of sys_dictionary.DICT_TYPE
     *
     * @mbg.generated
     */
    public String getDictType() {
        return dictType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dictionary.DICT_TYPE
     *
     * @param dictType the value for sys_dictionary.DICT_TYPE
     *
     * @mbg.generated
     */
    public void setDictType(String dictType) {
        this.dictType = dictType == null ? null : dictType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dictionary.SORT_VALUE
     *
     * @return the value of sys_dictionary.SORT_VALUE
     *
     * @mbg.generated
     */
    public Integer getSortValue() {
        return sortValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dictionary.SORT_VALUE
     *
     * @param sortValue the value for sys_dictionary.SORT_VALUE
     *
     * @mbg.generated
     */
    public void setSortValue(Integer sortValue) {
        this.sortValue = sortValue;
    }
}