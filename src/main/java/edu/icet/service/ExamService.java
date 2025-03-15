package edu.icet.service;

import edu.icet.dto.Exam;

import java.util.List;

public interface ExamService {

    void createExam(Exam exam);

    void updateExam(Exam exam);

    void deleteExamById(Integer integer);

    void deleteExamByCourseId(Integer integer);

    Exam getExamByCourseId(Integer integer);

    List<Exam> getAll();

}
