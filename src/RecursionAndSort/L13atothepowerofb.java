package RecursionAndSort;

public class L13atothepowerofb {
    public long power(int a, int b) {
        // Write your solution here
        //corner case
        if (b == 0) return 1;
        if (b == 1) return a;
        if (a == 0) return 0;
        long p = power(a, b / 2);
        if (b % 2 == 1) {
            return p * p * a;
        } else {
            return p * p;
        }
    }
}
