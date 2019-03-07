package cn.vo.service;

import cn.vo.pojo.entity.HansXiaoDianAddress;

import java.util.List;
import java.util.Map;

public interface HansXiaoDianAddressService {

    List<HansXiaoDianAddress>  findAll();
    void save(HansXiaoDianAddress hansXiaoDianAddress);
    void deleteId(Long id);
    Long count();
    HansXiaoDianAddress findId(Long id);

    List<HansXiaoDianAddress>  queryMap(String name,Integer index,Integer pageSize);
}
