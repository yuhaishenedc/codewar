import java.util.*;
public class test{
    public static void main(String[] args){
        for(int i=2017;i<100000000;i++){
            if(i%6==0&&i%8==0&&i%9==0){
                System.out.println(i);
                break;
            }
        }
    }

    public static void helper(int count){
        helper(count+1);
    }
}

