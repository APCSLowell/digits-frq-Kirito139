import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ /* to be implemented in part (a) */ 
        digitList = new ArrayList<Integer>();
        int foo = num;
	    while (foo / 10 != 0) {
            digitList.set(0, foo % 10);
            foo = foo / 10;
        }
        digitList.add(foo);
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
        int i = 0;
        for (int digit : digitList) {
            if (digit < digitList.get(i)) {
                return false;
            }
            i++;
        }
        return true;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
