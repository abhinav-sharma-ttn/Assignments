package ques_11;


public record Student(String name, int age, int id) {
    static int counter = 0;

    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
        counter++;
    }
}

