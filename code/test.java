import java.math.BigDecimal;

public class test {

    public static void main(String[] args) {
        double a=0.1;
        double b=0.2;
        BigDecimal precise_a=new BigDecimal(a);
        BigDecimal precise_b=new BigDecimal(b);
        BigDecimal precise_ret=precise_a.add(precise_b);
        System.out.println(precise_ret.toString());
    }
}