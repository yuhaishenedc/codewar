import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            String s=input.nextLine();
            int[] arr=new int[256];
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<s.length();i++){
                if(arr[s.charAt(i)]==0){
                    sb.append(s.charAt(i));
                }
                arr[s.charAt(i)]++;
            }
            System.out.println(sb.toString());
        }
    }
}