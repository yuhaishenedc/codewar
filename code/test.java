import  java.util.*;

public class test {

    public static void main(String[] args) {
        int[][] arr=new int[4][2];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[1][0]=2;
        arr[1][1]=3;
        arr[2][0]=3;
        arr[2][1]=4;
        arr[3][0]=1;
        arr[3][1]=3;
        Comparator<int[]> c=new java.util.Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[1]-b[1];
            }
        };
        Arrays.sort(arr,c);
        for(int i=0;i<4;i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}