import java.util.Stack;

public class RemoveDuplicates {
    public static String remove(String s){
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(!st.isEmpty()&& st.peek() == ch){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : st){
            sb.append(c);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "abbac";
        System.out.println(remove(s));
    }
    
}
