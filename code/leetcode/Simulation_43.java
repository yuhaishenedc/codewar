package leetcode;

import java.util.*;

public class Simulation_43 {
    class Solution {
        public String multiply(String num1, String num2) {
            char[] arr1=num1.toCharArray();
            char[] arr2=num2.toCharArray();
            int len1=arr1.length;
            int len2=arr2.length;
            if(len1==1&&arr1[0]-'0'==0){
                return "0";
            }
            else if(len2==1&&arr2[0]-'0'==0){
                return "0";
            }
            StringBuilder sb=new StringBuilder();
            int count=0;
            HashMap<Integer,ArrayList<Integer>> map=new HashMap();
            int max=Integer.MIN_VALUE;
            for(int i=len2-1;i>=0;i--){
                int pos=count;
                int num=arr2[i]-'0';
                int add=0;
                for(int j=len1-1;j>=0;j--){
                    int tmp=num*(arr1[j]-'0');
                    tmp+=add;
                    add=tmp/10;
                    if(!map.containsKey(pos)){
                        map.put(pos,new ArrayList<>());
                    }
                    map.get(pos).add(tmp%10);
                    pos++;
                    max=Math.max(max,pos);
                }
                if(add>0){
                    if(!map.containsKey(pos)){
                        map.put(pos,new ArrayList<>());
                    }
                    map.get(pos).add(add);
                    pos++;
                    max=Math.max(max,pos);
                }
                count++;
            }
            int add=0;
            for(int i=0;i<max;i++){
                ArrayList<Integer> tmp=map.get(i);
                int sum=0;
                for(int x:tmp){
                    sum+=x;
                }
                sum+=add;
                sb.append(sum%10);
                add=sum/10;
            }
            if(add!=0){
                sb.append(add);
            }
            return sb.reverse().toString();
        }
    }
}
