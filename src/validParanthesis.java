import java.util.Stack;
import java.util.HashMap;

class Backtracking {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty() || map.get(stack.pop()) != c) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Backtracking solution = new Backtracking();
        System.out.println(solution.isValid("()"));       // true
        System.out.println(solution.isValid("()[]{}"));   // true
        System.out.println(solution.isValid("(]"));       // false
        System.out.println(solution.isValid("([)]"));     // false
        System.out.println(solution.isValid("{[]}"));     // true
    }
}
