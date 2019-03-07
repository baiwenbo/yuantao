package cn.vo.service.impl;

import cn.vo.dao.QuestionMapper;
import cn.vo.pojo.Question;
import cn.vo.pojo.QuestionExample;
import cn.vo.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements IQuestionService {

    @Autowired
    private QuestionMapper questionMapper;

    @Override
    public List<Question> getType(Integer type) {
        QuestionExample questionExample=new QuestionExample();
        QuestionExample.Criteria criteria=questionExample.createCriteria();

        List<Question> questionList=questionMapper.selectByExample(questionExample);
        if (questionList.size()>0){
            return questionList;
        }
        return null;
    }
}
