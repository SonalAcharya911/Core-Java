package com.xworkz.external.impl;

import com.xworkz.internal.rule.ExamCenter;

public class BoardExamImpl implements ExamCenter {
    @Override
    public void writeExam() {
        System.out.println("running writeExam in BoardExam");
    }
}
