import java.util.Stack;

public class validParentheses {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(char ch:s.toCharArray()){
            if(st.isEmpty() || ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
                continue;
            }
                
            if(ch==')'){
                if(st.peek()=='(')
                    st.pop();
                else 
                    return false;
            }

            if(ch == '}'){
                if(st.peek()=='{')
                    st.pop();
                else
                    return false;
            }

            if(ch== ']'){
                if(st.peek()=='[')
                    st.pop();
                else    
                    return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "(]";
        System.out.println(isValid(s));
    }
}
