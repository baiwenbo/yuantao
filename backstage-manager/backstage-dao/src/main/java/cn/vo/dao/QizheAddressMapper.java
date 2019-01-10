package cn.vo.dao;

import cn.vo.pojo.QizheAddress;
import cn.vo.pojo.QizheAddressExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface QizheAddressMapper {
    int countByExample(QizheAddressExample example);

    int deleteByExample(QizheAddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QizheAddress record);

    int insertSelective(QizheAddress record);

    List<QizheAddress> selectByExample(QizheAddressExample example);

    QizheAddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QizheAddress record, @Param("example") QizheAddressExample example);

    int updateByExample(@Param("record") QizheAddress record, @Param("example") QizheAddressExample example);

    int updateByPrimaryKeySelective(QizheAddress record);

    int updateByPrimaryKey(QizheAddress record);

    List<QizheAddress> getQuery(Map map);
}