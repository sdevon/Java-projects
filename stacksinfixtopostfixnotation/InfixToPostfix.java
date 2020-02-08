/*
 * 
 */
package stacksinfixtopostfixnotation;

/**
 *
 * @author Devon
 */
public class InfixToPostfix {
    
    private String postfix;
    private char temp;
    ObjectStack stack = new ObjectStack();
  
    //priority of operator for formula

    /**
     *
     * @param op
     * @return
     */
        public int priority(char op){
        switch (op){
            case'^':return 3;
            case'*':
            case'/':return 2;
            case'+':
            case'-':return 1; 
            default: return 0;
        }
    }
     
    /*
    1.when operand is encountered copy to postfix
    2.when operand is encountered pop operators from the stack and place 
    them in the postfix expression until either the stack is empty or the 
    operator on top of the stack has a lower priority than the operator encountered 
    than the operator encountered in the infix expression.. Then push operator 
    encountered in the infix expression onto the stack.
    3.When the entire infix expression has been scanned, pop operators fron  the stack
    and place them in the postfix expression untill stack is empty.
    */

    // Method to convert infix to postfix:

    /**
     *
     * @param infix
     * @return
     */
        public String ToPostfix(String infix){
        
        postfix = "";
		
	for(int i=0; i < infix.length(); i++) {
            temp = infix.charAt(i);
            
            if ((temp >= '0') && (temp <= '9')){
	    postfix += temp;
	    }
            
            else if (temp == '('){
	            stack.push(temp);
	    }
            
            else if ((temp == '^') || (temp == '*') || (temp == '/') || (temp == '+') || (temp == '-')){
                
	        while ((!stack.isEmpty()) && ((Character)stack.top() != '(')){
                    
	                if (priority((Character)stack.top()) >= priority(temp)){
	                    postfix += stack.pop();
	                }
                        
	                else{
	                    break;
	                }
	            }
	            stack.push(temp);
	        }
            
		else if (temp == ')'){
                    
                    while ((!stack.isEmpty()) && ((Character)stack.top() != '(')){
                        postfix += stack.pop();
                    }
                    
	            if (!stack.isEmpty())
	                stack.pop();
	        }
	}
        
	while (!stack.isEmpty()){
	    postfix += stack.pop();
	}	
	return postfix;
	}
}