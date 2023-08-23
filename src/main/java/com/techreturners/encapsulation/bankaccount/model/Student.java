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

    public boolean upgradeStudentGrade(){
        switch(grade){
            case B:
                grade = Grade.A;
                return true;
            case C:
                grade = Grade.B;
                return true;
            case D:
                grade = Grade.C;
                return true;
            case E:
                grade = Grade.D;
                return true;
            case F:
                grade = Grade.E;
                return true;
            default:
                return false;
        }
    }

    public boolean downGradeStudentGrade(){
        switch(grade){
            case A:
                grade = Grade.B;
                return true;
            case B:
                grade = Grade.C;
                return true;
            case C:
                grade = Grade.D;
                return true;
            case D:
                grade = Grade.E;
                return true;
            case E:
                grade = Grade.F;
                return true;
            default:
                return false;
        }
    }

    public String upgradePrint(){
        return "Student "+getName()+ " in "+ getGroup()+
                " has upgraded grade of "+getGrade();
    }

    public String downGradePrint(){
        return "Student "+getName()+" in "+ getGroup()+
                " has downgraded grade of "+getGrade();
    }

    public String noGradingChangePrint(){
        return "Student "+getName()+" in "+getGroup()+
                " has no grade change";
    }

}
