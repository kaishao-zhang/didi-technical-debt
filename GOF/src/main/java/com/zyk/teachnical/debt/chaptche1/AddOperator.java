package com.zyk.teachnical.debt.chaptche1;

public class AddOperator extends Operator {

    @Override
    public int getResult() {
        return getOperatorNumberA() + getOperatorNumberB();
    }
}
