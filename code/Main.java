import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int[][] arr=new int[9][9];
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    arr[i][j]=input.nextInt();
                }
            }
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    dfs(i,j,arr);
                }
            }
        }
    }

    public static void dfs(int i,int j,int[][] arr){

    }
}