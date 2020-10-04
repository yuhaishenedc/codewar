package leetcode;

public class String_14 {
    /*
#include<algorithm>
class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        int m=INT_MAX;
        int sc=strs.size();
        if(sc==0){
            return "";
        }
        else if(sc==1){
            return strs[0];
        }
        for(int i=0;i<sc;i++){
            if(strs[i].length()<m){
                m=strs[i].length();
            }
        }
        string ret="";
        for(int i=0;i<m;i++){
            bool flag=true;
            char cmp=strs[0][i];
            for(int j=1;j<sc;j++){
                if(strs[j][i]!=cmp){
                    flag=false;
                    break;
                }
            }
            if(!flag){
                break;
            }
            else{
                ret+=cmp;
            }
        }
        return ret;
    }
};
     */

}
