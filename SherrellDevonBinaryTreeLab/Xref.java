package binarytree;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Devon
 */
public class Xref {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
   public static void main(String[] args) throws IOException {
	PrintWriter pw = new PrintWriter(new FileWriter("csis.txt"));
	Scanner omitedFile = new Scanner(new File("omited.txt"));
	Scanner textFile = new Scanner(new File("getty.txt"));
	Hash omited_words = new Hash(omitedFile,pw);
	omited_words.ReadInputFile();
	omited_words.display_hash_table();
	Word new_word = new Word(pw);
	new_word.readFile(textFile, omited_words);
	new_word.printData();
	String ex = "1";
	while (ex.equals("1")) {
            System.out.println("Run Word Query, enter 0 to exit: ");
            pw.println("Run Word Query, enter 0 to exit: ");
            Scanner keyboard = new Scanner(System.in);
            String input = keyboard.next();
            pw.append(input + "\n");
            pw.print(input + "\n");
            if (input.equals("0")) {
                ex = "0";
            }
            new_word.queryTree(input);
	}
        pw.close();
	omitedFile.close();
	textFile.close();
    }
}