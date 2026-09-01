package tier2;

import java.util.Arrays;

public class FindFirstandLastPositionofElementInSortedArray {
    static int[] arr;
    static int target;

    static int findTheBoundaryPosition(int[] nums, int target, boolean firstBound) {
        int start = 0;
        int end = nums.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                result = mid;
                if (firstBound) {
                    end = mid -1;
                } else {
                    start = mid +1;
                }

            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        arr = new int[]{5, 7, 7, 8, 8, 10};
        target = 8;
        int[] result = new int[] {-1,-1};
        int firstBound = findTheBoundaryPosition(arr, target, true);
        if (firstBound < 0) System.out.println(result);
        int lastBound = findTheBoundaryPosition(arr, target, false);
        System.out.println(Arrays.toString(new int[] {firstBound,lastBound}));
    }
}
