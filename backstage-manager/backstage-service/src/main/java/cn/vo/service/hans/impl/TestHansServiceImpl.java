package cn.vo.service.hans.impl;

import cn.vo.dao.hans.TestHansMapper;
import cn.vo.pojo.entity.TestHans;
import cn.vo.service.hans.ITestHansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestHansServiceImpl implements ITestHansService {

    @Autowired
    private TestHansMapper testHansMapper;

    @Override
    public void save(TestHans testHans) {
        testHansMapper.insert(testHans);
    }

    @Override
    public TestHans getId(Integer testId) {
        TestHans testHans= testHansMapper.selectByPrimaryKey(testId);
        return testHans;
    }
}
