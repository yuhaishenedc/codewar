import java.util.*;

public class test {



    public static void main(String[] args) {
        String temp="0123456";
        StringBuilder sb=new StringBuilder(temp);
        sb.replace(1,2,"test");
        System.out.println(sb.toString());
    }



}

