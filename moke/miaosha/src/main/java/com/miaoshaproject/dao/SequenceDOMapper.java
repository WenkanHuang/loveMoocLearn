package com.miaoshaproject.dao;

import com.miaoshaproject.dataObject.SequenceDO;
import org.springframework.stereotype.Repository;

@Repository
public interface SequenceDOMapper {



    SequenceDO getSequenceByName(String name);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_info
     *
     * @mbg.generated Fri Aug 16 11:12:47 CST 2019
     */
    int deleteByPrimaryKey(String name);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_info
     *
     * @mbg.generated Fri Aug 16 11:12:47 CST 2019
     */
    int insert(SequenceDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_info
     *
     * @mbg.generated Fri Aug 16 11:12:47 CST 2019
     */
    int insertSelective(SequenceDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_info
     *
     * @mbg.generated Fri Aug 16 11:12:47 CST 2019
     */
    SequenceDO selectByPrimaryKey(String name);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_info
     *
     * @mbg.generated Fri Aug 16 11:12:47 CST 2019
     */
    int updateByPrimaryKeySelective(SequenceDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_info
     *
     * @mbg.generated Fri Aug 16 11:12:47 CST 2019
     */
    int updateByPrimaryKey(SequenceDO record);
}