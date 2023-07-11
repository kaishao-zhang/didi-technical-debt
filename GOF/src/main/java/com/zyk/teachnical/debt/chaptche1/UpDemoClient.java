package com.zyk.teachnical.debt.chaptche1;

import java.util.Scanner;

/**
 * 经过改造抽象出来一个抽象的操作类，所有的操作都是基于该类的拓展，其实现类实现真正的业务逻辑，
 * 好处：
 *  1.各个实现相互不关联，防止修改后造成其他的逻辑出现问题
 *  2.方便拓展其他的计算方式
 */
public class UpDemoClient {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入操作数A:");
        int operatorNumber1 = scanner.nextInt();
        System.out.println("请输入操作数B:");
        int operatorNumber2 = scanner.nextInt();
        System.out.println("请输入操作符:");
        String operator = scanner.next();

        Operator operator1 = OperatorFactory.getOperator(operator.charAt(0));
        operator1.setOperatorNumberA(operatorNumber1);
        operator1.setOperatorNumberB(operatorNumber2);


        int result = operator1.getResult();
        System.out.println(result);


    }

}
