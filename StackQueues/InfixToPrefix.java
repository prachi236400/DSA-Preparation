import java.util.*;
public class InfixToPrefix {
    public static String infixToPrefix(String exp){
    StringBuilder ans=new StringBuilder();   //stringbuilder new object nhi bnata h best for heavy manipulate of string (non thread safe)
    Stack<Character> st=new Stack<>();
    String newStr=reverse(exp);
    int n=newStr.length();
    for(int i=0;i<n;i++){
        char ch=newStr.charAt(i);
        if(Character.isLetterOrDigit(ch)){
            ans.append(ch);
        }
        else if(ch=='('){
            st.push(ch);
        }
        else if(ch==')'){
            while( !st.isEmpty()&& st.peek()!='('){
            ans.append(st.peek());
            st.pop();
        }
        st.pop();
    }
        else{
            while(!st.isEmpty() && priority(ch)<priority(st.peek())){
                ans.append(st.peek());
                st.pop();
            }
            st.push(ch);

        }
    }
        while(!st.isEmpty()){
            ans.append(st.peek());
            st.pop();
        }
        String str1=reverse(ans.toString());
        return str1;

    }

    public static int priority(Character ch){
        if(ch=='+' || ch=='-') return 1;
        else if(ch=='*'|| ch=='/') return 2;
        else if(ch=='^') return 3;
        else return -1;

    }
    public static String reverse(String exp){
        String rev= new StringBuilder(exp).reverse().toString();
        StringBuilder brStr=new StringBuilder();
        for(char ch:rev.toCharArray()){
            if(ch=='('){
                brStr.append(')');

            }
            else if(ch==')') {
                brStr.append('(');
            }
            else {
                brStr.append(ch);
            }
        }
        return brStr.toString();
    }
    public static void main(String[] args) {
        String exp="(A+B)*C-D+F";
        System.out.println("Prefix exp: " + infixToPrefix(exp));
    }
}
