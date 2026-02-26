import java.util.Stack;

public class ReverseStringStack {
    public static String reverse (String s){
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            st.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
    return sb.toString();
}
public static void main(String[] args) {
    String s= "hello";
    System.out.println(reverse(s));
}

    
}
