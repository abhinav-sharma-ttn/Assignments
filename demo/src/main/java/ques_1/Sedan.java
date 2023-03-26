package ques_1;

public class Sedan {
    private String name;
    private int average;

    public Sedan() {
    }

    public Sedan(String name, int average) {
        this.name = name;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", average=" + average +
                '}';
    }
}
