package alignoutputs;

import java.util.Scanner;

/**
 * @author Devon
 */

public class AlignOutputs {

    double in1;
    double in2;
  
   public AlignOutputs(){
	 in1 = 0;
	 in2 = 0;
        }
    
    public double sum(double input1,double input2){ 
        double outsum = input1+input2;
        return outsum;
    }
    
    public double difference(double input11,double input21){
        double diff = input11 - input21;
        return diff;
    }
    
    public double product(double input1,double input2){
        double prod = input1*input2;
        return prod;
    }
    
    public double average(double input1,double input2){
        double avg = (input1*input2);
        avg = avg/2;
        return avg;
    }
    
    public int distance(double input1,double input2){    
        int dis = (int)(input1-input2);
        return dis;
    }
    
    public double max(double input1,double input2){
        if(input1>input2){
            return input1;
        }
        else{
            return input2;
        }
    }
    
    public double min(double input1,double input2){
         if(input1<input2){
            return input1;
        }
        else{
            return input2;
        }
    }
    
    
    
    public static void main(String[] args) {
        
     double ino1, ino2;
      AlignOutputs out = new AlignOutputs();
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
	ino1 = in.nextDouble();
        System.out.print("Enter number 2: ");
	ino2 = in.nextDouble();
        
        
       
      
        System.out.println("Sum:"+"\t" +"\t"+out.sum(ino1,ino2));
        System.out.println("Difference:"+"\t"+ out.difference(ino1,ino2));
        System.out.println("Product:"+"\t"+ out.product(ino1,ino2));
        System.out.println("Average:"+"\t"+ out.average(ino1,ino2));
        System.out.println("Distance:"+"\t"+ out.distance(ino1,ino2));
        System.out.println("Maximum:"+"\t"+ out.max(ino1,ino2));
        System.out.println("Minmum:"+"\t"+"\t"+out.min(ino1,ino2));
    }
    
}