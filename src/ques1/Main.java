/*
     1) Write Java code to define List . Insert 5 floating point numbers in List,
     and using an iterator, find the sum of the numbers in List.
*/

package ques1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Float> al = new ArrayList<Float>();

        // adding any 5 floating numbers
        al.add(10.10f);
        al.add(20.20f);
        al.add(30.30f);
        al.add(40.40f);
        al.add(50.50f);

        Iterator<Float> it = al.iterator();
        Float sum = 0F;

        // traversing the list
        while(it.hasNext())
            sum = sum + it.next();
        System.out.println("Sum : " + sum);
    }
}