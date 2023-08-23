package com.techreturners.encapsulation.bankaccount.app;

import com.techreturners.encapsulation.bankaccount.model.Grade;
import com.techreturners.encapsulation.bankaccount.model.Group;
import com.techreturners.encapsulation.bankaccount.model.Student;

public class StudentMain {

    private static final String FIRST_STUDENT_NAME = "Harry Potter";
    private static final String SECOND_STUDENT_NAME = "Hermione Granger";
    private static final String THIRD_STUDENT_NAME = "Ron Weasley";

    private static final String FOURTH_STUDENT_NAME = "Draco Malfoy";
    private static final String FIFTH_STUDENT_NAME = "Lord Voldemort";

    static void print(Student student, boolean upgradedFlag){
        if (upgradedFlag)
            System.out.println(student.upgradePrint());
        else
            System.out.println(student.noGradingChangePrint());
    }
    public static void main(String[] args){
        Student student = new Student(FIRST_STUDENT_NAME, Grade.B, Group.GROUP_1);
        boolean upgradedFlag = student.upgradeStudentGrade();
        print(student, upgradedFlag);

        student = new Student(SECOND_STUDENT_NAME, Grade.A, Group.GROUP_2);
        upgradedFlag = student.upgradeStudentGrade();
        print(student, upgradedFlag);

        student = new Student(THIRD_STUDENT_NAME, Grade.C, Group.GROUP_3);
        student.upgradeStudentGrade();
        print(student, upgradedFlag);

        student = new Student(FOURTH_STUDENT_NAME, Grade.D, Group.GROUP_4);
        student.downGradeStudentGrade();
        print(student, upgradedFlag);

        student = new Student(FIFTH_STUDENT_NAME, Grade.E, Group.GROUP_5);
        student.downGradeStudentGrade();
        print(student, upgradedFlag);
    }
}
