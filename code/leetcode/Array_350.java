package leetcode;

public class Array_350 {
    /*
class Solution {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        vector<int> ret;
        map<int,int> m1;
        int sc=nums1.size();
        for(int i=0;i<sc;i++){
            if(m1.find(nums1[i])==m1.end()){
                m1[nums1[i]]=1;
            }
            else{
                m1[nums1[i]]=m1[nums1[i]]+1;
            }
        }
        map<int,int> m2;
        sc=nums2.size();
        for(int i=0;i<sc;i++){
            if(m2.find(nums2[i])==m2.end()){
                m2[nums2[i]]=1;
            }
            else{
                m2[nums2[i]]=m2[nums2[i]]+1;
            }
        }
        for(auto iter=m1.begin();iter!=m1.end();iter++){
            if(m2.find(iter->first)!=m2.end()){
                int min_value=min(iter->second,m2[iter->first]);
                for(int i=0;i<min_value;i++){
                    ret.push_back(iter->first);
                }
            }
        }
        return ret;
    }
};
     */
}
