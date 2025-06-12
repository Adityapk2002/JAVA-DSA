// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and 
// sell on day 5 (price = 6), profit = 6-1 = 5.

// Note: That buying on day 2 and selling on day 1 
// is not allowed because you must buy before 
// you sell.

// Example 2:

// Input: prices = [7,6,4,3,1]
// Output: 0
// Explanation: In this case, no transactions are 
// done and the max profit = 0.

//BRUTE FORCE
// public class StockBuyAndSell {
//     static int stockBuy(int a[]) {
//         int maxProfit = 0;
//         int n = a.length;
//         for (int i = 0; i < n; i++) {
//             for (int j = 1; j < n; j++) {
//                 if (a[j] > a[i]) {
//                     maxProfit = Math.max(maxProfit, a[j] - a[i]);
//                 }
//             }
//         }
//         return maxProfit;
//     }
//     public static void main(String[] args) {
//         int a[] = { 7, 1, 5, 3, 6, 4 };
//         int ans = stockBuy(a);
//         System.out.println("Max profit is : " + ans);
//     }
// }

//OPTIMAL SOLUTION

public class StockBuyAndSell {
    static int stockBuy(int a[]) {
        int maxProfit = 0;
        int minValue = a[0];
        for (int i = 1; i < a.length; i++) {
            int cost = a[i] - minValue;
            maxProfit = Math.max(maxProfit, cost);
            minValue = Math.min(minValue, a[i]);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int a[] = { 7, 1, 5, 3, 6, 4 };
        int ans = stockBuy(a);
        System.out.println("Max profit is : " + ans);
    }
}