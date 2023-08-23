package com.techreturners.encapsulation.bankaccount.model;

public enum Group {
    GROUP_1(1),
    GROUP_2(2),
    GROUP_3(3),
    GROUP_4(4),
    GROUP_5(5);

    private final int groupValue;

    Group(int groupValue){
        this.groupValue = groupValue;
    }

    public int getGroupValue(){
        return groupValue;
    }
}
