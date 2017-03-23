package cn.qtech.mapper;

import cn.qtech.domain.SubjectDifficulty;

import java.util.List;

public interface SubjectDifficultyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_difficulty
     *
     * @mbggenerated Tue Mar 21 14:20:39 CST 2017
     */
    int deleteByPrimaryKey(String subjectId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_difficulty
     *
     * @mbggenerated Tue Mar 21 14:20:39 CST 2017
     */
    int insert(SubjectDifficulty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_difficulty
     *
     * @mbggenerated Tue Mar 21 14:20:39 CST 2017
     */
    int insertSelective(SubjectDifficulty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_difficulty
     *
     * @mbggenerated Tue Mar 21 14:20:39 CST 2017
     */
    SubjectDifficulty selectByPrimaryKey(String subjectId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_difficulty
     *
     * @mbggenerated Tue Mar 21 14:20:39 CST 2017
     */
    int updateByPrimaryKeySelective(SubjectDifficulty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_difficulty
     *
     * @mbggenerated Tue Mar 21 14:20:39 CST 2017
     */
    int updateByPrimaryKey(SubjectDifficulty record);

    List<SubjectDifficulty> queryAll();
}