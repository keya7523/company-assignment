public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueCount = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }

        return uniqueCount;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int result1 = removeDuplicates(nums1);
        System.out.print("Output: " + result1 + ", nums = [");
        for (int i = 0; i < result1; i++) {
            System.out.print(nums1[i]);
            if (i < result1 - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result2 = removeDuplicates(nums2);
        System.out.print("Output: " + result2 + ", nums = [");
        for (int i = 0; i < result2; i++) {
            System.out.print(nums2[i]);
            if (i < result2 - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
