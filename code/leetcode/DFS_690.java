package leetcode;

import java.util.*;

public class DFS_690 {

    class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    };


    class Solution {

        Map<Integer,Employee> m;

        public int getImportance(List<Employee> employees, int id) {
            m=new HashMap<Integer,Employee>();
            for(Employee e:employees){
                m.put(e.id,e);
            }
            return dfs(id);
        }

        int dfs(int id){
            Employee tmp=m.get(id);
            int sum=tmp.importance;
            int len=tmp.subordinates.size();
            for(int i=0;i<len;i++){
                sum+=dfs(tmp.subordinates.get(i));
            }
            return sum;
        }

    }
}
