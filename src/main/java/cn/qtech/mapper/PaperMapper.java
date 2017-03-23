package cn.qtech.mapper;

import cn.qtech.domain.Paper;
import cn.qtech.domain.PaperWithBLOBs;

public interface PaperMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbggenerated Tue Mar 21 14:20:39 CST 2017
     */
    int deleteByPrimaryKey(String paperId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbggenerated Tue Mar 21 14:20:39 CST 2017
     */
    int insert(PaperWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbggenerated Tue Mar 21 14:20:39 CST 2017
     */
    int insertSelective(PaperWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbggenerated Tue Mar 21 14:20:39 CST 2017
     */
    PaperWithBLOBs selectByPrimaryKey(String paperId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbggenerated Tue Mar 21 14:20:39 CST 2017
     */
    int updateByPrimaryKeySelective(PaperWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbggenerated Tue Mar 21 14:20:39 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(PaperWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbggenerated Tue Mar 21 14:20:39 CST 2017
     */
    int updateByPrimaryKey(Paper record);
}