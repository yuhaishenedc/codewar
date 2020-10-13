import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class test{

    public static void main(String[] args) throws InterruptedException {
        PipedOutputStream pos=new PipedOutputStream();
        PipedInputStream pis=new PipedInputStream();
        try {
            pis.connect(pos);
        }catch (IOException e){
            e.printStackTrace();
        }

        new MyProducer(pos).start();
        new MyConsumer(pis).start();
    }

}

class MyProducer extends Thread{
    private PipedOutputStream outputStream;

    private int index=0;

    public MyProducer(PipedOutputStream outputStream){
        this.outputStream=outputStream;
    }

    @Override
    public void run(){
        while(true){
            try{
                for(int i=0;i<5;i++){
                    outputStream.write(index++);
                }
            }catch (IOException e){
                e.printStackTrace();
            }

            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class MyConsumer extends Thread{

    private PipedInputStream inputStream;

    public MyConsumer(PipedInputStream inputStream){
        this.inputStream=inputStream;
    }

    @Override
    public void run(){
        while (true){
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            try {
                int count=inputStream.available();
                if(count>0){
                    System.out.println("rest product cout"+count);
                    System.out.println("get product"+inputStream.read());
                }
            }catch (IOException e1){
                e1.printStackTrace();
            }
        }
    }
}