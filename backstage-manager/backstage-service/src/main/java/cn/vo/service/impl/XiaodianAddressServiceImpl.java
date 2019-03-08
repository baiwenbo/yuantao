package cn.vo.service.impl;

import cn.vo.dao.XiaodianAddressMapper;
import cn.vo.dao.hans.XiaoDianAddressMapper;
import cn.vo.pojo.entity.XiaodianAddress;
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
}
