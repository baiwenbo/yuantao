package cn.vo.service.impl;

import cn.vo.dao.hans.TestPaperMapper;
import cn.vo.pojo.entity.TestPaper;
import cn.vo.pojo.entity.TestPaperExample;
import cn.vo.service.ITestPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TestPaperServiceImpl implements ITestPaperService {

    @Autowired
    private TestPaperMapper testPaperMapper;

    @Override
    public void save(TestPaper testPaper) {
        testPaperMapper.insertSelective(testPaper);
    }

    @Override
    public void updateId(TestPaper testPaper) {
        testPaperMapper.updateByPrimaryKeySelective(testPaper);

    }

    @Override
    public void deleteId(Integer id) {
        testPaperMapper.deleteByPrimaryKey(id);

    }



    @Override
    public TestPaper getById(Integer id) {
        return testPaperMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TestPaper> getListQuery(Map map) {
        return testPaperMapper.getListQuery(map);
    }

    @Override
    public Integer count() {
        TestPaperExample testPaperExample=new TestPaperExample();
        return testPaperMapper.countByExample(testPaperExample);
    }

    @Override
    public List<TestPaper> getMendianQuery(Map map) {
        return testPaperMapper.getMendianQuery(map);
    }

    @Override
    public List<TestPaper> getCompanyQuery(Map map) {
        return testPaperMapper.getCompanyQuery(map);
    }

    @Override
    public void updateAppeal(Map map) {
        testPaperMapper.updateAppeal(map);
    }

    @Override
    public void batchCheck(Map map) {
        testPaperMapper.batchCheck(map);
    }

    @Override
    public List<TestPaper> queryAll(Map map) {
        return testPaperMapper.queryAll(map);
    }

    @Override
    public List<TestPaper> getOldListQuery(Map map) {
        return testPaperMapper.getOldListQuery(map);
    }

    @Override
    public List<TestPaper> getOldMendianQuery(Map map) {
        return testPaperMapper.getOldMendianQuery(map);
    }

    @Override
    public List<TestPaper> getOldCompanyQuery(Map map) {
        return testPaperMapper.getOldCompanyQuery(map);
    }

    @Override
    public Integer countList(Map map) {
        return testPaperMapper.count(map);
    }

    @Override
    public Integer countListOld(Map map) {
        return testPaperMapper.countOld(map);
    }

}
