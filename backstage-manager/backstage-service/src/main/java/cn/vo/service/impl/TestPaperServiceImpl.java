package cn.vo.service.impl;

import cn.vo.dao.TestPaperMapper;
import cn.vo.pojo.entity.TestPaper;
import cn.vo.service.ITestPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        testPaperMapper.updateByPrimaryKey(testPaper);

    }

    @Override
    public void deleteId(Integer id) {
        testPaperMapper.deleteByPrimaryKey(id);

    }

    @Override
    public void delCompanyId(Integer companyId) {
        testPaperMapper.delCompanyId(companyId);
    }
}
