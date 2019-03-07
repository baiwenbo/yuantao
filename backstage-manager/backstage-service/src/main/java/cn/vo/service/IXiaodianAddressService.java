package cn.vo.service;

import cn.vo.pojo.entity.XiaodianAddress;

import java.util.List;

public interface IXiaodianAddressService {

    List<XiaodianAddress> queryLikeName(String name);
}
