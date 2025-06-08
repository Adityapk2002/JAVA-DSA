// find subarray with largest sum and return that sum
// imput - [5,4,-1,7,8];
//output - 23

class MaxSubArray {
    public static int maxSubArray(int nums[]) {
        int currentSum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int a[] = { 5, 4, -1, 7, 8 };
        int ans = maxSubArray(a);
        System.out.println("The maxSubarray is : " + ans);
    }
}