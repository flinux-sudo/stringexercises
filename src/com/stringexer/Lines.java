package com.stringexer;


import java.util.Scanner;

public class Lines {


    Scanner scaner=new Scanner(System.in);
    public void Line(){
        //String s = "new Strings;";
        //String s2 = "new SSSStringsAAAAA;";
        //String s3 = "new StringsSaaaa;";
       // deleteLastOccurennceOfSign(s,inputSign());
        inputSign();
       // char s=inputSign2();
}


    public void deleteLastOccurennceOfSign(String line ,char sign){
        line = new StringBuilder(line).reverse().toString().replaceFirst(String.valueOf(sign),"");
        line = new StringBuilder(line).reverse().toString();
        System.out.println(line);

    }
    public void inputSign(){
        System.out.println("input sign: ");
        char sign =' ';
        while(!(scaner.hasNext("a-z"))){
             sign =scaner.next("a-z").charAt(0);
        }
       // char sign =scaner.next().charAt(0);
        System.out.println(sign);

        //sign=scaner.next("a-zA-Z").charAt(0);
    }
    public void inputSign2() {
        char sign = 0;
        while(true) {
            try {
                System.out.println("Enter a sign: ");
                sign = scaner.next("a-zA-Z").charAt(0);
            } catch (Exception e) {
                System.out.println("Wrong input");

            }
        System.out.println(sign);

        }
    }


}
