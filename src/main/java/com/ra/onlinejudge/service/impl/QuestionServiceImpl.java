package com.ra.onlinejudge.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ra.onlinejudge.model.entity.Question;
import com.ra.onlinejudge.service.QuestionService;
import com.ra.onlinejudge.mapper.QuestionMapper;
import org.springframework.stereotype.Service;

/**
* @author jieniyu
* @description 针对表【question(题目)】的数据库操作Service实现
* @createDate 2024-01-01 23:53:40
*/
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question>
    implements QuestionService{

}




