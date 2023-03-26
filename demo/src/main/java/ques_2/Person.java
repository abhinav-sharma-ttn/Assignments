package ques_2;

import ques_1.Sedan;

// Person class has a dependency on Car class
public class Person {
    private int id, age;
    private String name;
    private Car car;

    public Person() {
    }

    public Person(int id, int age, String name, Car car) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.car = car;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}
