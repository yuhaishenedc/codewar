import java.util.*;
public class test{

    public static void main(String[] args){

        Queue

        Father c=new Child();
        c.eat();

        //下面的语句不能通过编译
        //c.play();
        System.out.println(c.age);
    }

}

class Father{
    protected int age;

    public Father(){
        age=40;
    }

    void eat(){
        System.out.println("父类在吃饭");
    }
}

class Child extends Father{
    protected int age;

    public Child(){
        age=10;
    }

    void eat(){
        System.out.println("子类在吃饭");
    }

    void play(){
        System.out.println("子类在玩");
    }
}
