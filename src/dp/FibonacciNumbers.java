package dp;

public class FibonacciNumbers {

    public static void main(String[] args) {
        // print fibonacci number for n
        int n = 20;
        // create methods for naive approach
        int fibonacciNumberAtN = dpApproachTwo(n);
        System.out.println(fibonacciNumberAtN);
    }

    private static int naiveFib(int n) {

        if (n <= 1) {
            return n;
        } else {
            return naiveFib(n - 1) + naiveFib(n - 2);
        }

    }

    private static int dpApproach(int n){
        // time complexity is O(n)
        // space complexity is O(n)
        int[] memo = new int[n+2];
        memo[0] = 0;
        memo[1] = 1;
        for(int i=2;i <= n;i++){
                memo[i] = memo[i-1] + memo[i-2];
        }
        return memo[n];

    }

    private static int dpApproachTwo(int n){
        // time complexity is O(n)
        // space complexity is O(n)
        int current=0;
        int previous = 1;
        int previousTwo = 0;
        for(int i = 2 ;i <=n;i++){
            current = previous + previousTwo;
            previousTwo = previous;
            previous = current;


        }
        return current;

    }
}
