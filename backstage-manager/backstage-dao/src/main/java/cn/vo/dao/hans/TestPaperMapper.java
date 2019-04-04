package cn.vo.dao.hans;

import cn.vo.pojo.entity.TestPaper;
import cn.vo.pojo.entity.TestPaperExample;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TestPaperMapper {
    int countByExample(TestPaperExample example);

    int deleteByExample(TestPaperExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TestPaper record);
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    int insertSelective(TestPaper record);

    List<TestPaper> selectByExample(TestPaperExample example);

    TestPaper selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TestPaper record, @Param("example") TestPaperExample example);

    int updateByExample(@Param("record") TestPaper record, @Param("example") TestPaperExample example);

    int updateByPrimaryKeySelective(TestPaper record);

    int updateByPrimaryKey(TestPaper record);

	 List<TestPaper> getListQuery(Map map);

	 //门店查询
    List<TestPaper> getMendianQuery(Map map);
    //公司查询
    List<TestPaper> getCompanyQuery(Map map);

    void updateAppeal(Map map);

    void batchCheck(Map map);

    List<TestPaper> queryAll(Map map);

    //以往数据查询
    List<TestPaper> getOldListQuery(Map map);
    List<TestPaper> getOldMendianQuery(Map map);
    List<TestPaper> getOldCompanyQuery(Map map);

    int count(Map map);

    int countOld(Map map);

}