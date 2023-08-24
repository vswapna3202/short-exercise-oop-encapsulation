package com.techreturners.encapsulation.bankaccount.app;

import com.techreturners.encapsulation.bankaccount.model.Grade;
import com.techreturners.encapsulation.bankaccount.model.Group;
import com.techreturners.encapsulation.bankaccount.model.School;

public class StudentMain {

    private static final String FIRST_STUDENT_NAME = "Harry Potter";
    private static final String SECOND_STUDENT_NAME = "Hermione Granger";
    private static final String THIRD_STUDENT_NAME = "Ron Weasley";

    private static final String FOURTH_STUDENT_NAME = "Draco Malfoy";
    private static final String FIFTH_STUDENT_NAME = "Lord Voldemort";

    private static final String SIXTH_STUDENT_NAME = "Vincent Crabbe";
    private static final String UPGRADE_STRING = "upgrade";
    public static void main(String[] args){
        /* Create school class, pass student name, grade, group and whether
        upgrade needs to happen or not.
         */
        School school = new School();
        school.processStudentGrade(FIRST_STUDENT_NAME,
                Grade.B,
                Group.GROUP_1,
                UPGRADE_STRING);

        school.processStudentGrade(SECOND_STUDENT_NAME,
                Grade.A,
                Group.GROUP_2,
                UPGRADE_STRING);

        school.processStudentGrade(THIRD_STUDENT_NAME,
                Grade.C,
                Group.GROUP_3,
                UPGRADE_STRING);

        school.processStudentGrade(FOURTH_STUDENT_NAME,
                Grade.D,
                Group.GROUP_4,
                "");

        school.processStudentGrade(FIFTH_STUDENT_NAME,
                Grade.E,
                Group.GROUP_5,
                "");

        school.processStudentGrade(SIXTH_STUDENT_NAME,
                Grade.F,
                Group.GROUP_5,
                "");
    }
}
