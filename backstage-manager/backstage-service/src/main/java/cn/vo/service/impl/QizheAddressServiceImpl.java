package cn.vo.service.impl;

import cn.vo.dao.QizheAddressMapper;
import cn.vo.pojo.QizheAddress;
import cn.vo.pojo.QizheAddressExample;
import cn.vo.service.IqizheAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class QizheAddressServiceImpl implements IqizheAddressService {

    @Autowired
    private QizheAddressMapper qizheAddressMapper;

    @Override
    public void insert(QizheAddress qizheAddress) {
        qizheAddressMapper.insertSelective(qizheAddress);
    }

    @Override
    public void update(QizheAddress qizheAddress) {
        qizheAddressMapper.updateByPrimaryKeySelective(qizheAddress);
    }

    @Override
    public void delteId(Integer id) {
        qizheAddressMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer count() {
        QizheAddressExample qizheAddressExample=new QizheAddressExample();
        return qizheAddressMapper.countByExample(qizheAddressExample);
    }

    @Override
    public List<QizheAddress> getQuery(Map map) {
        return qizheAddressMapper.getQuery(map);
    }

    @Override
    public QizheAddress getByQname(String qname) {
        QizheAddressExample qizheAddressExample=new QizheAddressExample();
        QizheAddressExample.Criteria criteria=qizheAddressExample.createCriteria();
        criteria.andQnameEqualTo(qname);
        List<QizheAddress> list=qizheAddressMapper.selectByExample(qizheAddressExample);
        if (list.size()>0){
            return list.get(0);
        }
        return null;
    }
}
