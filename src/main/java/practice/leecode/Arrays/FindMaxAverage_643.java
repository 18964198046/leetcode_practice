package practice.leecode.Arrays;

public class FindMaxAverage_643 {

    public double findMaxAverage(int[] nums, int k) {
        double max = 0;
        for(int i = 0; i < k; i++) {
            max += nums[i];
        }
        double sum = max;
        for(int i = k; i < nums.length; i++) {
            sum -= nums[i - k];
            sum += nums[i];
            max = Math.max(max, sum);
        }
        return max / k;
    }

}
