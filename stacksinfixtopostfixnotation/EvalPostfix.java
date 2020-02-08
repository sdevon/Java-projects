package stacksinfixtopostfixnotation;

/**
 *
 * @author Devon
 */

public class EvalPostfix {
  
    private char temp;
    private int result;
    ObjectStack stack = new ObjectStack();
    
    //just returns result of operations

    /**
     *
     * @param val1
     * @param val2
     * @param val3
     * @return
     */
        public int evalOperator(int val1, int val2, char val3){
	    switch (val3){
	        case '+':
	            return val2 + val1;
	        case '-':
	            return val2 - val1;
	        case '*':
	            return val2 * val1;
	        case '/':
	            return val2 / val1;
	        case '^':
	        	return val2 ^ val1;
	        default:
	            return -1;
	    }
    }
    
    //loop through stack pop stack do operation and push result back on stack
    //pop remaining in stack for result

    /**
     *
     * @param postfix
     * @return
     */
        public int evaluatePostfix(String postfix){
	for (int i = 0; i < postfix.length(); i++){
	     temp = postfix.charAt(i);
			
		if ((temp == '^') || (temp == '*') || (temp == '/') || (temp == '+') || (temp == '-')){
	            result = evalOperator((int)stack.pop(), (int)stack.pop(), temp);
	            stack.push(result);
	        }
                
	        else if ((temp >= '0') || (temp <= '9')){
	            stack.push((int)(temp - '0'));
	        }
	}
	return (int)stack.pop();
    }   
}