import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class test {
    public static void main(String[] args) {
        try{
            MyThread thread=new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
            System.out.println("是否停止："+thread.isInterrupted());
        }catch (Exception e){

        }
    }
}

class MyThread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<500000;i++){
            System.out.println("i="+i);
        }
    }
}

