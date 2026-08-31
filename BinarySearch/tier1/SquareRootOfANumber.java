package tier1;

public class SquareRootOfANumber {

    static int n;

    public static void main(String[] args) {

        n = 10;

        System.out.println(sqrt(n));

    }

    static int sqrt(int num) {
        int start = 1;
        int end = num;

        while (start<=end) {
            int mid = start + (end - start)/2;

            if (mid*mid == num) {
                return mid;
            } else if (mid*mid > num) {
                end = mid-1;
            } else if (mid*mid < num) {
                start = mid + 1;
            }
        }
         return end;
    }
}
