//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			int N = Integer.parseInt(br.readLine());
			int [] A = new int[N];
			String [] str = br.readLine().trim().split(" ");
			for(int i = 0; i < N; i++)
				A[i] = Integer.parseInt(str[i]);
			Solution ob = new Solution();
			System.out.println(ob.equalSum(A, N));
		}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
	int equalSum(int [] A, int N) {
		//Write your code here
		/* we will get TLE in this approach 
		Worst case will give O(N*i*(N-i))=O(N3)
		
		for(int i=0;i<N;i++){             ==O(N)
		    int sum=0;
		    int rp=N-1;
		    int lp=0;
		    while(lp<i){                  =O(i)
		        sum+=A[lp];
		        lp++;
		    }
		    while(rp>i){                  =O(N-i)
		        sum-=A[rp];
		        rp--;
		    }
		    if(sum==0){
		        return i+1;
		    }
		}
		return -1; */
		
		int sum = 0, currentSum = 0;
        for(int i=0; i<N; i++) sum+=A[i]; //find sum
        for(int i=0; i<N; i++) {
            if(sum - (currentSum*2) - A[i] == 0) return i+1; //find that index
            currentSum += A[i];
        }
        return -1;
		
	}
}