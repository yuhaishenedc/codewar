import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int n=input.nextInt();
            int m=input.nextInt();
            int k=input.nextInt();
            int[] arr=new int[n*m];
            int count=0;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=m;j++){
                    arr[count++]=i*j;
                }
            }
            for(int i=0;i<n*m;i++){
                System.out.print(arr[i]+" ");
            }
            Arrays.sort(arr);
            System.out.println("");
            for(int i=0;i<n*m;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println(arr[n*m-k]);
        }
    }

}