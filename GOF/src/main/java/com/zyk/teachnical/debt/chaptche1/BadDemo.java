package com.zyk.teachnical.debt.chaptche1;

import java.util.Scanner;

/**
 * 实现一个计算器的功能
 * 该实现的缺点：
 *  1.新增操作方法的时候有可能会对其它的操作符残生影响，比较危险
 *  2.输入和操作应分离
 */
public class BadDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入操作数A:");
        int operatorNumber1 = scanner.nextInt();
        System.out.println("请输入操作数B:");
        int operatorNumber2 = scanner.nextInt();
        System.out.println("请输入操作符:");
        String operator = scanner.next();
        int result = 0;
        switch (operator.charAt(0)) {
            case '+':
                result = operatorNumber1 + operatorNumber2;
                break;
            case '-':
                result = operatorNumber1 - operatorNumber2;
                break;
            case '*':
                result = operatorNumber1 * operatorNumber2;
                break;
            case '/':
                if (0 != operatorNumber2) {
                    result = operatorNumber1 / operatorNumber2;
                } else {
                    result = 0;
                }
                break;
        }
        System.out.println(result);
    }

}
