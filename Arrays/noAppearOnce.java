// Find the number that appears once, and the other numbers twice

// Example 1:
// Input Format: arr[] = {2,2,1}
// Result: 1
// Explanation: In this array, only the element 1 appear once and so it is the answer.

// Example 2:
// Input Format: arr[] = {4,1,2,1,2}
// Result: 4
// Explanation: In this array, only element 4 appear once and the other elements appear twice. So, 4 is the answer.
public class noAppearOnce {

    public static int leastNumber(int a[]) {
        for (int i = 0; i < a.length; i++) {
            int num = a[i];
            int count = 0;

            for (int j = 0; j < a.length; j++) {
                if (a[j] == num) {
                    count++;
                }
            }
            if (count == 1)
                return num;
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = { 4, 1, 2, 1, 2 };
        int ans = leastNumber(a);
        System.out.println("Least appeared number is : " + ans);
    }
}