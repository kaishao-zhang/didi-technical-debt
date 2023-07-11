package com.zyk.teachnical.debt.chaptche1;

public class OperatorFactory {

    public static Operator getOperator(char operator) {
        switch (operator) {
            case '+':
                return new AddOperator();
            case '-':
                return new SubOperator();
            default:
                return null;
        }
    }

}
