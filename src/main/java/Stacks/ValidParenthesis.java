package Stacks;

import HashMap.maxFrequencyNumber;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.print(isValid(str));
    }

    private static final Map<Character, Character> map =
            new HashMap<Character, Character>() {{
                put('(', ')');
                put('{', '}');
                put('[', ']');
            }};
    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            if(map.containsKey(c)){
                stack.push(c);
            }
            else if(stack.empty() || map.get(stack.pop())!=c){
                return false;
            }
        }
        return stack.isEmpty();

    }
}
