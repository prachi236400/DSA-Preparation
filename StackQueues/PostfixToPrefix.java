import java.util.*;
public class PostfixToPrefix {
    public static String postfixToPrefix(String exp){
        Stack<String> st=new Stack<>();
        int n=exp.length();
        for(int i=0;i<n;i++){
            char ch=exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                st.push(ch+"");
            }
            else{
                String t1=st.peek();
                st.pop();
                String t2=st.peek();
                st.pop();
                String store=ch+t2+t1;
                st.push(store);
            }
        }
        return st.peek();
    }
    public static void main(String[] args) {
        String exp="AB-DE+F*/";
        System.out.println("Prefix exp: "+ postfixToPrefix(exp));
    }
}
