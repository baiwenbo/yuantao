package cn.vo.service.impl;

import cn.vo.dao.hans.XiaoDianAddressMapper;
import cn.vo.pojo.entity.HansXiaoDianAddress;
import cn.vo.service.HansXiaoDianAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class HansXiaoDianAddressServiceImpl implements HansXiaoDianAddressService {

    @Autowired
    private XiaoDianAddressMapper xiaoDianAddressMapper;

    @Override
    public List<HansXiaoDianAddress> findAll() {
        return xiaoDianAddressMapper.findAll();
    }

    @Override
    public void save(HansXiaoDianAddress hansXiaoDianAddress) {
        xiaoDianAddressMapper.save(hansXiaoDianAddress);

    }

    @Override
    public void deleteId(Long id) {
        xiaoDianAddressMapper.delete(id);
    }

    @Override
    public Long count() {
        return xiaoDianAddressMapper.count();
    }

    @Override
    public HansXiaoDianAddress findId(Long id) {
        return xiaoDianAddressMapper.findOne(id);
    }

    @Override
    public List<HansXiaoDianAddress> queryMap(String name,Integer index,Integer pageSize) {
        return xiaoDianAddressMapper.queryMap(name,index,pageSize);
    }


}
