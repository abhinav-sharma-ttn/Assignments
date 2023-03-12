/*
     Q4. Write a program to showcase the use of optional class
 */

package ques_4;

import java.util.Optional;


public class Main {
    public static void main(String[] args){
        String fullName = addName("Abhinav","Sharma");
        Optional<String> s1 = Optional.ofNullable(fullName);
        System.out.println(s1.get());
        String fullName2 = addName2(null,null);
        Optional<String> s2 = Optional.ofNullable(fullName2);
        System.out.println(s2.orElse("no string"));

    }
    public static String addName(String s1,String s2){
        return s1.concat(" ").concat(s2);
    }

    public static String addName2(String s1,String s2){
        if(s1==null || s2==null){
            return null;
        }
        return s1.concat(s2);
    }
}
