
package calclargefactorials;

import java.io.*;

/**
 *
 * @author Devon
 */
public class LineWriter {
    
     private PrintWriter outFile;
    
    /**
     *
     * @param fileName
     */
    public LineWriter(String fileName) {
        try {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            outFile = new PrintWriter(bw);
        }    
        catch (IOException e) {
            System.out.println("LineWriter cannot open output file: " + fileName);
            e.printStackTrace();
        }
    }

    /**
     *
     * @param fileName
     * @param mode
     */
    public LineWriter(String fileName, String mode) {
        try {
            FileWriter fw = new FileWriter(fileName, "a".equals(mode));
            BufferedWriter bw = new BufferedWriter(fw);
            outFile = new PrintWriter(bw);
        }    
        catch (IOException e) {
            System.out.println("LineWriter cannot open output file: " + fileName);
            e.printStackTrace();
        }
    }

    /**
     *
     * @param s
     */
    public void println(String s) {
        outFile.println(s);
    }

    /**
     *
     * @param s
     */
    public void print(String s) {
        outFile.print(s);
    }

    /**
     *
     * @param i
     */
    public void println(int i) {
        outFile.println(i);
    }

    /**
     *
     * @param i
     */
    public void print(int i) {
        outFile.print(i);
    }

    /**
     *
     * @param l
     */
    public void println(long l) {
        outFile.println(l);
    }

    /**
     *
     * @param l
     */
    public void print(long l) {
        outFile.print(l);
    }

    /**
     *
     * @param s
     */
    public void println(short s) {
        outFile.println(s);
    }

    /**
     *
     * @param s
     */
    public void print(short s) {
        outFile.print(s);
    }
    
    /**
     *
     * @param b
     */
    public void println(byte b) {
        outFile.println(b);
    }

    /**
     *
     * @param b
     */
    public void print(byte b) {
        outFile.print(b);
    }
    
    /**
     *
     * @param b
     */
    public void println(boolean b) {
        outFile.println(b);
    }

    /**
     *
     * @param b
     */
    public void print(boolean b) {
        outFile.print(b);
    }

    /**
     *
     * @param f
     */
    public void println(float f) {
        outFile.println(f);
    }

    /**
     *
     * @param f
     */
    public void print(float f) {
        outFile.print(f);
    }

    /**
     *
     * @param d
     */
    public void println(double d) {
        outFile.println(d);
    }

    /**
     *
     * @param d
     */
    public void print(double d) {
        outFile.print(d);
    }

    /**
     *
     * @param c
     */
    public void println(char c) {
        outFile.println(c);
    }

    /**
     *
     * @param c
     */
    public void print(char c) {
        outFile.print(c);
    }

    /**
     *
     * @param o
     */
    public void println(Object o) {
        outFile.println(o);
    }

    /**
     *
     * @param o
     */
    public void print(Object o) {
        outFile.print(o);
    }
    
    /**
     *
     */
    public void println() {
        outFile.println();
    }
  
    /**
     *
     * @param s
     * @param args
     */
    public void printf(String s, Object... args) {
    	outFile.printf(s, args);
    }

    /**
     *
     */
    public void close() {
        outFile.flush();
        outFile.close();
    } 
}
