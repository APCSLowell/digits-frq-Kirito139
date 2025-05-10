import java.util.ArrayList;

public class Digits {

    private ArrayList<Integer> digitList;

    public Digits(int num) {
        /* to be implemented in part (a) */ 
        int foo = num;
        digitList = new ArrayList<Integer>();
        digitList.add(foo % 10);
        foo /= 10;

        while (foo / 10 != 0) {
            digitList.add(0, foo % 10);
            foo /= 10;
        }
    }

    public boolean isStrictlyIncreasing() {
        /* to be implemented in part (b) */
        int last = 0;

        for (int digit : digitList) {
            if (digit < last) return false;
            last = digit;
        }

        return true;
    }

    public String toString() {
        return digitList.toString();
    }
}
