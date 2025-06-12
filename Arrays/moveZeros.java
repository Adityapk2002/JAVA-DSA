// Move all Zeros to the end of the array
// Example 1:
// Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
// Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
// Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining order

// Example 2:
// Input: 1,2,0,1,0,4,0
// Output: 1,2,1,4,0,0,0
// Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining order

import java.util.ArrayList;

public class moveZeros {
    public static int[] moveZero(int a[]) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                arr.add(a[i]);
            }
        }
        int nz = arr.size();

        for (int i = 0; i < nz; i++) {
            a[i] = arr.get(i);
        }

        for (int i = nz; i < a.length; i++) {
            a[i] = 0;
        }
        return a;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 0, 1, 0, 4, 0 };
        int[] ans = moveZero(a);
        System.out.println("Final answer after moving zeros is : " + ans);
        for (int i = 0; i < a.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
