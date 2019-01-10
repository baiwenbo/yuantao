package cn.vo.dao;

import cn.vo.pojo.QizheScpc;
import cn.vo.pojo.QizheScpcExample;
import cn.vo.pojo.QizheScpc;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface QizheScpcMapper {
    int countByExample(QizheScpcExample example);

    int deleteByExample(QizheScpcExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QizheScpc record);

    int insertSelective(QizheScpc record);


    List<QizheScpc> selectByExample(QizheScpcExample example);

    QizheScpc selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QizheScpc record, @Param("example") QizheScpcExample example);


    int updateByExample(@Param("record") QizheScpc record, @Param("example") QizheScpcExample example);

    int updateByPrimaryKeySelective(QizheScpc record);

    int updateByPrimaryKey(QizheScpc record);
}