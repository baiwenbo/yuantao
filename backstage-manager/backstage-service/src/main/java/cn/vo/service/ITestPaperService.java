package cn.vo.service;

import cn.vo.pojo.entity.TestPaper;

import java.util.List;
import java.util.Map;

public interface ITestPaperService {

    void save(TestPaper testPaper);

    void updateId(TestPaper testPaper);

    void deleteId(Integer id);

    TestPaper getById(Integer id);

    List<TestPaper> getListQuery(Map map);

    Integer count();


}
