/*
      use record to create an immutable represent of student(name, id, age) and
      use its  constructor for initialization, equals to compare 2 students methods.
      Also keep a static counter to keep the count of objects created.
 */

package ques_11;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Abhinav", 22, 213);
        Student s2 = new Student("Sharma", 22, 214);
        Student s3 = new Student("Pulkit", 23, 215);

        System.out.println(s1.name());
        System.out.println(s1.equals(s2));
        System.out.println(Student.counter);
    }
}
