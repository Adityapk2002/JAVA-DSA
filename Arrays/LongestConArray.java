// Example 1:
// Input: [100, 200, 1, 3, 2, 4]
// Output: 4
// Explanation: The longest consecutive subsequence is 1, 2, 3, and 4.
// Input: [3, 8, 5, 7, 6]
// Output: 4
// Explanation: The longest consecutive subsequence is 5, 6, 7, and 8.

import java.util.Arrays;

class LongestConArray {
    static int longArray(int a[]) {
        if (a.length == 0)
            return 0;
        Arrays.sort(a);
        int longest = 1;
        int lastSmaller = Integer.MIN_VALUE;
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] - 1 == lastSmaller) {
                count += 1;
                lastSmaller = a[i];
            } else if (a[i] != lastSmaller) {
                count = 1;
                lastSmaller = a[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }

    public static void main(String[] args) {
        int a[] = { 3, 8, 5, 7, 6 };
        int ans = longArray(a);
        System.out.println("Lonest array is : " + ans);
    }
}
