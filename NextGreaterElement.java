import java.util.*;
public class NextGreaterElement{
    public static int[] nextgreat(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i-- ){
            while(!st.isEmpty() && st.peek() <=arr[i]){
                st.pop();

            }

 res[i] = st.isEmpty() ?-1 : st.peek();
 st.push(arr[i]);
            }
            return res;
        }
        public static void main(String[] args) {
            int arr[] = {12,15,10,3};
           System.out.println(Arrays.toString(nextgreat(arr)));
            
        }
    }
