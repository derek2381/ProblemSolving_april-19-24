// problem link
// https://codeforces.com/problemset/problem/1551/A

import java.util.*;

public class solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int ones = (n +1)/ 3;

            System.out.println((n - (2*ones)) + " " + (ones));
        }
    }
}
