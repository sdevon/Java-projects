
package calclargefactorials;

/**
 *
 * @author Devon
 */
public class FatNum {
	private DLL fatNum;
	
    /**
     *
     */
    public FatNum() {
		fatNum = new DLL();
		Long i = new Long(0);
		fatNum.addFirst(i);
	}
	
    /**
     *
     * @param fatNum
     */
    public FatNum(DLL fatNum) {
		this.fatNum = fatNum;
	}
	
    /**
     *
     * @param num
     */
    public FatNum(long num) {
		fatNum = new DLL();
		Long i = new Long(num);
		fatNum.addFirst(i);
	}
	
    /**
     *
     * @param num
     * @return
     */
    public DLL add(long num) {
		DLLNode p = fatNum.getFirstNode();
		while (num > 0) {
			if (p != null) {
				long i = ((Long)p.getInfo()).longValue();
				p.setInfo(new Long((i + num) % 1000));
				num = (i + num) / 1000;
			} else {
				fatNum.addLast(new Long(num % 1000));
				num = num / 1000;
			}
			if (p != null)
				p = p.getNext();
		}
		return fatNum;
	}
	
    /**
     *
     * @param num
     * @return
     */
    public DLL add(DLL num) {
		DLLNode p = fatNum.getFirstNode();
		DLLNode q = num.getFirstNode();
		long carry = 0;
		while (p != null && q != null) {
			carry += ((Long)p.getInfo()).longValue() + ((Long)q.getInfo()).longValue();
			p.setInfo(carry % 1000);
			carry /= 1000;
			p = p.getNext();
			q = q.getNext();
		}
		while (q != null) {
			fatNum.addLast(q.getInfo());
			q = q.getNext();
		}
		return fatNum;
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
		while (carry > 0) {
			fatNum.addLast(new Long(carry % 1000));
			carry /= 1000;
		}
		return fatNum;
	}

    /**
     *
     * @param num
     * @return
     */
    public DLL fact(long num) {
		FatNum temp = new FatNum(1);
		for (int i = 1; i <= num; ++i)
			temp.mult(i);
		this.fatNum = temp.fatNum;
		return fatNum;
	}
	
    /**
     *
     */
    public void print() {
		DLLNode p = fatNum.getLastNode();
		System.out.print(((Long)p.getInfo()).longValue());
		p = p.getBack();
		while (p != null) {
			long num = ((Long)p.getInfo()).longValue();
			System.out.print(",");
			if (num < 100)
				System.out.print(0);
			if (num < 10)
				System.out.print(0);
			System.out.print(num);
			p = p.getBack();
		}
	}

}