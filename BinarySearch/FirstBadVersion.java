public class FirstBadVersion {

    static int bad;

    private static boolean isBadVersion(int version) {
        return version>=bad;
    }

    static int firstBadVersion(int n) {

        int start = 0;
        int end = n;

        int mid = 0;

        while(start<end) {
            mid = start + (end - start)/2;

            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String args[]) {

        bad = 4;

        System.out.println(firstBadVersion(8));



    }


}
