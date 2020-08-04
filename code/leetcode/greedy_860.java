package leetcode;

//https://leetcode-cn.com/problems/lemonade-change/

public class greedy_860 {
    //贪心，先找10块的，再找五块的

    class Solution {
        public boolean lemonadeChange(int[] bills) {
            int[] money=new int[2];
            for(int i=0;i<bills.length;i++){
                if(bills[i]==5){
                    money[0]++;
                }
                else if(bills[i]==10){
                    money[1]++;
                    money[0]--;
                }
                else{
                    if(money[1]-1<0){
                        money[0]-=3;
                    }
                    else{
                        money[1]--;
                        money[0]--;
                    }
                }
                if(money[0]<0||money[1]<0){
                    return false;
                }
            }
            return true;
        }
    }
}
