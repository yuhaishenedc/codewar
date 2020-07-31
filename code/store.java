import java.util.Scanner;

//A了90%

public class store {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int n=input.nextInt();
            int m=input.nextInt();
            int k=input.nextInt();
            k=n*m-k+1;
            int left=0;
            int right=n*m;
            while(left<=right){
                int mid=(left+right)/2;
                int cnt=0;
                int tmp=mid/n;
                cnt+=tmp*n;
                for(int i=tmp+1;i<=m;i++){
                    cnt+=mid/i;
                }
                if(cnt<k){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }

            }
            System.out.println(left);
        }
    }
}
