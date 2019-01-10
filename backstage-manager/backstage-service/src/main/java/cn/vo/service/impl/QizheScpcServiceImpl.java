package cn.vo.service.impl;

import cn.vo.dao.QizheScpcMapper;
import cn.vo.pojo.QizheScpc;
import cn.vo.pojo.QizheScpcExample;
import cn.vo.service.IqizheScpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QizheScpcServiceImpl implements IqizheScpcService {

    @Autowired
    private QizheScpcMapper qizheScpcMapper;

    @Override
    public void insert(QizheScpc qizheScpc) {
        qizheScpcMapper.insertSelective(qizheScpc);
    }

    @Override
    public void update(QizheScpc qizheScpc) {
        qizheScpcMapper.updateByPrimaryKeySelective(qizheScpc);
    }

    @Override
    public void delteId(Integer id) {
        qizheScpcMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer count() {
        QizheScpcExample qizheScpcExample=new QizheScpcExample();
        return qizheScpcMapper.countByExample(qizheScpcExample);
    }
}
