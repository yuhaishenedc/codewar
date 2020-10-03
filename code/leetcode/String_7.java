package leetcode;

public class String_7 {
    /*
class Solution {
public:
    int reverse(int x) {
        string x1=to_string(x);
        string x2=x1;
        ::reverse(x2.begin(),x2.end());
        int sc=x2.length();
        if(x1[0]=='-'){
            for(int i=sc-1;i>0;i--){
                x2[i]=x2[i-1];
            }
            x2[0]='-';
        }
        long sum=0;
        if(x1[0]=='-'){
            for(int i=1;i<sc;i++){
                sum*=10;
                sum+=x2[i]-'0';
            }
            sum*=-1;
        }
        else{
            for(int i=0;i<sc;i++){
                sum*=10;
                sum+=x2[i]-'0';
            }
        }
        if(sum>=-2147483648&&sum<2147483648){
            return sum;
        }
        else{
            return 0;
        }
    }
};
     */
}
