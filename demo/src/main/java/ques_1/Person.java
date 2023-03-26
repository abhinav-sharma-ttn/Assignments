package ques_1;

// Person class has a dependency on Car class
public class Person {
    private int id, age;
    private String name;
    private Sedan sedan;

    public Person() {
    }

    public Person(int id, int age, String name, Sedan sedan) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.sedan = sedan;
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

    public Sedan getCar() {
        return sedan;
    }

    public void setCar(Sedan sedan) {
        this.sedan = sedan;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", car=" + sedan +
                '}';
    }
}
