// problem link
// https://www.codechef.com/practice/course/1to2stars/LP1TO201/problems/CHFSPL

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
		    int[] arr = new int[3];
		    for(int i = 0;i < 3;i++){
		        arr[i] = sc.nextInt();
		    }

		    Arrays.sort(arr);

		    System.out.println(arr[1] + arr[2]);
		}

	}
}
