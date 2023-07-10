package com.zyk.teachnical.debt.regex;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegexDemo01 {

    @Test
    public void maskCode() {
        String email = "112@qq.com";

        String regex = "^(.{2})(.*)(\\w@.*$)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.find()) {
            String prefix = matcher.group(1);
            String middle = matcher.group(2);
            String suffix = matcher.group(3);
            String maskedMiddle = maskCharacters(middle);
            String result =  prefix + maskedMiddle + suffix;
            System.out.println(result);
        }
    }
    private static String maskCharacters(String input) {
        return input.replaceAll(".", "*");
    }

    @Test
    public void testContains(){
        String message = "f333efefe";
        String regex = "^.*fe.*$";
        Pattern compile = Pattern.compile(regex);
//        Matcher matcher = compile.matcher(message)
        boolean matches = Pattern.matches(regex,message);
        System.out.println(matches);
    }

}
