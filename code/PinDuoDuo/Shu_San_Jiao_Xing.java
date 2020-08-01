package PinDuoDuo;

import java.util.*;

public class Shu_San_Jiao_Xing {
    public static void main(String[] args){
        //判断是否是三角形的方法：
        //空间中的三个点可以分别组成三个向量，只要判断其中两个向量不贡献就可以
        //取这两个向量(x1-x2,y1-y2),(x1-x3,y1-y3)
        //判断向量共线的方法
        //设两个向量分别为：(x1,y1),(x2,y2)
        //则两个向量共线时：
        //x1y2-x2y1=0

        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int n=input.nextInt();
            int[] arr_x=new int[n];
            int[] arr_y=new int[n];
            for(int i=0;i<n;i++){
                arr_x[i]=input.nextInt();
                arr_y[i]= input.nextInt();
            }
            int count=0;
            for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                    for(int k=j;k<n;k++){
                        int a=(arr_x[i]-arr_x[j])*(arr_y[i]-arr_y[k]);
                        int b=(arr_x[i]-arr_x[k])*(arr_y[i]-arr_y[j]);
                        if(a!=b){
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}
