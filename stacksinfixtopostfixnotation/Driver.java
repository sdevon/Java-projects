/*
 * Devon Sherrell
 * 009399947
 * CSCI 210 Data Structures
 */
package stacksinfixtopostfixnotation;

import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Devon
 */

public class Driver {

    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        try{
        PrintWriter pw = new PrintWriter(new FileWriter("csis.txt"));
        Scanner fileScan = new Scanner(new File("infix.txt"));
        int result;
        String post, buf;
        InfixToPostfix conversion = new InfixToPostfix();
        EvalPostfix evaluation = new EvalPostfix();
        
        
	while (fileScan.hasNext()){
            buf = fileScan.nextLine();
            post = conversion.ToPostfix(buf);
            result = evaluation.evaluatePostfix(post);

            // Output to terminal and output file
            System.out.println("Infix was: " + buf);
            System.out.println("Postfix: " + post);
            System.out.println("Solution: " + result);
            pw.println("Infix was: " + buf);
            pw.println("Postfix: " + post);
            pw.println("Solution: " + result);
            // Empty line for formatting
            pw.println();
	}
        //close input and output files
	fileScan.close();
	pw.close();
        }
        catch(IOException ex){
            System.out.printf("Error: %s\n", ex);
        }
        
        
    }
}