import java.math.BigInteger;
import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int n=input.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
            }
            Arrays.sort(arr);
            int[] sort=new int[arr.length/2];
            for(int i=0;i<arr.length/2;i++){
                sort[i]=arr[i]+arr[n-i-1];
            }
            Arrays.sort(sort);
            System.out.println(sort[sort.length-1]-sort[0]);
        }
    }

}