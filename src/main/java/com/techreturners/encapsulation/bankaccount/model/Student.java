package com.techreturners.encapsulation.bankaccount.model;

public class Student {
    private String name;
    private Grade grade;
    private Group group;

    private String secretNickName = "MySecretNickName";

    public Student(String name,Grade grade,Group group){
        this.name = name;
        this.grade = grade;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public Grade getGrade() {
        return grade;
    }

    public Group getGroup() {
        return group;
    }

    public int upgradeStudentGrade(){
        if (grade != Grade.A){
            grade = Grade.values()[grade.ordinal() - 1];
            return 1;
        }
        return 0;
    }

    public int downgradeStudentGrade(){
        if (grade != Grade.F){
            grade = Grade.values()[grade.ordinal() + 1];
            return -1;
        }
        return 0;
    }

    public String getGradeChangePrint(String action){
        return "Student "+getName()+ " in "+ getGroup()+
                " has "+action+ " grade of "+getGrade();
    }
    public String upgradePrint(){
        final String action = "upgraded";
        return getGradeChangePrint(action);
    }

    public String downgradePrint(){
        final String action = "downgraded";
        return getGradeChangePrint(action);
    }

    public String noGradingChangePrint(){
        final String action = "no change in";
        return getGradeChangePrint(action);
    }

}
