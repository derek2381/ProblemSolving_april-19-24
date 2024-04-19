// problem link
// https://codeforces.com/problemset/problem/1360/A

import java.util.*;

public class solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();

            int min,max;

            if(a > b){
                min = b;
                max = a;
            }else{
                min = a;
                max = b;
            }

            min = 2*min;

            if(min > max){
                System.out.println(min*min);
            }else{
                System.out.println(max*max);
            }
        }
    }
}
