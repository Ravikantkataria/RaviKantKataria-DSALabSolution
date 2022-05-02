package com.gl.dsa_lab_sol;

import java.util.*;
public class BalancedBrackets {

	// function to check if brackets are balanced
    static boolean areBracketsBalanced(String expr)
    {
               
        Stack<Character> stack = new Stack<>();
        char[] str = expr.toCharArray(); //convert expression to Characters
 
        // Checking each element in the string
        for (int i = 0; i < expr.length(); i++)
        {
            char x = str[i];
 
            if (x == '(' || x == '[' || x == '{')
            {
                // Push the element in the stack
                stack.push(x);
                continue;
            }
 
            // If current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
            case ')':
                check = stack.pop();
                if (check == '{' || check == '[')
                    return false;
                break;
 
            case '}':
                check = stack.pop();
                if (check == '(' || check == '[')
                    return false;
                break;
 
            case ']':
                check = stack.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }
 
        // Check Empty Stack
        return (stack.isEmpty());
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expr = "([[{}]])";
		        // Function call
        if (areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
      
        String expr2 = "([[{}]]))";
        if (areBracketsBalanced(expr2))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");

	} 
}
    
    
    
