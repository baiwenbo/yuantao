package cn.vo.service;

import cn.vo.pojo.entity.TestPaper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ITestPaperService {

    void save(TestPaper testPaper);

    void updateId(TestPaper testPaper);

    void deleteId(Integer id);

    TestPaper getById(Integer id);

    List<TestPaper> getListQuery(Map map);

    Integer count();

    List<TestPaper> getMendianQuery(Map map);

    List<TestPaper> getCompanyQuery(Map map);

    void updateAppeal(Map map);

    void batchCheck(Map map);

    List<TestPaper> queryAll(Map map);

    List<TestPaper> getOldListQuery(Map map);

    List<TestPaper> getOldMendianQuery(Map map);

    List<TestPaper> getOldCompanyQuery(Map map);

    Integer countList(Map map);

    Integer countListOld(Map map);


}
