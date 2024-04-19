// problem link
// https://www.codechef.com/practice/course/1to2stars/LP1TO201/problems/WEIGHTBL?tab=statement

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
		    int w1, w2, x1, x2, m;

		    w1 = sc.nextInt();
		    w2 = sc.nextInt();
		    x1 = sc.nextInt();
		    x2 = sc.nextInt();
		    m = sc.nextInt();

		    w2 = (w2 - w1);

		    if(x1*m <= w2 && w2 <= x2*m ){
		        System.out.println(1);
		    }else{
		        System.out.println(0);
		    }
		}

	}
}
