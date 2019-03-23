package cn.vo.service.impl;

import cn.vo.dao.XiaodianAddressMapper;
import cn.vo.pojo.entity.XiaodianAddress;
import cn.vo.pojo.entity.XiaodianAddressExample;
import cn.vo.service.IXiaodianAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class XiaodianAddressServiceImpl implements IXiaodianAddressService {

    @Autowired
    private XiaodianAddressMapper xiaodianAddressMapper;

    @Override
    public List<XiaodianAddress> queryLikeName(String name) {
        return xiaodianAddressMapper.queryLikeName(name);
    }

    @Override
    public XiaodianAddress getById(Long id) {
        return xiaodianAddressMapper.selectByPrimaryKey(id);
    }

    @Override
    public XiaodianAddress getCode(String code) {
        XiaodianAddressExample xiaodianAddressExample=new XiaodianAddressExample();
        XiaodianAddressExample.Criteria criteria=xiaodianAddressExample.createCriteria();
        criteria.andCodeEqualTo(code);
        List<XiaodianAddress> list=xiaodianAddressMapper.selectByExample(xiaodianAddressExample);
        if (list.size()>0){
            return list.get(0);
        }
        return null;
    }
}
