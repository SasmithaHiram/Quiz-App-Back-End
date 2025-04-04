package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Exam {
    private Integer id;
    private String examination;
    private String description;
    private Integer courseId;
    private String timetable;
    private String passingScore;
    private Integer questionCount;

}
