class StackArray{
    int[] stack ;
    int top ;
    int size;

StackArray(int size){
    this.size = size;
    stack = new int[size];
    top = -1;
}
void push(int x){
    if(top == size-1){
        System.out.println("stack Overflow");
        
    }
    stack[++top] = x;
    System.out.println(x+"pushed");
}
int pop(){
    if(top==-1){
        System.out.println("stack underflow");
        return -1;
    }
    return stack[top--];
}
int peek(){
    if(top == -1){
        System.out.println("stack is empty");
        return -1;
    }
    return stack[top];
}
boolean isEmpty(){
    return top ==-1;
}
}
public class ImplementationArrays{
    public static void main(String[] args) {
        StackArray st = new StackArray(5);
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
    }
}