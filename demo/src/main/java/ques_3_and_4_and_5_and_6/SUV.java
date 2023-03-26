package ques_3_and_4_and_5_and_6;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SUV implements Car {
    @Override
    public String typeOfCar() {
        return "SUV";
    }
}
