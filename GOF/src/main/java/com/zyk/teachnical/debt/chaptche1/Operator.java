package com.zyk.teachnical.debt.chaptche1;

public abstract class Operator {

    private int operatorNumberA;
    private int operatorNumberB;

    public abstract int getResult();

    public int getOperatorNumberA() {
        return operatorNumberA;
    }

    public void setOperatorNumberA(int operatorNumberA) {
        this.operatorNumberA = operatorNumberA;
    }

    public int getOperatorNumberB() {
        return operatorNumberB;
    }

    public void setOperatorNumberB(int operatorNumberB) {
        this.operatorNumberB = operatorNumberB;
    }
}
