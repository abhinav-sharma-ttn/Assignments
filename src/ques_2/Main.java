/*
     Using (instance) Method reference create and apply add and
     subtract method and using (Static) Method reference create and
     apply multiplication method for the functional interface created
 */

package ques_2;

import ques_2.all_classes.Add2;
import ques_2.all_classes.Multiply2;
import ques_2.all_classes.Subtract2;
import ques_2.all_interfaces.Adding;
import ques_2.all_interfaces.Multiplying;
import ques_2.all_interfaces.Subtracting;

public class Main {
    public static void main(String[] args) {

        Add2 ad1 = new Add2();
        Adding ad = ad1::addition;

        Subtract2 sb1 = new Subtract2();

        Subtracting sb = sb1::subtraction;

        System.out.println("Addition : " + ad.add(8, 9));
        System.out.println("Sub : " + sb.sub(5, 9));


        Multiplying ml = Multiply2::multiplies;

        System.out.println("Multiply : " + ml.multi(9, 5));

    }
}

