import java.math.BigDecimal;
import java.util.*;
import java.util.regex.Pattern;

public class test{
    Set

    // 表达式字符合法性校验正则模式，静态常量化可以降低每次使用都要编译地消耗
    private static final Pattern EXPRESSION_PATTERN = Pattern.compile("[0-9\\.+-/*()= ]+");

    // 运算符优先级map
    private static final Map<String, Integer> OPT_PRIORITY_MAP = new HashMap<String, Integer>() {
        {
            put("(", 0);
            put("+", 2);
            put("-", 2);
            put("*", 3);
            put("/", 3);
            put(")", 7);
            put("=", 20);
        }
    };

    public static double executeExpression(String expression){



        //非空检验
        if(expression==null||"".equals(expression.trim())){
            throw new IllegalArgumentException("表达式不能为空！");
        }

        //运算符栈
        Stack<String> optStack=new Stack<>();
        //操作数栈
        Stack<BigDecimal> numStack=new Stack<>();
        //当前正在读取的数字
        StringBuilder curNumBuilder=new StringBuilder(16);

        for(int i=0;i<expression.length();i++){
            char c=expression.charAt(i);
            if(c!=' '){//丢弃空白字符
                if(c>='0'&&c<='9'){
                    curNumBuilder.append(c);
                }
                else{
                    if(curNumBuilder.length()>0){
                        //处理之前读入的数字
                        numStack.push(new BigDecimal(curNumBuilder.toString()));
                        curNumBuilder.delete(0,curNumBuilder.length());
                    }

                    String curOpt=String.valueOf(c);
                    if(optStack.empty()){
                        optStack.push(curOpt);
                    }
                    else{
                        if(curOpt.equals("(")){
                            //当当前运算符为左括号时，直接入运算符栈
                            optStack.push(curOpt);
                        }
                        else if(curOpt.equals(")")){
                            //当当前运算符为右括号，触发括号内的字符表达式进行计算
                            directCalc(optStack,numStack,true);
                        }
                        else if(curOpt.equals("=")){
                            //当当前运算符为等号时，触发整个表达式剩余计算，并返回总的计算结果
                            directCalc(optStack,numStack,false);
                            return numStack.pop().doubleValue();
                        }
                        else{
                            //当前运算符为加减乘除之一，要与栈顶运算符进行比较，判断是否要进行一次二元运算
                            compareAndCalc(optStack,numStack,curOpt);
                        }
                    }
                }

            }

        }

        //表达式不是以等号结尾
        if(curNumBuilder.length()>0){
            numStack.push(new BigDecimal(curNumBuilder.toString()));
        }
        directCalc(optStack,numStack,false);
        return numStack.pop().doubleValue();

    }

    //当遇到右括号和等号执行的连续计算操作（递归计算）
    public static void directCalc(Stack<String> optStack,Stack<BigDecimal> numStack,boolean isBracket){
        String opt=optStack.pop();
        BigDecimal num2=numStack.pop();
        BigDecimal num1=numStack.pop();
        BigDecimal bigDecimal=floatingPointCalc(opt,num1,num2);

        numStack.push(bigDecimal);

        if(isBracket){
            if("(".equals(optStack.peek())){
                optStack.pop();
            }
            else{
                directCalc(optStack,numStack,isBracket);
            }
        }
        else{
            if(!optStack.empty()){
                directCalc(optStack,numStack,isBracket);
            }
        }
    }

    //拿当前元素符和栈顶运算符对比，如果栈顶运算符优先级高于或和当前运算符优先级相同
    //则执行一次二元运算（递归计算），否则当前运算符入栈
    public static void compareAndCalc(Stack<String> optStack,Stack<BigDecimal> numStack,String curOpt){
        String peekOpt=optStack.peek();
        int priority=getPriority(peekOpt,curOpt);
        if(priority==-1||priority==0){
            //栈顶运算符优先级大于或同级，触发一次二元运算
            String opt=optStack.pop();
            BigDecimal num2=numStack.pop();
            BigDecimal num1=numStack.pop();
            BigDecimal bigDecimal=floatingPointCalc(opt,num1,num2);

            numStack.push(bigDecimal);

            if(optStack.empty()){
                optStack.push(curOpt);
            }
            else{
                compareAndCalc(optStack,numStack,curOpt);
            }
        }
        else{
            optStack.push(curOpt);
        }
    }

    //不丢失精度的儿园运算，支持高精度运算
    public static BigDecimal floatingPointCalc(String opt,BigDecimal bigDecimal1,BigDecimal bigDecimal2){
        BigDecimal resultBigDecimal=new BigDecimal(0);
        switch (opt){
            case "+":
                resultBigDecimal=bigDecimal1.add(bigDecimal2);
                break;
            case "-":
                resultBigDecimal=bigDecimal1.subtract(bigDecimal2);
                break;
            case "*":
                resultBigDecimal=bigDecimal1.multiply(bigDecimal2);
                break;
            case "/":
                resultBigDecimal=bigDecimal1.divide(bigDecimal2,10, BigDecimal.ROUND_HALF_DOWN);
                break;
            default:
                break;
        }
        return resultBigDecimal;
    }

    //当第一个运算符优先级高时返回-1，第二个运算符优先级高时返回1
    //当两个运算符优先级相同时返回0
    public static int getPriority(String opt1,String opt2){
        int priority=OPT_PRIORITY_MAP.get(opt2)-OPT_PRIORITY_MAP.get(opt1);
        return priority;
    }

}