
package combolock;

import java.util.Scanner;

/**
 * @author Devon
 */
public class ComboLock {

  int s1,s2,s3,dial;
  
  
    public ComboLock(int secret1, int secret2, int secret3){
        this.s1 = secret1;
        this.s2 = secret2;
        this.s3 = secret3;
    }

    public void reset() {
        this.dial = 0;// reset to zero
    }

    public void turnLeft(int ticks) {
        this.sc(ticks);
        if (this.s1 == 1) {
            if (this.open(s2) == true) {
                System.out.println("The Secret2 is now unlocked");
            }
        }
    }

    public void turnRight(int ticks) {
        this.sc(ticks);
        if (this.open(s1) == true) {
            System.out.println("Secret 1 is now unlocked");
            if (this.open(s2) == true) {
                if (this.open(s3) == true) {
                    System.out.println("Combo lock is unlocked");
                }
            }
        }
    }

    public void sc(int ticks) {
        if (this.dial + ticks > 39) {
            if (ticks >= 39) {
                this.dial += ticks - 39;
            } 
            else if (this.dial >= 39) {
            }
        } 
        else if (this.dial + ticks < 0) {
            this.dial += 40 + ticks;
            this.dial += ticks - 40;
        } 
        else {
            this.dial += ticks;
        }
    }
    
    public boolean open(int secret) {
        if (this.dial == secret) {
            secret = -1;
            return true; 
        } else {
            return false; 
        }
    }
    
    public static void main(String args[]){
        ComboLock cl= new ComboLock(2,2,2);
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("enter first tick(hint:2): ");
        int tics=scan.nextInt();
        cl.turnLeft(tics); 
        System.out.println("enter first tick(hint:2): ");
        tics=scan.nextInt();
        cl.turnRight(tics);
        System.out.println("enter first tick(hint:2): ");
        tics=scan.nextInt();
        cl.sc(tics);
        cl.open(tics);
    }
}