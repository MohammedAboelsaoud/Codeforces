//https://codeforces.com/problemset/problem/2210/A

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            if (n == 2) {
                System.out.println("2 1");
            } else {
                // Print 2 first
                System.out.print("2 ");
                
                // Print n down to 3
                for (int i = n; i >= 3; i--) {
                    System.out.print(i + " ");
                }
                
                // Print 1 last
                System.out.println("1");
            }
        }
        
        sc.close();
    }
}
