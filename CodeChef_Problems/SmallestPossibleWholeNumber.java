// problem link
// https://www.codechef.com/practice/course/1to2stars/LP1TO201/problems/SMOL

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while(t-- > 0){
		    int n = sc.nextInt(), k = sc.nextInt();
		    int x = 0;
		    if(k != 0){
		        x = n/k;
		    }
		    n -= (x*k);

		    System.out.println(n);
		}

	}
}
