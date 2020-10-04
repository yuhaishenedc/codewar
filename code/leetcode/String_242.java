package leetcode;

public class String_242 {
    /*
class Solution {
public:
    bool isAnagram(string s, string t) {
        int len1=s.length();
        int len2=t.length();
        if(len1!=len2){
            return false;
        }
        int dp[256];
        for(int i=0;i<256;i++){
            dp[i]=0;
        }
        for(int i=0;i<len1;i++){
            dp[s[i]]++;
            dp[t[i]]--;
        }
        for(int i=0;i<256;i++){
            if(dp[i]!=0){
                return false;
            }
        }
        return true;
    }
};
     */
}
