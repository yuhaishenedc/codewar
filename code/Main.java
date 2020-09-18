import java.util.*;
public class Main{
    static class Node{
        int x;
        int y;
        Node(int x,int y){
            this.x=x;
            this.y=y;
        }
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int times=input.nextInt();
            for(int i=0;i<times;i++){
                int n=input.nextInt();
                int m=input.nextInt();
                char[][] map=new char[n][m];
                int[][] vis=new int[n][m];
                int begin_i=0;
                int begin_j=0;
                for(int j=0;j<n;j++){
                    char[] tmp=input.next().toCharArray();
                    for(int k=0;k<m;k++){
                        map[j][k]=tmp[k];
                        if(map[j][k]=='S'){
                            begin_i=j;
                            begin_j=k;
                        }
                    }
                }

                boolean flag=true;
                Queue<Node> q=new LinkedList<>();
                q.offer(new Node(begin_i,begin_j));
                vis[begin_i][begin_j]=1;
                while(!q.isEmpty()&&flag){
                    int sc=q.size();
                    System.out.println("sc:"+sc);
                    for(int j=0;j<sc;j++){

                        Node tmp=q.poll();
                        int x=tmp.x;
                        int y=tmp.y;

                        System.out.println("x:"+x+" y:"+y);


                        System.out.println("vis:"+vis[1][1]);

                        if(x-1>=0&&vis[x-1][y]==0){
                            if(map[x-1][y]=='.'){
                                q.add(new Node(x-1,y));
                                vis[x-1][y]=1;
                            }
                            else if(map[x-1][y]=='E'){
                                System.out.println("YES");
                                flag=false;
                                break;
                            }
                        }
                        if(y-1>=0&&vis[x][y-1]==0){
                            if(map[x][y-1]=='.'){
                                q.add(new Node(x,y-1));
                                vis[x][y-1]=1;
                            }
                            else if(map[x][y-1]=='E'){
                                System.out.println("YES");
                                flag=false;
                                break;
                            }
                        }
                        if(x+1<n&&vis[x+1][y]==0){
                            if(map[x+1][y]=='.'){
                                q.add(new Node(x+1,y));
                                vis[x+1][y]=1;
                            }
                            else if(map[x+1][y]=='E'){
                                System.out.println("YES");
                                flag=false;
                                break;
                            }
                        }
                        if(y+1<m&&vis[x][y+1]==0){
                            if(map[x][y+1]=='.'){
                                q.add(new Node(x,y+1));
                                vis[x][y+1]=1;
                            }
                            else if(map[x][y+1]=='E'){
                                System.out.println("YES");
                                flag=false;
                                break;
                            }
                        }
                    }
                }
                if(flag){
                    System.out.println("NO");
                }


            }
        }
    }
}