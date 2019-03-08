package cn.vo.service.impl;

import cn.vo.dao.TestPaperMapper;
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
    public void delCompanyId(Integer companyId) {
        testPaperMapper.delCompanyId(companyId);
    }

    @Override
    public TestPaper getCompanyId(Integer companyId) {
        TestPaperExample testPaperExample=new TestPaperExample();
        TestPaperExample.Criteria criteria=testPaperExample.createCriteria();
        criteria.andCompanyIdEqualTo(companyId);
        List<TestPaper> list=testPaperMapper.selectByExample(testPaperExample);
        if (list.size()>0){
            return  list.get(0);
        }
        return null;
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
}