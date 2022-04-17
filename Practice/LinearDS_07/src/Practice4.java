// Practice4
// 두 문자열 비교
// 단, #은 backspace 로 바로 이전의 문자를 삭제하는 기능이라고 가정

// 입출력 예시
// 입력: s1 = "tree", s2 = "th#ree"
// 출력: true

// 입력: s1 = "ab#a", s2 = "aab#"
// 출력: true

// 입력: s1 = "wo#w", s2 = "ww#o"
// 출력: false


import java.util.Stack;

public class Practice4 {

    public static boolean stringCompare(String s1, String s2) {
        Stack<String>stack = new Stack();
        String s11 ="";
        String s21="";
        for(String s:s1.split("")){
            if(s.equals("#")){
                stack.pop();
            }else {
                stack.push(s);
            }
        }
        for(String s:stack){
            s11+=s;
        }
        stack.clear();
        for(String c:s2.split("")){
            if(c.equals("#")){
                stack.pop();
            }else {
                stack.push(c);
            }
        }
        for(String s:stack){
            s21+=s;
        }
        if(s11.equals(s21)){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Test code
        String s1 = "tree";
        String s2 = "th#ree";
        System.out.println(stringCompare(s1, s2));

        s1 = "ab#a";
        s2 = "aab#";
        System.out.println(stringCompare(s1, s2));

        s1 = "wo#w";
        s2 = "ww#o";
        System.out.println(stringCompare(s1, s2));
    }
}
