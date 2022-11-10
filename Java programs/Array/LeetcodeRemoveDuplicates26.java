public class LeetcodeRemoveDuplicates26 {

    public static void main(String[] args) {
        int nums[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        removeDu(nums);

    }

    private static void removeDu(int[] nums) {

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == nums[i + 1]) {

            }
        }

    }

}
// nums = [0,0,1,1,1,2,2,3,3,4]
// [0,1,2,3,4,_,_,_,_,_]