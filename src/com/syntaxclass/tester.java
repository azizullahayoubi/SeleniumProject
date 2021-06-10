package com.syntaxclass;

public class tester {
    public static void main(String[] args) {
        String str="555jksajfk&*ckdsck0897421";
        String newStr=str.replaceAll("[^\\d.]","");
        //System.out.println(newStr);
        String [] arr={};
        int count=0;
        char str3;
        for (int i=0; i<newStr.length(); i++){
            count++;
            str3=newStr.charAt(i);
            if (newStr.charAt(i)==3 || newStr.length()==6){
                str3+='-';
                System.out.println(str3);
            }

        }

    }
}
