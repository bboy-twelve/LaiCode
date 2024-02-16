import BinarySearch.L15FirstOccurrence;

public class Main {
    public static void main(String[] args) {
        L15FirstOccurrence  a = new L15FirstOccurrence();
        int[] b =new int[]{2,2,2,2,4,8,9,9,14,18};
        int x = a.firstOccur(b,9);
        System.out.println(x);
    }
}