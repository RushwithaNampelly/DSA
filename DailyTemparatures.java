import java.util.*;

public class DailyTemparatures {

    public static int[] ten(int[] temp) {
        int n = temp.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && temp[i] > temp[st.peek()]) {
                int prevDay = st.pop();
                ans[prevDay] = i - prevDay;
            }
            st.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] temp = {20, 20, 40, 0, 20};
        int[] result = ten(temp);
        System.out.println(Arrays.toString(result));
    }
}