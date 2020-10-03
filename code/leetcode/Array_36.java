package leetcode;

public class Array_36 {
    /*
class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        for(int i=0;i<9;i++){
            if(helper_height(board,i)==false||helper_width(board,i)==false){
                return false;
            }
        }
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                if(helper_square(board,i,j)==false){
                    return false;
                }
            }
        }
        return true;
    }

    bool helper_width(vector<vector<char>>& board,int i){
        int dp[10];
        for(int k=0;k<10;k++){
            dp[k]=0;
        }
        for(int j=0;j<9;j++){
            int num=board[i][j]-'0';
            if(num>=0&&num<=9){
                dp[num]++;
                if(dp[num]==2){
                    return false;
                }
            }
        }
        return true;
    }

    bool helper_height(vector<vector<char>>& board,int j){
        int dp[10];
        for(int i=0;i<10;i++){
            dp[i]=0;
        }
        for(int i=0;i<9;i++){
            int num=board[i][j]-'0';
            if(num>=0&&num<=9){
                dp[num]++;
                if(dp[num]==2){
                    return false;
                }
            }
        }
        return true;
    }

    bool helper_square(vector<vector<char>>& board,int i,int j){
        int dp[10];
        for(int x=0;x<10;x++){
            dp[x]=0;
        }
        for(int k=i;k<i+3;k++){
            for(int l=j;l<j+3;l++){
                int num=board[k][l]-'0';
                if(num>=0&&num<=9){
                    dp[num]++;
                    if(dp[num]==2){
                        return false;
                    }
                }
            }
        }
        return true;
    }
};
     */
}
