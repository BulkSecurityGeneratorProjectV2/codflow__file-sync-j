package ink.codflow.sync.dao;

import ink.codflow.sync.entity.ClientDO;

public interface ClientDOMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table client
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table client
     * @mbg.generated
     */
    int insert(ClientDO record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table client
     * @mbg.generated
     */
    int insertSelective(ClientDO record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table client
     * @mbg.generated
     */
    ClientDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table client
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ClientDO record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table client
     * @mbg.generated
     */
    int updateByPrimaryKey(ClientDO record);
}