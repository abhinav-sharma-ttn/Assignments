package ques_1;

import java.util.concurrent.Callable;

public class Test implements Callable {
    int num ;
    public Test(int num){
        this.num=num;
    }
    @Override
    public Object call() throws Exception {
        return (int)num+ Math.random();
    }
}
