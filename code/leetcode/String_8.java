package leetcode;

public class String_8 {
    /*
class Solution {
public:
    int myAtoi(string s) {
        int sc=s.length();
        int i=0;
        while(i<sc&&s[i]==' '){
            i++;
        }
        if(i==sc){
            return 0;
        }
        else{
            long long sum=0;
            if(s[i]=='-'){
                i++;
                while(s[i]-'0'>=0&&s[i]-'0'<=9){
                    sum*=10;
                    sum+=s[i]-'0';
                    if(sum>INT_MAX){
                        return INT_MIN;
                    }
                    i++;
                }
                return -1*sum;
            }
            else if(s[i]=='+'){
                i++;
                while(s[i]-'0'>=0&&s[i]-'0'<=9){
                    sum*=10;
                    sum+=s[i]-'0';
                    if(sum>INT_MAX-1){
                        return INT_MAX;
                    }
                    i++;
                }
                return sum;
            }
            else if(s[i]-'0'>=0&&s[i]-'0'<=9){
                while(s[i]-'0'>=0&&s[i]-'0'<=9){
                    sum*=10;
                    sum+=s[i]-'0';
                    if(sum>INT_MAX-1){
                        return INT_MAX;
                    }
                    i++;
                }
                return sum;
            }
            else{
                return 0;
            }
        }
        return 0;
    }
};
     */
}
