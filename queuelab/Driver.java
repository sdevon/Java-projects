/*
 * Devon Sherrell
 */
package queuelab;
import java.io.*;
import java.util.Scanner;
/**
 * @author Devon Sherrell
 */
public class Driver {
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.lang.InterruptedException
     */
    
    public static void main(String[] args) throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter("csis.txt"))) {
            Scanner inputFile = new Scanner(new File("mfq.txt"));
            MFQ mfq = new MFQ(inputFile, pw);
            mfq.getJobs();
            mfq.outputHeader();
            mfq.runSimulation();
            mfq.outStats();
            inputFile.close();
        }     
    }  
}