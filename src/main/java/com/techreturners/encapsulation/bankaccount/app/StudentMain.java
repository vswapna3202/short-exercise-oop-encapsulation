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

    private static final String SIXTH_STUDENT_NAME = "Vincent Crabbe";
    private static final String UPGRADE_STRING = "upgrade";

    private static void print(Student student, int displayActionCode){
        String displayStr = switch(displayActionCode) {
            case 1 -> student.upgradePrint();
            case 0 -> student.noGradingChangePrint();
            default -> student.downgradePrint();
        };
        System.out.println(displayStr);


    }

    private static void processStudentGrade(String studentName,
                                            Grade grade,
                                            Group group,
                                            String action){
        int displayActionCode;

        Student student = new Student(studentName, grade, group);

        if (action.equals(UPGRADE_STRING)){
            displayActionCode = student.upgradeStudentGrade();
            print(student, displayActionCode);
        }else{
            displayActionCode = student.downgradeStudentGrade();
            print(student, displayActionCode);
        }


    }
    public static void main(String[] args){

        processStudentGrade(FIRST_STUDENT_NAME,
                Grade.B,
                Group.GROUP_1,
                UPGRADE_STRING);

        processStudentGrade(SECOND_STUDENT_NAME,
                Grade.A,
                Group.GROUP_2,
                UPGRADE_STRING);

        processStudentGrade(THIRD_STUDENT_NAME,
                Grade.C,
                Group.GROUP_3,
                UPGRADE_STRING);

        processStudentGrade(FOURTH_STUDENT_NAME,
                Grade.D,
                Group.GROUP_4,
                "");

        processStudentGrade(FIFTH_STUDENT_NAME,
                Grade.E,
                Group.GROUP_5,
                "");

        processStudentGrade(SIXTH_STUDENT_NAME,
                Grade.F,
                Group.GROUP_5,
                "");
    }
}
