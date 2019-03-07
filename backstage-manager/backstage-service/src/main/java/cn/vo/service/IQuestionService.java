package cn.vo.service;

import cn.vo.pojo.Question;

import java.util.List;

public interface IQuestionService {

    List<Question> getType(Integer type);
}
