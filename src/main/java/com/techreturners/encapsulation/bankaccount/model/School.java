package com.techreturners.encapsulation.bankaccount.model;

public class School {

    private static final String UPGRADE_STRING = "upgrade";

    /*
    This method creates a student object passing student name, grade and group.
    If the action is upgrade then upgradeStudentGrade() method is invoked else
    downgradeStudentGrade() method is invoked. print after upgrade or downgrade
    to display the student name, new grade and group.
     */
    public void processStudentGrade(String studentName,
                                    Grade grade,
                                    Group group,
                                    String action){

        Student student = new Student(studentName, grade, group);

        int displayActionCode = action.equals(UPGRADE_STRING) ?
                student.upgradeStudentGrade() : student.downgradeStudentGrade();
        print(student, displayActionCode);
    }

    /* This method prints the student details  by invoking either
    upgradePrint, noGradingChangePrint or downgradePrint on student class.
    Each of these methods print relevant messages of student name, group,
    new grade and whether upgraded, downgraded or grade not changed.
     */

    private static void print(Student student, int displayActionCode){
        String displayStr = switch(displayActionCode) {
            case 1 -> student.upgradePrint();
            case 0 -> student.noGradingChangePrint();
            default -> student.downgradePrint();
        };
        System.out.println(displayStr);


    }
}
