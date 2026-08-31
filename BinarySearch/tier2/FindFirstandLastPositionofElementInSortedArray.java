package tier2;

import java.util.Arrays;

public class FindFirstandLastPositionofElementInSortedArray {
    static int[] arr;
    static int target;

    static int[] findFirstAndLastOccurenceOfaTarget(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                if (arr[mid + 1] == target) {
                    return new int[]{mid, mid + 1};
                }
                if (arr[mid - 1] == target) {
                    return new int[]{mid - 1, mid};
                }
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {

        arr = new int[]{5, 7, 7, 8, 8, 10};
        target = 6;
        System.out.println(Arrays.toString(findFirstAndLastOccurenceOfaTarget(arr, target)));

    }
}
