import java.util.*;
public class BasketBall {
    public static int callpoint(String[] ops){
        Stack<Integer> st = new Stack<>();
        for(String op : ops){
            if(op.equals("C")){
                st.pop();
            }else if(op.equals("D")){
                st.push(st.peek()*2);
            }else if(op.equals("+")){
                int top =st.pop();
                 int newScore = top+st.peek();
                 st.push(top);
                 st.push(newScore);
            }else{
                st.push(Integer.parseInt(op));
            }
        }
        int sum =0;
        for(int score :st){
            sum+=score;
        }
        return sum;
    }
    public static void main(String[] args) {
     String[] ops = {"5","2","C","D","+"};
     System.out.println(callpoint(ops));
    }
    
}
