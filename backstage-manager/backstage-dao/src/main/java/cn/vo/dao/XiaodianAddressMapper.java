package cn.vo.dao;

import cn.vo.pojo.entity.XiaodianAddress;
import cn.vo.pojo.entity.XiaodianAddressExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface XiaodianAddressMapper {
    int countByExample(XiaodianAddressExample example);

    int deleteByExample(XiaodianAddressExample example);

    int deleteByPrimaryKey(Long id);

    int insert(XiaodianAddress record);

    int insertSelective(XiaodianAddress record);

    List<XiaodianAddress> selectByExampleWithBLOBs(XiaodianAddressExample example);

    List<XiaodianAddress> selectByExample(XiaodianAddressExample example);

    XiaodianAddress selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") XiaodianAddress record, @Param("example") XiaodianAddressExample example);

    int updateByExampleWithBLOBs(@Param("record") XiaodianAddress record, @Param("example") XiaodianAddressExample example);

    int updateByExample(@Param("record") XiaodianAddress record, @Param("example") XiaodianAddressExample example);

    int updateByPrimaryKeySelective(XiaodianAddress record);

    int updateByPrimaryKeyWithBLOBs(XiaodianAddress record);

    int updateByPrimaryKey(XiaodianAddress record);

     List<XiaodianAddress> queryLikeName(String name);
}