// Practice2
// 괄호 짝 검사

// 입출력 예시)
// 입력: "("
// 출력: Fail

// 입력: ")"
// 출력: Fail

// 입력: "()"
// 출력: Pass

import java.util.Stack;

public class Practice2 {
    public static void checkParenthesis(String str) {
        Stack st = new Stack();
        boolean ch = true;
        for (String s: str.split("")) {
            if(s.equals("(")){
                st.push(s);
            }else {
                if(st.isEmpty()){
                    ch = false;
                    break;
                }else {
                    st.pop();
                }
            }

            }
        if(ch &&st.isEmpty()){
            System.out.println("PASS!");
        }else {
            System.out.println("FAIL!");
        }
    }

    public static void main(String[] args) {
        // Test code
        checkParenthesis("(");          // FAIL!
        checkParenthesis(")");          // FAIL!
        checkParenthesis("()");         // PASS!
        checkParenthesis("()()()");     // PASS!
        checkParenthesis("(())()");     // PASS!
        checkParenthesis("(((()))");    // FAIL!
    }
}
