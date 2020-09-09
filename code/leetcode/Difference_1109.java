package leetcode;

public class Difference_1109 {
    //运用差分数组
    class Solution {
        public int[] corpFlightBookings(int[][] bookings, int n) {
            Difference test=new Difference(new int[n]);
            for(int[] booking:bookings){
                test.change(booking[0]-1,booking[1]-1,booking[2]);
            }
            return test.result();
        }

        class Difference{
            int[] diff;
            int len;

            Difference(int[] nums){
                len=nums.length;
                diff=new int[len];
                diff[0]=nums[0];
                for(int i=1;i<len;i++){
                    diff[i]=nums[i]-nums[i-1];
                }
            }

            public void change(int i,int j,int val){
                diff[i]+=val;
                if(j+1<len){
                    diff[j+1]-=val;
                }
            }

            public int[] result(){
                int[] res=new int[len];
                res[0]=diff[0];
                for(int i=1;i<len;i++){
                    res[i]=res[i-1]+diff[i];
                }
                return res;
            }
        }

    }
}
