package com.example.quizapp.service;

import com.example.quizapp.entity.Question;
import com.example.quizapp.entity.Quiz;
import com.example.quizapp.entity.QuizDto;
import com.example.quizapp.entity.QuizSubmitResponse;
import com.example.quizapp.repository.QuestionsRepository;
import com.example.quizapp.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;
    @Autowired
    private QuestionsRepository questionsRepository;

    public QuizDto createQuiz(QuizDto data) {
        Quiz quiz= new Quiz(data.getName(), data.getCourseId());
        Quiz createdQuiz = quizRepository.save(quiz);

        List<Question> submittedQuestions = data.getQuestions();
        for(int i=0;i<submittedQuestions.size();i++){
            submittedQuestions.get(i).setQuizId(createdQuiz.getId());
        }

        List<Question> createdQuestions = questionsRepository.saveAll(submittedQuestions);
        QuizDto response = new QuizDto(createdQuiz.getId(), createdQuiz.getName(), createdQuiz.getCourseId(), createdQuestions);
        return  response;
    }

    public QuizDto getQuizById(int id) {
        Quiz quiz = quizRepository.findById(id).orElse(null);
        List<Question> questions = questionsRepository.findByQuizId(id);

        QuizDto response = new QuizDto(quiz.getId(), quiz.getName(), quiz.getCourseId(), questions);
        return response;
    }

    public int submitQuiz(QuizSubmitResponse quizSubmitResponse) {
        List<Question> questions = questionsRepository.findByQuizId(quizSubmitResponse.getId());
        List<Question> submittedQuestions = quizSubmitResponse.getQuestions();
        int mark=0;
        for (int i = 0; i < questions.size(); i++) {
            Question q1,q2;
            q1 = questions.get(i);
            q2 = submittedQuestions.get(i);
            if(q1==q2){
                mark += q1.getMark();
            }
        }
        return mark;
    }

    public String deleteQuiz(int id){
        quizRepository.deleteById(id);
        //todo
        questionsRepository.deleteAllByQuizId(id);
        return "quiz deleted";
    }
}
