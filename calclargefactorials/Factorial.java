
package calclargefactorials;

/**
 * 
 * @author Devon
 */
public class Factorial {
	private LineWriter lw;
	
	private DLL fatNum;
	//private long numNodes, numDigits;
	private int nodeAllocAtOnce;
	
    /**
     *
     */
    public Factorial() {
		fatNum = new DLL();
		Long i = new Long(0);
		fatNum.addFirst(i);
		nodeAllocAtOnce = 0;
	}
	
    /**
     *
     * @param num
     */
    public Factorial(int num) {
		fatNum = fact(num);
		nodeAllocAtOnce = 0;
	}
	
    /**
     *
     * @param num
     */
    public Factorial(long num) {
		fatNum = new DLL();
		fatNum.addFirst(num);
		nodeAllocAtOnce = 0;
	}
	
    /**
     *
     * @param lw
     */
    public void getLineWriter(LineWriter lw) {
		this.lw = lw;
	}
	
    /**
     *
     * @param num
     * @return
     */
    public DLL mult(long num) {
		DLLNode p = fatNum.getFirstNode();
		long carry = 0;
		while (p != null) {
			long n = ((Long)p.getInfo()).longValue();
			p.setInfo(new Long((n * num + carry) % 1000));
			carry = (n * num + carry) / 1000;
			p = p.getNext();
		}
		int n = 0;
		while (carry > 0) {
			fatNum.addLast(new Long(carry % 1000));
			n += 1;
			carry /= 1000;
		}
		if (n > nodeAllocAtOnce)
			nodeAllocAtOnce = n;
		return fatNum;
	}

    /**
     *
     * @param num
     * @return
     */
    public DLL fact(int num) {
		Factorial temp = new Factorial((long)1);
		for (int i = 1; i <= num; ++i)
			temp.mult(i);
		nodeAllocAtOnce = temp.nodeAllocAtOnce;
		fatNum = temp.fatNum;
		return temp.fatNum;
	}
	
    /**
     *
     */
    public void print() {
		DLLNode p = fatNum.getLastNode();
		int numNodes = 1;
		int numDigits = 0;
		long num = ((Long)p.getInfo()).longValue();
		System.out.print(" ");
		lw.print(" ");
		if (num > 99) {
			numDigits += 3;
		} else if (num > 9) {
			System.out.print(" ");
			lw.print(" ");
			numDigits += 2;
		} else {
			System.out.print("  ");
			lw.print("  ");
			numDigits += 1;
		}
		System.out.print(num);
		lw.print(num);
		p = p.getBack();
		while (p != null) {
			if (++numNodes % 10 == 1) {
				System.out.println(",");
				lw.println(",");
				System.out.print(" ");
				lw.print(" ");
			} else {
				System.out.print(",");
				lw.print(",");
			}
			num = ((Long)p.getInfo()).longValue();
			if (num < 100) {
				System.out.print(0);
				lw.print(0);
			}
			if (num < 10) {
				System.out.print(0);
				lw.print(0);
			}
			System.out.print(num);
			lw.print(num);
			p = p.getBack();
		}
		System.out.println();
		lw.println();
		System.out.println("  numNodes: " + numNodes);
		lw.println("  numNodes: " + numNodes);
		System.out.println("  numDigits: " + (((numNodes - 1) * 3) + numDigits));
		lw.println("  numDigits: " + (((numNodes - 1) * 3) + numDigits));
		System.out.println("  Maximum nodes allocated at once: " + nodeAllocAtOnce);
		lw.println("  Maximum nodes allocated at once: " + nodeAllocAtOnce);
	}

}