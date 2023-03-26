package ques_3_and_4_and_5_and_6;

import org.springframework.stereotype.Component;

@Component
public class Sedan implements Car {
    @Override
    public String typeOfCar() {
        return "Sedan";
    }
}
