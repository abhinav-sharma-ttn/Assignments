package ques_5;

public class Test extends Thread {

    String name;
    int age;

    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 2; i++) {
                if (i == 0) {
                    System.out.println(Thread.currentThread().getName() + " have" + " " + name + " " + age);
                } else {
                    System.out.println(Thread.currentThread().getName() + " " + "have displayed ");
                }
                Thread.sleep(500);
            }
            System.out.println("Process end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
