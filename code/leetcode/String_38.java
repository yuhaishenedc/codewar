package leetcode;

public class String_38 {
    /*
class Solution {
public:
    string countAndSay(int n) {
        vector<string> v;
        v.push_back("1");
        for(int i=1;i<n;i++){
            string tmp;
            string prev=v[i-1];
            int sc=prev.length();
            int cnt=0;
            for(int j=0;j<sc;j++){
                cnt++;
                if(j!=sc-1&&prev[j]!=prev[j+1]){
                    tmp+=to_string(cnt);
                    tmp+=prev[j];
                    cnt=0;
                }
                else if(j==sc-1){
                    tmp+=to_string(cnt);
                    tmp+=prev[j];
                }
            }
            v.push_back(tmp);
        }
        return v[n-1];
    }
};
     */
}
