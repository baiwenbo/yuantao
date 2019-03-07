package cn.vo.service;

import cn.vo.pojo.entity.TestPaper;

public interface ITestPaperService {

    void save(TestPaper testPaper);

    void updateId(TestPaper testPaper);

    void deleteId(Integer id);

    void delCompanyId(Integer companyId);


}
