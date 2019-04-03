package cn.vo.service.hans;

import cn.vo.pojo.entity.TestHans;

public interface ITestHansService {

    void save(TestHans testHans);

    void updateId(TestHans testHans);

    void delete(Integer testId);

    TestHans getTestId(Integer testId);
}
