import java.util.*;
public class PrefixToInfix {
    public static String prefixToInfix(String exp){
        Stack<String> st=new Stack<>();
        int n=exp.length();
        for(int i=n-1;i>=0;i--){
            char ch=exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                st.push(ch+"");
            }
            else{
                String t1=st.peek();
                st.pop();
                String t2= st.peek();
                st.pop();
                String store="("+t1+ch+t2+")";
                st.push(store);
                
            }
        }
        return st.peek();
    }
    public static void main(String[] args) {
        String exp="*+PQ-MN";
        System.out.println("Infix Exp: "+prefixToInfix(exp));
    }
}
