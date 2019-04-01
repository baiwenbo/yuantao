package cn.vo.service.hans.impl;

import cn.vo.dao.hans.TestHansMapper;
import cn.vo.pojo.entity.TestHans;
import cn.vo.pojo.entity.TestHansExample;
import cn.vo.service.hans.ITestHansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestHansServiceImpl implements ITestHansService {

    @Autowired
    private TestHansMapper testHansMapper;

    @Override
    public void save(TestHans testHans) {
        testHansMapper.insertSelective(testHans);
    }

    @Override
    public void updateId(TestHans testHans) {
        testHansMapper.updateByPrimaryKeySelective(testHans);
    }

    @Override
    public TestHans getTestId(Integer testId) {
        TestHansExample testHansExample =new TestHansExample();
        TestHansExample.Criteria criteria=testHansExample.createCriteria();
        List<TestHans> list=testHansMapper.selectByExample(testHansExample);
        if (list.size()>0){
            return list.get(0);
        }
        return null;
    }
}
