import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ /* to be implemented in part (a) */ 
	    while (num / 10 != 0) {
            digitList.set(0, num % 10);
            num = num / 10;
        }
        digitList.add(num);
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
