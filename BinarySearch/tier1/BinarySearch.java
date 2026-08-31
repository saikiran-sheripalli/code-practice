package tier1;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 10;
        System.out.println("Index of a target : " + binarySearch(nums, target));
        binarySearch(nums, target);

    }

    // if target is present, returns the index of target, otherwise returns -1
    static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while( start < end ) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) return mid;

            if (target > nums[mid]) {
                start = mid+1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}