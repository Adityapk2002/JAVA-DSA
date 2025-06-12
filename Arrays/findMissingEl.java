// Find the missing number in an array
// Example 1:
// Input Format: N = 5, array[] = {1,2,4,5}
// Result: 3
// Explanation: In the given array, number 3 is missing. So, 3 is the answer.

// Example 2:
// Input Format: N = 3, array[] = {1,3}
// Result: 2
// Explanation: In the given array, number 2 is missing. So, 2 is the answer.

public class findMissingEl {
    static int findElement(int a[]) {
        int N = a.length;
        int sum = 0;
        int totalSum = (N * (N + 1) / 2);
        for (int i = 0; i < N - 1; i++) {
            sum += a[i];
        }
        return totalSum - sum;
    }

    public static void main(String[] args) {
        int a[] = { 1, 3 };
        int ans = findElement(a);
        System.out.println("Missing element is : " + ans);
    }
}
