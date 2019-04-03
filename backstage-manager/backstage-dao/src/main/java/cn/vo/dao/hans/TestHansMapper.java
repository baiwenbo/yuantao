package cn.vo.dao.hans;

import cn.vo.pojo.entity.TestHans;
import cn.vo.pojo.entity.TestHansExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TestHansMapper {
    int countByExample(TestHansExample example);

    int deleteByExample(TestHansExample example);

    int deleteByPrimaryKey(Integer testId);

    int insert(TestHans record);

    int insertSelective(TestHans record);

    List<TestHans> selectByExample(TestHansExample example);

    TestHans selectByPrimaryKey(Integer hansid);

    int updateByExampleSelective(@Param("record") TestHans record, @Param("example") TestHansExample example);

    int updateByExample(@Param("record") TestHans record, @Param("example") TestHansExample example);

    int updateByPrimaryKeySelective(TestHans record);

    int updateByPrimaryKey(TestHans record);
}