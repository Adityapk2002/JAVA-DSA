// Count Maximum Consecutive One's in the array
// Input: prices = {1, 1, 0, 1, 1, 1}
// Output: 3
// Explanation: There are two consecutive 1’s and three consecutive 1’s in the array out of which maximum is 3.
// Input: prices = {1, 0, 1, 1, 0, 1} 
// Output: 2
// Explanation: There are two consecutive 1's in the array. 
public class maxOnes {
    static int consecutiveOnes(int a[]) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int a[] = { 1, 0, 1, 1, 0, 1 };
        int answer = consecutiveOnes(a);
        System.out.println("Consecutive ones are : " + answer);
    }
}
