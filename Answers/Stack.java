import java.util.*;

public class Stack {
    public static Boolean isBalanced(String s){
        Deque<Character> stack = new ArrayDeque<>();
        
        for (char c : s.toCharArray()){
            if(c == '('){
                stack.push(c);

            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isBalanced("(()())")); // true
        System.out.println(isBalanced("())("));   // false
        System.out.println(isBalanced("((()))"));  // true
    }
}
