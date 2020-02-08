
package seperatenames;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Devon
 */
public class SeperateNames {

   public static void main(String[] args) throws FileNotFoundException { 
       
        HashSet<String> maleNames = new HashSet<>(); 
        HashSet<String> femaleNames = new HashSet<>(); 
         
       try (Scanner fileRead = new Scanner(new File("babyNames.txt"))) {
           
           while (fileRead.hasNext()) {
               
               int rank = fileRead.nextInt();
               String maleName = fileRead.next();
               String femaleName = fileRead.next();
               maleNames.add(maleName);
               femaleNames.add(femaleName);
           }
       } 
       
        writeNames("boy_names", maleNames); 
        writeNames("girl_names", femaleNames); 
    } 
 
    public static void writeNames(String filename, HashSet<String> names) throws FileNotFoundException { 
       
        try (PrintWriter fileWrite = new PrintWriter(new File(filename))) {
           
           for (String name : names) {
               fileWrite.println(name);
           }
       } 
    } 
    
}
