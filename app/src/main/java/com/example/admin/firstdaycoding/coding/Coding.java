package com.example.admin.firstdaycoding.coding;

import java.util.ArrayList;

/**
 * Created by Admin on 11/28/2017.
 */

public class Coding {

    public static void main(String[] args) {

        Coding obj = new Coding();

        for (int i = 1; i < 20;i++)    {
           obj.math(i);
        }

        System.out.println();

        String test1 = "abbb";
        String test2 = "test";
        String test3 = "abba";

        System.out.println(obj.Palindrome(test1));
        System.out.println(obj.Palindrome(test2));
        System.out.println(obj.Palindrome(test3));

        System.out.println();

        ArrayList<String> list = new ArrayList<String>();
        list.add("name");
        list.add("mac");
        list.add("name");
        list.add("test");
        list.add("test");

        obj.duplicates(list);

    }

    public void duplicates (ArrayList list) {
        ArrayList arr = new ArrayList();

        for(int i = 0; i < list.size(); i++)    {
           String str = (String) list.get(i);

           if (arr.contains(str))   {
               System.out.print(str + ", ");
           }
           else {
               arr.add(str);
           }
        }
    }

    public boolean Palindrome(String string)    {
        for (int i =0; i < string.length()/2;i++)   {
            String letter = string.substring(i,i+1);
            String letter2 = string.substring(string.length()-1-i,string.length()-i);

            if (!(letter.equals(letter2))) {
                return false;
            }

            /*if (!(string.substring(i,i+1).equals(string.substring(string.length()-i-1,string.length()-i)))){
                return false;
            }*/
        }
        return true;
    }

    public void math(int num) {
        if (num %3 == 0 && num % 5 ==0) {
            System.out.println("fizzBuzz");
        }
        else if(num %3 ==0) {
            System.out.println("fizz");
        }
        else if (num % 5 ==0) {
            System.out.println("buzz");
        }
    }
}
