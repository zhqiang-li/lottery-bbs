package com.zhegu.lottery.bbs.dao;

import com.zhegu.lottery.bbs.orm.WbLike;

public interface WbLikeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wb_like
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer guid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wb_like
     *
     * @mbg.generated
     */
    int insert(WbLike record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wb_like
     *
     * @mbg.generated
     */
    int insertSelective(WbLike record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wb_like
     *
     * @mbg.generated
     */
    WbLike selectByPrimaryKey(Integer guid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wb_like
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(WbLike record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wb_like
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(WbLike record);
}