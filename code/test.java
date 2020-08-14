import java.util.*;
public class test{
    public static void main(String[] args){
        helper(0);
    }

    public static void helper(int count){
        helper(count+1);
    }
}

