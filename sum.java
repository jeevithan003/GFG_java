// Write a program to find the sum of the given series 1+2+3+ . . . . . . (n terms) 

// Examples:

// Input: n = 1
// Output: 1
// Explanation: For n = 1, the sum will be 1.
// Input: n = 5
// Output: 15
// Explanation: For n = 5, sum will be 15. 1 + 2 + 3 + 4 + 5 = 15.




class Solution {
    public static long seriesSum(int n) {
        long sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
}