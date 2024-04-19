// problem link
// https://www.codechef.com/practice/course/1to2stars/LP1TO201/problems/CSTOCK

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
		    float n, a, b, c;
		    n = sc.nextFloat();
		    a = sc.nextFloat();S
		    b = sc.nextFloat();
		    c = sc.nextFloat();

		    c = c / 100;

		    c = n * c;

		    n += c;

		    if(n >= a && n <= b){
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }

		}

	}
}
