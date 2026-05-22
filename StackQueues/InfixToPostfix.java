import java.util.*;

class InfixToPostfix {
    public static String infixToPostfix(String exp) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                ans.append(ch);
            }else if(ch=='('){
                st.push(ch);
            }
            else if(ch==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    ans.append(st.peek());
                    st.pop();
                }
                st.pop();
            }
            else{
                while(!st.isEmpty() && priority(ch)<=priority(st.peek())){
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
        
        return ans.toString();
    }
    public static int priority(Character ch){
        if(ch=='+' || ch=='-') return 1;
        else if(ch=='*'|| ch=='/') return 2;
        else if(ch=='^') return 3;
        else return -1;

    }



    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)";
        System.out.println("Postfix exp: " + infixToPostfix(exp));
    }
}