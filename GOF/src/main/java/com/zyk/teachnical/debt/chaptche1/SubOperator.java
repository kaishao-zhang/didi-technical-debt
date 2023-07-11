package com.zyk.teachnical.debt.chaptche1;

public class SubOperator extends Operator {

    @Override
    public int getResult() {
        return getOperatorNumberA() - getOperatorNumberB();
    }
}
