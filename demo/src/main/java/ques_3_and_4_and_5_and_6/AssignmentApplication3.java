/*
    3. Use @Component and @Autowired annotations to in Loosely Coupled
    code for dependency management
    4. Get a Spring Bean from application context and display its properties.
    5. Demonstrate how you will resolve ambiguity while autowiring bean (Hint : @Primary)
    6. Perform Constructor Injection in a Spring Bean
*/

package ques_3_and_4_and_5_and_6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AssignmentApplication3 {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                SpringApplication.run(AssignmentApplication3.class, args);

        // line 18 covers ques 4 also, getting bean using application context
        Person person = applicationContext.getBean(Person.class);
        person.setName("Raman");
        person.setAge(30);
        person.setId(1);

        System.out.println("Person name : " + person.getName());
        System.out.println("ID : " + person.getId());
        System.out.println("Age : " + person.getAge());
        System.out.println("Car: " + person.getCar().typeOfCar());
    }
}
