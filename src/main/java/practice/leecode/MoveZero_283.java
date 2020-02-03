package practice.leecode;

public class MoveZero_283 {

    public void moveZeroes(int[] nums) {

        int zeros = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                zeros++;
                continue;
            }

            if (zeros != 0) {
                nums[i - zeros] = nums[i];
                nums[i] = 0;
            }

        }
    }

}
