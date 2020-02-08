
package reversefile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Devon
 */
public class ReverseFile {

       public static void main(String[] args) throws FileNotFoundException { 
        String filenameRead; 
        String filenameWrite; 
        if (args.length == 2) { 
            filenameRead = args[0]; 
            filenameWrite = args[1]; 
        } else { 
            try (Scanner console = new Scanner(System.in)) {
                System.out.print("File to read: ");
                filenameRead = console.next();
                System.out.print("File to output in: ");
                filenameWrite = console.next();
            } 
        } 
 
        ArrayList<String> fileLines = readLines(filenameRead); 
        writeLines(fileLines, filenameWrite); 
    } 
 
   
    public static ArrayList<String> readLines(String filename) throws FileNotFoundException { 
        ArrayList<String> lines = new ArrayList<>(); 
       try (Scanner fileRead = new Scanner(new File(filename))) {
           while (fileRead.hasNextLine()) {
               String line = fileRead.nextLine();
               lines.add(line);
           }
       } 
        return lines; 
    } 
 
    public static void writeLines(ArrayList<String> lines, String filename) throws FileNotFoundException { 
       try (PrintWriter fileWrite = new PrintWriter(new File(filename))) {
          int j =1;
           for (int i = lines.size() - 1; i > -1; i--) {
               //fileWrite.print("/*"+j+"*/");
               fileWrite.println(lines.get(i));
               //j++;
           }
       } 
    } 
    
}
