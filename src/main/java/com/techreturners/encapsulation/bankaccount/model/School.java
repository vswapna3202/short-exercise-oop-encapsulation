package com.techreturners.encapsulation.bankaccount.model;

public class School {

    private static final String UPGRADE_STRING = "upgrade";
    public void processStudentGrade(String studentName,
                                    Grade grade,
                                    Group group,
                                    String action){

        Student student = new Student(studentName, grade, group);

        int displayActionCode;
        if (action.equals(UPGRADE_STRING)){
            displayActionCode = student.upgradeStudentGrade();
            print(student, displayActionCode);
        }else{
            displayActionCode = student.downgradeStudentGrade();
            print(student, displayActionCode);
        }
    }

    private static void print(Student student, int displayActionCode){
        String displayStr = switch(displayActionCode) {
            case 1 -> student.upgradePrint();
            case 0 -> student.noGradingChangePrint();
            default -> student.downgradePrint();
        };
        System.out.println(displayStr);


    }
}
