package cn.vo.service;

import cn.vo.pojo.QizheAddress;

import java.util.List;
import java.util.Map;

public interface IqizheAddressService {

    void insert(QizheAddress qizheAddress);

    void update(QizheAddress qizheAddress);

    void delteId(Integer id);

    Integer count();

    List<QizheAddress> getQuery(Map map);

    QizheAddress getByQname(String qname);
}
