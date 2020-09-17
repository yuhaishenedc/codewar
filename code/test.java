import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class test {
    private static String LOCK="LOCK";
    private final Integer FULL=10;
    private static Integer count=0;

    public static void main(String[] args) throws Exception {
        test t=new test();
        new Thread(t.new Producer()).start();
        new Thread(t.new Consumer()).start();
        new Thread(t.new Producer()).start();
        new Thread(t.new Consumer()).start();
        new Thread(t.new Producer()).start();
        new Thread(t.new Consumer()).start();
        new Thread(t.new Producer()).start();
        new Thread(t.new Consumer()).start();
    }

    class Producer implements Runnable{
        @Override
        public void run(){
            for(int i=0;i<10;i++){
                try{
                    Thread.sleep(3000);
                }catch (Exception e){
                    e.printStackTrace();
                }
                synchronized (LOCK){
                    while (count==FULL){
                        try{
                            LOCK.wait();
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                    count++;
                    System.out.println(Thread.currentThread().getName()+"  生产者生产，目前共有："+count);
                    LOCK.notifyAll();
                }
            }
        }
    }

    class Consumer implements Runnable{
        @Override
        public void run(){
            for(int i=0;i<10;i++){
                try{
                    Thread.sleep(3000);
                }catch (InterruptedException e1){
                    e1.printStackTrace();
                }
                synchronized (LOCK){
                    while(count==0){
                        try{
                            LOCK.wait();
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                    count--;
                    System.out.println(Thread.currentThread().getName()+"消费者消费，目前共有："+count);
                    LOCK.notifyAll();
                }
            }
        }
    }
}




